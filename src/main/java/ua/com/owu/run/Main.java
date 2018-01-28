package ua.com.owu.run;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import javax.security.auth.login.Configuration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        LocalContainerEntityManagerFactoryBean entityManagerFactory =new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());


        try (ConfigurableApplicationContext context
                     = new ClassPathXmlApplicationContext("classpath:/META-INF/context.xml");
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("!!!!vvedit!!!");
            String name = scanner.next();
            String surname = scanner.next();

            UserService bean = context.getBean(UserService.class);
            bean.save(new User(name, surname));
        }

    }
}
