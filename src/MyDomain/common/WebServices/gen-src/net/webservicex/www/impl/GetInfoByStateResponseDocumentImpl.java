/*
 * An XML document type.
 * Localname: GetInfoByStateResponse
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByStateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetInfoByStateResponse(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetInfoByStateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByStateResponseDocument
{
    
    public GetInfoByStateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINFOBYSTATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByStateResponse");
    
    
    /**
     * Gets the "GetInfoByStateResponse" element
     */
    public net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse getGetInfoByStateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse target = null;
            target = (net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse)get_store().find_element_user(GETINFOBYSTATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetInfoByStateResponse" element
     */
    public void setGetInfoByStateResponse(net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse getInfoByStateResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse target = null;
            target = (net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse)get_store().find_element_user(GETINFOBYSTATERESPONSE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse)get_store().add_element_user(GETINFOBYSTATERESPONSE$0);
            }
            target.set(getInfoByStateResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetInfoByStateResponse" element
     */
    public net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse addNewGetInfoByStateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse target = null;
            target = (net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse)get_store().add_element_user(GETINFOBYSTATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetInfoByStateResponse(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetInfoByStateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse
    {
        
        public GetInfoByStateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETINFOBYSTATERESULT$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByStateResult");
        
        
        /**
         * Gets the "GetInfoByStateResult" element
         */
        public net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult getGetInfoByStateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult target = null;
                target = (net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult)get_store().find_element_user(GETINFOBYSTATERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetInfoByStateResult" element
         */
        public boolean isSetGetInfoByStateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETINFOBYSTATERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetInfoByStateResult" element
         */
        public void setGetInfoByStateResult(net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult getInfoByStateResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult target = null;
                target = (net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult)get_store().find_element_user(GETINFOBYSTATERESULT$0, 0);
                if (target == null)
                {
                    target = (net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult)get_store().add_element_user(GETINFOBYSTATERESULT$0);
                }
                target.set(getInfoByStateResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetInfoByStateResult" element
         */
        public net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult addNewGetInfoByStateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult target = null;
                target = (net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult)get_store().add_element_user(GETINFOBYSTATERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetInfoByStateResult" element
         */
        public void unsetGetInfoByStateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETINFOBYSTATERESULT$0, 0);
            }
        }
        /**
         * An XML GetInfoByStateResult(@http://www.webserviceX.NET).
         *
         * This is a complex type.
         */
        public static class GetInfoByStateResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByStateResponseDocument.GetInfoByStateResponse.GetInfoByStateResult
        {
            
            public GetInfoByStateResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
