/*
 * An XML document type.
 * Localname: GetInfoByCityResponse
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByCityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetInfoByCityResponse(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetInfoByCityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByCityResponseDocument
{
    
    public GetInfoByCityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINFOBYCITYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByCityResponse");
    
    
    /**
     * Gets the "GetInfoByCityResponse" element
     */
    public net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse getGetInfoByCityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse target = null;
            target = (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse)get_store().find_element_user(GETINFOBYCITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetInfoByCityResponse" element
     */
    public void setGetInfoByCityResponse(net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse getInfoByCityResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse target = null;
            target = (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse)get_store().find_element_user(GETINFOBYCITYRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse)get_store().add_element_user(GETINFOBYCITYRESPONSE$0);
            }
            target.set(getInfoByCityResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetInfoByCityResponse" element
     */
    public net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse addNewGetInfoByCityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse target = null;
            target = (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse)get_store().add_element_user(GETINFOBYCITYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetInfoByCityResponse(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetInfoByCityResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse
    {
        
        public GetInfoByCityResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETINFOBYCITYRESULT$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByCityResult");
        
        
        /**
         * Gets the "GetInfoByCityResult" element
         */
        public net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult getGetInfoByCityResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult target = null;
                target = (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult)get_store().find_element_user(GETINFOBYCITYRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetInfoByCityResult" element
         */
        public boolean isSetGetInfoByCityResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETINFOBYCITYRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetInfoByCityResult" element
         */
        public void setGetInfoByCityResult(net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult getInfoByCityResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult target = null;
                target = (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult)get_store().find_element_user(GETINFOBYCITYRESULT$0, 0);
                if (target == null)
                {
                    target = (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult)get_store().add_element_user(GETINFOBYCITYRESULT$0);
                }
                target.set(getInfoByCityResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetInfoByCityResult" element
         */
        public net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult addNewGetInfoByCityResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult target = null;
                target = (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult)get_store().add_element_user(GETINFOBYCITYRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetInfoByCityResult" element
         */
        public void unsetGetInfoByCityResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETINFOBYCITYRESULT$0, 0);
            }
        }
        /**
         * An XML GetInfoByCityResult(@http://www.webserviceX.NET).
         *
         * This is a complex type.
         */
        public static class GetInfoByCityResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult
        {
            
            public GetInfoByCityResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
