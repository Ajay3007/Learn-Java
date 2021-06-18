    In this section we will learn about input/output handling process. Java treats all data as a stream of bytes or characters. A large number of classes, to deal with disk files, memory and source/destination independent process, are available in Java.
    
# I/O STREAMS
    Java's input/output (I/O) operations are intricate, complex to understand, but more flexible and poerful. Java developers have focused their attention for non-keyboard data handling. 
    All I/O operations in java are straem based.The stream start from or end with files, memory, monitor, keyboard and network sockets. 
    Te sources from where data are read from is called input stream. The sink to which the data are written from is called output stream.
    Data used in Java are handled in two streams, byte stream and character stream.
    I/O operations of byte stream are handled by two abstract classes InputSream and OutputStream.
    Simillarly character stream has Reader and Writer abstract classes.
    
# THE FILE CLASS
    The File class is used only to know the details about a file. It cannot be used to read or write bytes into a file. It helps to study a file before handeling it.
    The File class has following constructor:
        I. File(String dirpath)
        II. File(String dirpath, String filename)
        III. File(File object, String filename)
    where, dirpath is directory path, filename is name of the file and object is File type object.
    Some of the methods defined in the File class are:
            Method                          Purpose of the Method
        1. String getName()                         Returns the name of the directory or file of the invoking object
        2. String getPath()                         Returns the path of the invoking object
        3. String getAbsolutePath()                 Returns the absolute path of the invoking object
        4. String getParent()                       Returns the name of the parent directory of the invoking object.
        5. boolean exists()                         Returns true if the dir/ file object exists, otherwise false.
        6. boolean canWrite()                       Return true if the File object is writable, otherwise false.
        7. boolean canRead()                        Return true if the File object is readable, otherwise false.
        8. boolean isDirectory()                    Return true if the invoking object is a directory, otherwise false.
        9. boolean isFile()                         Return true if the invoking object is a file, otherwise false.
        10. boolean isHidden()                      Returns true if the File object is hidden, otherwise false.
        11. long lastModified()                     Returns a long value representing the last modified date in millisecond.
        12. long length()                           Returns a long value representing the size of the file in bytes.
        13. boolean renameTo(File newname)          Returns Renames the File object with the new name; returns true upon successful renaming
        14. boolean delete()                        Delete the file of the invoking object; returns true on successful deletion, otherwise false.
        
# BYTE STREAM
    In this, stream data are accessed as a sequence of bytes. All types other than character or text are dealt in this stream.
    Since InputStream and OutputStream are abstract classes, object of this type cannot be created. However object references of this type can be declared. 
    These two classes have abstract and concrete methods. The abstract methods are implemented in the subclasses.
    
        
        
        
