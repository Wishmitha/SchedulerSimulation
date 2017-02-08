Team Members : R.B. Mahanama / W.S. Mendis / T.A.S.Y. Jayathilaka / L.M. Jathilake / S.A.N. Jayasooriya

**Shortest Remaining Time First Scheduling :**

Shortest remaining time, also known as shortest remaining time first (SRTF), is a scheduling method that is a pre-emptive version of shortest job next scheduling. In this scheduling algorithm, the process with the smallest amount of time remaining until completion is selected to execute. Since the currently executing process is the one with the shortest amount of time remaining by definition, and since that time should only reduce as execution progresses, processes will always run until they complete or a new process is added that requires a smaller amount of time.

Shortest remaining time is advantageous because short processes are handled very quickly. The system also requires very little overhead since it only makes a decision when a process completes or a new process is added, and when a new process is added the algorithm only needs to compare the currently executing process with the new process, ignoring all other processes currently waiting to execute.

Like shortest job first, it has the potential for process starvation; long processes may be held off indefinitely if short processes are continually added. This threat can be minimal when process times follow a heavy-tailed distribution.[1] A similar algorithm which avoids starvation at the cost of higher tracking overhead is Highest response ratio next.

Like shortest job next scheduling, shortest remaining time scheduling is rarely used outside of specialized environments because it requires accurate estimations of the runtime of all processes that are waiting to execute.

(Wikipedia)

**Implementation :**

The simulation is based on the observer-observable connection between Clock, Process and Scheduler. Each of these has different class implemented in the simulation. The message passing between each class is done using notification class. And the remaining time comparator sorts out the process with the least remaining time from the ready queue. 

**Development :**

The simulation was developed using NetBeans IDE in Java language. MVC architecture and Basic Object Oriented Concepts were used in the development process. GitHub was used for team development.