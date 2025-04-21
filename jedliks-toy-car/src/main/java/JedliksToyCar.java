public class JedliksToyCar {

    private int distance = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) JedliksToyCar.buy()  method");
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.distanceDisplay()  method");
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.batteryDisplay()  method");
        if (battery == 0) {
          return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
        if (battery > 0) {
          distance += 20;
          battery -= 1;
        }
    }
}
