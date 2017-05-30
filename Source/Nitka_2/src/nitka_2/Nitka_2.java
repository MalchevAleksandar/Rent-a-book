package nitka_2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;


public class Nitka_2 extends JApplet implements Runnable{

    int x, y;
    
    @Override
    public void init(){
    
        this.setSize(170, 550);
        x = 0;
        y = 550;
        Thread t = new Thread(this);
        t.start();
    }
    
    
    @Override
    public void paint(Graphics g){
        
        g.setColor(new Color(255, 26, 26));
        g.drawRect(x, y, 16, 10);
        g.setColor(new Color(0, 102, 0));
        g.fillRect(x, y, 16, 10);
        
        
    }
    
    
    @Override
    public void run() {
        while(true){
            repaint();
            
            if(y > 0){
                y -= 10;
            }else if(x >= 153){
                x = 0;
                y = 550;
                this.setBackground(Color.WHITE);
            }else{
                y = 540;
                x += 17;
            }
            
            
            
            try{
                Thread.sleep(20);
            }catch(InterruptedException ex){
                System.out.println("Прекинато!");
            }
        }
    }
    
    
    
}
