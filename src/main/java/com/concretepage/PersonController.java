package com.concretepage;

import com.ocs.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Goodarzi on 02/28/2015.
 */
@RestController
@RequestMapping("/service")
public class PersonController {
    @Autowired
    PersonServiceRunner personServiceRunner;

    @RequestMapping("/savePerson")
    public void savePerson(
            @RequestParam(value = "personId", required = true) String personId,
            @RequestParam(value = "personName", required = false) String personName,
            @RequestParam(value = "personLastName", required = false) String personLastName,
            @RequestParam(value = "personNationalId", required = true) String personNationalId
    ){
        Person person = new Person();
        person.setPersonId(personId);
        person.setNationalId(personNationalId);
        person.setFirstName(personName);
        person.setLastName(personLastName);
        personServiceRunner.savePerson(person);

    }


    @RequestMapping("/savePersonObject")
    public void savePersonObject(@RequestBody Person person){
        personServiceRunner.savePerson(person);
    }
}
