package com.retobackend.demo.client;

import com.retobackend.demo.model.ApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class ReqresApiClient {
    @Value("${app.users.url:}")
    private String endpoint;
    public ApiResponse getDataResponse(){

        var headers = new HttpHeaders();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ApiResponse> response = restTemplate.exchange(getUserURI(), HttpMethod.GET, new HttpEntity<>(headers),
                new ParameterizedTypeReference<>() {});
        return response.getBody();
    }

    public URI getUserURI(){
        var userURI = UriComponentsBuilder
                .fromHttpUrl(endpoint)
                .build().encode().toUri();
        return userURI;
    }
}
