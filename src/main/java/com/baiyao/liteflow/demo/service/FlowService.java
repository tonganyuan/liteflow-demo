package com.baiyao.liteflow.demo.service;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: tonganyuan
 * @Date: 2023/1/3 15:45
 * @Description:
 */
@Service
@Slf4j
public class FlowService {

    @Resource
    private FlowExecutor flowExecutor;

    public void testConfig() {
        LiteflowResponse liteflowResponse = flowExecutor.execute2Resp("chain2", "arg");
        System.out.println("规则执行是否成功：" + liteflowResponse.isSuccess());
    }
}
