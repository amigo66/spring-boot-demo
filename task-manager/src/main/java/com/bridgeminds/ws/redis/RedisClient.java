package com.bridgeminds.ws.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class RedisClient
{

	@Autowired
	private JedisPool jedisPool;

	public void lpush(String key, String value)
	{

		Jedis jedis = null;
		try
		{
			jedis = jedisPool.getResource();
			jedis.lpush(key, value);
		}
		finally
		{
			jedis.close();
		}

	}

	public String rpop(String key)
	{
		Jedis jedis = null;
		try
		{
			jedis = jedisPool.getResource();
			return jedis.rpop(key);
		}
		finally
		{
			jedis.close();
		}
	}
}