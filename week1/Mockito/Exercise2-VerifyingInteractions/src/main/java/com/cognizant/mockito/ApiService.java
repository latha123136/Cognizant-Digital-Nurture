package com.cognizant.mockito;

public class ApiService {

    private ExternalApi api;

    public ApiService(ExternalApi api) {
        this.api = api;
    }

    public void process() {
        api.sendData("Hello Mockito");
    }
}