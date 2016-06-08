package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by chris on 07.06.16.
 */
@WebService
public class CreateCustomer {
    List customers = new LinkedList();
    @WebMethod
    public void addCustomer(String customer){
        customers.add(customer);
    }
}
