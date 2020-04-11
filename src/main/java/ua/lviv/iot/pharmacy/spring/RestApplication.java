package ua.lviv.iot.pharmacy.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EntityScan("ua.lviv.iot.pharmacy.model")
@ComponentScan({"ua.lviv.iot.pharmacy.dataaccess",
  "ua.lviv.iot.pharmacy.business",
  "ua.lviv.iot.pharmacy.spring.controller"})
@EnableJpaRepositories({"ua.lviv.iot.pharmacy.dataaccess"})
public class RestApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

}
