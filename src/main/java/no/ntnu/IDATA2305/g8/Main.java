package no.ntnu.IDATA2305.g8;

import no.ntnu.IDATA2305.g8.entities.Process;
import no.ntnu.IDATA2305.g8.schedulers.FCFS;
import no.ntnu.IDATA2305.g8.schedulers.PreemptivePriority;
import no.ntnu.IDATA2305.g8.schedulers.Scheduler;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
//    TODO: Add code to parse input and start the simulation
//    Maybe use args like <schedulerName> <burstTime> <arrivalTime> <burstTime> <arrivalTime> <burstTime> <arrivalTime>
//    Where each pair of burstTime and arrivalTime represents a process
    ArrayList<Process> processes = new ArrayList<>();
    processes.add(new Process(1, 13, 0, 3));
    processes.add(new Process(2, 7, 1, 2));
    processes.add(new Process(3, 3, 5, 1));
    processes.add(new Process(4, 6, 2, 4));

    Scheduler scheduler = new PreemptivePriority(processes);
    scheduler.execute();

    System.out.println();

    Scheduler scheduler2 = new FCFS(processes);
    scheduler2.execute();
  }
}

// p1: -1, p2: -4, p3: -3, p2: -3, p1: -12, p4: -6
// p1: 12, p2: 3, p3: 0, p2: 0, p1: 0, p4: 0

// p1 waiting: 4 + 3 + 3 = 10
// p2 waiting: 3
// p3 waiting: 0
// p4 waiting: 3 + 3 + 3 + 12 = 21

// p1 turnaround: 10 + 13 = 23
// p2 turnaround: 3 + 7 = 10
// p3 turnaround: 0 + 3 = 3
// p4 turnaround: 21 + 6 = 27

