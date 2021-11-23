
package com.dorayakisupplier.service.ws.DorayakiRequest;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DorayakiService", targetNamespace = "http://www.dorayaki.com/api/DorayakiService", wsdlLocation = "file:/D:/ITB/Sem%205/WBD/Gitlab/dorayaki-supplier/src/main/java/com/dorayakisupplier/wsdl/DorayakiRequest/DorayakiRequestService.wsdl")
public class DorayakiService
    extends Service
{

    private final static URL DORAYAKISERVICE_WSDL_LOCATION;
    private final static WebServiceException DORAYAKISERVICE_EXCEPTION;
    private final static QName DORAYAKISERVICE_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "DorayakiService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/ITB/Sem%205/WBD/Gitlab/dorayaki-supplier/src/main/java/com/dorayakisupplier/wsdl/DorayakiRequest/DorayakiRequestService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DORAYAKISERVICE_WSDL_LOCATION = url;
        DORAYAKISERVICE_EXCEPTION = e;
    }

    public DorayakiService() {
        super(__getWsdlLocation(), DORAYAKISERVICE_QNAME);
    }

    public DorayakiService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DORAYAKISERVICE_QNAME, features);
    }

    public DorayakiService(URL wsdlLocation) {
        super(wsdlLocation, DORAYAKISERVICE_QNAME);
    }

    public DorayakiService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DORAYAKISERVICE_QNAME, features);
    }

    public DorayakiService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DorayakiService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DorayakiServicePortType
     */
    @WebEndpoint(name = "DorayakiServicePort")
    public DorayakiServicePortType getDorayakiServicePort() {
        return super.getPort(new QName("http://www.dorayaki.com/api/DorayakiService", "DorayakiServicePort"), DorayakiServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DorayakiServicePortType
     */
    @WebEndpoint(name = "DorayakiServicePort")
    public DorayakiServicePortType getDorayakiServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dorayaki.com/api/DorayakiService", "DorayakiServicePort"), DorayakiServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DORAYAKISERVICE_EXCEPTION!= null) {
            throw DORAYAKISERVICE_EXCEPTION;
        }
        return DORAYAKISERVICE_WSDL_LOCATION;
    }

}
