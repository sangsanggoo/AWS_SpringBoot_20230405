package com.web.study.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class ParamsAop {
	@Pointcut("@annotation(com.web.study.AOP.annotation.ParamsAspect)")
	private void pointCut() {}
	
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		StringBuilder builder = new StringBuilder();
//		StringBuilder : append 해줄때 마다 문자열을 합쳐준다.
		
		CodeSignature codeSignature =  (CodeSignature)joinPoint.getSignature();
		String[] parameterNames = codeSignature.getParameterNames();
		// 파라미터 값 들고오는거
		
		Object[] arg = joinPoint.getArgs();
		// value값?
		
 		for(int i = 0 ; i < arg.length ; i++) {
 			if(i != 0) {
 				builder.append(", ");
 			}
 			builder.append(parameterNames[i] + ":" + arg[i]);
 		}
 		log.info("[ Params ] >>> {}" , builder.toString());
 		
		
		return joinPoint.proceed();
	}
}
