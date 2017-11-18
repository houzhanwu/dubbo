package cn.cttic.utils;

import java.io.Serializable;

public class ResultEntity implements Serializable {
	private static final long serialVersionUID = 5163060880905679964L;

	private boolean status;

	private int code;

	private String message;

	private Object data;
	

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
