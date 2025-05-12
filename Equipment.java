
/**
 * Write a description of class Equipment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equipment
 {
    private String type;
    private String brand;

    public Equipment(String type, String brand) 
    {
        if (type == null || type.isEmpty()) 
        {
             throw new IllegalArgumentException("Equipment type cannot be empty.");
        }
        
        if (brand == null || brand.isEmpty()) 
        {
             throw new IllegalArgumentException("Equipment brand cannot be empty.");
        }
        
        this.type = type;
        this.brand = brand;
    }
}