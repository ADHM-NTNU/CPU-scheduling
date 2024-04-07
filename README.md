# CPU-scheduling
Repository for assignment 3 - CPU scheduling in IDATA2305

## How to use
In the main method insert the processes you want to schedule. The top ones for preemtive priority or the bottom one for
FCFS. Run the main class to calculate average waiting time an average turnaround time. There is already created a schedule
as an example. The calculations used below are based on these.
## Processes
Below is the processes and attributes that we chose to use for an example schedule:

| ID | Burst time | Arrival time | Priority´*` |
|:--:|:----------:|:------------:|:-----------:|
| P1 |     13     |      0       |      3      |
| P2 |     7      |      1       |      2      |
| P3 |     3      |      5       |      1      |
| P4 |     6      |      2       |      4      |

´*` *Only relevant for the preemptive priority algorithm*


## Preemptive Priority Algorithm
|  *Time*   | 0 - 1 | 1 - 5 | 5 - 8 | 8 - 11 | 11 - 23 | 23 -29 |
|:---------:|:-----:|:-----:|:-----:|:------:|:-------:|:-----:|
| *Process* |  P1   |  P2   |  P3   |   P2   |   P1    |  P4   |
### Waiting time

* P1 - 10
* P2 - 3
* P3 - 0
* P4 - 21

Average waiting time: 34/4 = 8.5

### Turnaround time

* P1 - 23
* P2 - 10
* P3 - 3
* P4 - 27

Average turnaround time: 63/4 = 15.75



## First Come, First Served Algorithm
|  *Time*   | 0 - 13 | 13 - 20 | 20 - 26 | 26 - 29 |
|:---------:|:------:|:-------:|:-------:|:------:|
| *Process* |   P1   |   P2    |   P3    |   P4   |
### Waiting time

* P1 - 0
* P2 - 12
* P3 - 18
* P4 - 21

Average waiting time: 51/4 = 12.75