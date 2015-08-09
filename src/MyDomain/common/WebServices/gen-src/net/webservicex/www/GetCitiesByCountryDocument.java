/*
 * An XML document type.
 * Localname: GetCitiesByCountry
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetCitiesByCountryDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www;


/**
 * A document containing one GetCitiesByCountry(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public interface GetCitiesByCountryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCitiesByCountryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB2B2F29A0381C4F6CD4FA7422F919908").resolveHandle("getcitiesbycountry7584doctype");
    
    /**
     * Gets the "GetCitiesByCountry" element
     */
    net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry getGetCitiesByCountry();
    
    /**
     * Sets the "GetCitiesByCountry" element
     */
    void setGetCitiesByCountry(net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry getCitiesByCountry);
    
    /**
     * Appends and returns a new empty "GetCitiesByCountry" element
     */
    net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry addNewGetCitiesByCountry();
    
    /**
     * An XML GetCitiesByCountry(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public interface GetCitiesByCountry extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCitiesByCountry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB2B2F29A0381C4F6CD4FA7422F919908").resolveHandle("getcitiesbycountry5800elemtype");
        
        /**
         * Gets the "CountryName" element
         */
        java.lang.String getCountryName();
        
        /**
         * Gets (as xml) the "CountryName" element
         */
        org.apache.xmlbeans.XmlString xgetCountryName();
        
        /**
         * True if has "CountryName" element
         */
        boolean isSetCountryName();
        
        /**
         * Sets the "CountryName" element
         */
        void setCountryName(java.lang.String countryName);
        
        /**
         * Sets (as xml) the "CountryName" element
         */
        void xsetCountryName(org.apache.xmlbeans.XmlString countryName);
        
        /**
         * Unsets the "CountryName" element
         */
        void unsetCountryName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry newInstance() {
              return (net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.webservicex.www.GetCitiesByCountryDocument newInstance() {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.webservicex.www.GetCitiesByCountryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.webservicex.www.GetCitiesByCountryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.webservicex.www.GetCitiesByCountryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetCitiesByCountryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetCitiesByCountryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetCitiesByCountryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
