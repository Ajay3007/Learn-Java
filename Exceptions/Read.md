    In this chapter, we will learn about exceptions. Exceptions are abnormal conditions occuring in a program. When such exceptions occurs, the program aborts or hangs, leaving the user without any information.
    Such errors occuring in abnormalconditions are called exceptions. The errors may occur internally in the program code or through the resources the program is trying to access.
    the sources of errors may be users-input errors such as giving a wrong input URL, device errors such printer not ready, code errors like array index out of bound, trying to access an empty stack and devide by zero error.
    The objective of handling exceptions is to inform the user about the error ar to take an alternative path to overcome the problem and complete the remaining task.
    
# TYPES OF EXCEPTIONS
    All exceptions in Java are handled by a superclass 'Throwable' defined in java.lang package. The 'Throwable' class has two subclasses, Exceptio and  Error. Exception again has two subclasses, IOException and RuntimeException.
            Throwable
                     1. Error --> errors which are beyond the control of programmersare dealt in this class. Disk full and memory not enough are of this type.
                     2. Excetion --> In this class, user can create one's own Exception and use it in Java program.
                                I. IOException --> Exceptions occuring while accessing I/O devices are handled in this class. File not found, end of file encountered are of this type.
                                II. RuntimeException --> Exception occuring in the program code at run time are handled in this class. Devide by zero, wrong cast and null pointer access are of this type.


    
                               
