
package com.dorayakisupplier.service.ws.DorayakiRequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dorayakirecipes" type="{http://www.dorayaki.com/api/DorayakiService}RecipeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeTypes", propOrder = {
    "dorayakirecipes"
})
public class RecipeTypes {

    protected List<RecipeType> dorayakirecipes;

    /**
     * Gets the value of the dorayakirecipes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dorayakirecipes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDorayakirecipes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipeType }
     * 
     * 
     */
    public List<RecipeType> getDorayakirecipes() {
        if (dorayakirecipes == null) {
            dorayakirecipes = new ArrayList<RecipeType>();
        }
        return this.dorayakirecipes;
    }

}
