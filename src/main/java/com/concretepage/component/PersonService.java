package com.concretepage.component;

import org.springframework.stereotype.Component;

import com.concretepage.MyPerson;

@Component
public class PersonService implements IPersonService {
	@Override
	public MyPerson getPersonDetail(Integer id){
		MyPerson p = new MyPerson();
		p.setId(id);
		p.setLocation("Varanasi");
		p.setName("Ram");
		return p;
	}
}
