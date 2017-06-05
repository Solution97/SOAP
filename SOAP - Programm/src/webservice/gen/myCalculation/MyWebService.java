
package webservice.gen.myCalculation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


@WebServiceClient(name = "MyWebService", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:8080/services?wsdl")
public class MyWebService
    extends Service
{

    private final static URL MyWebService_WSDL_LOCATION;
    private final static WebServiceException MyWebService_EXCEPTION;
    private final static QName MyWebService_QNAME = new QName("http://webservice/", "MyWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/services?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MyWebService_WSDL_LOCATION = url;
        MyWebService_EXCEPTION = e;
    }

    public MyWebService() {
        super(__getWsdlLocation(), MyWebService_QNAME);
    }

    public MyWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MyWebService_QNAME, features);
    }

    public MyWebService(URL wsdlLocation) {
        super(wsdlLocation, MyWebService_QNAME);
    }

    public MyWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MyWebService_QNAME, features);
    }

    public MyWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }


    @WebEndpoint(name = "CALCULATIONPort")
    public CALCULATION getCALCULATIONort() {
        return super.getPort(new QName("http://webservice/", "CALCULATIONPort"), CALCULATION.class);
    }


    @WebEndpoint(name = "CALCULATIONPort")
    public CALCULATION getCALCULATIONPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "CALCULATIONPort"), CALCULATION.class, features);
    }

   
    private static URL __getWsdlLocation() {
        if (MyWebService_EXCEPTION!= null) {
            throw MyWebService_EXCEPTION;
        }
        return MyWebService_WSDL_LOCATION;
    }

}
