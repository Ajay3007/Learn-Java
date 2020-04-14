    In this section, we will learn about strings. Java supports three type of strings, String, StringBuffer and StringBuilder.
    String type strings are rigid, whereas StringBuffer and StringBuilder strings are flexible for manipulation.
    In java, a string is defined as a sequence of characters. String class deals with string that are not altered after creation.
    StringBuffer and StringBuilder classes deals with string that need alteration after they are created. All the classes are available in java.lang package.
    
# THE STRING CLASS
    String objects are created using the following constructors:
    String()   ---> Creates a String object with no character/Empty string.
    String(char charray[]) ---> Creates a String using charray
    String(char charray[], int start, int len) ---> Creates a String from charray, starting at charray[start] with len number of chars.
    String(String strObject) ---> Creates a String from String object strObject.
    EXAMPLE:
        1. String s1 = new String();   ---> Creates s1 with no characters
        2. char name[] = {'M','a','g','e','s','h'};
           String s2 = new String(name);  ---> Creates a String s2 with string "Magesh"
        3. char name[] = {'M','a','g','e','s','h'};
           String s3 = new String(name,2,3);  ---> Creates a String s2 with string "ges"
        4. String s4 = new String(s2);  ---> Creates a String s4 with string "Magesh"
            Separate memory is allocated when String object are created using new operatoreven if strings are identicle. In above examples 2 and 4, the object s2 and s4 contains same strings, even they occupy separate memory locations.
            This can be avoided and memory can be saved if strings are created from String literals. 
        5. String s5 = "Magesh";
        6. String s6 = "Magesh";
            In this method, the string objects s5 and s6 contain identicle string "Magesh". In this case Java does not store two objects, but only one. The same reference, where the object is stored, is given to s5 and s6.

# Equality (==) Operator and equalls Method
    Equality operator(==) checks whether the contents of object reference variable are equall, while the equall methods check whether the contents of the objects are equall.  
        String s6 = "Magesh";
        let address of s6 = 3B4F, then 3B4F is Content of reference variable and Magesh is Content of Object
        So, in above, (s2==s4) --> false, as both s2 and s4 has different memmory locations.
                      s5.equals(s6) --> true
        
# String Concatenation With +
    There are diff
    erent ways of concatenation of strings. One way to use + operator. EXAMPLE:
        1. String s1 = "This is demo" + "text";
            The string s1 will take up: s1 = This is demo text
        2. int mark = 75;
           String s2 = "Your mark is" + mark;
           System.out.println(s2);
            The above will give: Your mark is 75
        The + operator can be used with string and numerical variables. In such cases, the numerical values are converted to String type and appended to the preceding String object. 
        3. System.out.println("Sum of 3 and 5 is" + 3+5);
            Output: Sum of 3 and 5 is 35
        4. System.out.println("Sum of 3 and 5 is" + (3+5));
            Output: Sum of 3 and 5 is 8
            In example 3 and 4 operator precedence is observed.
            
# Useful Methods for String objects
        Refer the program StringSort.java and StringExtract.java
        
# The toString() method
    When an object is created using new operator, a reference to the object is created.
    A default toString() method in the super object converts this reference to a human readable string form and store it in the object reference.
    This string can be printed out using the println method.
            
# THE StringBuffer CLASS
    * Strings that need modification are handled by StringBuffer class. After creating a StringBuffer, new string can be inserted or appended to it.
    * The size of the StringBuffer can grow whenever neede. StringBuffer objects can be dynamically altered.
    * When a StringBuffer is created, space for '16' more characters is always appended with it. This helps the StringBuffer object to grow by 16 more characters without any other process.
    * That is the size of StringBuffer is the number of character in that string plus 16. 
    * When the string grows beyond the free 16 character space, the StringBuffer is relocated to a new memory space with the required size.
    * StringBuffer type objects are safe to use in multithreaded environment.
    The constructors in StringBuffer class help to create StringBuffer objects. The constructors are:
        1. StringBuffer()  --> creates an empty StringBuffer objects, it has 16-character space
        2. StringBuffer(int size) --> create a StringBuffer object with a buffer of size capacity
        3. StringBuffer(String str) --> create a StringBuffer object with the string str plus space of 16 character
    The equals() method defined in String class is also available in StringBuffer class. The equals() method can be used to compare the same type of string object and not the mixed.
    That is, a String object cannot be compared with StringBuffer object.
    
    Refer program StringBuff.java
    
# THE StringBuilder CLASS
    There is yet another class StringBuilder to handle mutable and flexible string. It has all method defined in StringBuffer class.
    StringBuilder type strings are not safe to use in multiple threads.
