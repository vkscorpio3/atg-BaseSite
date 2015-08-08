/*
 * An XML document type.
 * Localname: GetInfoByAreaCodeResponse
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByAreaCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetInfoByAreaCodeResponse(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetInfoByAreaCodeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByAreaCodeResponseDocument
{
    
    public GetInfoByAreaCodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINFOBYAREACODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByAreaCodeResponse");
    
    
    /**
     * Gets the "GetInfoByAreaCodeResponse" element
     */
    public net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse getGetInfoByAreaCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse target = null;
            target = (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse)get_store().find_element_user(GETINFOBYAREACODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetInfoByAreaCodeResponse" element
     */
    public void setGetInfoByAreaCodeResponse(net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse getInfoByAreaCodeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse target = null;
            target = (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse)get_store().find_element_user(GETINFOBYAREACODERESPONSE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse)get_store().add_element_user(GETINFOBYAREACODERESPONSE$0);
            }
            target.set(getInfoByAreaCodeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetInfoByAreaCodeResponse" element
     */
    public net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse addNewGetInfoByAreaCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse target = null;
            target = (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse)get_store().add_element_user(GETINFOBYAREACODERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetInfoByAreaCodeResponse(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetInfoByAreaCodeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse
    {
        
        public GetInfoByAreaCodeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETINFOBYAREACODERESULT$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetInfoByAreaCodeResult");
        
        
        /**
         * Gets the "GetInfoByAreaCodeResult" element
         */
        public net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult getGetInfoByAreaCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult target = null;
                target = (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult)get_store().find_element_user(GETINFOBYAREACODERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetInfoByAreaCodeResult" element
         */
        public boolean isSetGetInfoByAreaCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETINFOBYAREACODERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetInfoByAreaCodeResult" element
         */
        public void setGetInfoByAreaCodeResult(net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult getInfoByAreaCodeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult target = null;
                target = (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult)get_store().find_element_user(GETINFOBYAREACODERESULT$0, 0);
                if (target == null)
                {
                    target = (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult)get_store().add_element_user(GETINFOBYAREACODERESULT$0);
                }
                target.set(getInfoByAreaCodeResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetInfoByAreaCodeResult" element
         */
        public net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult addNewGetInfoByAreaCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult target = null;
                target = (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult)get_store().add_element_user(GETINFOBYAREACODERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetInfoByAreaCodeResult" element
         */
        public void unsetGetInfoByAreaCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETINFOBYAREACODERESULT$0, 0);
            }
        }
        /**
         * An XML GetInfoByAreaCodeResult(@http://www.webserviceX.NET).
         *
         * This is a complex type.
         */
        public static class GetInfoByAreaCodeResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult
        {
            
            public GetInfoByAreaCodeResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
