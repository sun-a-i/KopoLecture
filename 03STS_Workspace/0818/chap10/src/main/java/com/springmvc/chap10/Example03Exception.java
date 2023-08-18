package com.springmvc.chap10;

@SuppressWarnings("serial")
public class Example03Exception extends RuntimeException{ 
		
	private String errMsg;	
	
	public Example03Exception() {
		super();		
		this.errMsg = "Example03Exception 메시지입니다";
	}
	
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
