package example;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by chris on 08.06.16.
 */
@WebService
public class RestRequest {

    @WebMethod
    public String restRequestReturner(){
        return "RestRequest";
    }

}
