
package nyp.yusuf.com;


public class Main {
    
    
    
    public static void bilgiVer(GeometricObject geo){
        
        System.out.println(geo.toString());
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
      /*  Rectangle rectangle = new Rectangle(20, 30, "Blue", true);
        Circle circle = new Circle(5, "Yellow", true);
        
        bilgiVer(circle);
        bilgiVer(rectangle);
        */
        
        //Object object = new GeometricObject(); //
        //GeometricObject geo  = new GeometricObject();
        //System.out.println(object.toString());
        //System.out.println(geo.toString()); // Override Metod
      
        /*Object object = new Rectangle(); //Implicit type casting
        System.out.println(object instanceof Rectangle); // return true;
        Rectangle r = (Rectangle)object; //Explicit Type Casting
        */
       
       
        //Object object2 = new Object();
        //Rectangle r = (Rectangle)object2; // ClassCastException
        String s = "Ahmet";
        String b = new String("Ahmet");
        System.out.println(s==b);
        System.out.println(s.equals(b));
        
        
    }
}
