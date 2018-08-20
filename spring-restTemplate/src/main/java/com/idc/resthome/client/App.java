package com.idc.resthome.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.idc.resthome.config.AppConfig;
import com.idc.resthome.model.Accounth;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       RestClient obj=context.getBean(RestClient.class);
       List<Accounth> cc=obj.findallacoount("http://localhost:8095/spring-rest-example1/all");
       System.out.println(cc);
       //String del=obj.delete("http://localhost:8095/spring-rest-example1/delete-800");
      // System.out.println(del);
       /*
       Accounth account=new Accounth();
       account.setId(100);
       account.setBalance(5000);
       account.setName("Kohli");
       String sav=obj.save("http://localhost:8095/spring-rest-example1/open", account);
       System.out.println(sav);
       */
       
       Accounth account1 =obj.update("http://localhost:8095/spring-rest-example1/findOne-100");
       account1.setBalance(7000);
       account1.setName("virat");
       System.out.println(account1);
       String up=obj.update1("http://localhost:8095/spring-rest-example1/update-100", account1);
       System.out.println(up);
    
       List<Accounth> cc1=obj.findallacoount("http://localhost:8095/spring-rest-example1/all");
       System.out.println(cc1);
     
    
    
    
    }
}
