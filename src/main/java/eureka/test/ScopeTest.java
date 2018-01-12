package eureka.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by whyse
 * on 2018/1/11 13:34
 */
@Component
@Scope("prototype")
public class ScopeTest {
    //默认是单例singleton prototype(每次调用创建一个bean)
    //@Import(EurekaServerConfiguration.class)  可以将该类实例化，添加到上下文容器中。
    //@Configuration 表名这是一个配置类，相当于spring中的xml
}
