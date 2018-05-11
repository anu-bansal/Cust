package com.kkd.customerloginservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class CustomerLoginController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@HystrixCommand(fallbackMethod="fallBackCustomerLogin")
	@GetMapping("/customer/user/{phone_no}")
	public CustomerLoginConfiguration getPhoneNo(@PathVariable String phone_no) {
		logger.info("{}", "Getting phone no. to match with entered phone no. during login");
		return new CustomerLoginConfiguration(phone_no,"anu");
	}
	
	public String fallBackCustomerLogin() {
		return "fallback for phone no.";
	}

}
