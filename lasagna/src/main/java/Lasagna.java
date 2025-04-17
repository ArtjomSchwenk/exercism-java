public class Lasagna {
    
    public int expectedMinutesInOven() {
      return 40;
    }
    
    public int remainingMinutesInOven(int spendTime) {
      return expectedMinutesInOven() - spendTime;   
    }
    
    public int preparationTimeInMinutes(int layers) {
      return layers * 2;
    }
    
    public int totalTimeInMinutes(int layers, int spendTime) {
      return preparationTimeInMinutes(layers) + spendTime;
    }
}
