package com.kopo.file;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/*
 [MultipartFile 인터페이스]
 getName() - 매개 변수 이름 반환
 getContentType() - 파일의 콘텐츠 형식
 getOriginalFilename() - 실제 파일 이름
 isEmpty() - 업로드한 파일이 비었는지 확인
 getSize() - 바이트의 파일 크기
 getBytes() - 바이트의 배열로 파일 내용을 반환
 getInputStream() - 파일 내용을 읽어서 InputStream 을 반환
 transferTo(File dest) - 수신된 파일을 지정한 대상으로 전송
 
[파일 업로드 방식]
1. @RequestParam 활용 - 멀티파트 요청이 들어오면 메서드의 매개변수에 multipart를 적용
 */

@Controller
public class exam01 {
	@GetMapping("/form")
	public String requestForm() {
		return "file_01";
	}	
	@PostMapping("/form")
	public String submitForm(@RequestParam("name") String name,
							@RequestParam("fileImage") MultipartFile file) {
		//원본파일이름 : 개똥이.jpg
		//내가 지정한 이름 : 진돗개
		//f = c:\\upload\\진돗개_개똥이.jpg		
		String filename = file.getOriginalFilename();
		File f = new File("c:\\upload\\" + name + "_" + filename);
		
		try {
			file.transferTo(f);
		}catch (Exception e) {
			e.printStackTrace();
		}						
		return "file_submit";
	}
}













