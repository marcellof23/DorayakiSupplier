
package com.dorayakisupplier.service.ws.DorayakiRequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DorayakiTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DorayakiTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dorayakirequests" type="{http://www.dorayaki.com/api/DorayakiService}DorayakiType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DorayakiTypes", propOrder = {
    "dorayakirequests"
})
public class DorayakiTypes {

    protected List<DorayakiType> dorayakirequests;

    /**
     * Gets the value of the dorayakirequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dorayakirequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDorayakirequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DorayakiType }
     * 
     * 
     */
    public List<DorayakiType> getDorayakirequests() {
        if (dorayakirequests == null) {
            dorayakirequests = new ArrayList<DorayakiType>();
        }
        return this.dorayakirequests;
    }

}
