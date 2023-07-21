package com.kopo.file;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
2. HttpServletRequest 이용 - jsp 에서 활용
3. @ModelAttribute 활용 - 매개변수 이름이 imageFile 같으면 커맨드 객체에 
						 프로퍼티 추가 하는 방식
 */

@Controller
@RequestMapping("/exam02")
public class exam02 {
	
	@GetMapping("/form")
	public String requestForm(Member member) {
		return "file_02";
	}
	
	@PostMapping("/form")
	public String submitForm(@ModelAttribute("member") Member member,
			HttpServletRequest request, HttpSession session) {

		String name = member.getName();
		String filename = member.getImageFile().getOriginalFilename();
		
		try {
			member.getImageFile().transferTo(new File("c:\\upload\\"+name+"_"+filename));
		}catch (Exception e) {
			e.printStackTrace();
		}				
		return "file_submit";
	}
}













