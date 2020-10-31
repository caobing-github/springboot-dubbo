package com.dubbo;

import com.dubbo.entity.Dept;
import com.dubbo.service.DeptService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});
        context.start();
        DeptService deptService =context.getBean(DeptService.class);
        Dept dept = deptService.queryByPcode("100001");
        System.out.println(dept);
//        UserService demoService = (UserService)context.getBean("userService"); // 获取远程服务代理
//        User hello = demoService.queryById("1"); // 执行远程方法
    }
}
