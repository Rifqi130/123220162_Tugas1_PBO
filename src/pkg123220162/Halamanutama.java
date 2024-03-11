/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220162;

import javax.swing.*;
import java.awt.Font;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class Frameutama extends JFrame{
    //inisiasi awalan
    JLabel tulisan1 = new JLabel("Welcome,[Mr./Mrs.].[username]");
    JLabel tulisan2 = new JLabel("Tentukan Panjang, Lebar, dan Tinggi untuk menghitung Balok ");
    
    //inisiasi JLabel dan JText panjang, lebar, dan tinggi
    JLabel pnjg = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel ting = new JLabel("Tinggi");
    
    JTextField pnj = new JTextField();
    JTextField lbr = new JTextField();
    JTextField tng = new JTextField();
    
    //inisiasi bttn hitung dan reset
    JButton htng = new JButton("Hitung");
    JButton rst = new JButton("Reset");
    
    //Hasil
    JLabel hsl = new JLabel("Hasil");
    
    JLabel luper = new JLabel("Luas Persegi");
    JLabel kelper = new JLabel("Keliling Persegi");
    JLabel vobal = new JLabel("Volume Balok");
    JLabel lpb = new JLabel("Luas Permukaan Balok");
    
    JLabel hslluper = new JLabel("[Hasil Berupa Angka]");
    JLabel hslkelper = new JLabel("[Hasil Berupa Angka]");
    JLabel hslvobal = new JLabel("[Hasil Berupa Angka]");
    JLabel hsllpb = new JLabel("[Hasil Berupa Angka]");
    
    
    
    
    
    Frameutama(){
        setVisible(true);
        setSize(720, 720);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(null);
        
        add(tulisan1);
        tulisan1.setBounds(20, 20, 400, 24);
        tulisan1.setFont(new Font("Arial", Font.PLAIN, 25));
        add(tulisan2);
        tulisan2.setBounds(20, 50, 600, 25);
        tulisan2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        add(pnjg);
        pnjg.setBounds(20, 100, 300, 25);
        pnjg.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lebar);
        lebar.setBounds(20, 130, 300, 25);
        lebar.setFont(new Font("Arial", Font.PLAIN, 15));
        add(ting);
        ting.setBounds(20, 160, 300, 25);
        ting.setFont(new Font("Arial", Font.PLAIN, 15));
        
        add(pnj);
        pnj.setBounds(100, 100, 300, 25);
        pnj.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lbr);
        lbr.setBounds(100, 130, 300, 25);
        lbr.setFont(new Font("Arial", Font.PLAIN, 15));
        add(tng);
        tng.setBounds(100, 160, 300, 25);
        tng.setFont(new Font("Arial", Font.PLAIN, 15));
        
        add(htng);
        htng.setBounds(20, 210, 300, 30);
        htng.setFont(new Font("Arial", Font.PLAIN, 15));
        add(rst);
        rst.setBounds(360, 210, 300, 30);
        rst.setFont(new Font("Arial", Font.PLAIN, 15));
        
        
        add(hsl);
        hsl.setBounds(180, 250, 300, 30);
        hsl.setFont(new Font("Arial", Font.PLAIN, 20));
        add(luper);
        luper.setBounds(20, 280, 300, 30);
        luper.setFont(new Font("Arial", Font.PLAIN, 15));
        add(kelper);
        kelper.setBounds(20, 310, 300, 30);
        kelper.setFont(new Font("Arial", Font.PLAIN, 15));
        add(vobal);
        vobal.setBounds(20, 340, 300, 30);
        vobal.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lpb);
        lpb.setBounds(20, 370, 300, 30);
        lpb.setFont(new Font("Arial", Font.PLAIN, 15));
        
        add(hslluper);
        hslluper.setBounds(300, 280, 300, 30);
        hslluper.setFont(new Font("Arial", Font.PLAIN, 15));
        add(hslkelper);
        hslkelper.setBounds(300, 310, 300, 30);
        hslkelper.setFont(new Font("Arial", Font.PLAIN, 15));
        add(hslvobal);
        hslvobal.setBounds(300, 340, 300, 30);
        hslvobal.setFont(new Font("Arial", Font.PLAIN, 15));
        add(hsllpb);
        hsllpb.setBounds(300, 370, 300, 30);
        hsllpb.setFont(new Font("Arial", Font.PLAIN, 15));
    }
}

public class Halamanutama {
    
    public static void main(String[] args) {
        
        
        Frameutama frameutama = new Frameutama();
        
    }
}
