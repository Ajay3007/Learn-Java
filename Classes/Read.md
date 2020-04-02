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
        The variable adrs is the object reference variable whose type is Address.
