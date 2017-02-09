package com.bridgeminds.ws;

import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.bridgeminds.ws.controller.TaskController;

@Aspect
@Component
public class ServiceLogAspect
{
	private final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);

	@Pointcut("execution(public * com.bridgeminds.ws.controller..*.*(..))")
	public void requestLog()
	{
		System.out.println("####### initial webLog()...");
	}

	@Before("requestLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable
	{
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();

		// 记录下请求内容
		LOGGER.info("[URL         ] " + request.getRequestURL().toString());
		LOGGER.info("[HTTP_METHOD ] " + request.getMethod());
		LOGGER.info("[IP          ] " + request.getRemoteAddr());
		LOGGER.info("[CLASS_METHOD] " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
		LOGGER.info("[ARGS        ] " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(returning = "ret", pointcut = "requestLog()")
	public void doAfterReturning(Object ret) throws Throwable
	{
		// 处理完请求，返回内容
		LOGGER.info("[RESPONSE    ] " + ret);
	}

}