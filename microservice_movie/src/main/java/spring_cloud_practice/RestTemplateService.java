package spring_cloud_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


public class RestTemplateService {
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
