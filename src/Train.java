public class Train extends Vehicles {
    public final double speed = 40;


    public Train(String vehiclesName, double distance){
        super(vehiclesName, distance);
    }


    @Override
    public double time() {
        return this.getDistance() / this.speed;
    }

    @Override
    public String toString() {
        return "Bus{" + "trainName : " + getVehiclesName() + " - distance : " + getDistance()  +"km- " +
                "speed=" + speed+"km/h"+ "-time : " + time()+ "h"+
                "} " ;
    }
}
