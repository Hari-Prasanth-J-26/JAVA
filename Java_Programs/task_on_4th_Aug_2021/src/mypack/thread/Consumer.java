package mypack.thread;

class Consumer extends Thread {
    Producer p;
    Thread t2;
  
    public Consumer(Producer temp)
    {
        p = temp;
        t2 = new Thread(this);
        t2.start();
    }
  
    @Override
    public void run()
    {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Consumed "+p.buffer.charAt(i));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Buffer is Empty");
    }
}
  