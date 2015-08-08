

/**
 * GlobalWeatherTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package soap.weather;

    /*
     *  GlobalWeatherTest Junit test case
    */

    public class GlobalWeatherTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetWeather() throws java.lang.Exception{

        soap.weather.GlobalWeatherStub stub =
                    new soap.weather.GlobalWeatherStub();//the default implementation should point to the right endpoint

           net.webservicex.www.GetWeatherDocument getWeather8=
                                                        (net.webservicex.www.GetWeatherDocument)getTestObject(net.webservicex.www.GetWeatherDocument.class);
                    // TODO : Fill in the getWeather8 here
                
                        assertNotNull(stub.getWeather(
                        getWeather8));
                  



        }
        
        /**
         * Auto generated test method
         */
        public  void testgetCitiesByCountry() throws java.lang.Exception{

        soap.weather.GlobalWeatherStub stub =
                    new soap.weather.GlobalWeatherStub();//the default implementation should point to the right endpoint

           net.webservicex.www.GetCitiesByCountryDocument getCitiesByCountry10=
                                                        (net.webservicex.www.GetCitiesByCountryDocument)getTestObject(net.webservicex.www.GetCitiesByCountryDocument.class);
                    // TODO : Fill in the getCitiesByCountry10 here
                
                        assertNotNull(stub.getCitiesByCountry(
                        getCitiesByCountry10));
                  



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
    