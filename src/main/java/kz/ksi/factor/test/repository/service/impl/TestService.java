package kz.ksi.factor.test.repository.service.impl;

import kz.factor.resources.tofischema.GetMessageRequest;
import kz.factor.resources.tofischema.GetMessageResponse;
import kz.ksi.factor.test.repository.service.ITestService;
import org.springframework.stereotype.Component;

/**
 * Created by Erlan.Ibraev on 05.07.2016.
 */

@Component
public class TestService implements ITestService {

    public GetMessageResponse getMessageResponse(GetMessageRequest request) {
        GetMessageResponse result = new GetMessageResponse();

        return result;
    }

}
