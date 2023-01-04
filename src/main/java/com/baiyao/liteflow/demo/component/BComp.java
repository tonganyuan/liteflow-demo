package com.baiyao.liteflow.demo.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: tonganyuan
 * @Date: 2023/1/3 15:17
 * @Description:
 */
@LiteflowComponent("b")
@Slf4j
public class BComp extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("===============组件B启动了================");
    }
}
