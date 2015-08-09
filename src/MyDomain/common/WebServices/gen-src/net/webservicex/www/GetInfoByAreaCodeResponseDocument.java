/*
 * An XML document type.
 * Localname: GetInfoByAreaCodeResponse
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByAreaCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www;


/**
 * A document containing one GetInfoByAreaCodeResponse(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public interface GetInfoByAreaCodeResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInfoByAreaCodeResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49D8D563B634FA26587747A2ACA12DBD").resolveHandle("getinfobyareacoderesponse5460doctype");
    
    /**
     * Gets the "GetInfoByAreaCodeResponse" element
     */
    net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse getGetInfoByAreaCodeResponse();
    
    /**
     * Sets the "GetInfoByAreaCodeResponse" element
     */
    void setGetInfoByAreaCodeResponse(net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse getInfoByAreaCodeResponse);
    
    /**
     * Appends and returns a new empty "GetInfoByAreaCodeResponse" element
     */
    net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse addNewGetInfoByAreaCodeResponse();
    
    /**
     * An XML GetInfoByAreaCodeResponse(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public interface GetInfoByAreaCodeResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInfoByAreaCodeResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49D8D563B634FA26587747A2ACA12DBD").resolveHandle("getinfobyareacoderesponse6a9eelemtype");
        
        /**
         * Gets the "GetInfoByAreaCodeResult" element
         */
        net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult getGetInfoByAreaCodeResult();
        
        /**
         * True if has "GetInfoByAreaCodeResult" element
         */
        boolean isSetGetInfoByAreaCodeResult();
        
        /**
         * Sets the "GetInfoByAreaCodeResult" element
         */
        void setGetInfoByAreaCodeResult(net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult getInfoByAreaCodeResult);
        
        /**
         * Appends and returns a new empty "GetInfoByAreaCodeResult" element
         */
        net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult addNewGetInfoByAreaCodeResult();
        
        /**
         * Unsets the "GetInfoByAreaCodeResult" element
         */
        void unsetGetInfoByAreaCodeResult();
        
        /**
         * An XML GetInfoByAreaCodeResult(@http://www.webserviceX.NET).
         *
         * This is a complex type.
         */
        public interface GetInfoByAreaCodeResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInfoByAreaCodeResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49D8D563B634FA26587747A2ACA12DBD").resolveHandle("getinfobyareacoderesult6b40elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult newInstance() {
                  return (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse newInstance() {
              return (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.webservicex.www.GetInfoByAreaCodeResponseDocument.GetInfoByAreaCodeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument newInstance() {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetInfoByAreaCodeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetInfoByAreaCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
