package com.wj.springboot.common;

import java.io.Serializable;

/**
* 响应类型
* @author wangwenjie
*泛型T是实际的响应类型
*响应类型T为Object
*/
public class ResponseItem<T> implements Serializable {
	/**
	 * 错误的内部编号,success表示成功
	 */
	private String status;
	/**
	 * 错误描述
	 */
	private String message;
	/**
	 * 返回值
	 */
	private T data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}