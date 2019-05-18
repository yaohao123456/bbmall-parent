package cn.itsource.bbmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yh
 * @version V1.0
 * @className PlatApplication
 * @date 2019/5/12
 */
@SpringBootApplication
@EnableEurekaClient
//@MapperScan(basePackages = "cn.itsource.bbmall.mapper")
public class PlatApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatApplication.class,args);
    }
}
