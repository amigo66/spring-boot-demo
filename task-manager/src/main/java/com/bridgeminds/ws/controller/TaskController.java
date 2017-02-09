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
import com.alibaba.fastjson.JSON;
import com.bridgeminds.ws.service.TaskService;
import com.bridgeminds.ws.util.TaskError;

@RestController
@RequestMapping("/task")
public class TaskController
{
	@Autowired
	private TaskService taskService;

	private final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);

	/**
	 * 将任务添加到队列
	 * 
	 * @param task
	 */
	@RequestMapping(value = "/put", method = RequestMethod.POST)
	public ResponseEntity<?> putTask(@RequestBody String task)
	{
		try
		{
			taskService.putTask(task);
			LOGGER.info("PUSH Task -> " + task);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<TaskError>(new TaskError(HttpStatus.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<TaskError>(new TaskError(HttpStatus.OK), HttpStatus.OK);
	}

	/**
	 * 从队列尾部获取一个任务，保证先进先出
	 * 
	 * @return
	 */
	@RequestMapping(value = "/get")
	public ResponseEntity<?> getTask()
	{
		String task = null;
		try
		{
			task = taskService.getTask();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			LOGGER.error("Get task from Redis queue error.", e);
			return new ResponseEntity<TaskError>(new TaskError(HttpStatus.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		LOGGER.info("POP Task -> " + task);
		if (null == task)
		{
			return new ResponseEntity<TaskError>(new TaskError(HttpStatus.NO_CONTENT), HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("asdfasdfasfdas", HttpStatus.OK);
		}
	}

	/**
	 * 将任务添加到队列
	 * 
	 * @param task
	 */
	@RequestMapping(value = "/putdebug", method = RequestMethod.POST)
	public ResponseEntity<?> debugTask(@RequestBody String task)
	{
		try
		{
			taskService.putDebug(task);
			LOGGER.info("PUSH Task -> " + task);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<TaskError>(new TaskError(HttpStatus.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<TaskError>(new TaskError(HttpStatus.OK), HttpStatus.OK);
	}

	/**
	 * 从队列尾部获取一个任务，保证先进先出
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getdebug")
	public ResponseEntity<?> getDebugTask()
	{
		String task = null;
		try
		{
			task = taskService.getDebugTask();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			LOGGER.error("Get task from Redis queue error.", e);
			return new ResponseEntity<TaskError>(new TaskError(HttpStatus.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		LOGGER.info("POP Task -> " + task);
		if (null == task)
		{
			return new ResponseEntity<TaskError>(new TaskError(HttpStatus.NO_CONTENT), HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>(JSON.toJSONString(task), HttpStatus.OK);
		}
	}
}
