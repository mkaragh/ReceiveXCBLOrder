package org.dxc.ngoi.order.receiver;

import java.io.FileOutputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ReceiveXcblOrderApplication {

	public static void main(String[] args) throws Exception{
		
		FileCopyUtils.copy(new ClassPathResource("server.truststore.jks").getInputStream(),
				new FileOutputStream("/tmp/server.truststore.jks"));
		SpringApplication.run(ReceiveXcblOrderApplication.class, args);
	}

}
