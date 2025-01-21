import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoThread5 {
  private Map<Integer, String> map; // HashMap is not safe

  public DemoThread5() {
    this.map = new Hashtable<>(); // HashMap = Array + LinkedList
    //this.map = new Collections.synchronizedMap(new HashMap<>());
  }

  public String put(Integer key, String value) {
    return this.map.put(key, value);
  }

  public int size(){
    return this.map.size();
  }

  public static void main(String[] args) {
    DemoThread5 central = new DemoThread5();
    //put (i, String)
    // 0-> 100_000 and 100_000 -> 200_000
    Runnable putEntryTask1 = () -> {
      for (int i = 0; i < 100_000; i++){
        central.put(i, "abc");
      }
  };

  Runnable putEntryTask2 = () -> {
    for (int i= 100_000; i < 200_000; i++){
      central.put(i, "abc");
      }
  };

    Thread workerB = new Thread(putEntryTask1);
    workerB.start(); // main thread initialise another thread (workerB) to execute the task
    //the workerB execute the task ONLY.

    Thread workerC = new Thread(putEntryTask2);
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
