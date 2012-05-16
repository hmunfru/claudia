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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



/**
 * <p>Java class for CIM_UserEntity_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIM_UserEntity_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity}CIM_UserEntity_Type">
 *       &lt;sequence>
 *         &lt;element name="hasCIM_SystemAdministrator" type="{http://schemas.telefonica.com/nuba-model/exp}CIM_ApplicationSystemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="URL_DRP" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasCIM_OrgStructure" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIM_UserEntity_Type", propOrder = {
    "hasCIMSystemAdministrator"
})
public class CIMUserEntityType
    extends org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_userentity.CIMUserEntityType
{

    @XmlElement(name = "hasCIM_SystemAdministrator")
    protected List<CIMApplicationSystemType> hasCIMSystemAdministrator;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "URL_DRP", required = true)
    protected String urldrp;
    @XmlAttribute(name = "hasCIM_OrgStructure", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object hasCIMOrgStructure;

    /**
     * Gets the value of the hasCIMSystemAdministrator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasCIMSystemAdministrator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasCIMSystemAdministrator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIMApplicationSystemType }
     * 
     * 
     */
    public List<CIMApplicationSystemType> getHasCIMSystemAdministrator() {
        if (hasCIMSystemAdministrator == null) {
            hasCIMSystemAdministrator = new ArrayList<CIMApplicationSystemType>();
        }
        return this.hasCIMSystemAdministrator;
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

    /**
     * Gets the value of the urldrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLDRP() {
        return urldrp;
    }

    /**
     * Sets the value of the urldrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLDRP(String value) {
        this.urldrp = value;
    }

    /**
     * Gets the value of the hasCIMOrgStructure property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHasCIMOrgStructure() {
        return hasCIMOrgStructure;
    }

    /**
     * Sets the value of the hasCIMOrgStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHasCIMOrgStructure(Object value) {
        this.hasCIMOrgStructure = value;
    }

}
