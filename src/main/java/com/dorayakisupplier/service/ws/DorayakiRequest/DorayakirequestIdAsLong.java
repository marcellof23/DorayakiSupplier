
package com.dorayakisupplier.service.ws.DorayakiRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dorayakirequest_idAsLong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dorayakirequest_idAsLong">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dorayakirequest_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dorayakirequest_idAsLong", propOrder = {
    "dorayakirequestId"
})
public class DorayakirequestIdAsLong {

    @XmlElement(name = "dorayakirequest_id")
    protected long dorayakirequestId;

    /**
     * Gets the value of the dorayakirequestId property.
     * 
     */
    public long getDorayakirequestId() {
        return dorayakirequestId;
    }

    /**
     * Sets the value of the dorayakirequestId property.
     * 
     */
    public void setDorayakirequestId(long value) {
        this.dorayakirequestId = value;
    }

}
