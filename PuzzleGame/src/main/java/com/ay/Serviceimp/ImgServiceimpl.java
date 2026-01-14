package com.ay.Serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ay.Dto.ImageDTO;
import com.ay.Mapper.ImageMapper;
import com.ay.Service.Imgservice;
import com.ay.repo.Imagerepo;

@Service
public class ImgServiceimpl implements Imgservice {
	
	@Autowired
	private Imagerepo imr;

	@Override
	public List<ImageDTO> getimagesByCategory(String category) {

		return imr.findByCategory(category).stream().map(ImageMapper::toDTO).toList();
	}

}
