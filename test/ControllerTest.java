import coffeedraw.*;
import java.awt.*;

/**
 * Tests the Controller's initializer function and tests methods to retrieve images and sounds from files.
 */
public class ControllerTest extends Controller {
    
    public static void main(String[] args) {
        new ControllerTest.startController(800, 600, "ControllerTest");
    }
    
    public void begin() {
        Image notReal = getImage("doesntexist.png"); // May throw an error if you try to display it.
        AudioClip notRealSound = getAudio("doesntexist.wav"); // Will not make any sound if you try to play it.
    }
    
}
