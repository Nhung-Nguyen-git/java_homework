public class Bus extends Vehicles{
    public final double speed = 20;


    public Bus(String vehiclesName, double distance){
        super(vehiclesName, distance);
    }

    @Override
    public double time() {
        return this.getDistance() / this.speed;
    }

    @Override
    public String toString() {
        return "Bus{" + "busName : " + getVehiclesName() + " - distance : " + getDistance()  +"km- " +
                "speed=" + speed+"km/h"+ "-time : " + time()+ "h"+
                "} " ;
    }
}
