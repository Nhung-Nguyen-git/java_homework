public class Plane extends Vehicles{
    public Plane(String vehiclesName, double distance) {
        super(vehiclesName, distance);
    }

    public final double speed = 80;





    @Override
    public double time() {
        return this.getDistance() / this.speed;
    }

    @Override
    public String toString() {
        return "Bus{" + "planeName : " + getVehiclesName() + " - distance : " + getDistance()  +"km- " +
                "speed=" + speed+"km/h"+ "-time : " + time()+ "h"+
                "} " ;
    }
}
