package com.wwt.xxljobdemo.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author wwt
 * @ClassName MyJobHandler.java
 * @Description TODO
 * @CreateTime 2022-12-20 18:24
 */
@Component
public class MyJobHandler {

    private Logger log = LoggerFactory.getLogger(MyJobHandler.class);

    /**
     * @Author wwt
     * @Description 任务执行代码 
     * @Param
     * @Return
     * @CreateTime 2022-12-20 18:27
     */
    @XxlJob(value = "demoJobHandler", init = "init", destroy = "destroy")
    public ReturnT<String> execute(String param){
        log.info("MyJobHandler execute 任务方法触发成功  >>>>>>>>>>>>");
        return ReturnT.SUCCESS;
    }

    /**
     * @Author wwt
     * @Description 开启任务时执行
     * @Param
     * @Return
     * @CreateTime 2022-12-20 18:27
     */
    private void init(){
        log.info("MyJobHandler init >>>>>>>>>>>");
    }

    /**
     * @Author wwt
     * @Description 项目停的时候执行
     * @Param
     * @Return
     * @CreateTime 2022-12-20 18:28
     */
    private void destroy(){
        log.info("MyJobHandler destroy >>>>>>>>>>>");
    }
}
