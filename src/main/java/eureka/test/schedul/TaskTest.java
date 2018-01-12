package eureka.test.schedul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by whyse
 * on 2018/1/11 16:32
 */
//@Service
public class TaskTest {

    static  Logger logger = LoggerFactory.getLogger(TaskTest.class);
    //=================================================================
    @Scheduled(fixedDelay = 5000)
    public void fixedDelay(){
        logger.info("fixedDelay");
    }
    @Scheduled(fixedRate = 5000)
    public void fixedRate(){
        logger.info("fixedRate");
    }
    @Scheduled(cron = "0/5 * * * * *")
    public void cron(){
        logger.info("cron");
    }
}
