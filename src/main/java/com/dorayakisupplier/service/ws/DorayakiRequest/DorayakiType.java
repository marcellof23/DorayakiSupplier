
package com.dorayakisupplier.service.ws.DorayakiRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DorayakiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DorayakiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dorayakirequest_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="recipe_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DorayakiType", propOrder = {

})
public class DorayakiType {

    @XmlElement(name = "dorayakirequest_id")
    protected long dorayakirequestId;
    @XmlElement(name = "recipe_id")
    protected long recipeId;
    protected long qty;

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

}
