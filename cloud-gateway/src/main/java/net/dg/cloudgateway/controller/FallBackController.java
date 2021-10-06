package net.dg.cloudgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

    @RequestMapping("/userFallBack")
    public Mono<String> orderServiceFallBack() {
        return Mono.just("User Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/departmentFallback")
    public Mono<String> paymentServiceFallBack() {
        return Mono.just("Department Service is taking too long to respond or is down. Please try again later");
    }
}