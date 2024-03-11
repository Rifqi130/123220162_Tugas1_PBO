/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123220162;

import javax.swing.*;
import java.awt.Font;

class Framelogin extends JFrame{
    // inisiasi awal
    JLabel tulisan1 = new JLabel("Selamat Datang!!!");
    JLabel tulisan2 = new JLabel("Silahkan masuk untuk melanjutkan");
    
    //inisiasi usuername
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    
    JTextField labelinputuser = new JTextField();
    JTextField labelinputpassword = new JTextField();
    
    //inisiasi jenis kelamin
    
    JLabel jeniskelamin = new JLabel("Jenis Kelamin");
    
    JRadioButton pillaki = new JRadioButton("Laki-Laki");
    JRadioButton pilper = new JRadioButton("Perempuan");
    
    //inisiasi bttn login
    JButton login = new JButton("Login");
    
    
    Framelogin(){
        setVisible(true);
        setSize(720,720);
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
        add(tulisan1);
        tulisan1.setBounds(20, 20, 200, 24);
        tulisan1.setFont(new Font("Arial", Font.PLAIN, 20));
        add(tulisan2);
        tulisan2.setBounds(20, 50, 300, 25);
        tulisan2.setFont(new Font("Arial", Font.PLAIN, 18));
        
        add(username);
        username.setBounds(20, 100, 100, 32);
        username.setFont(new Font("Arial", Font.PLAIN, 18));
        add(password);
        password.setBounds(20, 150, 100, 32);
        password.setFont(new Font("Arial", Font.PLAIN, 18));
        
        add(labelinputuser);
        labelinputuser.setBounds(120, 100, 300, 32);
        labelinputuser.setFont(new Font("Arial", Font.PLAIN, 18));
        add(labelinputpassword);
        labelinputpassword.setBounds(120, 150, 300, 32);
        labelinputpassword.setFont(new Font("Arial", Font.PLAIN, 18));
        
        add(jeniskelamin);
        jeniskelamin.setBounds(120, 190, 200, 32);
        jeniskelamin.setFont(new Font("Arial", Font.PLAIN, 18));
        
        ButtonGroup pilJenKel = new ButtonGroup();
        pilJenKel.add(pillaki);
        pilJenKel.add(pilper);
        
        add(pillaki);
        pillaki.setBounds(20, 230, 100, 32);
        pillaki.setFont(new Font("Arial", Font.PLAIN, 18));
        add(pilper);
        pilper.setBounds(200, 230, 200, 32);
        pilper.setFont(new Font("Arial", Font.PLAIN, 18));
        
        add(login);
        login.setBounds(80, 270, 200, 32);
        login.setFont(new Font("Arial", Font.PLAIN, 18));
        
        
    }
}


    

public class Homepage {
    
    
    public static void main(String[] args) {
        
        
        Framelogin framelogin = new Framelogin();
        
    }
    
}
