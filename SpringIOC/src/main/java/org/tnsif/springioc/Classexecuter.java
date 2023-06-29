package org.tnsif.springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Classexecuter {

	public static void main(String[] args) {
		//hard code
		/*SBIcard s=new SBIcard();
		HDFCCard h =new HDFCCard();
		s.deposit();
		s.withdraw();
		h.deposit();
		h.withdraw();
		
*/	
	BeanFactory  b=new ClassPathXmlApplicationContext("beans.xml");
    /* SBIcard s=(SBIcard)b.getBean("sbi");
     s.deposit();
     s.withdraw();
     
     HDFCCard s1=(HDFCCard)b.getBean("hdfc");
     s1.deposit();
     s1.withdraw();
     */
	
	DebitCard s1 =(DebitCard) b.getBean("hdfc");
	s1.deposit();
	s1.withdraw();
	}

}
