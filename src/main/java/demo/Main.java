package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        /**
         * This work for both xml configuration and annotation configuration
         * */

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MMMBs");
//        System.out.println(doctor);
//
//        Doctor doctor1 = context.getBean(Doctor.class);
//
//        System.out.println(doctor1);

    }
}
