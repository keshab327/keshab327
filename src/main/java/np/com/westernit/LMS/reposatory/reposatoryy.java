package np.com.westernit.LMS.reposatory;


import org.apache.tomcat.jni.User;
import org.springframework.data.repository.CrudRepository;

import np.com.westernit.LMS.entity.mystudent;

public interface reposatoryy extends CrudRepository<mystudent,Integer>{

	

	mystudent save(mystudent s);
	
}