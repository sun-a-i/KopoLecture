package com.springmvc.chap10;

@SuppressWarnings("serial")
public class Example03Exception extends RuntimeException{ 
		
	private String errMsg;	
	
	public Example03Exception() {
		super();		
		this.errMsg = "Example03Exception �޽����Դϴ�";
	}
	
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
