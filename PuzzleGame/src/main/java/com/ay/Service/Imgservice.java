package com.ay.Service;

import java.util.List;

import com.ay.Dto.ImageDTO;

public interface Imgservice{
	
	List<ImageDTO> getimagesByCategory( String category);
}