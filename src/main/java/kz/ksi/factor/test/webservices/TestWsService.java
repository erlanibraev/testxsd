package kz.ksi.factor.test.webservices;

import kz.factor.resources.tofischema.GetDataRequest;
import kz.factor.resources.tofischema.GetDataResponse;
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

    public static final String NAMESPACE_URI = "http://www.factor.kz/resources/TOFISchema";

    private ITestService testService;

    public ITestService getTestService() {
        return testService;
    }

    @Autowired
    public void setTestService(ITestService testService) {
        this.testService = testService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDataRequest")
    @ResponsePayload
    public GetDataResponse getData(@RequestPayload GetDataRequest request) {
        return testService.getMessageResponse(request);
    }

}
