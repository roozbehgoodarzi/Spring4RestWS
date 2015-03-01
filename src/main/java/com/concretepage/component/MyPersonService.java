package com.concretepage.component;

import com.concretepage.MyPerson;
import org.springframework.stereotype.Component;

@Component
public class MyPersonService implements IMyPersonService {
	@Override
	public MyPerson getPersonDetail(Integer id){
		MyPerson p = new MyPerson();
		p.setId(id);
		p.setLocation("Varanasi");
		p.setName("Ram");
		return p;
	}
}
