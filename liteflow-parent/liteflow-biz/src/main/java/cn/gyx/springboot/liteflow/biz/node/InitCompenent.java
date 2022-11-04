package cn.gyx.springboot.liteflow.biz.node;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("Init")
public class InitCompenent extends NodeComponent {
    @Override
    public void process() throws Exception {
        String str = this.getSlot().getRequestData();
        System.out.println(str);
        System.out.println("InitComponent executed!");

        this.getSlot().setOutput(this.getNodeId(), "init component output");
    }
}
