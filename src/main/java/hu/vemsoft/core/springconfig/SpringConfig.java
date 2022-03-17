package hu.vemsoft.core.springconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Base configuration for Spring framework
 */
@ComponentScan(basePackages = "hu.vemsoft.core")
@Configuration
public class SpringConfig {
}
