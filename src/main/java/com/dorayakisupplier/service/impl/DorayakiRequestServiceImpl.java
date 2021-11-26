package com.dorayakisupplier.service.impl;


import javax.jws.WebService;

import com.dorayakisupplier.service.ws.LogRequest.LogType;
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

import java.io.*;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.XML;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLEncoder  ;
import java.net.URL;
import java.util.List;

@WebService(endpointInterface = "com.dorayakisupplier.service.ws.DorayakiRequest.DorayakiServicePortType")
public class DorayakiRequestServiceImpl implements DorayakiServicePortType {
   public StatusCode addDorayaki (DorayakiType dorayakiType) throws DorayakiFault, IOException {
        // if ((logType.getIp() == null|| logType.getIp().equals("")) ) {
        //     throw new DorayakiFault("Log should not be null or empty ", "Wrong input Data");
        // }

        String apiName = "dorayaki-request";
        Integer id = 1;
        Integer qty = 10;

        HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:5001/api/" + apiName).openConnection();

       connection.setRequestMethod("POST");
       connection.setRequestProperty("Content-Type", "application/json; utf-8");
       connection.setRequestProperty("Accept", "application/json");
       connection.setDoOutput(true);

       String jsonInputString = "{\"recipe_id\": 1, \"qty\": 5}";

       try(OutputStream os = connection.getOutputStream()) {
           byte[] input = jsonInputString.getBytes("utf-8");
           os.write(input, 0, input.length);
       }

       System.out.println("POST was successful.");

       StatusCode code = new StatusCode();

       if(200 == 200){
           code.setCode(201);
           System.out.println("POST was successful.");
       }
       else if(300 == 401){
           code.setCode(401);
           System.out.println("Bad request.");
       }

        return code;
    }

    @Override
    public DorayakiTypes getDorayakis(DorayakirequestIdAsLong dorayakiID) throws DorayakiFault {
        DorayakiTypes result = new DorayakiTypes();

        Axios axios = new Axios("http://localhost:5001/api");
        String url = "/dorayaki-request";
        String res = axios.get(url);
        System.out.println(res);
        JSONObject dorayakiObj = new JSONObject(res);

        JSONArray dorayakiArr = dorayakiObj.getJSONArray("data");

        for(int i=0;i<dorayakiArr.length();i++){
            JSONObject dorayakiArrItem = dorayakiArr.getJSONObject(i);
            DorayakiType dorayaki = new DorayakiType();
            dorayaki.setDorayakirequestId(dorayakiArrItem.getInt("dorayakirequest_id"));
            dorayaki.setRecipeId(dorayakiArrItem.getInt("recipe_id"));
            dorayaki.setQty(dorayakiArrItem.getInt("qty"));

            result.getDorayakirequests().add(dorayaki);
        }
        return result;
    }

    @Override
    public DorayakiType getDorayakiById(DorayakirequestIdAsLong params) throws DorayakiFault {
        if (params.getDorayakirequestId() < 0) {
            throw new DorayakiFault("Id is not valid", "Wrong input Data");
        }

        long param = params.getDorayakirequestId();

        Axios axios = new Axios("http://localhost:5001/api");
        String url = "/dorayaki-request/" + param;
        String res = axios.get(url);

        JSONObject dorayakiObj = new JSONObject(res);
        JSONObject dorayakiItem = dorayakiObj.getJSONObject("data");

        DorayakiType dorayaki = new DorayakiType();
        dorayaki.setDorayakirequestId(dorayakiItem.getInt("dorayakirequest_id"));
        dorayaki.setRecipeId(dorayakiItem.getInt("recipe_id"));
        dorayaki.setQty(dorayakiItem.getInt("qty"));

        return dorayaki;
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

        JSONObject dorayakiObj = new JSONObject(res);
        System.out.println(dorayakiObj);
        Integer statusCode = dorayakiObj.getInt("code");

        StatusCode code = new StatusCode();

        if(statusCode == 200){
            code.setCode(200);
            System.out.println("POST was successful.");
        }
        else if(300 == 401){
            code.setCode(401);
            System.out.println("Bad request.");
        }

        return code;
    }
}
