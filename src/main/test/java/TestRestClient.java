import com.ocs.entity.Person;
import junit.framework.TestCase;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Goodarzi on 03/03/2015.
 */
public class TestRestClient extends TestCase {
    public static final String SERVER_URI = "http://localhost:8080/service/savePersonObject";
    public void testCreatePerson(){
        RestTemplate restTemplate = new RestTemplate();
        Person person = new Person();
        person.setPersonId("22222");
        person.setNationalId("54545454");
        person.setFirstName("Hamed");
        person.setLastName("Mirzaei");
        restTemplate.postForLocation(SERVER_URI,person);
        System.out.println("********");

    }
}
