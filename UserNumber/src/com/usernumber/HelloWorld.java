package com.usernumber;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {

   @ManagedProperty(value="#{message}")
   private MessageBean messagebean;

   private String message;

   public HelloWorld() {
      System.out.println("HelloWorld started!");   
   }
   public String getMessage() {
      if(messagebean != null){
         message = messagebean.getMessage();
      }       
      return message;
   }
   public void setMessageBean(MessageBean message) {
      this.messagebean = message;
   }
}