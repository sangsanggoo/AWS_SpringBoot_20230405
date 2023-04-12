package com.web.study.AOP;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.patterns.AnnotationPointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class TimerAop {
	
//	private final Logger logger = LogManager.getLogger(TimerAop.class);
	
	
	// 접근지정자 public은 생략 가능~!!
	@Pointcut("execution( * com.web.study..*.*(..))")
	private void pointCut() {};
	
	@Pointcut("@annotation(com.web.study.AOP.annotation.TimerAspect)")
	private void AnnotationPointcut() {};
	
	@Around("AnnotationPointcut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		//전처리
		Object logic = joinPoint.proceed(); // proceed = 메소드 호출
		//후처리
		
		stopWatch.stop();
		log.info("Time >>> {}.{}: {}초",joinPoint.getSignature().getDeclaringTypeName(),
				joinPoint.getSignature().getName(),
				stopWatch.getTotalTimeSeconds());
//		System.out.println(joinPoint.getSignature().getDeclaringTypeName());
//		System.out.println(joinPoint.getSignature().getName());
//		System.out.println("메소드 실행 시간 : " + stopWatch.getTotalTimeSeconds() + "초");
		return logic;
	}
}
