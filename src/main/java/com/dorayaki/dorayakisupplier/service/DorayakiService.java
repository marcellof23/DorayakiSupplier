package com.dorayaki.dorayakisupplier.service;

import com.dorayaki.dorayakisupplier.model.Dorayaki;
import com.dorayaki.dorayakisupplier.repo.DorayakiRepo;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class DorayakiService {

    private static final DorayakiRepo dorayakiRepo = new DorayakiRepo();

    @WebMethod
    public List<Dorayaki> getAllDorayaki(){
        try {
            return dorayakiRepo.getAllDorayaki();
        } catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
