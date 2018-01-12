package eureka.test.msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by whyse
 * on 2018/1/11 14:09
 */
@Component
public class DemoEventSender {

    @Autowired
    ApplicationContext applicationContext;//框架没有启动就不能收到这个

    public void publish() {
        applicationContext.publishEvent(new DemoEvent(this,"我是一个消息"));
    }
}
