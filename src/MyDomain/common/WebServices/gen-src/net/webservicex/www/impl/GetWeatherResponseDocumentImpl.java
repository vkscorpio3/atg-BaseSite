/*
 * An XML document type.
 * Localname: GetWeatherResponse
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetWeatherResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetWeatherResponse(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetWeatherResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherResponseDocument
{
    
    public GetWeatherResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWEATHERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetWeatherResponse");
    
    
    /**
     * Gets the "GetWeatherResponse" element
     */
    public net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse getGetWeatherResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse target = null;
            target = (net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse)get_store().find_element_user(GETWEATHERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetWeatherResponse" element
     */
    public void setGetWeatherResponse(net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse getWeatherResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse target = null;
            target = (net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse)get_store().find_element_user(GETWEATHERRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse)get_store().add_element_user(GETWEATHERRESPONSE$0);
            }
            target.set(getWeatherResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetWeatherResponse" element
     */
    public net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse addNewGetWeatherResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse target = null;
            target = (net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse)get_store().add_element_user(GETWEATHERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetWeatherResponse(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetWeatherResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherResponseDocument.GetWeatherResponse
    {
        
        public GetWeatherResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETWEATHERRESULT$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetWeatherResult");
        
        
        /**
         * Gets the "GetWeatherResult" element
         */
        public java.lang.String getGetWeatherResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETWEATHERRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GetWeatherResult" element
         */
        public org.apache.xmlbeans.XmlString xgetGetWeatherResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETWEATHERRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "GetWeatherResult" element
         */
        public boolean isSetGetWeatherResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETWEATHERRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetWeatherResult" element
         */
        public void setGetWeatherResult(java.lang.String getWeatherResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETWEATHERRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETWEATHERRESULT$0);
                }
                target.setStringValue(getWeatherResult);
            }
        }
        
        /**
         * Sets (as xml) the "GetWeatherResult" element
         */
        public void xsetGetWeatherResult(org.apache.xmlbeans.XmlString getWeatherResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETWEATHERRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GETWEATHERRESULT$0);
                }
                target.set(getWeatherResult);
            }
        }
        
        /**
         * Unsets the "GetWeatherResult" element
         */
        public void unsetGetWeatherResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETWEATHERRESULT$0, 0);
            }
        }
    }
}
