package com.bridgeminds.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgeminds.ws.entity.TaskStatusEntity;
import com.bridgeminds.ws.mapper.TaskStatusMapper;

@Service
public class TaskStatusService
{
	@Autowired
	private TaskStatusMapper statusMappper;

	public void insert(TaskStatusEntity status) throws Exception
	{
		statusMappper.insert(status);
	}
}
