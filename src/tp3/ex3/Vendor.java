package ex3;
public class Vendor extends Thread{

    private ISISandwich isiSandwich;

    public Vendor(String s, ISISandwich isiSandwich) {
        super(s);
        this.isiSandwich = isiSandwich;
    }

    @Override
    public void run()  {synchronized(isiSandwich) {
        try {
                sleep(2000);
              //todo : prepare a sandwich, set it as ready and notify a student
                isiSandwich.setReady(true); 
                
                System.out.println("Vendor "+this.getName()+" said 'ISI Sandwich Is ready'");
                isiSandwich.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}}
