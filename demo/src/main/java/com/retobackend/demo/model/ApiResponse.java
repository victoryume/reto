package com.retobackend.demo.model;

import java.util.List;

public class ApiResponse {
    List<DataResposeClient> data;
    public ApiResponse() {
    }

    public ApiResponse(List<DataResposeClient> data) {
        this.data = data;
    }

    public List<DataResposeClient> getData() {
        return data;
    }

    public void setData(List<DataResposeClient> data) {
        this.data = data;
    }
}
