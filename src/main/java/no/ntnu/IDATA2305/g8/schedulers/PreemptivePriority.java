package no.ntnu.IDATA2305.g8.schedulers;

import no.ntnu.IDATA2305.g8.entities.Process;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class that represents a Preemptive Priority scheduler.
 * Sets processes in the constructor and sorts them by arrival time.
 * Includes method to execute the algorithm and print the statistics.
 */
public class PreemptivePriority extends Scheduler {
  private int processesCompleted = 0;
  private final ArrayList<Process> processes = new ArrayList<>();
  private int currentTime = 0;
  private Process currentProcess = null;

  /**
   * Constructor for the Preemptive Priority scheduler.
   * Sorts the processes by arrival time and adds them to the list of processes.
   * @param processes The list of processes to be scheduled.
   */
  public PreemptivePriority(List<Process> processes) {
    processes.sort(Comparator.comparingInt(Process::getArrivalTime));
    this.processes.addAll(processes);
  }

  /**
   * Method that executes the Preemptive Priority algorithm.
   * Only does the calculations for the average waiting time and average turnaround time.
   * Doesn't actually do any scheduling.
   * Prints the statistics to the console.
   */
  @Override
  public void execute() {
    double totalWaitingTime = 0;
    double totalTurnaroundTime = 0;
    while (processesCompleted < processes.size()) {
      final int time = currentTime;
      Process nextProcess = processes.stream()
              .filter(p -> p.getArrivalTime() <= time && p.getRemainingTime() > 0)
              .min(Comparator.comparingInt(Process::getPriority))
              .orElse(null);

      if (nextProcess == null) {
        currentTime++;
        continue;
      }

      if (currentProcess != nextProcess) {
        currentProcess = nextProcess;
      }

      currentProcess.setRemainingTime(currentProcess.getRemainingTime() - 1);
      currentTime++;

      if (currentProcess.getRemainingTime() == 0) {
        processesCompleted++;
        int turnaroundTime = currentTime - currentProcess.getArrivalTime();
        int waitingTime = turnaroundTime - currentProcess.getBurstTime();
        totalWaitingTime += waitingTime;
        totalTurnaroundTime += turnaroundTime;
      }
    }
    double averageWaitingTime = totalWaitingTime / processes.size();
    double averageTurnaroundTime = totalTurnaroundTime / processes.size();

    System.out.println("Statistics for Preemptive Priority:");
    System.out.println("Average waiting time: " + averageWaitingTime);
    System.out.println("Average turnaround time: " + averageTurnaroundTime);
  }
}