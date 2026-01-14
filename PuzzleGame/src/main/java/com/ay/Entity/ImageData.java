package com.ay.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
@Table(name = "images")
//@Data
public class ImageData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "image_url",length = 2048, nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private String category;
    
    
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


    
    
    

    
    
    
    
    
//	public Object getId() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object getTitle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object getImageUrl() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object getCategory() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void setId(Object id2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setTitle(Object title2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setImageUrl(Object imageUrl2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setCategory(Object category2) {
//		// TODO Auto-generated method stub
//		
//	}
}
