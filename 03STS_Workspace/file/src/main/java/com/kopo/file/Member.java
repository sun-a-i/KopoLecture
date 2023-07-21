package com.kopo.file;

import org.springframework.web.multipart.MultipartFile;

public class Member {
	private String name;
	private MultipartFile imageFile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MultipartFile getImageFile() {
		return imageFile;
	}
	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	
	
}
