/*
 * An XML document type.
 * Localname: GetWeather
 * Namespace: http://www.webserviceX.NET
 * Java type: net.webservicex.www.GetWeatherDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetWeather(@http://www.webserviceX.NET) element.
 *
 * This is a complex type.
 */
public class GetWeatherDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherDocument
{
    
    public GetWeatherDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWEATHER$0 = 
        new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetWeather");
    
    
    /**
     * Gets the "GetWeather" element
     */
    public net.webservicex.www.GetWeatherDocument.GetWeather getGetWeather()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherDocument.GetWeather target = null;
            target = (net.webservicex.www.GetWeatherDocument.GetWeather)get_store().find_element_user(GETWEATHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetWeather" element
     */
    public void setGetWeather(net.webservicex.www.GetWeatherDocument.GetWeather getWeather)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherDocument.GetWeather target = null;
            target = (net.webservicex.www.GetWeatherDocument.GetWeather)get_store().find_element_user(GETWEATHER$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetWeatherDocument.GetWeather)get_store().add_element_user(GETWEATHER$0);
            }
            target.set(getWeather);
        }
    }
    
    /**
     * Appends and returns a new empty "GetWeather" element
     */
    public net.webservicex.www.GetWeatherDocument.GetWeather addNewGetWeather()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherDocument.GetWeather target = null;
            target = (net.webservicex.www.GetWeatherDocument.GetWeather)get_store().add_element_user(GETWEATHER$0);
            return target;
        }
    }
    /**
     * An XML GetWeather(@http://www.webserviceX.NET).
     *
     * This is a complex type.
     */
    public static class GetWeatherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherDocument.GetWeather
    {
        
        public GetWeatherImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CITYNAME$0 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "CityName");
        private static final javax.xml.namespace.QName COUNTRYNAME$2 = 
            new javax.xml.namespace.QName("http://www.webserviceX.NET", "CountryName");
        
        
        /**
         * Gets the "CityName" element
         */
        public java.lang.String getCityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CityName" element
         */
        public org.apache.xmlbeans.XmlString xgetCityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "CityName" element
         */
        public boolean isSetCityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CITYNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "CityName" element
         */
        public void setCityName(java.lang.String cityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITYNAME$0);
                }
                target.setStringValue(cityName);
            }
        }
        
        /**
         * Sets (as xml) the "CityName" element
         */
        public void xsetCityName(org.apache.xmlbeans.XmlString cityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITYNAME$0);
                }
                target.set(cityName);
            }
        }
        
        /**
         * Unsets the "CityName" element
         */
        public void unsetCityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CITYNAME$0, 0);
            }
        }
        
        /**
         * Gets the "CountryName" element
         */
        public java.lang.String getCountryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAME$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAME$2, 0);
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
                return get_store().count_elements(COUNTRYNAME$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYNAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYNAME$2);
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
                get_store().remove_element(COUNTRYNAME$2, 0);
            }
        }
    }
}
