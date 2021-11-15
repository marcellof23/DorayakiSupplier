
package com.dorayakisupplier.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dorayakisupplier.service package. 
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

    private final static QName _TutorialTypes_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "tutorialTypes");
    private final static QName _TutID_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "tutID");
    private final static QName _TutorialType_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "tutorialType");
    private final static QName _UpdateStatusCode_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "updateStatusCode");
    private final static QName _UpdateTutorialType_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "updateTutorialType");
    private final static QName _DeleteStatusCode_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "deleteStatusCode");
    private final static QName _TutorialID_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "tutorialID");
    private final static QName _StatusCode_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "statusCode");
    private final static QName _DeleteID_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "deleteID");
    private final static QName _TutorialFault_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "tutorialFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dorayakisupplier.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusCode }
     * 
     */
    public StatusCode createStatusCode() {
        return new StatusCode();
    }

    /**
     * Create an instance of {@link TutorialType }
     * 
     */
    public TutorialType createTutorialType() {
        return new TutorialType();
    }

    /**
     * Create an instance of {@link TutorialTypes }
     * 
     */
    public TutorialTypes createTutorialTypes() {
        return new TutorialTypes();
    }

    /**
     * Create an instance of {@link IdAsLong }
     * 
     */
    public IdAsLong createIdAsLong() {
        return new IdAsLong();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TutorialTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "tutorialTypes")
    public JAXBElement<TutorialTypes> createTutorialTypes(TutorialTypes value) {
        return new JAXBElement<TutorialTypes>(_TutorialTypes_QNAME, TutorialTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdAsLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "tutID")
    public JAXBElement<IdAsLong> createTutID(IdAsLong value) {
        return new JAXBElement<IdAsLong>(_TutID_QNAME, IdAsLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TutorialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "tutorialType")
    public JAXBElement<TutorialType> createTutorialType(TutorialType value) {
        return new JAXBElement<TutorialType>(_TutorialType_QNAME, TutorialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "updateStatusCode")
    public JAXBElement<StatusCode> createUpdateStatusCode(StatusCode value) {
        return new JAXBElement<StatusCode>(_UpdateStatusCode_QNAME, StatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TutorialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "updateTutorialType")
    public JAXBElement<TutorialType> createUpdateTutorialType(TutorialType value) {
        return new JAXBElement<TutorialType>(_UpdateTutorialType_QNAME, TutorialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "deleteStatusCode")
    public JAXBElement<StatusCode> createDeleteStatusCode(StatusCode value) {
        return new JAXBElement<StatusCode>(_DeleteStatusCode_QNAME, StatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdAsLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "tutorialID")
    public JAXBElement<IdAsLong> createTutorialID(IdAsLong value) {
        return new JAXBElement<IdAsLong>(_TutorialID_QNAME, IdAsLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "statusCode")
    public JAXBElement<StatusCode> createStatusCode(StatusCode value) {
        return new JAXBElement<StatusCode>(_StatusCode_QNAME, StatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdAsLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "deleteID")
    public JAXBElement<IdAsLong> createDeleteID(IdAsLong value) {
        return new JAXBElement<IdAsLong>(_DeleteID_QNAME, IdAsLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "tutorialFault")
    public JAXBElement<String> createTutorialFault(String value) {
        return new JAXBElement<String>(_TutorialFault_QNAME, String.class, null, value);
    }

}
