package com.example.customermanagement;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 
 */

/**
 * @author M1027342
 *
 */
@Aspect
@Component
public class AspectLogging {
	
	private Logger logger = LoggerFactory.getLogger(AspectLogging.class.getName());

	@Before("execution(* com.example.customermanagement.*.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.debug(joinPoint.getSignature().getName());
		logger.debug(Arrays.toString(joinPoint.getArgs()));
	}

}
