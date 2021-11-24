package com.dorayakisupplier.service.impl;


import javax.jws.WebService;

import com.google.gson.Gson;
import com.dorayakisupplier.service.ws.DorayakiRequest.DorayakirequestIdAsLong;
import com.dorayakisupplier.service.ws.DorayakiRequest.StatusCode;
import com.dorayakisupplier.service.ws.DorayakiRequest.DorayakiServicePortType;
import com.dorayakisupplier.model.Axios;
import com.dorayakisupplier.service.ws.DorayakiRequest.DorayakiFault;
import com.dorayakisupplier.service.ws.DorayakiRequest.DorayakiType;
import com.dorayakisupplier.service.ws.DorayakiRequest.DorayakiTypes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.XML;

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
        dorayaki.setRecipeId(1);
        dorayaki.setQty(10);

        DorayakiType dorayaki2 = new DorayakiType();
        dorayaki2.setDorayakirequestId(2);
        dorayaki2.setRecipeId(2);
        dorayaki.setQty(20);

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
        DorayakiType dorayaki = new DorayakiType();
        dorayaki.setRecipeId(params.getRecipeId());
        dorayaki.setQty(params.getQty());
        
        String payload = "{"
            + String.format("\"recipe_id\":\"%d\",", dorayaki.getRecipeId())
            + String.format("\"qty\":\"%d\"", dorayaki.getQty())
            + "}";
        
        Axios axios = new Axios("http://localhost:5001/api");
        String url = "/dorayaki-request";
        String res = axios.post(url, payload);

        System.out.println(res);
        System.out.println(res.split(","));

        JsonObject o = new JsonParser().parse(res).getAsJsonObject();
        System.out.println("INII JSON OBJECTTTTTT");
        System.out.println(o);

        String xml = XML.toString(o);
        System.out.println("INII XML OBJECTTTTTT");
        System.out.println(xml);

        //ganti jadi json dulu si res nya terus ambil res.code
        String ok = "\"status\":\"OK\"";

        StatusCode code = new StatusCode();

        if(res.indexOf(ok) != -1){
          code.setCode(200);
        }

        return code;
    }
}
