
package webservice.gen.myCalculation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


@WebService(name = "CALCULATION", targetNamespace = "http://webservice/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CALCULATION {

    @WebMethod(operationName = "Subtraktion")
    @WebResult(partName = "return")
    @Action(input = "http://webservice/CALCULATION/SubtraktionRequest", output = "http://webservice/CALCULATION/SubtraktionResponse")
    public float subtraktion(
        @WebParam(name = "arg0", partName = "arg0")
        float arg0,
        @WebParam(name = "arg1", partName = "arg1")
        float arg1);


    @WebMethod(operationName = "Multiplikation")
    @WebResult(partName = "return")
    @Action(input = "http://webservice/CALCULATION/MultiplikationRequest", output = "http://webservice/CALCULATION/MultiplikationResponse")
    public float multiplikation(
        @WebParam(name = "arg0", partName = "arg0")
        float arg0,
        @WebParam(name = "arg1", partName = "arg1")
        float arg1);


    @WebMethod(operationName = "Addition")
    @WebResult(partName = "return")
    @Action(input = "http://webservice/CALCULATION/AdditionRequest", output = "http://webservice/CALCULATION/AdditionResponse")
    public float addition(
        @WebParam(name = "arg0", partName = "arg0")
        float arg0,
        @WebParam(name = "arg1", partName = "arg1")
        float arg1);

    
    @WebMethod(operationName = "Division")
    @WebResult(partName = "return")
    @Action(input = "http://webservice/CALCULATION/DivisionRequest", output = "http://webservice/CALCULATION/DivisionResponse")
    public float division(
        @WebParam(name = "arg0", partName = "arg0")
        float arg0,
        @WebParam(name = "arg1", partName = "arg1")
        float arg1);


}
