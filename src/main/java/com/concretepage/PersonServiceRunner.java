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

    public Person getPersonByUnitEmployCode(String unitEmployCode){
        Person person = personService.getPersonByEmployeeId(unitEmployCode);
        return person;
    }
    public Person getPersonByNationalId(String nationalId){
        Person person = personService.getPersonByEmployeeId(nationalId);
        return person;
    }
    public Person getPersonByAccountId(String accountId){
        Person person = personService.getPersonByEmployeeId(accountId);
        return person;
    }

    public void saveOrUpdate(Person person){
        personService.saveOrUpdatePerson(person);
        System.out.println("person saved or updated..");
    }

    public Person getPersonByParameter(String parameterType, String parameterValue) {
        switch(Integer.parseInt(parameterType)){
            case 1:
                return this.getPersonByUnitEmployCode(parameterValue);
            case 2:
                return this.getPersonByNationalId(parameterValue);
            case 3:
                return this.getPersonByAccountId(parameterType);
            default:
                System.out.println("invalid parameter");
        }

        return null;
    }
}
