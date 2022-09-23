package billsburgers;

public class HealthyBurger extends Hamburger {

     private String healthyExtra1Name;
     private double healthyExtra1Price;
     private String healthyExtra2Name;
     private double healthyExtra2Price;

     public HealthyBurger(String meat, double price) {
          super("Healthy Hamburger","Brown rye roll", meat, price);
     }

     public void addHealthyAddition1(String name, double price) {
          this.healthyExtra1Name = name;
          this.healthyExtra1Price = price;
     }

     public void addHealthyAddition2(String name, double price) {
          this.healthyExtra2Name = name;
          this.healthyExtra2Price = price;
     }

     @Override
     public double itemizeHamburger() {
          double totalPrice = super.itemizeHamburger();
          if (healthyExtra1Name != null) {
               System.out.println(this.healthyExtra1Name + " added for extra price of " + this.healthyExtra1Price);
               totalPrice += healthyExtra1Price;
          }
          if (healthyExtra2Name != null) {
               System.out.println(this.healthyExtra2Name + " added for extra price of " + this.healthyExtra2Price);
               totalPrice += healthyExtra2Price;
          }
          return totalPrice;
     }

}
