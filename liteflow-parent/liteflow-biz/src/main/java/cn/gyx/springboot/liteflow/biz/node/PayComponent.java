package cn.gyx.springboot.liteflow.biz.node;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("Pay")
public class PayComponent extends NodeComponent {
    @Override
    public void process() {
        try {
            Thread.sleep(400L);
            String[] temp = new String[1000];
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("pay component executed!");

    }
}
