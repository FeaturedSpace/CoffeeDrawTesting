import coffeedraw.*;
import java.awt.*;


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
