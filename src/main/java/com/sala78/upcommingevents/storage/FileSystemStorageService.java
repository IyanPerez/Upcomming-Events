package com.sala78.upcommingevents.storage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class FileSystemStorageService  {
    
    private final Path rootLocation;
    
    @Autowired
    public FileSystemStorageService(StorageProperties properties){
        this.rootLocation = Paths.get(properties.getLocation());
    }

    
    
    public void store(MultipartFile file) throws Exception{
        try {
            if(file.isEmpty()){
                throw new Exception("Failed to store empty file.");
            }

            Path destinationFile = this.rootLocation.resolve(
                Paths.get(file.getOriginalFilename()))
                .normalize().toAbsolutePath();
            if (!destinationFile.getParent().equals(this.rootLocation.toAbsolutePath())){
                //verifica que se esta guardando en el directorio correcto y no en cualquiera 
                throw new Exception("Can't store file outside current directory");

            }
// con esta linea le decimo consigue el bits (image) colocalo en el directorio y si hay una imagen con el mismo nombre me lo reemplzas
            try(InputStream inputStream = file.getInputStream()){
                Files.copy(inputStream, destinationFile,StandardCopyOption.REPLACE_EXISTING);
            }
        }

        catch(IOException e){
            throw new Exception("failed to store file",e);
        }
    }

   
    
    public Path load(String filename){
        return rootLocation.resolve(filename);
    }
    


}
