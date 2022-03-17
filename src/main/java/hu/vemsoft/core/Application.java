package hu.vemsoft.core;

import hu.vemsoft.core.springconfig.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point of the application. May be removed later.
 * Defines different types of application contexts which could theoretically also used in parallel.
 */
public class Application {

    public static void main(String[] args) {

        // Uses annotations present in Java classes
        ApplicationContext annotationBasedConfig = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Uses beans.xml resource file on classpath
        // ApplicationContext xmlBasedConfig = new ClassPathXmlApplicationContext("beans.xml");

    }

}
