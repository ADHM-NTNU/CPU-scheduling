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
  }
}
