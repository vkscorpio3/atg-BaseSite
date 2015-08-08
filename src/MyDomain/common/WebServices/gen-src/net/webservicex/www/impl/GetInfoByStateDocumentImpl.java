/*
 * An XML document type.
 * Localname: GetInfoByState
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByStateDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetInfoByState(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetInfoByStateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByStateDocument
{
    
    public GetInfoByStateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINFOBYSTATE$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByState");
    
    
    /**
     * Gets the "GetInfoByState" element
     */
    public net.webservicex.www.GetInfoByStateDocument.GetInfoByState getGetInfoByState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByStateDocument.GetInfoByState target = null;
            target = (net.webservicex.www.GetInfoByStateDocument.GetInfoByState)get_store().find_element_user(GETINFOBYSTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetInfoByState" element
     */
    public void setGetInfoByState(net.webservicex.www.GetInfoByStateDocument.GetInfoByState getInfoByState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByStateDocument.GetInfoByState target = null;
            target = (net.webservicex.www.GetInfoByStateDocument.GetInfoByState)get_store().find_element_user(GETINFOBYSTATE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetInfoByStateDocument.GetInfoByState)get_store().add_element_user(GETINFOBYSTATE$0);
            }
            target.set(getInfoByState);
        }
    }
    
    /**
     * Appends and returns a new empty "GetInfoByState" element
     */
    public net.webservicex.www.GetInfoByStateDocument.GetInfoByState addNewGetInfoByState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByStateDocument.GetInfoByState target = null;
            target = (net.webservicex.www.GetInfoByStateDocument.GetInfoByState)get_store().add_element_user(GETINFOBYSTATE$0);
            return target;
        }
    }
    /**
     * An XML GetInfoByState(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetInfoByStateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByStateDocument.GetInfoByState
    {
        
        public GetInfoByStateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USSTATE$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "USState");
        
        
        /**
         * Gets the "USState" element
         */
        public java.lang.String getUSState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USSTATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "USState" element
         */
        public org.apache.xmlbeans.XmlString xgetUSState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USSTATE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "USState" element
         */
        public boolean isSetUSState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USSTATE$0) != 0;
            }
        }
        
        /**
         * Sets the "USState" element
         */
        public void setUSState(java.lang.String usState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USSTATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USSTATE$0);
                }
                target.setStringValue(usState);
            }
        }
        
        /**
         * Sets (as xml) the "USState" element
         */
        public void xsetUSState(org.apache.xmlbeans.XmlString usState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USSTATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USSTATE$0);
                }
                target.set(usState);
            }
        }
        
        /**
         * Unsets the "USState" element
         */
        public void unsetUSState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USSTATE$0, 0);
            }
        }
    }
}
