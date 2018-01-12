package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 这个类不能放在java路径下，应该建一个包，然后放进去
 *
 * Created by whyse
 * on 2017/8/28 12:03
 */
@EnableEurekaServer //本次eureka server 的注解
@SpringBootApplication //boot
//@EnableScheduling //启动任务模块解析
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
