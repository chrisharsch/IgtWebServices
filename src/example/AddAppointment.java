package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by chris on 07.06.16.
 */
@WebService
public class AddAppointment {

    List appointments = new LinkedList();
    @WebMethod
    public void addAppointment(Object appointment){
        appointments.add(appointment);
    }

}
