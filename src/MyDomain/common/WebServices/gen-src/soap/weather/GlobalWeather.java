

/**
 * GlobalWeather.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package soap.weather;

    /*
     *  GlobalWeather java interface
     */

    public interface GlobalWeather {
          

        /**
          * Auto generated method signature
          * Get weather report for all major cities around the world.
                    * @param getWeather
                
         */

         
                     public net.webservicex.www.GetWeatherResponseDocument getWeather(

                        net.webservicex.www.GetWeatherDocument getWeather)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * Get all major cities by country name(full / part).
                    * @param getCitiesByCountry
                
         */

         
                     public net.webservicex.www.GetCitiesByCountryResponseDocument getCitiesByCountry(

                        net.webservicex.www.GetCitiesByCountryDocument getCitiesByCountry)
                        throws java.rmi.RemoteException
             ;

        

        
       //
       }
    