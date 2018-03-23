package com.company;

/**
(1) in inheritance, subclass object when call an 
    instanse member funtion of sublass only,
    funtion contains implicit reference variables 
    this and super both referring to the 
    current objects (Object of subclass)

(2) the only difference in this and super is 
    -this reference variable is of subclass type.
    -super reference variable is of super class type. 

(3) if your method overrides one of its 
    superclass methods you can invoke the
    superclass version of themethod through
    the use of the keyword super 
    
(4) It avoids name conflict between member 
    variable of superclass and subclass 

    **/

    class SuperKeyword {
     public static void main(String []args){
       B obj = new B();
       obj.f1("Super");
       obj.f2(); 
     }

    }

    class A {
   int z=5;
   public void f1(String name){}   
    }
    class B extends A{
        int z=6;
        public void f1(String name){
            super.f1("super");
        }
        public void f2(){
            int z;
            z=2;
            System.out.println(super.z);
            System.out.println(this.z);
            
        }
    }