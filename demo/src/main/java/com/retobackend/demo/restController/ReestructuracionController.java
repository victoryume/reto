package com.retobackend.demo.restController;

import com.retobackend.demo.model.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.retobackend.demo.service.ReestructuracionService;

@RestController
@RequestMapping("/api/data")
public class ReestructuracionController {

    @Autowired
    private ReestructuracionService reestructuracionService;
    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public DataResponse reestructurar(){

        return  reestructuracionService.reestructurar();

    }



}
