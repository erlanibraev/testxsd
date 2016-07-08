package kz.ksi.factor.test.repository.service;


import kz.factor.resources.tofischema.GetDataRequest;
import kz.factor.resources.tofischema.GetDataResponse;

/**
 * Created by Erlan.Ibraev on 05.07.2016.
 */
public interface ITestService {
    public GetDataResponse getMessageResponse(GetDataRequest request);
}
