abstract class Vehicles {
private String vehiclesName;
   private double distance;
   private double time;

    public Vehicles(String vehiclesName, double distance) {
        this.vehiclesName = vehiclesName;
        this.distance = distance;
    }



    public String getVehiclesName() {
        return vehiclesName;
    }

    public void setVehiclesName(String vehiclesName) {
        this.vehiclesName = vehiclesName;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }



    public abstract double time();

    @Override
    public String toString() {
        return "Vehicles{" +
                "vehiclesName='" + vehiclesName + '\'' +
                ", distance=" + distance +
                ", time=" + getTime() +
                '}';
    }
}
