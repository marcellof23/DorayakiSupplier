
package com.dorayakisupplier.service.ws.LogRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for log_request_idAsLong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="log_request_idAsLong">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="log_request_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "log_request_idAsLong", propOrder = {
    "logRequestId"
})
public class LogRequestIdAsLong {

    @XmlElement(name = "log_request_id")
    protected long logRequestId;

    /**
     * Gets the value of the logRequestId property.
     * 
     */
    public long getLogRequestId() {
        return logRequestId;
    }

    /**
     * Sets the value of the logRequestId property.
     * 
     */
    public void setLogRequestId(long value) {
        this.logRequestId = value;
    }

}
