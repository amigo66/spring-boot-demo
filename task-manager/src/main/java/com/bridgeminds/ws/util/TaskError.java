package com.bridgeminds.ws.util;

import java.util.Date;
import org.springframework.http.HttpStatus;
import com.alibaba.fastjson.annotation.JSONField;

public class TaskError
{
	private int status;
	private String message;

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date timestamp;

	/**
	 * 如果不想返回这个字段，可以通过设置serialize = false实现
	 */
	@JSONField(serialize = true)
	private String remarks;

	public TaskError(HttpStatus status)
	{
		super();
		this.status = status.value();
		this.message = status.name();
		this.timestamp = new Date();
	}

	public TaskError(HttpStatus status, String message)
	{
		super();
		this.status = status.value();
		this.message = message;
		this.timestamp = new Date();
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(HttpStatus status)
	{
		this.status = status.value();
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public Date getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(Date timestamp)
	{
		this.timestamp = timestamp;
	}

	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
}
