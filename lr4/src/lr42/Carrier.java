package lr42;

public class Carrier extends Warship{
    private int aircraft_amount;
    public Carrier(String code, int aircraft_amount) {
        super(code);
        this.aircraft_amount = aircraft_amount;
    }

    public Carrier(String code) {
        super(code);
        aircraft_amount = 0;
    }

    public int getAircraft_amount() {
        return aircraft_amount;
    }

    public void setAircraft_amount(int aircraft_amount) {
        this.aircraft_amount = aircraft_amount;
    }

    public void sendAircraft(){
        if (aircraft_amount > 0){
            System.out.println("aircraft goes yyyyyyyy");
            this.aircraft_amount--;
        }else{
            System.out.println("no aircraft to go yyyyyyyy");
        }
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void swim() {
        super.swim();
    }
}
