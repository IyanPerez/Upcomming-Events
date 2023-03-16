package com.sala78.upcommingevents.services;


import java.util.stream.Stream;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sala78.upcommingevents.models.Image;
import com.sala78.upcommingevents.repositories.ImageRepository;


import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;


@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;
  
    public Image store(MultipartFile file) throws IOException {
      String fileName = StringUtils.cleanPath(file.getOriginalFilename());
      Image Image = new Image(fileName, file.getContentType(), file.getBytes());
  
      return imageRepository.save(Image);
    }
  
    public Image getFile(String id) {
      return imageRepository.findById(id).get();
    }
    
    public Stream<Image> getAllFiles() {
      return imageRepository.findAll().stream();
    }

   

 
   

}
