/*
 * An XML document type.
 * Localname: GetInfoByCity
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByCityDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetInfoByCity(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetInfoByCityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByCityDocument
{
    
    public GetInfoByCityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINFOBYCITY$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByCity");
    
    
    /**
     * Gets the "GetInfoByCity" element
     */
    public net.webservicex.www.GetInfoByCityDocument.GetInfoByCity getGetInfoByCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByCityDocument.GetInfoByCity target = null;
            target = (net.webservicex.www.GetInfoByCityDocument.GetInfoByCity)get_store().find_element_user(GETINFOBYCITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetInfoByCity" element
     */
    public void setGetInfoByCity(net.webservicex.www.GetInfoByCityDocument.GetInfoByCity getInfoByCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByCityDocument.GetInfoByCity target = null;
            target = (net.webservicex.www.GetInfoByCityDocument.GetInfoByCity)get_store().find_element_user(GETINFOBYCITY$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetInfoByCityDocument.GetInfoByCity)get_store().add_element_user(GETINFOBYCITY$0);
            }
            target.set(getInfoByCity);
        }
    }
    
    /**
     * Appends and returns a new empty "GetInfoByCity" element
     */
    public net.webservicex.www.GetInfoByCityDocument.GetInfoByCity addNewGetInfoByCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByCityDocument.GetInfoByCity target = null;
            target = (net.webservicex.www.GetInfoByCityDocument.GetInfoByCity)get_store().add_element_user(GETINFOBYCITY$0);
            return target;
        }
    }
    /**
     * An XML GetInfoByCity(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetInfoByCityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByCityDocument.GetInfoByCity
    {
        
        public GetInfoByCityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USCITY$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "USCity");
        
        
        /**
         * Gets the "USCity" element
         */
        public java.lang.String getUSCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USCITY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "USCity" element
         */
        public org.apache.xmlbeans.XmlString xgetUSCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USCITY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "USCity" element
         */
        public boolean isSetUSCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USCITY$0) != 0;
            }
        }
        
        /**
         * Sets the "USCity" element
         */
        public void setUSCity(java.lang.String usCity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USCITY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USCITY$0);
                }
                target.setStringValue(usCity);
            }
        }
        
        /**
         * Sets (as xml) the "USCity" element
         */
        public void xsetUSCity(org.apache.xmlbeans.XmlString usCity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USCITY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USCITY$0);
                }
                target.set(usCity);
            }
        }
        
        /**
         * Unsets the "USCity" element
         */
        public void unsetUSCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USCITY$0, 0);
            }
        }
    }
}
