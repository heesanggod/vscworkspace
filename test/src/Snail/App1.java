package Snail;

interface Vehicle {
    void accelerate ();
    void stop ();
    void setStart ();
}

class Car implements Vehicle {
    String vin;
    String color;
    boolean isStart;
    @Override
    public void accelerate() {
        throw new UnsupportedOperationException("Unimplemented method 'accelerate'");
    }
    @Override
    public void stop() {
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }
    @Override
    public void setStart() {
        throw new UnsupportedOperationException("Unimplemented method 'setStart'");
    }
}

class Train implements Vehicle {
    String trainMumber;
    String departureStation;
    String arrivalStation;
    boolean isStart;
    @Override
    public void accelerate() {
        throw new UnsupportedOperationException("Unimplemented method 'accelerate'");
    }
    @Override
    public void stop() {
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }
    @Override
    public void setStart() {
        throw new UnsupportedOperationException("Unimplemented method 'setStart'");
    }
}

class ManualCar extends Car {
    int gear;
    void setGear(int gear) {

    }
}
 
class AutomaticCar extends Car {
    int gear;
    void setGear(int gear) {

    }
 }

class FreightTrain extends Train {
    Float cargoWeight;

}

class PassengerTrain extends Train {
    int passengerCount;

}
public class App1 {
    
}
