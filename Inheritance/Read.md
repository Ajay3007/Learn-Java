# INHERITANCE
    An existing class can be extended by adding additional capabilities. Such a class is called a subclass. Subclasses inherite all the properties of the parent classes. This process is known as inheritance.
    A subclass inherits all instance variables and methods from its superclass and also has its own instance variables and methods. This principle helps to build classes for complex problems and also avoid the repetation of codes in the new class. 
    To create a subclass, the keyword 'extends' is used in the class definition.
    
# CREATING SUBCLASSES
    Refer the program Inherite.java for the code. In the program, the keyword 'super' refers to the superclass constructor Address().
   #When super() is used inside a constructor, it must be the first statement.
   
# METHOD OVERRIDING
    When subclasses are constructed, they may have their own methods in addition to the iherited methods from the superclass. It is possible for methods in subclass to have the same name and type signature as that of the superclass. 
    In that case, the method inthe subclass will override the method in the superclass. This is called method overriding. Method overriding exhibits the full polymorphism property.
    Refer program Override.java for the code.
    Java supports multi level inheritance as given below:
            Class A -----> Class B Extends A -----> Class C Extends B
            
# FINAL CLASS
    Inheritance allows creation of subclasses. However, if need arises, inheritance can be prevented by declaring a class as final.
    A class declared as 'final' cannot have subclasses.
    Refer program FinalClass.java for the code.
    
# FINAL METHOD
    Method in a class can be protected from overriding methods in subclass. Like final classes, methods can be declared with the modifier 'final'. Methods declared as 'final' cannot have overriding methods in the subclasses.
    
# FINAL VARIABLE
    Variables can also be declared as 'final'. 'final' variables are constants. You cannot assign ane new value to them once you have declared them as final. final variables must be assigned values ehile declaring them to be final. 
    The general form of declarimg a 'final' variable is:
        final type VariableName = Value;
    By convention, final variables are declared with uppercase letters. Folloeing are few examples for final:
        final int MINUTE_VAL = 60;
        final double UPPER_LIMIT = 120.25;
        final double PHI = 3.142;
        
# OBJECT DESTRUCTION AND GARBAGE COLLECTION
    When objects are created, they occupy some memory space of the computer. When an object is no more in use, java identifies them automatically and frees the memory. This is called garbage collection.
    There is no seperate destruction method in java.In certain situations, objects may use other than memory, like a files or a system resource. In such cases, care must be taken to free those resources before the object is destroyed.
    In order to provide such facility, Java has finalize() method. This method can be put inside a class. Before an object is destroyed, Java runs the finalize() method. The user can define whatever action to be taken inside the finalize() method.
    
# Static Methods
    We have so far seen that methods are called on the object. This is called in relation to an instance of a class. Java provides a mechanism, in ehich methods can be called without an instance of a class.
    Such methods are called 'static' methods. Static methods are declared by using the modifier 'static'. For example, the main() is a static method as it has to function independent of any object.
    The general form of calling a static methods is:
        classname.static_method;
    A static method cannot access any instance variable of that class. It cannot make use of 'this' or 'super' inside the method. It can only access static methods and static variables.
    Refer program StaticSameClass.java for static methods within the same class and StaticDiffClass.java for static methods in different classes.
    
# Static Variables
    Instance variables of java can also be declared as static. When a variable is declared as static, it becomes a class variable or global variable.
    Static variables can be access by any part of the program. Even if an instance is created, the static variables retain the last modified value.
    Any object of the class in which the static variable is defined can modify the value of static variable. 
    Refer program StaticVar.java
    
# Static Blocks
    In certain cases, it may be needed to excute a set of statements in a class only once and independent of the instance.
    In Java, such statements can be placed in a block and declared as static. Such blocks are called static blocks. 
    When a class is loaded, the block is excuted. In the subsequent instances, the static blocks are not excuted. 
    With this feature, it is possible to excute a set of instruction in the static block even in the absence of a main method.
    Refer program StaticBlock.java
    
# ABSTRACT CLASSES
    In the inheritance hierarchy, we have seen, while going down, one encounters subclasses which have definite instance variables and methods. Similarly, when we go up in the hierarchy, common properties of classes can be abstracted and defined in a single class. This helps to deal a complex problem in one class.
    For ex: consider geometrical shapes, circle, rectangle and parallelogram. All of them have cirtain comon properties like area and circumference. The common properties can be abstracted and can be brought under a common class,Shape, with methods for calculating the area and circumference. But these methods cannot have a concrete body as the formulate for calculating area and circumference are different.
    Therefore methods defined without a concrete body. Java allows defining of meythods without body and such methods are called 'abstract' methods. Abstract methods are defined with a keyword 'abstract'. 
    A class containing atleast one abstract method is called as an abstract class.
    Refer program AbstractClass.java
    
# MATHEMATICAL METHODS
    Basic mathematical functions like, sin(x) are available in java.lang package. All of the methods are static.
        Math.toRadians(angle_degree)           ---> converts degree into radian
        Math.sin(angle_radian)/Math.cos(angle_radian)
        Math.E                                 ---> geves value of epsilon i.e. e = 2.713
        Math.exp(n)                            ---> exponential fuction
        Math.PI                                ---> gives value of pi
        Math.rint(x)                           ---> gives rounded value of x, eg. if x = 3.6 it gives 4.0
        Math.round(x)                          ---> gives rounded integer value of x, eg. if x = 3.6 it gives 4
        Math.ceil(x)                           ---> rounded to the nearest value greater than equall to x, eg. if x = 3.6 it gives 4.0
        Math.floor(x)                          ---> rounded to the nearest value less than equall to x, eg. if x = 3.6 it gives 3.0
        Math.log(n)                            ---> gives Natural Logarithm of n, eg. if n = 10.0, it gives 2.3026
        Math.log10(n)                          ---> logarithm to the base 10
        Math.exp(Math.log(n))                  ---> antilog of n
        Math.sinh(x)/Math.cosh(x)/Math.tanh(x) ---> Hyperbolic
        Math.pow(a,b)                          ---> gives a ^ b
        
# TIME AND DATE
    Java has a class GregorianCalender contained in java,util package. This has several methods to handle date, year,month, day, hour, minutes, AM, PM etc.One can make use of this class wheneve time and date related info is needed from the system.
        
