package com.baiyao.liteflow.demo.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: tonganyuan
 * @Date: 2023/1/4 13:53
 * @Description:
 */
@LiteflowComponent("d")
@Slf4j
public class DComp extends NodeSwitchComponent {

    @Override
    public String processSwitch() throws Exception {
        log.info("============switch 节点 D 执行了===============");
        return "b";
    }
}
