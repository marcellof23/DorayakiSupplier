
package com.dorayakisupplier.service.ws.DorayakiRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DorayakiReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DorayakiReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dorayakirequest_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="recipe_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DorayakiReqType", propOrder = {

})
public class DorayakiReqType {

    @XmlElement(name = "dorayakirequest_id")
    protected long dorayakirequestId;
    @XmlElement(name = "recipe_id")
    protected long recipeId;
    protected long qty;
    @XmlElement(required = true)
    protected String username;

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

    /**
     * Gets the value of the recipeId property.
     * 
     */
    public long getRecipeId() {
        return recipeId;
    }

    /**
     * Sets the value of the recipeId property.
     * 
     */
    public void setRecipeId(long value) {
        this.recipeId = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     */
    public long getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     */
    public void setQty(long value) {
        this.qty = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
