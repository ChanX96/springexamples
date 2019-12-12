package com.chanx.examples.ui;

import com.chanx.examples.dao.AccountDao;
import com.chanx.examples.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

// 模拟一个表现层，用于调用业务层
public class Client {

    // 获取spring容器的IOC核心容器，并根据id获取对象
    public static void main(String[] args) {

        // 1. 获取核心容器对象
        /*
        *  Application三个常用实现类：单例对象适用。
        *       ClassPathXmlApplicationContext：它可以加载类路径下的配置文件，要求配置文件必须在类路径下。
        *       FileSystemXmlApplicationContext：可以加载磁盘任意路径下的配置文件，必须有访问权限。
        *       AnnotationConfigApplicationContext：读取注解创建容器。
        *  BeanFactory：多例对象适用。
        *       创建核心容器时延迟加载。
        * */
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\code\\web\\spring\\src\\main\\resources\\bean.xml");
//        Resource resource = new ClassPathResource("bean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);

        // 2. 根据id获取bean对象
        AccountService as = (AccountService)ac.getBean("accountService");
        AccountDao ad = ac.getBean("accountDao", AccountDao.class);
//        AccountService as = (AccountService)factory.getBean("accountService");
//        AccountDao ad = factory.getBean("accountDao", AccountDao.class);

        as.saveAccount();
        System.out.println(ad);

        // 手动关闭容器
//        ac.close();
    }
}
