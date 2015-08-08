/*
 * An XML document type.
 * Localname: GetInfoByAreaCode
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByAreaCodeDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetInfoByAreaCode(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetInfoByAreaCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByAreaCodeDocument
{
    
    public GetInfoByAreaCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINFOBYAREACODE$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByAreaCode");
    
    
    /**
     * Gets the "GetInfoByAreaCode" element
     */
    public net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode getGetInfoByAreaCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode target = null;
            target = (net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode)get_store().find_element_user(GETINFOBYAREACODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetInfoByAreaCode" element
     */
    public void setGetInfoByAreaCode(net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode getInfoByAreaCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode target = null;
            target = (net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode)get_store().find_element_user(GETINFOBYAREACODE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode)get_store().add_element_user(GETINFOBYAREACODE$0);
            }
            target.set(getInfoByAreaCode);
        }
    }
    
    /**
     * Appends and returns a new empty "GetInfoByAreaCode" element
     */
    public net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode addNewGetInfoByAreaCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode target = null;
            target = (net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode)get_store().add_element_user(GETINFOBYAREACODE$0);
            return target;
        }
    }
    /**
     * An XML GetInfoByAreaCode(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetInfoByAreaCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByAreaCodeDocument.GetInfoByAreaCode
    {
        
        public GetInfoByAreaCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USAREACODE$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "USAreaCode");
        
        
        /**
         * Gets the "USAreaCode" element
         */
        public java.lang.String getUSAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USAREACODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "USAreaCode" element
         */
        public org.apache.xmlbeans.XmlString xgetUSAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USAREACODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "USAreaCode" element
         */
        public boolean isSetUSAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USAREACODE$0) != 0;
            }
        }
        
        /**
         * Sets the "USAreaCode" element
         */
        public void setUSAreaCode(java.lang.String usAreaCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USAREACODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USAREACODE$0);
                }
                target.setStringValue(usAreaCode);
            }
        }
        
        /**
         * Sets (as xml) the "USAreaCode" element
         */
        public void xsetUSAreaCode(org.apache.xmlbeans.XmlString usAreaCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USAREACODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USAREACODE$0);
                }
                target.set(usAreaCode);
            }
        }
        
        /**
         * Unsets the "USAreaCode" element
         */
        public void unsetUSAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USAREACODE$0, 0);
            }
        }
    }
}
