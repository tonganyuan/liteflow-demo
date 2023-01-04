package com.baiyao.liteflow.demo.service;

import com.baiyao.liteflow.demo.LiteFlowApplication;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: tonganyuan
 * @Date: 2023/1/3 15:48
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LiteFlowApplication.class)
public class FlowServiceTest {

    @Resource
    private FlowExecutor flowExecutor;

    @Test
    public void testFlow1(){
        LiteflowResponse liteflowResponse = flowExecutor.execute2Resp("chain2", "arg");
        System.out.println("规则执行是否成功：" + liteflowResponse.isSuccess());
    }

    @Test
    public void testFlow2(){
        LiteflowResponse liteflowResponse = flowExecutor.execute2Resp("chain3", "arg");
        System.out.println("规则执行是否成功：" + liteflowResponse.isSuccess());
    }

}
