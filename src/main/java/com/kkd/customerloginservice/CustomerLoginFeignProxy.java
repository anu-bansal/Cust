package com.kkd.customerloginservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="Customer-details-service")
@RibbonClient(name="Customer-details-service")
public class CustomerLoginFeignProxy {

}
