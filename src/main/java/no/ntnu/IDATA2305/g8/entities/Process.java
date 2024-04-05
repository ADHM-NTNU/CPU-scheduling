package no.ntnu.IDATA2305.g8.entities;

/**
 * Class that represents a process.
 * Has methods for executing the process as well as methods for getting the different variables and a string representation of the process.
 */
public class Process {
  double pId;
  double initBurstTime;
  double burstTime;
  double arrivalTime;
  double waitingTime = 0;
  double completionTime = 0;
  double turnaroundTime = 0;

  /**
   * Constructor for the Process class.
   *
   * @param pId         The id of the process.
   * @param burstTime   The burst time of the process.
   * @param arrivalTime The arrival time of the process.
   */
  public Process(double pId, double burstTime, double arrivalTime) {
    this.pId = pId;
    this.initBurstTime = burstTime;
    this.burstTime = burstTime;
    this.arrivalTime = arrivalTime;
  }

  /**
   * Method for executing the process.
   */

}

