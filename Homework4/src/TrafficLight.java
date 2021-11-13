public class TrafficLight {
    private Light light;

    static class Light{
        int greenRoad;

        Light(int greenRoad){
            this.greenRoad = greenRoad;
        }

    }
    public TrafficLight(){
        light = new Light(1);
    }

    public void carArrived(int carId, int roadId, int direction,
                           Runnable turnGreen, Runnable crossCar){
        synchronized (light){
            if(light.greenRoad != roadId){
                light.greenRoad = roadId;
                turnGreen.run();
                System.out.println("Traffic Light On Road " + (direction < 3 ? "A" : "B")
                         + " Is Green");
            }

            crossCar.run();
            System.out.println("Car " + carId + " Has Passed Road " +
                    (direction < 3 ? "A" : "B") + " In Direction " + direction);
        }
    }

}
