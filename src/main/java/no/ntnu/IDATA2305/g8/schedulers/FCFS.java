package no.ntnu.IDATA2305.g8.schedulers;

import no.ntnu.IDATA2305.g8.entities.Process;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class that represents a First Come First Serve scheduler.
 * Sets processes in the constructor and sorts them by arrival time.
 * Includes method to execute the algorithm and print the statistics.
 */
public class FCFS extends Scheduler {
  private final List<Process> processes = new ArrayList<>();
  private double currentTime = 0;
  private double totalWaitingTime = 0;
  private double totalTurnaroundTime = 0;

  /**
   * Constructor for the First Come First Serve scheduler.
   * Sorts the processes by arrival time and adds them to the list of processes.
   * @param processes The list of processes to be scheduled.
   */
  public FCFS(List<Process> processes) {
    processes.sort(Comparator.comparingInt(Process::getArrivalTime));
    this.processes.addAll(processes);
  }

  /**
   * Method that executes the First Come First Serve algorithm.
   * Only does the calculations for the average waiting time and average turnaround time.
   * Doesn't actually do any scheduling.
   * Prints the statistics to the console.
   */
  @Override
  public void execute() {
    for (Process process : processes) {
      if (currentTime < process.getArrivalTime()) {
        currentTime = process.getArrivalTime();
      }
      double waitingTime = currentTime - process.getArrivalTime();
      totalWaitingTime += waitingTime;
      currentTime += process.getBurstTime();
      double turnaroundTime = currentTime - process.getArrivalTime();
      totalTurnaroundTime += turnaroundTime;
    }
    System.out.println("Statistics for First Come First Serve:");
    System.out.println("Average waiting time: " + totalWaitingTime / processes.size());
    System.out.println("Average turnaround time: " + totalTurnaroundTime / processes.size());
  }
}
