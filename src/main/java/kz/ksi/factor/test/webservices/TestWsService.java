package kz.ksi.factor.test.webservices;

import kz.factor.resources.tofischema.GetMessageRequest;
import kz.factor.resources.tofischema.GetMessageResponse;
import kz.ksi.factor.test.repository.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Erlan.Ibraev on 05.07.2016.
 */
@Endpoint
public class TestWsService {

    private static final String NAMESPACE_URI = "http://www.factor.kz/resources/TOFISchema";

    private ITestService testService;

    public ITestService getTestService() {
        return testService;
    }

    @Autowired
    public void setTestService(ITestService testService) {
        this.testService = testService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMessageRequest")
    @ResponsePayload
    public GetMessageResponse getMessage(@RequestPayload GetMessageRequest request) {
        return testService.getMessageResponse(request);
    }
}
