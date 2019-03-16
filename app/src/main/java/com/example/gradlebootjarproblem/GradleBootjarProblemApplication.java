package com.example.gradlebootjarproblem;

import com.example.bar.BarClient;
import com.example.foo.FooClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GradleBootjarProblemApplication {

  public static void main(String[] args) {
    SpringApplication.run(GradleBootjarProblemApplication.class, args);
  }

  @Bean
  public FooClient fooClient() {
    return new FooClient();
  }

  @Bean
  public BarClient barClient() {
    return new BarClient();
  }

}
