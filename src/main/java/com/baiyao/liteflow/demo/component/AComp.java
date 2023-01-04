package com.baiyao.liteflow.demo.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: tonganyuan
 * @Date: 2023/1/3 14:51
 * @Description:
 */
@Slf4j
@LiteflowComponent("a")
public class AComp extends NodeComponent {

    @Override
    public void process() throws Exception {
        log.info("===============组件A启动了================");
        AComp contextBean = this.getContextBean(AComp.class);
        throw new RuntimeException("组件A失败了");
    }

    @Override
    public boolean isAccess() {
        log.info("A组件判断是否可执行");
        return true;
    }

    @Override
    public void onSuccess() throws Exception {
        log.info("A组件成功了");
    }

    @Override
    public void onError() throws Exception {
        log.info("A组件失败了");
    }
}
