    * An array is a variable representing a collection of like-typed data. Arrays are useful in representing vectors, matrices, strings and tables. When an array is created, it reserves a specified number of memory locations to strore the values of a collection of data of a particular type. 
     Each of the memory location is identified by an index associated with the array variable.
     An array is treated as an object.
    
## ONE-DIMENTIONAL ARRAY
    In Java, an array is created in two steps:
    1. An array variable is to be declared.
    2. An array object is to be created using 'new' operator by specifying number of memory locations required.
        int numb[];             // declares an array variable numb of type int.
        numb = new int[12];     // allocates memory for 12 int type.
        Now, numb can handle 12 int type values, each value can be accessed by using values 0 to 11. Suppose, the 12 values are 7, 45, 3, 4, 26, 35, 40, 75, 99, 125, 54, 65, the array will be referred by the index given below:
        numb[0]---> 7
        numb[1]---> 45
        numb[2]---> 3
        .           .
        .           .
        .           .
        numb[11]---> 65
    The declaration of array and creation of array can be done in a single statement.
        int numb[] = new int[12];
  #Array initialization
        Array can be initialized by writting the values inside the braces { . , . , ... }. The above array can be written as:
        int numb[] = {7, 45, 3, 4, ... , 65};
        In that case the number of elements need not be specified.
   
        
## MULTI-DIMENSIONAL ARRAY
    The following statement declare and allocate memory of a 3 X 4 matrix of int type:
        int mat[][] = new int[3][4];    // this statement creates matrix with 3 rows and 4 columns.
    In java it is possible to have rows of varrying columns as given below:
        int mat[][] = new int[3][];
        mat[0] = new int[2];
        mat[1] = new int[3];
        mat[2] = new int[4];
    Multi-dimentional array can be initialized like one-dimentional array.
        int mat[][] = {{.,.,..}, {.,.,...}, ... , {.,.,..}};
        
        
# Array CLASS
    *Java language has a built-in Arrays class packaged in java.util package.
    
   # Method ------------------------> Purpose of method
  # 1. Static int binarySearch(type[] array, type key)
  * Searches the array(sorted) for the specific key using binary serach algorithm. Returns the index of key if found otherwise returns the index of the position at ehich the key is to be inserted + 1 with -ve sign. The type can be byte, short, int, long, float, double, char and object
  
  # 2. Static int binarySearch(type[] array, int fromindex, int toIndex, type key)
  * Searches the array(sorted) in range specified for the key using binary serach algorithm. Returns the index of key if found otherwise returns the index of the position at ehich the key is to be inserted + 1 -ve with sign. The type can be byte, short, int, long, float, double, char and object
    
   # 3. Static type[] copyOf(type[] original, int newLen)
  * Copies the source array to another array of size newLen. The type can be byte, short, int, long, float, double, char and object
  
  # 4. Static void fill(type[] array, type val)
  * Fills the array with the specified value val.
  
  # 5. Static void fill(type[] array, int fromIndex, int toIndex, type val)
  * Fills the array in the specified range with the value val.
  
  # 6. Static void sort(type[] array)
  * Sort the given array in ascending order. The type can be byte, short, int, long, float, double, char and object
  
  # 7. Static void sort(type[] array, int fromIndex, int toIndex)
  * Sort the given array in the specified range in ascending order. The type can be byte, short, int, long, float, double, char and object
  

        

  
