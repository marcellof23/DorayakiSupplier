package com.dorayaki.dorayakisupplier.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class Hello {

    @WebMethod
    public String punten(String name) {
        return "Pararunten akang teteh" + name;
    }
}