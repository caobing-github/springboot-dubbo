import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: dubbo
 * @description:
 * @author: caobing
 * @createtime: 2020-10-10
 */
public class App {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
