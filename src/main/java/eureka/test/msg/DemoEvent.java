package eureka.test.msg;

import org.springframework.context.ApplicationEvent;

/**
 * Created by whyse
 * on 2018/1/11 14:04
 */
public class DemoEvent extends ApplicationEvent{

    String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
