package com.springmvc.chap10;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Example02Exception.java

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="찾을 수 없습니다")
public class Example02Exception extends Exception {
	public Example02Exception(String message) {	        
        super(message);
        System.out.print(message);
        //return webpage10_01; -> view 컨트롤러로 화면 이동
    }
}
