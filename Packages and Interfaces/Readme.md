    In this section, packages and interfaces are explained. When there are several classes that are reusable in many programs, then managing them becomes a problem. To overcome this problem, package is used.
    Interfaces have methods which do not have body. Interfaces helps programmars to implement the interface methods with a procedure of their choice. Interfaces also help to realize multiple inheritance.
    
# PACKAGE
    Generally, you create many classes for several applications. Whwn there are large number of classes, keeping them all in a single directory and managing them for different applications is bit cumbersome.
    To solve this problem, one can store the classes in different directories, each directory containing classes performing similar type of functions. To identify the location where a class is stored in the directory, the 'package'statement is used.
    This is neccessary to identify a class when you want to use that class in any other class in any other directory. Thus package helps to manage large number of classes. 
    The general form of the package statement is:
        package pckg1.pckg2.pckg3;
    For example, the statement, package java.soms.jbook; --> states that the program is stored in a directory java\soms\jbook.
    In any program, the package statement, if used, must be the first statement.
            Package1                Package2
            Class A                 Class A
            Class B                 Class D
            Class C                 Class E
                                    Class F
    
# THE import STATEMENT
    When you want to use the classes in a package in another class in a different package, then those classes can be refered in your class using 'import' statement.
    For example, the class A in Package1 in above can be accesed by package2 by placing the following statement:
        import package1.A;
    In any Java program, the import statement, if used, must appear immediately after package statement.
    
# ACCESS MODIFIER
    One of the key feature of Java is its encapsulation. This feature helps to protect your datta and method to the extent you want. This feature in Java is implemented through access modifier.
    Table-> Access modifier and their visibility
            Modifier                   Visibilty
            private                    Visible only to the class
            protected                  Visible to the subclasses in any package and to all classes in the same package
            public                     Visible to all packages
            No Modifier(default)       Visible only to the same package
    Refer program AccessDemo.java and PackageDemo.java
    
# INTERFACES
# Defining Interfaces 
    Interfaces are similar to abstract classes, but difer in their functionality. Interfaces define methods without body. Interfaces cannot have instance variables.
    But it can contain final variables, which must be initialized with values. The methods can have type signature. The interfaces help to implement multiple inheritance in java.
    The general form of defining an interface is:
        modifier interface interface_name{
            final type var1 = val1;
            final type var2 = val2;
            modifier return_type mname1(type signature1);
            modifier return_type mname2(type signature2);
        }
   Here, the modifier can be either public or no modifier. When the interface is declare as public any other class can make use of it.
   The following is an example of interface declaration:
        interface Calculation{
            final double pi = 3.142;
            double Area(double r);
        }
        
# Implementating an Interface
    Once an interface is defined, another class should implement all the methods of the interface. An interface can be implemented in any number of classes. A class can implement any number of interfaces.
    The general form of implementing an interface is:
        modifier class classname [extends superclass] implements interface1, interface2, ... , interfaceN{
            body;
        }
    Here, the modifier is either public or no modifier.
    Java doesn't support multiple inheritance like C++. Java supports only multilevel inheritance.
        Multiple Inheritance                                              Multilevel Inheritance
           Class A      Class B     Class C                                     Class A
                 Class D Extends A,B,C                                       Class B Extends A
                                                                             Class C Extends B
    A class can implement more than one interface, exhibiting multiple inheritance.
        The functionality of multiple inheritance in Java is realized through the interfaces, in which a class can implement any number of interfaces.
        A class implementing an interface can also have additional methods of its own.
     The following is an example for implementating an interface Calculation:
        class Circle implements Calculation{
            public double Area(double x){       //When an implement method is declared in a class, it must be declared as public.
                double ar;
                ar = pi * x * x;
                return ar;
            }
        }
    An interface can be extended to create another interface. For example the following interface extends the previous interface Calculation:
        interface Average extends Calculation{
            void Mean(double[] d);
        }
    Now, any class that implements the Average must implement both methods Area and Mean.
        
 
