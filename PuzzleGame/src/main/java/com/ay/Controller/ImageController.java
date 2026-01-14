package com.ay.Controller;



import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ay.Dto.ImageDTO;
import com.ay.Service.Imgservice;


@RestController
@RequestMapping("/api/images")

@CrossOrigin(
	    origins = "http://localhost:5173",
	    allowedHeaders = "*",
	    allowCredentials = "true",
	    methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS }
	)
public class ImageController {

  
   private Imgservice imgs;
   
   public ImageController(Imgservice imgs) {
       this.imgs = imgs;
   }
   

    // API FRONTEND NEEDS
    @GetMapping("/category/{category}")
    public List<ImageDTO> getImagesByCategory(
            @PathVariable String category
    ) {
        return imgs.getimagesByCategory(category);
    }
}
