package com.retobackend.demo.service;

import com.retobackend.demo.client.ReqresApiClient;
import com.retobackend.demo.model.ApiResponse;
import com.retobackend.demo.model.DataResponse;
import com.retobackend.demo.model.DataResposeClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class ReestructuracionServiceTest {

    //@MockBean
    //ReqresApiClient apiClient;

    @Autowired
    ReestructuracionService reestructuracionService;
    @Test
    void reestructurar() {

        DataResponse result = reestructuracionService.reestructurar();
        assertTrue(result.getData().size()==6);
    }
}