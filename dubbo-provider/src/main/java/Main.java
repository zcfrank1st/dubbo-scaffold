import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by zcfrank1st on 12/2/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("这里是dubbo-provider服务，按任意键退出");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
