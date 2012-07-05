//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.12 at 03:51:35 PM CET 
//


package com.telefonica.schemas.nuba_model.exp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CIM_SoftwareElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIM_SoftwareElementType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareElement}CIM_SoftwareElement_Type">
 *       &lt;sequence>
 *         &lt;element name="hasCIM_CollectedSoftwareElements" type="{http://schemas.telefonica.com/nuba-model/exp}CIM_InstalledProduct_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIM_SoftwareElementType", propOrder = {
    "hasCIMCollectedSoftwareElements"
})
public class CIMSoftwareElementType
    extends org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_softwareelement.CIMSoftwareElementType
{

    @XmlElement(name = "hasCIM_CollectedSoftwareElements")
    protected List<CIMInstalledProductType> hasCIMCollectedSoftwareElements;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the hasCIMCollectedSoftwareElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasCIMCollectedSoftwareElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasCIMCollectedSoftwareElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIMInstalledProductType }
     * 
     * 
     */
    public List<CIMInstalledProductType> getHasCIMCollectedSoftwareElements() {
        if (hasCIMCollectedSoftwareElements == null) {
            hasCIMCollectedSoftwareElements = new ArrayList<CIMInstalledProductType>();
        }
        return this.hasCIMCollectedSoftwareElements;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}