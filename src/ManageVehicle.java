public class ManageVehicle {

        private Bus bus;
        private  Train train;
        private Plane plane;

        public Bus getBus() {
            return bus;
        }

        public void setBus(Bus bus) {
            this.bus = bus;
        }

        public Train getTrain() {
            return train;
        }

        public void setTrain(Train train) {
            this.train = train;
        }

        public Plane getPlane() {
            return plane;
        }

        public void setPlane(Plane plane) {
            this.plane = plane;
        }

    @Override
    public String toString() {
        return "ManageVehicle{" +
                "bus=" + bus +
                ", train=" + train +
                ", plane=" + plane +
                '}';
    }
}


