    In this section, we will learn about multithreaded programming in Java. A single task can be devided into a number of small sub-task can be excuted as an independent process. Such a process is known as a thread.
    
# MULTITASKING
    When more than one task is processed by a computer, it is called multitasking. This is being done to utilize the idle of a CPU more effectively.
    Each task (heavy-weight process) has its own set of variables and seperate memory location for them. The underlying OS does the multitasking process by bringing task to the CPU and excuting them by using appropriate schedule.
    
# Multithreading
    In many real-life situation, a single task (heavy-weight process) may comprise of many sub-task (light-weight process), such as reading an input stream, processing data, drawing graphics on screen, etc.
    Each sub-task is carried out one after another. But certain sub-task, like reading an input stream, may have to keep waiting till a byte is read. In such occasions, CPU will be idling without doing any work.
    This idling time of CPU can be utilized if some other sub-task, say drawing a graphic on screen can be excuted in CPU. This mechanism of treating a single task as several independent process simultaneously is called multithreading.
    In multithreading same set of variables and memory space is shared by the threads. The thrading mechanism is supported by Java's Thread class contained in java.lang package.
    
# CREATING A THREAD
    A Java thread can be created in two different ways:
    (i). By extending Thread class
    (ii). By implementing Runnable interface
            In both cases the run() method which contains the code for the thread is to be implemented.
# Thread Class
    Few are the constructors defined in Thread class are:
    (i). Thread(Runnable target) --> Creates a new thread object, using the target which contains the run() method.
    (ii). Thread(String name)    --> Creates a new thread object with a name specified by name.
    (iii). Thread(Runnable target, String name) --> Creates a new thread object, using the target which contains the run() method, with a name specified in name.
    
# Some of the methods define in a Thread class
    1. String getName()         Returns the name of invoking Tread object.
    2. boolean isAlive()        Returns true if the thread has started and has not yet terminated.
    3. void join()              Waits for a thread to terminate.
    4. void run()               Contains the statements that are to be excuted in a thread.
    5. void start()             Starts a thread by calling the run() method.
    6. void sleep(long ms)      Makes the currently excuting thread to sleep for ms milli second.

    Let us see how to crate a thread from a Thread class: Refer the programs Threadcreate1.java and Threadcreate2.java
    
    For the second way to create a thread by implementing the inteface Runnable: Refer the programs Threadcreate3.java and Threadcreate4.java
    
# STATES OF A THREAD
    When a thread is created, it goes to different states before it completes its task and is dead. The different states are:
        *new --> When a thread is created, it is in a new state. In this state the thread will not be executed.
        *runnable --> When the start() method is called on the thread object, the thread is in rannable state. A runnable thread need not be excuted by the CPU. A runnable thread joins the collection of threads that are ready for excution.
        *running --> A thread currently being excuted by the CPU.
        *blocked --> A running thread may go to a blocked state due to any of the following condition:
                        1. wait method is called by the thread
                        2. the thread perform I/O operation
                        3. sleep method is called by the thread
                When a block thread is unblocked, it goes to runnable state and not to running state. Among the runnable threads, one which has higher priority (set by the programmer) will go to the running state.
                The scheduling is done by the OS.
        *dead --> A thread becomes dead on two occations.
                In the first case, a thread completes its task, exits the running state and becomes dead.
                In the other case, the run method is aborted, due to the occurence of an exception and the thread becomes dead.

# MULTITHREADED PROGRAMMING
    In earlier, we have seen only one thread. Now we will see how to write a multithreaded program. When a program is started a thread is automatically created. It is called the main thread. 
    
    
    
