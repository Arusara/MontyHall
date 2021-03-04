public class MontyHallMain {


    public static void main(String arg[]) {

        // creating MontyHall object.
        MontyHall montyHall = new MontyHall();

        for (int i=1;i<=1000;i++) {

            // generate random car no.
            int randomDoorNo  = (int) (3 * Math.random());
            System.out.println("Counter: "+i);
            System.out.println("Random car number: "+randomDoorNo);

            // generate random  no.
            int randomPlayerNo = (int) (3 * Math.random());
            System.out.println("Random player selection number: "+randomPlayerNo);

            // genrate random no for host other than player picked.
            while (true) {
                int hostNo = (int) (3 * Math.random());
                if (hostNo != randomPlayerNo) {
                    System.out.println("Random host selection number: " + hostNo);
                    break;
                }
            }

            // incrementing counter based on host no and player selection.
            if (randomDoorNo == randomPlayerNo)
                montyHall.incrementCounter2();
            else
                montyHall.incrementCounter1();
        }

        // printing both counters.
        System.out.println("counter 1 value : "+montyHall.getCounter1());
        System.out.println("counter 2 value : "+montyHall.getCounter2());

    }

}
