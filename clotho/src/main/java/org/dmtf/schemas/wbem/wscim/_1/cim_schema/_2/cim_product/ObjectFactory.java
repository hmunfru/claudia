//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.12 at 03:51:35 PM CET 
//


package org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_product;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.dmtf.schemas.wbem.wscim._1.common.CimDateTime;
import org.dmtf.schemas.wbem.wscim._1.common.CimString;
import org.dmtf.schemas.wbem.wscim._1.common.CimUnsignedInt;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_product package. 
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

    private final static QName _Caption_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", "Caption");
    private final static QName _WarrantyStartDate_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", "WarrantyStartDate");
    private final static QName _InstanceID_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", "InstanceID");
    private final static QName _WarrantyDuration_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", "WarrantyDuration");
    private final static QName _ElementName_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", "ElementName");
    private final static QName _Description_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", "Description");
    private final static QName _SKUNumber_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", "SKUNumber");
    private final static QName _CIMProduct_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", "CIM_Product");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_product
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Caption }
     * 
     */
    public Caption createCaption() {
        return new Caption();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link CIMProductType }
     * 
     */
    public CIMProductType createCIMProductType() {
        return new CIMProductType();
    }

    /**
     * Create an instance of {@link SKUNumber }
     * 
     */
    public SKUNumber createSKUNumber() {
        return new SKUNumber();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link IdentifyingNumber }
     * 
     */
    public IdentifyingNumber createIdentifyingNumber() {
        return new IdentifyingNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Caption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", name = "Caption")
    public JAXBElement<Caption> createCaption(Caption value) {
        return new JAXBElement<Caption>(_Caption_QNAME, Caption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", name = "WarrantyStartDate")
    public JAXBElement<CimDateTime> createWarrantyStartDate(CimDateTime value) {
        return new JAXBElement<CimDateTime>(_WarrantyStartDate_QNAME, CimDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", name = "InstanceID")
    public JAXBElement<CimString> createInstanceID(CimString value) {
        return new JAXBElement<CimString>(_InstanceID_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimUnsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", name = "WarrantyDuration")
    public JAXBElement<CimUnsignedInt> createWarrantyDuration(CimUnsignedInt value) {
        return new JAXBElement<CimUnsignedInt>(_WarrantyDuration_QNAME, CimUnsignedInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", name = "ElementName")
    public JAXBElement<CimString> createElementName(CimString value) {
        return new JAXBElement<CimString>(_ElementName_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", name = "Description")
    public JAXBElement<CimString> createDescription(CimString value) {
        return new JAXBElement<CimString>(_Description_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SKUNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", name = "SKUNumber")
    public JAXBElement<SKUNumber> createSKUNumber(SKUNumber value) {
        return new JAXBElement<SKUNumber>(_SKUNumber_QNAME, SKUNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIMProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_Product", name = "CIM_Product")
    public JAXBElement<CIMProductType> createCIMProduct(CIMProductType value) {
        return new JAXBElement<CIMProductType>(_CIMProduct_QNAME, CIMProductType.class, null, value);
    }

}