package no.ntnu.IDATA2305.g8.schedulers;

import no.ntnu.IDATA2305.g8.entities.Process;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Class that represents a First Come First Serve scheduler.
 */
public class FCFS extends Scheduler {
  private final List<Process> processes = new ArrayList<>();
  private double currentTime = 0;
  private double totalWaitingTime = 0;
  private double totalTurnaroundTime = 0;
  public FCFS(List<Process> processes) {
    processes.sort(Comparator.comparingDouble(Process::getArrivalTime));
    this.processes.addAll(processes);
  }

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
    System.out.println("Average waiting time: " + totalWaitingTime / processes.size());
    System.out.println("Average turnaround time: " + totalTurnaroundTime / processes.size());
  }

}
