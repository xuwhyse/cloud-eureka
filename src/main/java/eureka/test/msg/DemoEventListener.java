package eureka.test.msg;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by whyse
 * on 2018/1/11 14:07
 */
@Component
public class DemoEventListener implements ApplicationListener<DemoEvent>{
    //implements ApplicationListener<DemoEvent>  过滤其他事件
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.err.println("收到消息:"+demoEvent.msg);
    }
}
