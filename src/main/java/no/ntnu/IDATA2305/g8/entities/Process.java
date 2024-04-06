package no.ntnu.IDATA2305.g8.entities;

/**
 * Class that represents a process.
 * Has methods for executing the process as well as methods for getting the different variables and a string representation of the process.
 */
public class Process {
  private int pId;
  private int burstTime;
  private int arrivalTime;
  private int priority;
  private int remainingTime = 0;

  /**
   * Constructor for the Process class.
   *
   * @param pId         The id of the process.
   * @param burstTime   The burst time of the process.
   * @param arrivalTime The arrival time of the process.
   */
  public Process(int pId, int burstTime, int arrivalTime) {
    this.pId = pId;
    this.burstTime = burstTime;
    this.arrivalTime = arrivalTime;
  }

  public Process(int pId, int burstTime, int arrivalTime, int priority) {
    this.pId = pId;
    this.burstTime = burstTime;
    this.remainingTime = burstTime;
    this.arrivalTime = arrivalTime;
    this.priority = priority;
  }

  public int getpId() {
    return pId;
  }

  public int getBurstTime() {
    return burstTime;
  }

  public int getArrivalTime() {
    return arrivalTime;
  }

  public int getPriority() {
    return priority;
  }

  public int getRemainingTime() {
    return remainingTime;
  }

  public void setRemainingTime(int remainingTime) {
    this.remainingTime = remainingTime;
  }
}

