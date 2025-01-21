import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class DemoThread4 {
  private List<Integer> integers; // not thread safe

  // solution 
  // 1. native data structure (AtomicXXXX)
  // 2. lock the action

  public DemoThread4(){
    this.integers = new Stack<>(); // polymorphism
  }

  // public ArrayList<Integer> getIntegers() {
  //   return this.integers;
  // }

  public synchronized boolean add(Integer integer){
    return this.integers.add(integer); // lock this line of code
  }

  public int size(){
    return this.integers.size();
  }

  // public synchronized void addI() {
  //   this.integers.add(1);
  // }

  public static void main(String[] args) {
    DemoThread4 central = new DemoThread4();
    Runnable addSomething = () -> {
      for (int i = 0; i < 100; i++) {
        central.add(i);
      }
    };

    Thread workerB = new Thread(addSomething);
    workerB.start(); // main thread initialise another thread (workerB) to execute the task
    //the workerB execute the task ONLY.

    Thread workerC = new Thread(addSomething);
    workerC.start();

    // Main Thread
    try {
      workerB.join(); // main thread wait until workderB complete the task
      workerC.join(); // main thread wait until workderC complete the task
    } catch (InterruptedException e) {

    }

    System.out.println(central.size());

  }


}
