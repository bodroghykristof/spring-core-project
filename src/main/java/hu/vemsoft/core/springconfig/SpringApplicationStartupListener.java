package hu.vemsoft.core.springconfig;

import hu.vemsoft.core.service.LazyService;
import hu.vemsoft.core.service.UserService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * This class is responsible for running logic right after the application context has been set up.
 */
@Component
public class SpringApplicationStartupListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override public void onApplicationEvent(ContextRefreshedEvent event) {
        UserService userServiceBean = (UserService) SpringApplicationContext.getBean("userService");
        System.out.println(userServiceBean.findAll().size());
        // post construct method is only called here as this bean is defined as a lazy bean
        LazyService lazyService = (LazyService) SpringApplicationContext.getBean("lazyService");
    }
}
