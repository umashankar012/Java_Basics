/*
In this lecture we will learn:
- Different states of a thread
- Method used for each state of a thread
- Flow chart diagram of a thread cycle
- Difference between Runnable and Running state


#1
- Every time you create a new thread that goes into a new state.
- When you start a thread, it goes into the Runnable state.
When the thread is executing and then it is waiting for the schedular, it is in a runnable state.
- When the thread is actually running on a CPU, it is in a Running state.
The thread executes with the help of the run() method in a running state.
A thread goes in the running state only when it gets informed by the schedular to get executed.
- The thread can be held with the help of the sleep() or wait() method, then will go into the waiting state.
- With the use of notify() method, the thread goes to the Runnable state from the waiting state.
- You can stop the execution of a thread by using a stop() method, and then it will go into the Dead State.
When the work of a thread gets over, then it will go into the dead state automatically.


#2
  start()    notify()
New -----------} Runnable  {------------
    | |         |  
    | |run()        |
    | |         |
    |Runnning ----------}Waiting
    | |  sleep() or wait()
    | |
    | |__stop()____Dead
    |_______________|
      stop()
*/