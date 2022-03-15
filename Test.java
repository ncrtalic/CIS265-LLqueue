package llqueue;

/**
 *
 * @author ncrta
 */
public class Test {
     public static void main(String[] args) throws QueueFullException {

            LLQueue llQueue = new LLQueue();

            ArrayQueue arrayQueue = new ArrayQueue(3500);


            for (int i = 0; i < 3000; i++) {

                  double value = Math.random();

                  llQueue.add(value);

                  arrayQueue.add(value);

            }

            System.out.println("Initial ArrayQueue size: " + arrayQueue.size());

            System.out.println("Initial LLQueue size: " + llQueue.size());

            System.out.println("Testing ArrayQueue");

            //start time

            long start = System.currentTimeMillis();

            //2000 enqueue-dequeue operations

            for (int i = 0; i < 2000; i++) {

                  double value = Math.random();

                  arrayQueue.remove();

                  arrayQueue.add(value);

            }

            //stop time/elapsed time

            long end = System.currentTimeMillis();

            double time = (end - start) / 1000.0;

            System.out.println("It took " + time

                        + " seconds for 2000 enqueue-dequeue operations");

            System.out.println("Testing LLQueue");

            start = System.currentTimeMillis();

            for (int i = 0; i < 2000; i++) {

                  double value = Math.random();

                  llQueue.remove();

                  llQueue.add(value);

            }

            end = System.currentTimeMillis();

            time = (end - start) / 1000.0;

            System.out.println("It took " + time

                        + " seconds for 2000 enqueue-dequeue operations");

      }

}

