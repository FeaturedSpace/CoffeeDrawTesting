import coffeedraw.*;
import java.awt.*;

/**
 * This test is designed to test the various constructors of the WindowController (A Controller that has a canvas and helper
 * methods. It also may use arguments to test the 3 different intializer methods of the Controller class.
 */
public class WindowTest extends WindowController {
    
    public static void main(String[] args) {
        if(args == null || args == new String[0]) 
            new WindowTest.startController();
        
        if(args[0] == "size")
            new WindowTest.startController(800, 600);
            
        if(args[0] == "name")
            new WindowTest.startController(800, 600, "Custom_Name");
        
    }
    
    
    
    
}
