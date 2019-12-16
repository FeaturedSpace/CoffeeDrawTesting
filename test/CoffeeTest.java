import coffeedraw.*;
import java.awt.*;
import javax.swift.*;
import java.util.*;

public class CoffeeTest extends WindowController {
    
    public static DrawingCanvas pCanvas;
    
    public static void main(String[] args) {
        new CoffeeTest().startController(800, 600, "Coffee Test");
    }
    
    public void begin() {
        
    }
    
    public void onMousePress(Location point) {
        
    }
    
    public void onMouseRelease(Location point) {
    
    }
    
    public void onMouseMove(Location point) {
    
    }
    
    public void onMouseDrag(Location point) {
    
    }
    
    public void onMouseEnter(Location point) {
    
    }
    
    public void onMouseExit(Location point) {
    
    }
    
    public void onUpPress() {
    
    }
    
    public void onUpPress() {
    
    }
    
    public void onUpRelease() {
    
    }
    
    public void onDownPress() {
    
    }
    
    public void onDownRelease() {
    
    }
    
    public void onLeftPress() {
    
    }
    
    public void onLeftRelease() {
    
    }
    
    public void onRightPress() {
    
    }
    
    public void onRightRelease() {
    
    }
    
    public void onBackspaceHeld() {
    
    }
    
    public static class Player extends ActiveObject {
        private FilledRect body;
        private Collection<FilledOval> wheels;
        
        public static class Vector2d {
            private double x, y;
            
            public Vector2d(double x, double y) {
                this.x = x;
                this.y = y;
            }
            
            public Vector2d(Vector2d toCopy) {
                this.x = toCopy.getX();
                this.y = toCopy.getY();
            }
            
            public double getX() {
                return this.x;
            }
            
            public double getY() {
                return this.y;
            }
            
            public void setX(double x) {
                this.x = x;
            }
            
            public void setY(double y) {
                this.y = y;
            }
            
            public void set(double x, double y) {
                this.x = x;
                this.y = y;
            }
            
            public Vector2d modify(double change) {
                this.x += change;
                this.y += change;
                return this;
            }
            
            public Vector2d add(Vector2d toAdd) {
                this.x += toAdd.getX();
                this.y += toAdd.getY();
                return this;
            }
            
            public Vector2d sub(Vector2d toSub) {
                this.x -= toSub.getX();
                this.y -= toSub.getY();
                return this;
            }
            
            public Vector2d dot(Vector2d toMul) {
                this.x *= toMul.getX();
                this.y *= toMul.getY();
                return this;
            }
            
            public Vector2d copy() {
                return new Vector2d(this);
            }
            
        }
            
            
        
        private int direction = 0;
        
        private Velocity2d velocity;
        
        public Player(double x, double y) {
            body = new FilledRect(x, y, 75, 175, Color.YELLOW, CoffeeTest.pCanvas);
            wheels = new FilledOval[] { new FilledOval(x, y + 178, 5, 5, pCanvas), new FilledOval(x+75+5, y + 178, 5, 5, CoffeeTest.pCanvas) };
            
            
            // Death. Only Death.
            velocity = new Velocity2d(0, 0);
        }
        
        public void animate() {
            wheels.forEach((wheel) -> {
                wheel.rotate((direction) * 8);
            });
        }
        
        public void move(int direction) {
            this.direction = direction;
            
            body.move(velocity.getX(), velocity.getY());
            wheels.move(velocity.getX(), velocity.getY());
        }
        
        
    }
    
}
