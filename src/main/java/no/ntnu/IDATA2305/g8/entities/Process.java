package no.ntnu.IDATA2305.g8.entities;

/**
 * Class that represents a process.
 * Has methods for getting the process id, burst time, arrival time and priority.
 * Also has methods for getting and setting the remaining time of the process.
 * Used by the schedulers to keep track of the processes.
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

  /**
   * Constructor for the Process class.
   *
   * @param pId         The id of the process.
   * @param burstTime   The burst time of the process.
   * @param arrivalTime The arrival time of the process.
   * @param priority    The priority of the process.
   */
  public Process(int pId, int burstTime, int arrivalTime, int priority) {
    this.pId = pId;
    this.burstTime = burstTime;
    this.remainingTime = burstTime;
    this.arrivalTime = arrivalTime;
    this.priority = priority;
  }

  /**
   * Gets the id of the process.
   * @return The id of the process.
   */
  public int getpId() {
    return pId;
  }

  /**
   * Gets the burst time of the process.
   * @return The burst time of the process.
   */
  public int getBurstTime() {
    return burstTime;
  }

  /**
   * Gets the arrival time of the process.
   * @return The arrival time of the process.
   */
  public int getArrivalTime() {
    return arrivalTime;
  }

  /**
   * Gets the priority of the process.
   * @return The priority of the process.
   */
  public int getPriority() {
    return priority;
  }

  /**
   * Gets the remaining time of the process.
   * @return The remaining time of the process.
   */
  public int getRemainingTime() {
    return remainingTime;
  }

  /**
   * Sets the remaining time of the process.
   * @param remainingTime The remaining time of the process.
   */
  public void setRemainingTime(int remainingTime) {
    this.remainingTime = remainingTime;
  }
}

