package kz.ksi.factor.test.repository.service.impl;

import kz.factor.resources.tofischema.BodyType;
import kz.factor.resources.tofischema.GetMessageRequest;
import kz.factor.resources.tofischema.GetMessageResponse;
import kz.factor.resources.tofischema.data.DataType;
import kz.factor.resources.tofischema.metadata.MetaDataType;
import kz.ksi.factor.test.repository.service.ITestService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Erlan.Ibraev on 05.07.2016.
 */

@Component
public class TestService implements ITestService {

    public GetMessageResponse getMessageResponse(GetMessageRequest request) {
        GetMessageResponse result = new GetMessageResponse();

        result.setBody(makeBody());

        return result;
    }

    private BodyType makeBody() {
        BodyType result = new BodyType();
        result.setMetadata(makeMetaData());
        makeDate(result.getData());
        return result;
    }

    private void makeDate(List<DataType> data) {

        for(int i=0; i < 10; i++) {
            data.add(makeDateItem());
        }

    }

    private DataType makeDateItem() {
        DataType result = new DataType();
        return result;
    }

    private MetaDataType makeMetaData() {
        return null;
    }

}
