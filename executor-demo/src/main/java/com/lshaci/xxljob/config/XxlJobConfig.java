package com.lshaci.xxljob.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.xxl.job.core.executor.XxlJobExecutor;

@Configuration
@PropertySource("classpath:config/properties/xxlJob.properties")
public class XxlJobConfig {

	@Bean(initMethod = "start", destroyMethod = "destroy")
	@ConfigurationProperties("xxl.job.executor")
	public XxlJobExecutor xxlJobExecutor() {
		return new XxlJobExecutor();
	}

}