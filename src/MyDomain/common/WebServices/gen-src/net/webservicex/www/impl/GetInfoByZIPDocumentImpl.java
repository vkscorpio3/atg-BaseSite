/*
 * An XML document type.
 * Localname: GetInfoByZIP
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByZIPDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetInfoByZIP(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetInfoByZIPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByZIPDocument
{
    
    public GetInfoByZIPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINFOBYZIP$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByZIP");
    
    
    /**
     * Gets the "GetInfoByZIP" element
     */
    public net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP getGetInfoByZIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP target = null;
            target = (net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP)get_store().find_element_user(GETINFOBYZIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetInfoByZIP" element
     */
    public void setGetInfoByZIP(net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP getInfoByZIP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP target = null;
            target = (net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP)get_store().find_element_user(GETINFOBYZIP$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP)get_store().add_element_user(GETINFOBYZIP$0);
            }
            target.set(getInfoByZIP);
        }
    }
    
    /**
     * Appends and returns a new empty "GetInfoByZIP" element
     */
    public net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP addNewGetInfoByZIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP target = null;
            target = (net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP)get_store().add_element_user(GETINFOBYZIP$0);
            return target;
        }
    }
    /**
     * An XML GetInfoByZIP(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetInfoByZIPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByZIPDocument.GetInfoByZIP
    {
        
        public GetInfoByZIPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USZIP$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "USZip");
        
        
        /**
         * Gets the "USZip" element
         */
        public java.lang.String getUSZip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USZIP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "USZip" element
         */
        public org.apache.xmlbeans.XmlString xgetUSZip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USZIP$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "USZip" element
         */
        public boolean isSetUSZip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USZIP$0) != 0;
            }
        }
        
        /**
         * Sets the "USZip" element
         */
        public void setUSZip(java.lang.String usZip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USZIP$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USZIP$0);
                }
                target.setStringValue(usZip);
            }
        }
        
        /**
         * Sets (as xml) the "USZip" element
         */
        public void xsetUSZip(org.apache.xmlbeans.XmlString usZip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USZIP$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USZIP$0);
                }
                target.set(usZip);
            }
        }
        
        /**
         * Unsets the "USZip" element
         */
        public void unsetUSZip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USZIP$0, 0);
            }
        }
    }
}
