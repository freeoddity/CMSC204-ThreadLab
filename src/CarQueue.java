import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class CarQueue {
	private Random randInt;
	private Queue<Integer> directions;
	public CarQueue() {
		directions = new ArrayDeque<Integer>();
		randInt = new Random();
		directions.add(randInt.nextInt(4));
		directions.add(randInt.nextInt(4));
		directions.add(randInt.nextInt(4));
		directions.add(randInt.nextInt(4));
		directions.add(randInt.nextInt(4));
		directions.add(randInt.nextInt(4));
		
	}

	public void addToQueue() {
		// TODO Auto-generated method stub
		class cQueue implements Runnable{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					try {
						directions.add(randInt.nextInt(4));
						Thread.sleep(200);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		cQueue carQ = new cQueue();
		Thread t = new Thread(carQ);
		t.start();
	}

	public int deleteQueue() {
		// TODO Auto-generated method stub
		return directions.remove();
	}

}
