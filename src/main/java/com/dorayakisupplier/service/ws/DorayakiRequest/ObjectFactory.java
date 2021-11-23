
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

    private final static QName _LgID_QNAME = new QName("http://www.dorayaki.com/api/LogService", "lgID");
    private final static QName _UpdateStatusCode_QNAME = new QName("http://www.dorayaki.com/api/LogService", "updateStatusCode");
    private final static QName _UpdateLogType_QNAME = new QName("http://www.dorayaki.com/api/LogService", "updateLogType");
    private final static QName _LogType_QNAME = new QName("http://www.dorayaki.com/api/LogService", "logType");
    private final static QName _LogFault_QNAME = new QName("http://www.dorayaki.com/api/LogService", "logFault");
    private final static QName _DeleteStatusCode_QNAME = new QName("http://www.dorayaki.com/api/LogService", "deleteStatusCode");
    private final static QName _DeleteID_QNAME = new QName("http://www.dorayaki.com/api/LogService", "deleteID");
    private final static QName _StatusCode_QNAME = new QName("http://www.dorayaki.com/api/LogService", "statusCode");
    private final static QName _LogID_QNAME = new QName("http://www.dorayaki.com/api/LogService", "logID");
    private final static QName _LogTypes_QNAME = new QName("http://www.dorayaki.com/api/LogService", "logTypes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dorayakisupplier.service.ws.DorayakiRequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LogType }
     * 
     */
    public LogType createLogType() {
        return new LogType();
    }

    /**
     * Create an instance of {@link StatusCode }
     * 
     */
    public StatusCode createStatusCode() {
        return new StatusCode();
    }

    /**
     * Create an instance of {@link LogRequestIdAsLong }
     * 
     */
    public LogRequestIdAsLong createLogRequestIdAsLong() {
        return new LogRequestIdAsLong();
    }

    /**
     * Create an instance of {@link LogTypes }
     * 
     */
    public LogTypes createLogTypes() {
        return new LogTypes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogRequestIdAsLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/LogService", name = "lgID")
    public JAXBElement<LogRequestIdAsLong> createLgID(LogRequestIdAsLong value) {
        return new JAXBElement<LogRequestIdAsLong>(_LgID_QNAME, LogRequestIdAsLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/LogService", name = "updateStatusCode")
    public JAXBElement<StatusCode> createUpdateStatusCode(StatusCode value) {
        return new JAXBElement<StatusCode>(_UpdateStatusCode_QNAME, StatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/LogService", name = "updateLogType")
    public JAXBElement<LogType> createUpdateLogType(LogType value) {
        return new JAXBElement<LogType>(_UpdateLogType_QNAME, LogType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/LogService", name = "logType")
    public JAXBElement<LogType> createLogType(LogType value) {
        return new JAXBElement<LogType>(_LogType_QNAME, LogType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/LogService", name = "logFault")
    public JAXBElement<String> createLogFault(String value) {
        return new JAXBElement<String>(_LogFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/LogService", name = "deleteStatusCode")
    public JAXBElement<StatusCode> createDeleteStatusCode(StatusCode value) {
        return new JAXBElement<StatusCode>(_DeleteStatusCode_QNAME, StatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogRequestIdAsLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/LogService", name = "deleteID")
    public JAXBElement<LogRequestIdAsLong> createDeleteID(LogRequestIdAsLong value) {
        return new JAXBElement<LogRequestIdAsLong>(_DeleteID_QNAME, LogRequestIdAsLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/LogService", name = "statusCode")
    public JAXBElement<StatusCode> createStatusCode(StatusCode value) {
        return new JAXBElement<StatusCode>(_StatusCode_QNAME, StatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogRequestIdAsLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/LogService", name = "logID")
    public JAXBElement<LogRequestIdAsLong> createLogID(LogRequestIdAsLong value) {
        return new JAXBElement<LogRequestIdAsLong>(_LogID_QNAME, LogRequestIdAsLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dorayaki.com/api/LogService", name = "logTypes")
    public JAXBElement<LogType> createLogTypes(LogType value) {
        return new JAXBElement<LogType>(_LogTypes_QNAME, LogType.class, null, value);
    }

}
