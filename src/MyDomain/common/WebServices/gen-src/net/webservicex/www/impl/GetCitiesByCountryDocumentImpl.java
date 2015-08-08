/*
 * An XML document type.
 * Localname: GetCitiesByCountry
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetCitiesByCountryDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetCitiesByCountry(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetCitiesByCountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetCitiesByCountryDocument
{
    
    public GetCitiesByCountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCITIESBYCOUNTRY$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetCitiesByCountry");
    
    
    /**
     * Gets the "GetCitiesByCountry" element
     */
    public net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry getGetCitiesByCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry target = null;
            target = (net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry)get_store().find_element_user(GETCITIESBYCOUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCitiesByCountry" element
     */
    public void setGetCitiesByCountry(net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry getCitiesByCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry target = null;
            target = (net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry)get_store().find_element_user(GETCITIESBYCOUNTRY$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry)get_store().add_element_user(GETCITIESBYCOUNTRY$0);
            }
            target.set(getCitiesByCountry);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCitiesByCountry" element
     */
    public net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry addNewGetCitiesByCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry target = null;
            target = (net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry)get_store().add_element_user(GETCITIESBYCOUNTRY$0);
            return target;
        }
    }
    /**
     * An XML GetCitiesByCountry(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetCitiesByCountryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetCitiesByCountryDocument.GetCitiesByCountry
    {
        
        public GetCitiesByCountryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRYNAME$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "CountryName");
        
        
        /**
         * Gets the "CountryName" element
         */
        public java.lang.String getCountryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CountryName" element
         */
        public org.apache.xmlbeans.XmlString xgetCountryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "CountryName" element
         */
        public boolean isSetCountryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNTRYNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "CountryName" element
         */
        public void setCountryName(java.lang.String countryName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYNAME$0);
                }
                target.setStringValue(countryName);
            }
        }
        
        /**
         * Sets (as xml) the "CountryName" element
         */
        public void xsetCountryName(org.apache.xmlbeans.XmlString countryName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYNAME$0);
                }
                target.set(countryName);
            }
        }
        
        /**
         * Unsets the "CountryName" element
         */
        public void unsetCountryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNTRYNAME$0, 0);
            }
        }
    }
}
