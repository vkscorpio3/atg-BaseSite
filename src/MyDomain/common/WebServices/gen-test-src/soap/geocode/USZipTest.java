

/**
 * USZipTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package soap.geocode;

    /*
     *  USZipTest Junit test case
    */

    public class USZipTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetInfoByAreaCode() throws java.lang.Exception{

        soap.geocode.USZipStub stub =
                    new soap.geocode.USZipStub();//the default implementation should point to the right endpoint

           net.webservicex.www.GetInfoByAreaCodeDocument getInfoByAreaCode16=
                                                        (net.webservicex.www.GetInfoByAreaCodeDocument)getTestObject(net.webservicex.www.GetInfoByAreaCodeDocument.class);
                    // TODO : Fill in the getInfoByAreaCode16 here
                
                        assertNotNull(stub.getInfoByAreaCode(
                        getInfoByAreaCode16));
                  



        }
        
        /**
         * Auto generated test method
         */
        public  void testgetInfoByCity() throws java.lang.Exception{

        soap.geocode.USZipStub stub =
                    new soap.geocode.USZipStub();//the default implementation should point to the right endpoint

           net.webservicex.www.GetInfoByCityDocument getInfoByCity18=
                                                        (net.webservicex.www.GetInfoByCityDocument)getTestObject(net.webservicex.www.GetInfoByCityDocument.class);
                    // TODO : Fill in the getInfoByCity18 here
                
                        assertNotNull(stub.getInfoByCity(
                        getInfoByCity18));
                  



        }
        
        /**
         * Auto generated test method
         */
        public  void testgetInfoByState() throws java.lang.Exception{

        soap.geocode.USZipStub stub =
                    new soap.geocode.USZipStub();//the default implementation should point to the right endpoint

           net.webservicex.www.GetInfoByStateDocument getInfoByState20=
                                                        (net.webservicex.www.GetInfoByStateDocument)getTestObject(net.webservicex.www.GetInfoByStateDocument.class);
                    // TODO : Fill in the getInfoByState20 here
                
                        assertNotNull(stub.getInfoByState(
                        getInfoByState20));
                  



        }
        
        /**
         * Auto generated test method
         */
        public  void testgetInfoByZIP() throws java.lang.Exception{

        soap.geocode.USZipStub stub =
                    new soap.geocode.USZipStub();//the default implementation should point to the right endpoint

           net.webservicex.www.GetInfoByZIPDocument getInfoByZIP22=
                                                        (net.webservicex.www.GetInfoByZIPDocument)getTestObject(net.webservicex.www.GetInfoByZIPDocument.class);
                    // TODO : Fill in the getInfoByZIP22 here
                
                        assertNotNull(stub.getInfoByZIP(
                        getInfoByZIP22));
                  



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
    