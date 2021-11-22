
package nyp.yusuf.com;

import java.util.ArrayList;


public class Main {
    
    
    
    public static void bilgiVer(GeometricObject geo){
        
        System.out.println(geo.toString());
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
      /*  Rectangle rectangle = new Rectangle(20, 30, "Blue", true);
        Circle circle = new Circle(5, "Yellow", true);FALSE
        
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
        /*
        Equals Metodu Nedir ? 
        */
        /*String s = "Ahmet";
        String b = new String("Ahmet");
        System.out.println(s==b); //FALSE
        System.out.println(s.equals(b)); //TRUE*/
        
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1, 55);
        list.add(55);
        //System.out.println(list);// [0,55,1]
        //System.out.println(list.contains(1));  //True
        //System.out.println(list.contains(55)); //True
        //System.out.println(list.contains(65)); //False
        System.out.println(list.get(1)); // 55
        System.out.println(list.indexOf(55)); // 1 döner baştan başla indexi bulunca bas
        System.out.println(list.lastIndexOf(55)); // 3 döner sondan başla
        System.out.println(list.isEmpty()); // false döner liste boş değil
        //list.remove(1); // 1.indisi siler
        //list.remove((Integer)55); // 55 değerini bulup siler(ilk bulduğunu)
        list.set(0,32); // 0. indisi 32 ile değiştirir.
        System.out.println(list);
        System.out.println(list.size());
        //list.clear();
        //System.out.println(list);// []
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
