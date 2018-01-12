package eureka;

import eureka.test.msg.DemoEventSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

/**
 * 所有模块init的调用部分
 * Created by whyse
 * on 2017/9/14 13:56
 */
@Service
public class ApplicationStarter implements ApplicationListener<ContextRefreshedEvent> {

    static Logger logger = LoggerFactory.getLogger(ApplicationStarter.class);
    @Autowired
    DemoEventSender demoEventSender;
    //==============================================================================
    //系统加载完成的事件
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //防止重复执行。
//        if(event.getApplicationContext().getParent() == null){
//            init();
//        }
//        init();
    }

    public int init(){
        demoEventSender.publish();
        return 0;
    }

}
