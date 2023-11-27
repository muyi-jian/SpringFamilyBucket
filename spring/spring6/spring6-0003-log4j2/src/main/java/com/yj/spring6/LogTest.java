package com.yj.spring6;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/25 21:08
 * @description
 */
public class LogTest {
    private Logger logger = LoggerFactory.getLogger(LogTest.class);

    /**
     *
     * 日志信息的优先级**，日志信息的优先级从高到低有**TRACE < DEBUG < INFO < WARN < ERROR < FATAL**
     *                 TRACE：追踪，是最低的日志级别，相当于追踪程序的执行
     *                 DEBUG：调试，一般在开发中，都将其设置为最低的日志级别
     *                 INFO：信息，输出重要的信息，使用较多
     *                 WARN：警告，输出警告的信息
     *                 ERROR：错误，输出错误信息
     *                 FATAL：严重错误
     */
    @Test
    public void testLog() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Log log = (Log) applicationContext.getBean("log");
        log.logPrint();
        logger.info("执行成功........");
    }


}
