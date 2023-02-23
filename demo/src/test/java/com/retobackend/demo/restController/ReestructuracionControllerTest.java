package com.retobackend.demo.restController;

import com.retobackend.demo.model.DataResponse;
import com.retobackend.demo.service.ReestructuracionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ReestructuracionControllerTest {

    @InjectMocks
    ReestructuracionController reestructuracionController;
    @Mock
    ReestructuracionService reestructuracionService;
    @Test
    void reestructurar() {
        List<String> listData = Arrays.asList("1/George/george.bluth@reqres.in", "2/Janet/janet.weaver@reqres.in");
        DataResponse data = new DataResponse();
        data.setData(listData);

        when(reestructuracionService.reestructurar()).thenReturn(data);

        DataResponse result = reestructuracionController.reestructurar();
        assertTrue(result.getData().size()==2);

    }
}