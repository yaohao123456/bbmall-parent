package cn.itsource.bbmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yh
 * @version V1.0
 * @className ProductServiceApplication
 * @date 2019/5/17
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("cn.itsource.bbmall.mapper")
public class ProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class,args);
    }
}
