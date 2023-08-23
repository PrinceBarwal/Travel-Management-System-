package travel.management.system;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class Login extends JFrame {
    
    Login(){
        setSize(900 , 400);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
//        ### create firat panel ###
        JPanel p1 = new JPanel();
        p1.setBounds(0,0,400 , 400);
        p1.setBackground(new Color(133,193,233));
//        p1.setBackground(Color.WHITE);
        p1.setLayout(null);
        add(p1);
        
//        ### add image to panel 1 ###
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100 , 100 , 200 , 200);
        p1.add(image);
        
        
        
//        ### add second panel ####
        JPanel p2 = new JPanel();
        p2.setBounds(410 , 10 , 460 , 340);
        p2.setLayout(null);
        add(p2);
        
        
//        ### add username filed in panel p2 ###
        JLabel usernamelbl = new JLabel("Username");
        usernamelbl.setBounds(50 , 20 , 200 , 30);
        usernamelbl.setFont(new Font("Tahoma" , Font.PLAIN , 25));
        p2.add(usernamelbl);
        
//        ### add username text filed ###

        JTextField usernametf = new JTextField();
        usernametf.setBounds(50 , 60 , 300 , 30);
        usernametf.setFont(new Font("Raleway" , Font.PLAIN , 20));
        usernametf.setBorder(BorderFactory.createEmptyBorder());
        p2.add(usernametf);
        
        
//        ### add password filed in panel p2 ###
        JLabel passwordlbl = new JLabel("Password");
        passwordlbl.setBounds(50 , 120 , 200 , 30);
        passwordlbl.setFont(new Font("Tahoma" , Font.PLAIN , 25));
        p2.add(passwordlbl);
        
//        ### add password text filed ###

        JTextField passwordtf = new JTextField();
        passwordtf.setBounds(50 , 160 , 300 , 30);
        passwordtf.setFont(new Font("Raleway" , Font.PLAIN , 20));
        passwordtf.setBorder(BorderFactory.createEmptyBorder());
        p2.add(passwordtf);
        
        
        
//        ### add login button ###
        JButton login = new JButton("Login");
        login.setBounds(60 , 220 , 100 , 30);
        login.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        login.setBackground(new Color(133 , 193 , 233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133 , 193 , 233)));
        p2.add(login);
        
        
        
//        ### add signup button ###
        JButton signup = new JButton("SignUp");
        signup.setBounds(200 , 220 , 100 , 30);
        signup.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        signup.setBackground(new Color(133 , 193 , 233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133 , 193 , 233)));
        p2.add(signup);
        
        
//        ### add forget password button ###
        JButton forget = new JButton("Forget Password");
        forget.setBounds(100 , 270 , 170 , 30);
        forget.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        forget.setBackground(new Color(133 , 193 , 233));
        forget.setForeground(Color.WHITE);
        forget.setBorder(new LineBorder(new Color(133 , 193 , 233)));
        p2.add(forget);
        
        
        
//        ### add trouble sign in label ###
        JLabel text = new JLabel("Trouble in Login....");
        text.setBounds(300 , 270 , 100 , 30);
        text.setForeground(Color.RED);
        p2.add(text);
        
        
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Login();
    }
}
