package com.dorayakisupplier.service.impl;

import javax.jws.WebService;

import com.dorayakisupplier.service.ws.DorayakiRequest.DorayakirequestIdAsLong;
import com.dorayakisupplier.service.ws.DorayakiRequest.StatusCode;
import com.dorayakisupplier.service.ws.DorayakiRequest.DorayakiServicePortType;
import com.dorayakisupplier.service.ws.DorayakiRequest.DorayakiFault;
import com.dorayakisupplier.service.ws.DorayakiRequest.DorayakiType;
import com.dorayakisupplier.service.ws.DorayakiRequest.DorayakiTypes;

@WebService(endpointInterface = "com.dorayakisupplier.service.ws.DorayakiRequest.DorayakiServicePortType")
public class DorayakiRequestServiceImpl implements DorayakiServicePortType {
   public StatusCode addDorayaki (DorayakiType dorayakiType) throws DorayakiFault {
        // if ((logType.getIp() == null|| logType.getIp().equals("")) ) {
        //     throw new DorayakiFault("Log should not be null or empty ", "Wrong input Data");
        // }

        StatusCode code = new StatusCode();
        code.setCode(201);
        return code;
    }

    @Override
    public DorayakiTypes getDorayakis(DorayakirequestIdAsLong dorayakiID) throws DorayakiFault {
        if (dorayakiID.getDorayakirequestId() == 0) {
            throw new DorayakiFault("Id is not valid", "Wrong input Data");
        }
        DorayakiTypes result = new DorayakiTypes();

        DorayakiType dorayaki = new DorayakiType();
        dorayaki.setDorayakirequestId(1);
        // dorayaki.setEndpoint("http://localhost:8085/api/dorayakiService");
        // dorayaki.setIp("196.168.0.1");
        // dorayaki.setTimestamp("January 1, 2024, 00:00:00 GMT");

        DorayakiType dorayaki2 = new DorayakiType();
        dorayaki2.setDorayakirequestId(2);
        // dorayaki2.setEndpoint("http://localhost:8085/api/dorayakiService");
        // dorayaki2.setIp("196.168.1.1");
        // dorayaki2.setTimestamp("January 2, 2024, 00:00:00 GMT");

        // result.getdorayakis().add(dorayaki);
        // result.getdorayakis().add(dorayaki2);

        return result;
    }

    @Override
    public DorayakiType getDorayakiById(DorayakirequestIdAsLong params) throws DorayakiFault {
        return null;
    }

    public StatusCode deleteDorayaki(DorayakirequestIdAsLong params) throws DorayakiFault {
        return null;
    }

    @Override
    public StatusCode updateDorayaki(DorayakiType params) throws DorayakiFault {
        return null;
    }
}
