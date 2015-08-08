

/**
 * USZip.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package soap.geocode;

    /*
     *  USZip java interface
     */

    public interface USZip {
          

        /**
          * Auto generated method signature
          * Get State Code,City,Area Code,Time Zone,Zip Code by Area Code
                    * @param getInfoByAreaCode
                
         */

         
                     public net.webservicex.www.GetInfoByAreaCodeResponseDocument getInfoByAreaCode(

                        net.webservicex.www.GetInfoByAreaCodeDocument getInfoByAreaCode)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * Get State Code,City,Area Code,Time Zone,Zip Code by City
                    * @param getInfoByCity
                
         */

         
                     public net.webservicex.www.GetInfoByCityResponseDocument getInfoByCity(

                        net.webservicex.www.GetInfoByCityDocument getInfoByCity)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * Get State Code,City,Area Code,Time Zone,Zip Code by state
                    * @param getInfoByState
                
         */

         
                     public net.webservicex.www.GetInfoByStateResponseDocument getInfoByState(

                        net.webservicex.www.GetInfoByStateDocument getInfoByState)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * Get State Code,City,Area Code,Time Zone,Zip Code by Zip Code
                    * @param getInfoByZIP
                
         */

         
                     public net.webservicex.www.GetInfoByZIPResponseDocument getInfoByZIP(

                        net.webservicex.www.GetInfoByZIPDocument getInfoByZIP)
                        throws java.rmi.RemoteException
             ;

        

        
       //
       }
    