package com.bridgeminds.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgeminds.ws.redis.RedisClient;

@Service
public class TaskService
{
	private static final String TASK_QUEUE = "TASK_QUEUE_KEY";
	private static final String DEBUG_QUEUE = "DEBUG_QUEUE_KEY";

	@Autowired
	private RedisClient redisClient;

	public void putTask(String task) throws Exception
	{
		redisClient.lpush(TASK_QUEUE, task);
	}

	public String getTask() throws Exception
	{
		return redisClient.rpop(TASK_QUEUE);
	}

	public void putDebug(String task) throws Exception
	{
		redisClient.lpush(DEBUG_QUEUE, task);
	}

	public String getDebugTask() throws Exception
	{
		return redisClient.rpop(DEBUG_QUEUE);
	}
}
