package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * There five different types of scope available in spring bean.
 * By defaults, it will Singleton, but we can specify the scope.
 * 1. Singleton -> One object in the entire application
 * 2. Prototype -> You will get different object everytime you request the object from the container.
 * 3. Request -> Is used when you need one object or
 *          different object for each of the request you receive in the application.
 * 4. Session ->
 * 5. Global session
 *
 * The last three (i.e. Request, Session and Global session) are used mainly when there is a
 * web aware context available (i.e. when we are implementing the spring MCV).
 * */


@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfig {


    @Bean
    public Doctor doctor(){
        return new Doctor();
    }
}
