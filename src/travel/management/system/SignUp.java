package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener{
    
    JButton create , back;
    
    SignUp(){
        setSize(900 , 400 );
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);        
        
//        ### add first panel ###
        JPanel p1 = new JPanel();
        p1.setBounds(0,0,500 , 400);
        p1.setLayout(null);
        p1.setBackground(new Color(133,193,233));
        add(p1);
        
//        ### add username filed in panel p1 ###
        JLabel usernamelbl = new JLabel("Username : ");
        usernamelbl.setBounds(40 , 20 , 200 , 30);
        usernamelbl.setFont(new Font("Tahoma" , Font.BOLD , 20));
        p1.add(usernamelbl);
        
        
//        ### add username text filed ###
        JTextField usernametf = new JTextField();
        usernametf.setBounds(170 , 20 , 250 , 30);
        usernametf.setFont(new Font("Ralway" , Font.PLAIN , 20));
        usernametf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(usernametf);
        
        
//        ### add name filed in panel p1 ###
        JLabel namelbl = new JLabel("Name : ");
        namelbl.setBounds(40 , 70 , 200 , 30);
        namelbl.setFont(new Font("Tahoma" , Font.BOLD , 20));
        p1.add(namelbl);
        
        
//        ### add name text filed ###
        JTextField nametf = new JTextField();
        nametf.setBounds(170 , 70 , 250 , 30);
        nametf.setFont(new Font("Ralway" , Font.PLAIN , 20));
        nametf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(nametf);
        
        
        
//        ### add password filed in panel p1 ###
        JLabel passwordlbl = new JLabel("Password : ");
        passwordlbl.setBounds(40 , 120 , 200 , 30);
        passwordlbl.setFont(new Font("Tahoma" , Font.BOLD , 20));
        p1.add(passwordlbl);
        
        
//        ### add password text filed ###
        JTextField passwordtf = new JTextField();
        passwordtf.setBounds(170 , 120 , 250 , 30);
        passwordtf.setFont(new Font("Ralway" , Font.PLAIN , 20));
        passwordtf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(passwordtf);
        
        
//        ### add secuirty filed in panel p1 ###
        JLabel securitylbl = new JLabel("Security Q.: ");
        securitylbl.setBounds(40 , 170 , 130 , 30);
        securitylbl.setFont(new Font("Tahoma" , Font.BOLD , 20));
        p1.add(securitylbl);
        
        
//        ### add security question choice ###
        Choice question = new Choice();
        question.add("Fav Character from The Boys.");
        question.add("Fav Marvel superhero");
        question.add("Your Lucky Number.");
        question.add("Your childhood superhero");
        question.setBounds(170 , 170 , 300 , 30);
        question.setFont(new Font("Raleway" , Font.PLAIN , 20));
        question.setBackground(Color.WHITE);
        p1.add(question);
        
        
//        ### add answer filed in panel p1 ###
        JLabel asnwerlbl = new JLabel("Answer : ");
        asnwerlbl.setBounds(40 , 220 , 200 , 30);
        asnwerlbl.setFont(new Font("Tahoma" , Font.BOLD , 20));
        p1.add(asnwerlbl);
        
        
//        ### add answer text filed ###
        JTextField asnwertf = new JTextField();
        asnwertf.setBounds(170 , 220 , 250 , 30);
        asnwertf.setFont(new Font("Ralway" , Font.PLAIN , 20));
        asnwertf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(asnwertf);
        
        
//        ### add create button ###
        create = new JButton("Create");
        create.setBounds(100 , 300 , 100 , 30);
        create.setForeground(new Color(133 , 193 , 233));
        create.setBackground(Color.WHITE);
        create.setFont(new Font("Tahoma" , Font.PLAIN , 22));
        create.addActionListener(this);
        p1.add(create);
        
        
        
//        ### add back button ###
        back = new JButton("Back");
        back.setBounds(250 , 300 , 100 , 30);
        back.setForeground(new Color(133 , 193 , 233));
        back.setBackground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.PLAIN , 22));
        back.addActionListener(this);
        p1.add(back);
     
        
        
        
//        ### add image in frame ###
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(300 , 300, Image.SCALE_DEFAULT);
        ImageIcon i3  =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550 , 50 , 300 , 300);
        add(image);
        

        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create){
            
        }
        else{
            new Login();
            setVisible(false);
            
        }
    }
    
    public static void main(String[] args){
        new SignUp();
    }
}
