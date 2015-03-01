package com.concretepage;

import com.ocs.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Goodarzi on 02/28/2015.
 */
@Service
public class PersonServiceRunner {
    @Autowired
    com.ocs.spring.service.PersonService personService;

    public void savePerson(Person person){
        personService.addPerson(person);
        System.out.println("person inserted ..");
    }
}
