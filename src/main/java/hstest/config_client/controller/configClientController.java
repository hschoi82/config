package hstest.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class configClientController {

    //@Value("${test.str}")
    @Value("${configserver.value}")
    private String cofigStr;

    @GetMapping("/test")
    public String test(){
        return cofigStr;
    }
}
