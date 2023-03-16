package com.sala78.upcommingevents.storage;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;

import static org.mockito.BDDMockito.then;

import com.sala78.upcommingevents.services.ImageService;



@AutoConfigureMockMvc
@SpringBootTest
public class FileUploadTest{

   
    @Autowired
	private MockMvc mvc;

	@MockBean
	private ImageService imageService;


    @Test
	public void shouldSaveUploadedFile() throws Exception {
		MockMultipartFile multipartFile = new MockMultipartFile("image", "imgsize.png",
				"text/plain", "Spring Framework".getBytes());
		this.mvc.perform(multipart("/").file(multipartFile))
				.andExpect(status().isFound())
				.andExpect(header().string("Location", "/"));

		then(this.imageService).should().store(multipartFile);
	}


    private MockMultipartHttpServletRequestBuilder multipart(String url) {
        return MockMvcRequestBuilders.multipart(url);
    }




 
  
 


}