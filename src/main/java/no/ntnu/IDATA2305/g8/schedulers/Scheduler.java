package no.ntnu.IDATA2305.g8.schedulers;

import no.ntnu.IDATA2305.g8.entities.Process;

import java.util.PriorityQueue;

/**
 * Abstract class that represents a scheduler with a certain algorithm.
 */
public abstract class Scheduler {
//  I have no idea if PriorityQueue is smart to use
//  TODO: Figure out if PriorityQueue is smart to use
  PriorityQueue<Process> processes = new PriorityQueue<Process>();
  abstract void execute();
}
