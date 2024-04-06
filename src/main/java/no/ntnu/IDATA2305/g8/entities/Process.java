package no.ntnu.IDATA2305.g8.entities;

/**
 * Class that represents a process.
 * Has methods for executing the process as well as methods for getting the different variables and a string representation of the process.
 */
public class Process {
  private double pId;
  private double initBurstTime;
  private double burstTime;
  private double arrivalTime;

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

  public double getpId() {
    return pId;
  }

  public double getBurstTime() {
    return burstTime;
  }

  public double getArrivalTime() {
    return arrivalTime;
  }

}

