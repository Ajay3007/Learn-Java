#Classes are the basic building blocks for Object Oriented Programming (OOPs) in java. A class is like the blueprint of a building. Objects are created from classes. An object is an instance of a class. Any given problem is treated as a collection of objects.
# DEFINING A CLASS
    A class defines the data type used and the methods that manipulates them.
    The variables declared in a class are called instance variable.
    The general form of defining a class is:
        class classname extends Superclassname{
            type instance-var-1;
            type instance-var-2;
            type instance-var-N;
            return_type methodname1(parameter_list1){
                body1;
            }
            return_type methodname2(parameter_list2){
                body2;
            }
            return_type methodnameN(parameter_listN){
                bodyN;
            }
        }
        classname is a user defined class name.
        extends is a Java reserved keyword and is optional.
        Superclassname is the name of the parent class from ehich this class is derived.
            Example:
                class Address{
                    String name,city;
                    int pin;
                }
                
# THE new OPERATOR AND OBJECTS
    A java object is one instance of a class.
    An object is created from a class using the new operator.
    The new operator creates an object and return an object reference.
    This reference points to the object. The object reference can be stored in a variable.
    The variable that store object references are called object reference variable. The type of the object reference variable is of the class type.
        Example:
            Address adrs = new Address();
        The variable adrs is the object reference variable whose type is Address. The new operator creates an object of type Address and returns thr object reference, which is stored in sdrs.
        When you copy one object reference to another object reference variable, no object is created, but another copy of reference is created, which again points to same object.
        
# THE dot(.) OPERATOR
    The dot operator is used to access the instance variables and methods defined in that object. The general form of using the dot operator is:
    Object.instance_variable
    
# METHOD DECLARATION AND CALLING
    Methods are declared inside a class. Each method performs a specific tasks. The data associated with the instance variables are manipulated by the methods.
    The general form of declaring a method is:
        return_type methodname(parameterlist){
            body;
            return expression;
        }
    A method can be called only on its object. However, methods declared as static can be called directly independent of an object. The general form of calling a method is:
        Object.methodname(parameter-list);
        
# CONSTRUCTORS
    A constructor is used to assign initial values to object when it is created. Using constructors, instance variables can be assigned initial values automatically when an object is created.
    Constructors are special methods. The name of the constructor shall be same as the name of the class itself. There can be any number of constructor in a class.
    The general form of declaring a constructor is:
        class classname{
            type instance_var;
            classname(parameter-list1){
                body1;
            }
            classname(parameter-list2){
                body2;
            }
            type methodname(parameter-list3){
                body;
            }
        }
    Constructors are used to initialize the instance variable.
        
# INSTANCE VARIABLE HIDING ---> Use of this keyword
    In declaring methods and constructors, parameters are used as arguments. The name of parameters are generally different from that of the instance variables.
    In order to identify instance variables from formal parameters, the key word 'this' is used. 'this' refers to the current class.
    
# Constructor Overloading
    Contructors with different parameter list is called constructor overloading.
    EXAMPLE:
        //Define a constructor
	    Address(String nm, String cty, int pn){
		    name = nm;
		    city = cty;
		    pin = pn;
	        }
            Address(){
		        name = "Ajay Kumar Gupt";
		        city = "Gorakhpur";
		        pin = 273311;
	        }
        }
        
# this IN A CONSTRUCTOR
    One constructor of a class can refer to another constructor of the same class through the keyword 'this'. 
    EXAMPLE:
        //First constructor
	Address(String nm, String cty, int pn){
		name = nm;
		city = cty;
		pin = pn;
	}
	//Second Constructor refers to the first constructor
	Address(Address obj){
		this(obj.name,obj.city,obj.pin);
	}
	
# METHOD OVERLOADING
	A class can contain any number of methods. Methods can take parameters as input for data manipulation. Java permots many methods to have same name, but with different type signatures.This way of methods having the same name, but with different type signature is known as method overloading.
#Overloading methods exhibit the concept of polymorphism.


	
	
