package Home;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Sky {

	public static void main(String[] args) {
		
		Resource r1 = new ClassPathResource("applicationContext.xml");
		
		BeanFactory b1 = new XmlBeanFactory(r1);
		
		kite k1 =(kite) b1.getBean("t1");
		k1.display();
	}

}
