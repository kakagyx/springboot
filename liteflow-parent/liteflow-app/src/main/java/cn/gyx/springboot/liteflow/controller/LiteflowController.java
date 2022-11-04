package cn.gyx.springboot.liteflow.controller;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LiteflowController {

    @Resource
    private FlowExecutor flowExecutor;

    @RequestMapping("/flow/execute")
    public String executeFlow(){
        try {
            LiteflowResponse rsp = flowExecutor.execute2Resp("PayExample");
            return rsp.getMessage();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

}
