

/**
 * WeatherTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package soap.weather;

    /*
     *  WeatherTest Junit test case
    */

    public class WeatherTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetCityWeatherByZIP() throws java.lang.Exception{

        soap.weather.WeatherStub stub =
                    new soap.weather.WeatherStub();//the default implementation should point to the right endpoint

           com.cdyne.ws.weatherws.GetCityWeatherByZIPDocument getCityWeatherByZIP12=
                                                        (com.cdyne.ws.weatherws.GetCityWeatherByZIPDocument)getTestObject(com.cdyne.ws.weatherws.GetCityWeatherByZIPDocument.class);
                    // TODO : Fill in the getCityWeatherByZIP12 here
                
                        assertNotNull(stub.getCityWeatherByZIP(
                        getCityWeatherByZIP12));
                  



        }
        
        /**
         * Auto generated test method
         */
        public  void testgetWeatherInformation() throws java.lang.Exception{

        soap.weather.WeatherStub stub =
                    new soap.weather.WeatherStub();//the default implementation should point to the right endpoint

           com.cdyne.ws.weatherws.GetWeatherInformationDocument getWeatherInformation14=
                                                        (com.cdyne.ws.weatherws.GetWeatherInformationDocument)getTestObject(com.cdyne.ws.weatherws.GetWeatherInformationDocument.class);
                    // TODO : Fill in the getWeatherInformation14 here
                
                        assertNotNull(stub.getWeatherInformation(
                        getWeatherInformation14));
                  



        }
        
        /**
         * Auto generated test method
         */
        public  void testgetCityForecastByZIP() throws java.lang.Exception{

        soap.weather.WeatherStub stub =
                    new soap.weather.WeatherStub();//the default implementation should point to the right endpoint

           com.cdyne.ws.weatherws.GetCityForecastByZIPDocument getCityForecastByZIP16=
                                                        (com.cdyne.ws.weatherws.GetCityForecastByZIPDocument)getTestObject(com.cdyne.ws.weatherws.GetCityForecastByZIPDocument.class);
                    // TODO : Fill in the getCityForecastByZIP16 here
                
                        assertNotNull(stub.getCityForecastByZIP(
                        getCityForecastByZIP16));
                  



        }
        
        //Create the desired XmlObject and provide it as the test object
        public  org.apache.xmlbeans.XmlObject getTestObject(java.lang.Class type) throws java.lang.Exception{
        java.lang.reflect.Method creatorMethod = null;
                if (org.apache.xmlbeans.XmlObject.class.isAssignableFrom(type)){
                    Class[] declaredClasses = type.getDeclaredClasses();
                    for (int i = 0; i < declaredClasses.length; i++) {
                        Class declaredClass = declaredClasses[i];
                        if (declaredClass.getName().endsWith("$Factory")){
                            creatorMethod = declaredClass.getMethod("newInstance",null);
                            break;
                        }

                    }
                }
                if (creatorMethod!=null){
                    return  (org.apache.xmlbeans.XmlObject)creatorMethod.invoke(null,null);
                }else{
                    throw new java.lang.Exception("Creator not found!");
                }

        }

         

    }
    