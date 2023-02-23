package com.retobackend.demo.service;

import com.retobackend.demo.client.ReqresApiClient;
import com.retobackend.demo.model.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ReestructuracionService {

    @Autowired
    ReqresApiClient apiClient;
    public DataResponse reestructurar() {

        List<String> data = apiClient.getDataResponse().getData().stream()
                .map( p -> p.getId() + "/" + p.getFirst_name() + "/" + p.getEmail())
                .collect(Collectors.toList());
        DataResponse dataResponse = new DataResponse();
        dataResponse.setData(data);
        return dataResponse;
    }
}
