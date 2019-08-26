package org.dxc.ngoi.order.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReceiveXcblOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceiveXcblOrderApplication.class, args);
	}

}
