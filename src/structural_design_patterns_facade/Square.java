package structural_design_patterns_facade;
public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Square::draw()");
   }
}