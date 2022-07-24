package cn.mask.mask.label.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.mask.mask.label.dubbo.**.dao")
public class MaskLabelDubboApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaskLabelDubboApplication.class, args);
    }
}
