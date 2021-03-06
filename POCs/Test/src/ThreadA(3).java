
public class ThreadA {
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        b.start();
 
        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
               b.sleep(4000);
                b.wait();
                b.method1();
            
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total is: " + b.total);
        }
    }
}
 
class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<10 ; i++){
            	
                total += i;
                notify();
                method1();
                System.out.println(total);
            	System.out.println("inside run");

            }
         
        }
    }
    
    void method1(){
    	synchronized(this){
    	System.out.println("Hello");
    }
    }
}