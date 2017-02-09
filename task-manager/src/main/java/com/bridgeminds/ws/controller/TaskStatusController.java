package com.bridgeminds.ws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bridgeminds.ws.entity.TaskStatusEntity;
import com.bridgeminds.ws.service.TaskStatusService;
import com.bridgeminds.ws.util.TaskError;

@RestController
@RequestMapping("/status")
public class TaskStatusController
{
	private final Logger LOGGER = LoggerFactory.getLogger(TaskStatusController.class);

	@Autowired
	private TaskStatusService statusService;

	/**
	 * 更新任务状态，将记录存到数据库
	 * 
	 * @param status
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<?> updateStatus(@RequestBody TaskStatusEntity status)
	{
		try
		{
			statusService.insert(status);
		}
		catch (Exception e)
		{
			LOGGER.error("Save task status to DB error.", e);
			return new ResponseEntity<TaskError>(new TaskError(HttpStatus.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		LOGGER.info(status.toString());
		return new ResponseEntity<TaskError>(new TaskError(HttpStatus.OK), HttpStatus.OK);
	}
}
