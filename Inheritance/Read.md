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
    
 
    
