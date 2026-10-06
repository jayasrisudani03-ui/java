class A{
  int num;
  boolean valueset=false;
  public synchronized void put(int num){
	if(valueset){
		try{
			wait();
		}catch(InterruptedException e){}
	}
	this.num=num;
	System.out.println("put :"+num);
	valueset=true;
	notify();
}
public synchronized void get(){
	if(!valueset){
		try{
			wait();
		}catch(InterruptedException e){}
	}
	System.out.println("Got :"+ num);
	valueset=false;
	notifyAll();
}
}
class producer implements Runnable{
A a;
public producer(A a){
	this.a=a;
	Thread t = new Thread(this);
	t.start();
}
public void run(){
	int i=0;
	while(true){
		a.put(i++);
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){}
	}
}
}
class consumer implements Runnable{
	A a;
	public consumer(A a){
		this.a=a;
		Thread t= new Thread(this);
		t.start();
	}
	public void run(){
		while (true){
			a.get();
		}
	}
}
 class producer{
	public static void main(String args[]){
		A a = new A();
		producer p = new producer(a);
		consumer c = new consumer(a);
	}
}