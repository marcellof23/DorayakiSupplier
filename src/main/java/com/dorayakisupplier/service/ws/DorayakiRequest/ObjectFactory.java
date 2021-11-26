
package com.dorayakisupplier.service.ws.DorayakiRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dorayakisupplier.service.ws.DorayakiRequest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DorayakiTypes_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "dorayakiTypes");
    private final static QName _DrID_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "drID");
    private final static QName _RecipeTypes_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "recipeTypes");
    private final static QName _UpdateStatusCode_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "updateStatusCode");
    private final static QName _UpdateDorayakiType_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "updateDorayakiType");
    private final static QName _DorayakiType_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "dorayakiType");
    private final static QName _DorayakiFault_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "dorayakiFault");
    private final static QName _DorayakiID_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "dorayakiID");
    private final static QName _RecipeID_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "recipeID");
    private final static QName _StatusCode_QNAME = new QName("http://www.dorayaki.com/api/DorayakiService", "statusCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dorayakisupplier.service.ws.DorayakiRequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DorayakiTypes }
     * 
     */
    public DorayakiTypes createDorayakiTypes() {
        return new DorayakiTypes();
    }

    /**
     * Create an instance of {@link RecipeTypes }
     * 
     */
    public RecipeTypes createRecipeTypes() {
        return new RecipeTypes();
    }

    /**
     * Create an instance of {@link StatusCode }
     * 
     */
    public StatusCode createStatusCode() {
        return new StatusCode();
    }

    /**
     * Create an instance of {@link DorayakirequestIdAsLong }
     * 
     */
    public DorayakirequestIdAsLong createDorayakirequestIdAsLong() {
        return new DorayakirequestIdAsLong();
    }

    /**
     * Create an instance of {@link DorayakiReqType }
     * 
     */
    public DorayakiReqType createDorayakiReqType() {
        return new DorayakiReqType();
    }

    /**
     * Create an instance of {@link DorayakiType }
     * 
     */
    public DorayakiType createDorayakiType() {
        return new DorayakiType();
    }

    /**
     * Create an instance of {@link RecipeIdAsLong }
     * 
     */
    public RecipeIdAsLong createRecipeIdAsLong() {
        return new RecipeIdAsLong();
    }

    /**
     * Create an instance of {@link DorayakiReqTypes }
     * 
     */
    public DorayakiReqTypes createDorayakiReqTypes() {
        return new DorayakiReqTypes();
    }

    /**
     * Create an instance of {@link RecipeType }
     * 
     */
    public RecipeType createRecipeType() {
        return new RecipeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DorayakiTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/DorayakiService", name = "dorayakiTypes")
    public JAXBElement<DorayakiTypes> createDorayakiTypes(DorayakiTypes value) {
        return new JAXBElement<DorayakiTypes>(_DorayakiTypes_QNAME, DorayakiTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DorayakirequestIdAsLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/DorayakiService", name = "drID")
    public JAXBElement<DorayakirequestIdAsLong> createDrID(DorayakirequestIdAsLong value) {
        return new JAXBElement<DorayakirequestIdAsLong>(_DrID_QNAME, DorayakirequestIdAsLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/DorayakiService", name = "recipeTypes")
    public JAXBElement<RecipeTypes> createRecipeTypes(RecipeTypes value) {
        return new JAXBElement<RecipeTypes>(_RecipeTypes_QNAME, RecipeTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/DorayakiService", name = "updateStatusCode")
    public JAXBElement<StatusCode> createUpdateStatusCode(StatusCode value) {
        return new JAXBElement<StatusCode>(_UpdateStatusCode_QNAME, StatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DorayakiReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/DorayakiService", name = "updateDorayakiType")
    public JAXBElement<DorayakiReqType> createUpdateDorayakiType(DorayakiReqType value) {
        return new JAXBElement<DorayakiReqType>(_UpdateDorayakiType_QNAME, DorayakiReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DorayakiType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/DorayakiService", name = "dorayakiType")
    public JAXBElement<DorayakiType> createDorayakiType(DorayakiType value) {
        return new JAXBElement<DorayakiType>(_DorayakiType_QNAME, DorayakiType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/DorayakiService", name = "dorayakiFault")
    public JAXBElement<String> createDorayakiFault(String value) {
        return new JAXBElement<String>(_DorayakiFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DorayakirequestIdAsLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/DorayakiService", name = "dorayakiID")
    public JAXBElement<DorayakirequestIdAsLong> createDorayakiID(DorayakirequestIdAsLong value) {
        return new JAXBElement<DorayakirequestIdAsLong>(_DorayakiID_QNAME, DorayakirequestIdAsLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeIdAsLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/DorayakiService", name = "recipeID")
    public JAXBElement<RecipeIdAsLong> createRecipeID(RecipeIdAsLong value) {
        return new JAXBElement<RecipeIdAsLong>(_RecipeID_QNAME, RecipeIdAsLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/DorayakiService", name = "statusCode")
    public JAXBElement<StatusCode> createStatusCode(StatusCode value) {
        return new JAXBElement<StatusCode>(_StatusCode_QNAME, StatusCode.class, null, value);
    }

}
