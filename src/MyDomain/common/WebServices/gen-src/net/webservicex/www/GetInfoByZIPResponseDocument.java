/*
 * An XML document type.
 * Localname: GetInfoByZIPResponse
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByZIPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www;


/**
 * A document containing one GetInfoByZIPResponse(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public interface GetInfoByZIPResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInfoByZIPResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49D8D563B634FA26587747A2ACA12DBD").resolveHandle("getinfobyzipresponse843ddoctype");
    
    /**
     * Gets the "GetInfoByZIPResponse" element
     */
    net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse getGetInfoByZIPResponse();
    
    /**
     * Sets the "GetInfoByZIPResponse" element
     */
    void setGetInfoByZIPResponse(net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse getInfoByZIPResponse);
    
    /**
     * Appends and returns a new empty "GetInfoByZIPResponse" element
     */
    net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse addNewGetInfoByZIPResponse();
    
    /**
     * An XML GetInfoByZIPResponse(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public interface GetInfoByZIPResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInfoByZIPResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49D8D563B634FA26587747A2ACA12DBD").resolveHandle("getinfobyzipresponse7d20elemtype");
        
        /**
         * Gets the "GetInfoByZIPResult" element
         */
        net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult getGetInfoByZIPResult();
        
        /**
         * True if has "GetInfoByZIPResult" element
         */
        boolean isSetGetInfoByZIPResult();
        
        /**
         * Sets the "GetInfoByZIPResult" element
         */
        void setGetInfoByZIPResult(net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult getInfoByZIPResult);
        
        /**
         * Appends and returns a new empty "GetInfoByZIPResult" element
         */
        net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult addNewGetInfoByZIPResult();
        
        /**
         * Unsets the "GetInfoByZIPResult" element
         */
        void unsetGetInfoByZIPResult();
        
        /**
         * An XML GetInfoByZIPResult(@http://www.webserviceX.NET).
         *
         * This is a complex type.
         */
        public interface GetInfoByZIPResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInfoByZIPResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49D8D563B634FA26587747A2ACA12DBD").resolveHandle("getinfobyzipresult2901elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult newInstance() {
                  return (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse.GetInfoByZIPResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse newInstance() {
              return (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.webservicex.www.GetInfoByZIPResponseDocument.GetInfoByZIPResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.webservicex.www.GetInfoByZIPResponseDocument newInstance() {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetInfoByZIPResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetInfoByZIPResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
