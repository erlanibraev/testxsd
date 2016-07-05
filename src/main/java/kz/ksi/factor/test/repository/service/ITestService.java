package kz.ksi.factor.test.repository.service;

import kz.factor.resources.tofischema.GetMessageRequest;
import kz.factor.resources.tofischema.GetMessageResponse;

/**
 * Created by Erlan.Ibraev on 05.07.2016.
 */
public interface ITestService {
    public GetMessageResponse getMessageResponse(GetMessageRequest request);
}
