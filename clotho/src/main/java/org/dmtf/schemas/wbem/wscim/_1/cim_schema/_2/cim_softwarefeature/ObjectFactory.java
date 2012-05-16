//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.12 at 03:51:35 PM CET 
//


package org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_softwarefeature;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.dmtf.schemas.wbem.wscim._1.common.CimDateTime;
import org.dmtf.schemas.wbem.wscim._1.common.CimString;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_softwarefeature package. 
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

    private final static QName _OperatingStatus_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "OperatingStatus");
    private final static QName _CIMSoftwareFeature_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "CIM_SoftwareFeature");
    private final static QName _Status_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "Status");
    private final static QName _Description_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "Description");
    private final static QName _ElementName_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "ElementName");
    private final static QName _InstanceID_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "InstanceID");
    private final static QName _CommunicationStatus_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "CommunicationStatus");
    private final static QName _DetailedStatus_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "DetailedStatus");
    private final static QName _StatusDescriptions_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "StatusDescriptions");
    private final static QName _PrimaryStatus_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "PrimaryStatus");
    private final static QName _Caption_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "Caption");
    private final static QName _HealthState_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "HealthState");
    private final static QName _InstallDate_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "InstallDate");
    private final static QName _OperationalStatus_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", "OperationalStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_softwarefeature
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CommunicationStatus }
     * 
     */
    public CommunicationStatus createCommunicationStatus() {
        return new CommunicationStatus();
    }

    /**
     * Create an instance of {@link HealthState }
     * 
     */
    public HealthState createHealthState() {
        return new HealthState();
    }

    /**
     * Create an instance of {@link PrimaryStatus }
     * 
     */
    public PrimaryStatus createPrimaryStatus() {
        return new PrimaryStatus();
    }

    /**
     * Create an instance of {@link IdentifyingNumber }
     * 
     */
    public IdentifyingNumber createIdentifyingNumber() {
        return new IdentifyingNumber();
    }

    /**
     * Create an instance of {@link OperationalStatus }
     * 
     */
    public OperationalStatus createOperationalStatus() {
        return new OperationalStatus();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link Caption }
     * 
     */
    public Caption createCaption() {
        return new Caption();
    }

    /**
     * Create an instance of {@link ProductName }
     * 
     */
    public ProductName createProductName() {
        return new ProductName();
    }

    /**
     * Create an instance of {@link CIMSoftwareFeatureType }
     * 
     */
    public CIMSoftwareFeatureType createCIMSoftwareFeatureType() {
        return new CIMSoftwareFeatureType();
    }

    /**
     * Create an instance of {@link OperatingStatus }
     * 
     */
    public OperatingStatus createOperatingStatus() {
        return new OperatingStatus();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link DetailedStatus }
     * 
     */
    public DetailedStatus createDetailedStatus() {
        return new DetailedStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "OperatingStatus")
    public JAXBElement<OperatingStatus> createOperatingStatus(OperatingStatus value) {
        return new JAXBElement<OperatingStatus>(_OperatingStatus_QNAME, OperatingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIMSoftwareFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "CIM_SoftwareFeature")
    public JAXBElement<CIMSoftwareFeatureType> createCIMSoftwareFeature(CIMSoftwareFeatureType value) {
        return new JAXBElement<CIMSoftwareFeatureType>(_CIMSoftwareFeature_QNAME, CIMSoftwareFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "Status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "Description")
    public JAXBElement<CimString> createDescription(CimString value) {
        return new JAXBElement<CimString>(_Description_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "ElementName")
    public JAXBElement<CimString> createElementName(CimString value) {
        return new JAXBElement<CimString>(_ElementName_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "InstanceID")
    public JAXBElement<CimString> createInstanceID(CimString value) {
        return new JAXBElement<CimString>(_InstanceID_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "CommunicationStatus")
    public JAXBElement<CommunicationStatus> createCommunicationStatus(CommunicationStatus value) {
        return new JAXBElement<CommunicationStatus>(_CommunicationStatus_QNAME, CommunicationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailedStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "DetailedStatus")
    public JAXBElement<DetailedStatus> createDetailedStatus(DetailedStatus value) {
        return new JAXBElement<DetailedStatus>(_DetailedStatus_QNAME, DetailedStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "StatusDescriptions")
    public JAXBElement<CimString> createStatusDescriptions(CimString value) {
        return new JAXBElement<CimString>(_StatusDescriptions_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimaryStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "PrimaryStatus")
    public JAXBElement<PrimaryStatus> createPrimaryStatus(PrimaryStatus value) {
        return new JAXBElement<PrimaryStatus>(_PrimaryStatus_QNAME, PrimaryStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Caption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "Caption")
    public JAXBElement<Caption> createCaption(Caption value) {
        return new JAXBElement<Caption>(_Caption_QNAME, Caption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HealthState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "HealthState")
    public JAXBElement<HealthState> createHealthState(HealthState value) {
        return new JAXBElement<HealthState>(_HealthState_QNAME, HealthState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "InstallDate")
    public JAXBElement<CimDateTime> createInstallDate(CimDateTime value) {
        return new JAXBElement<CimDateTime>(_InstallDate_QNAME, CimDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationalStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_SoftwareFeature", name = "OperationalStatus")
    public JAXBElement<OperationalStatus> createOperationalStatus(OperationalStatus value) {
        return new JAXBElement<OperationalStatus>(_OperationalStatus_QNAME, OperationalStatus.class, null, value);
    }

}
