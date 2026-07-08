package com.cognizant.mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        ApiService service = new ApiService(mockApi);

        service.process();

        verify(mockApi).sendData("Hello Mockito");
    }
}