package hello.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    /*
    @Bean
    public UserService someDummyBean1(UserMapper userMapper) {
        return new UserService(userMapper);
    }
    @Bean
    public OrderService someDummyBean2(UserService userService) {
        return new OrderService(userService);
    }
    */

    /*
    使用 代替这里的 @Bean
    @Service
    public class OrderService {
       ...
    }
    */
}