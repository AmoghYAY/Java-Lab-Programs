
class Collegethread extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        } 
        catch(InterruptedException e){
            System.out.println("College Thread interrupted.");
        }
    }
}

class CSEthread extends Thread{
    public void run(){
        try{
            for (int i = 0; i < 25; i++){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } 
        catch (InterruptedException e){
            System.out.println("CSE Thread interrupted.");
        }
    }
}

public class ThreadProgram{
    public static void main(String[] args){
        Collegethread collegethread=new Collegethread();
        CSEthread csethread=new CSEthread();
        collegethread.start();
        csethread.start();
    }
}
