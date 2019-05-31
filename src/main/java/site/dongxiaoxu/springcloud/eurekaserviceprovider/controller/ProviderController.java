package site.dongxiaoxu.springcloud.eurekaserviceprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    private AtomicInteger count = new AtomicInteger(0);

    @RequestMapping("/msg")
    public String getMsg(String name) {

        return "hello " + name + " count: " +  count.incrementAndGet();
    }
}
