package com.dorayakisupplier.service;

import com.dorayakisupplier.model.DorayakiVariant;
import com.dorayakisupplier.repo.DorayakiVariantRepo;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class DorayakiService {

    private static final DorayakiVariantRepo dorayakiRepo = new DorayakiVariantRepo();

    @WebMethod
    public List<DorayakiVariant> getAllDorayaki(){
        try {
            return dorayakiRepo.getDorayakiVariants();
        } catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
