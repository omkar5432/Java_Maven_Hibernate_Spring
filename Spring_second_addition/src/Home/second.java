package Home;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class second {

	public static void main(String[] args) {
		int fact=1,num=4;
		Resource r1 = new ClassPathResource("applicationContext.xml");
		
		BeanFactory b1 = new XmlBeanFactory(r1);
		First f1=(First) b1.getBean("t1");
		f1.addition();
		fact = f1.factorial(num);
		System.out.println("Factorial of "+num +" is "+fact);
	}

}
