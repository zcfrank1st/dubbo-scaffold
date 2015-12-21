import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import services.HelloService;

/**
 * Created by zcfrank1st on 12/2/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/consumer.xml")
public class StartConsumer {

    @Autowired
    private HelloService helloService;

    @Test
    public void test(){
        System.out.println("dubbo-consumer服务启动，调用！");
        helloService.sayHello();

    }
}
