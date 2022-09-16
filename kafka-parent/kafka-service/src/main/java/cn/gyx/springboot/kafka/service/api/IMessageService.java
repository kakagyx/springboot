package cn.gyx.springboot.kafka.service.api;

public interface IMessageService {
    /**
     * 发送消息
     *
     * @return
     */
    void sendMessage(String messgae);
}
