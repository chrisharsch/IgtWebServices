package example;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by chris on 07.06.16.
 */
@WebService
public class GeoSearch {
    @WebMethod
    public double search(){
        return 2.123;
    }
}
