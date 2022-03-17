package hu.vemsoft.core;

import hu.vemsoft.core.springconfig.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Entry point of the application. May be removed later.
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext CONTEXT = new AnnotationConfigApplicationContext(SpringConfig.class);

    }

}
