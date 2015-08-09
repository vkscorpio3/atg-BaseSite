/*
 * An XML document type.
 * Localname: GetInfoByCityResponse
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetInfoByCityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www;


/**
 * A document containing one GetInfoByCityResponse(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public interface GetInfoByCityResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInfoByCityResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49D8D563B634FA26587747A2ACA12DBD").resolveHandle("getinfobycityresponse446fdoctype");
    
    /**
     * Gets the "GetInfoByCityResponse" element
     */
    net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse getGetInfoByCityResponse();
    
    /**
     * Sets the "GetInfoByCityResponse" element
     */
    void setGetInfoByCityResponse(net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse getInfoByCityResponse);
    
    /**
     * Appends and returns a new empty "GetInfoByCityResponse" element
     */
    net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse addNewGetInfoByCityResponse();
    
    /**
     * An XML GetInfoByCityResponse(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public interface GetInfoByCityResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInfoByCityResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49D8D563B634FA26587747A2ACA12DBD").resolveHandle("getinfobycityresponse443celemtype");
        
        /**
         * Gets the "GetInfoByCityResult" element
         */
        net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult getGetInfoByCityResult();
        
        /**
         * True if has "GetInfoByCityResult" element
         */
        boolean isSetGetInfoByCityResult();
        
        /**
         * Sets the "GetInfoByCityResult" element
         */
        void setGetInfoByCityResult(net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult getInfoByCityResult);
        
        /**
         * Appends and returns a new empty "GetInfoByCityResult" element
         */
        net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult addNewGetInfoByCityResult();
        
        /**
         * Unsets the "GetInfoByCityResult" element
         */
        void unsetGetInfoByCityResult();
        
        /**
         * An XML GetInfoByCityResult(@http://www.webserviceX.NET).
         *
         * This is a complex type.
         */
        public interface GetInfoByCityResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInfoByCityResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49D8D563B634FA26587747A2ACA12DBD").resolveHandle("getinfobycityresult3c2delemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult newInstance() {
                  return (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse.GetInfoByCityResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse newInstance() {
              return (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.webservicex.www.GetInfoByCityResponseDocument.GetInfoByCityResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.webservicex.www.GetInfoByCityResponseDocument newInstance() {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetInfoByCityResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetInfoByCityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
