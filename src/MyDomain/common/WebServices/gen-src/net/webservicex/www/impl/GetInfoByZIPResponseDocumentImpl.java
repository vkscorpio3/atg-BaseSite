/*
 * An XML document type.
 * Localname: GetInfoByZIPResponse
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByZIPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetInfoByZIPResponse(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetInfoByZIPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByZIPResponseDocument
{
    
    public GetInfoByZIPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINFOBYZIPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByZIPResponse");
    
    
    /**
     * Gets the "GetInfoByZIPResponse" element
     */
    public net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse getGetInfoByZIPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse target = null;
            target = (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse)get_store().find_element_user(GETINFOBYZIPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetInfoByZIPResponse" element
     */
    public void setGetInfoByZIPResponse(net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse getInfoByZIPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse target = null;
            target = (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse)get_store().find_element_user(GETINFOBYZIPRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse)get_store().add_element_user(GETINFOBYZIPRESPONSE$0);
            }
            target.set(getInfoByZIPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetInfoByZIPResponse" element
     */
    public net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse addNewGetInfoByZIPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse target = null;
            target = (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse)get_store().add_element_user(GETINFOBYZIPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetInfoByZIPResponse(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetInfoByZIPResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse
    {
        
        public GetInfoByZIPResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETINFOBYZIPRESULT$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByZIPResult");
        
        
        /**
         * Gets the "GetInfoByZIPResult" element
         */
        public net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult getGetInfoByZIPResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult target = null;
                target = (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult)get_store().find_element_user(GETINFOBYZIPRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetInfoByZIPResult" element
         */
        public boolean isSetGetInfoByZIPResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETINFOBYZIPRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetInfoByZIPResult" element
         */
        public void setGetInfoByZIPResult(net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult getInfoByZIPResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult target = null;
                target = (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult)get_store().find_element_user(GETINFOBYZIPRESULT$0, 0);
                if (target == null)
                {
                    target = (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult)get_store().add_element_user(GETINFOBYZIPRESULT$0);
                }
                target.set(getInfoByZIPResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetInfoByZIPResult" element
         */
        public net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult addNewGetInfoByZIPResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult target = null;
                target = (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult)get_store().add_element_user(GETINFOBYZIPRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetInfoByZIPResult" element
         */
        public void unsetGetInfoByZIPResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETINFOBYZIPRESULT$0, 0);
            }
        }
        /**
         * An XML GetInfoByZIPResult(@http://www.webserviceX.NET).
         *
         * This is a complex type.
         */
        public static class GetInfoByZIPResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult
        {
            
            public GetInfoByZIPResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
