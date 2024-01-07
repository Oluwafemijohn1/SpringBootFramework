package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /**
         * This work for both xml configuration and annotation configuration
         * */
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        
        Staff doctor = context.getBean(Doctor.class);
//        Staff nurse = (Nurse) context.getBean("nurse");
        doctor.assist();
//        nurse.assist();
    }
}
