/*
 * An XML document type.
 * Localname: GetCitiesByCountryResponse
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetCitiesByCountryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetCitiesByCountryResponse(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetCitiesByCountryResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetCitiesByCountryResponseDocument
{
    
    public GetCitiesByCountryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCITIESBYCOUNTRYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetCitiesByCountryResponse");
    
    
    /**
     * Gets the "GetCitiesByCountryResponse" element
     */
    public net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse getGetCitiesByCountryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse target = null;
            target = (net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse)get_store().find_element_user(GETCITIESBYCOUNTRYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCitiesByCountryResponse" element
     */
    public void setGetCitiesByCountryResponse(net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse getCitiesByCountryResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse target = null;
            target = (net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse)get_store().find_element_user(GETCITIESBYCOUNTRYRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse)get_store().add_element_user(GETCITIESBYCOUNTRYRESPONSE$0);
            }
            target.set(getCitiesByCountryResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCitiesByCountryResponse" element
     */
    public net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse addNewGetCitiesByCountryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse target = null;
            target = (net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse)get_store().add_element_user(GETCITIESBYCOUNTRYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCitiesByCountryResponse(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetCitiesByCountryResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetCitiesByCountryResponseDocument.GetCitiesByCountryResponse
    {
        
        public GetCitiesByCountryResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETCITIESBYCOUNTRYRESULT$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetCitiesByCountryResult");
        
        
        /**
         * Gets the "GetCitiesByCountryResult" element
         */
        public java.lang.String getGetCitiesByCountryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETCITIESBYCOUNTRYRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GetCitiesByCountryResult" element
         */
        public org.apache.xmlbeans.XmlString xgetGetCitiesByCountryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETCITIESBYCOUNTRYRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "GetCitiesByCountryResult" element
         */
        public boolean isSetGetCitiesByCountryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETCITIESBYCOUNTRYRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetCitiesByCountryResult" element
         */
        public void setGetCitiesByCountryResult(java.lang.String getCitiesByCountryResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETCITIESBYCOUNTRYRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETCITIESBYCOUNTRYRESULT$0);
                }
                target.setStringValue(getCitiesByCountryResult);
            }
        }
        
        /**
         * Sets (as xml) the "GetCitiesByCountryResult" element
         */
        public void xsetGetCitiesByCountryResult(org.apache.xmlbeans.XmlString getCitiesByCountryResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETCITIESBYCOUNTRYRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GETCITIESBYCOUNTRYRESULT$0);
                }
                target.set(getCitiesByCountryResult);
            }
        }
        
        /**
         * Unsets the "GetCitiesByCountryResult" element
         */
        public void unsetGetCitiesByCountryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETCITIESBYCOUNTRYRESULT$0, 0);
            }
        }
    }
}
