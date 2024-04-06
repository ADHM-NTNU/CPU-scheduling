package no.ntnu.IDATA2305.g8.schedulers;

import no.ntnu.IDATA2305.g8.entities.Process;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PreemptivePriority extends Scheduler {
  private int processesCompleted = 0;
  private ArrayList<Process> processes = new ArrayList<>();
  private int currentTime = 0;
  private Process currentProcess = null;
  public PreemptivePriority(List<Process> processes) {
    processes.sort(Comparator.comparingInt(Process::getArrivalTime));
    this.processes.addAll(processes);
  }

  @Override
  public void execute() {
    int totalWaitingTime = 0;
    int totalTurnaroundTime = 0;
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

    System.out.println("Average waiting time: " + totalWaitingTime / processes.size());
    System.out.println("Average turnaround time: " + totalTurnaroundTime / processes.size());
  }
}