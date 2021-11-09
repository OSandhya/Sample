package com.FirstSpring;

public class Car {
      private String color;
      private String carname;
      public Car()
      {
    	  super();
      }
      public Car(String color,String carname)
      {
    	  super();
    	  this.color=color;
    	  this.carname=carname;
      }
      
      public String getColor()
      {
    	  return color;
      }
      public void setColor(String color)
      {
    	  this.color=color;
      }
      public String getCarname()
      {
    	  return carname;
      }
      public void setCarname(String carname)
      {
    	  this.carname=carname;
      }
      public void drive()
      {
    	  System.out.println("car is moving");
    	  System.out.println(color+" "+carname);
      }
}
