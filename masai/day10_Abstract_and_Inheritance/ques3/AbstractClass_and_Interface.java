//
//Q3) Explain abstract class and interface with an example.
//ans: Abstract Class: This is a type of a class in which we cannot instantiated.
//     Abstract class may or may not have abstract method.
//     Abstract class is meaningless unless and untill it is not extended by its child.
//     The child class of abstract class should overide the abstract method otherwise the child class should be written as abstract class.
//     The abstract class is extended through inheritance.
//     
//     
//     eg:
//      public abstract class A{
//      
//      void func1(){   //concrete method
//      SOP("Inside func1 of class A");
//      }
//      
//      void funcB();   //abstract method  
//      
//      }
//      
//      
//      Interface:
//              Interface object is also not created directly.
//              Interface is similar to abstract but the main difference is that it should have all method as a abstract.
//              Interface class should be implemented instead of extend.
//              The implemented class should override all the abstract method otherwise it should written as a abstract class.
//              Same properties of normal class is also applicable.
//              All the methods are public and default inside the interface if we don not write.
//              
//              
//              eg:
//              interface A{
//              
//              void func2();
//              
//              }
//              
//              class Demo implements A{
//              
//              @Override
//              void func2(){
//              sop("Inside func2 of class Demo");
//              }
//              
//              }
//              
//              