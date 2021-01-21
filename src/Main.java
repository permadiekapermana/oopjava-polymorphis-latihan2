public class Main {

	public static void main(String[] args){
      Bike b = new Bike();
      b = new Yamaha();
      System.out.println("Speedlimit Yamaha : "+b.speedlimit);
      b = new Honda();
      System.out.println("Speedlimit Honda : "+b.speedlimit);
      }

}
