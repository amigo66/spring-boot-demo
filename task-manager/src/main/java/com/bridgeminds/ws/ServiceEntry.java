package com.bridgeminds.ws;

import java.util.List;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 使用FastJson解析数据，需要继承WebMvcConfigurerAdapter并且覆盖configureMessageConverters()方法
 * 
 * @author King
 * 
 */
@SpringBootApplication
@MapperScan("com.bridgeminds.ws.mapper")
public class ServiceEntry extends WebMvcConfigurerAdapter
{
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters)
	{
		super.configureMessageConverters(converters);

		// 1.需要先定义一个 Convert 转换消息的对象
		FastJsonHttpMessageConverter fastConvert = new FastJsonHttpMessageConverter();

		// 2.添加 FastJson的配置信息，如：是否要格式化返回的JSON数据
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

		// 3.在Convert中添加配置信息
		fastConvert.setFastJsonConfig(fastJsonConfig);

		// 4.将Convert添加 到Converters中
		converters.add(fastConvert);
	}

	public static void main(String[] args)
	{
		SpringApplication.run(ServiceEntry.class, args);
	}
}
