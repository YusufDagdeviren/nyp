
package nyp.com.yusuf;

import java.util.Date;


public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        
        this("white",false);
        
        /*color = "white";
        filled = false;*/
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return String.format("%s renkli %b dolulukta bir nesne %s tarihinde oluşturuldu", color,filled,dateCreated.toString());
    }
    
    
    
     
}
