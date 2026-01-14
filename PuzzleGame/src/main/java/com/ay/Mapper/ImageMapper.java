package com.ay.Mapper;

import com.ay.Dto.ImageDTO;
import com.ay.Entity.ImageData;

public class ImageMapper {

    // Entity → DTO
    public static ImageDTO toDTO(ImageData entity) {
        ImageDTO dto = new ImageDTO();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setImageUrl(entity.getImageUrl());
        dto.setCategory(entity.getCategory());
        return dto;
    }

    // DTO → Entity
    public static ImageData toEntity(ImageDTO dto) {
        ImageData entity = new ImageData();
        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        entity.setImageUrl(dto.getImageUrl());
        entity.setCategory(dto.getCategory());
        return entity;
    }
}