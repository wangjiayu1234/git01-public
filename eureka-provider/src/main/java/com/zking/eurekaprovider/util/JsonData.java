package com.zking.eurekaprovider.util;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 服务器返回给客户端的JSON格式的数据
 *
 */
public class JsonData extends HashMap<String, Object> implements Serializable {

	private static final long serialVersionUID = -8855960778711040221L;
	private int code;
	private String msg;
	private Object result;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public JsonData(int code, String msg, Object result) {
		super();
		this.put("code", code);
		this.put("msg", msg);
		this.put("result", result);
	}

	public JsonData() {
		super();
	}

}
