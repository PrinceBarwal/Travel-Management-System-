package travel.management.system;
import javax.swing.*;
import java.awt.*;



public class Splash extends JFrame implements Runnable{
    
    Thread t;
    
    
    Splash(){
//        setSize(500,500);
//        setLocationRelativeTo(null);
//        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        
        t = new Thread(this);
        t.start();
        
        setVisible(true);
        
        int x = 1;
        
        for(int i=2 ; i<=580 ; i+=4 , x+=1){
            setLocation(530 - ((i+x)/2) , 330 - (i/2));
            setSize(i+3*x , i+x/2);
            
            try{
                Thread.sleep(10);
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
//            new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String [] args){
        new Splash();
    }
}