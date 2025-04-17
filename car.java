public class car extends vehicle {

    private int numberOfSeats;

    public void getNumberOfSeats() {
        System.out.println("Number of Seats in Car: " + numberOfSeats);
    }
    @Override
    public void start(){
        super.start();
        System.out.println("Strating Car");
    }
    @Override
    public void stop(){
        super.stop();
        System.out.println("Stoping Car");
    }

}
