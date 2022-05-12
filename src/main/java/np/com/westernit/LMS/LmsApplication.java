package np.com.westernit.LMS;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import np.com.westernit.LMS.entity.mystudent;
import np.com.westernit.LMS.reposatory.reposatoryy;

@SpringBootApplication
@ComponentScan(basePackages= {"np.com.westernit.LMS.controller"})
public class LmsApplication {

	public static void main(String[] args) {
	ApplicationContext context=	(ApplicationContext) SpringApplication.run(LmsApplication.class, args);
	//((BeanFactory) context).getBean(reposatoryy.class);
	reposatoryy repo=((BeanFactory) context).getBean(reposatoryy.class);
	
	mystudent s=new mystudent(3, "keshab");
	s.set_id(5);
	s.set_name("keahbbbb");
	
	mystudent ss=repo.save(s);
	
	
	
	
	}
	
	

}
