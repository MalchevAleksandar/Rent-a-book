package applet_preporaka;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class Applet_preporaka extends JApplet{
    
    JPanel glaven, gore, dole, ime, prezime, adresa, grad,
            kniga, avtor, prazen1, prazen2, kopce;
    JLabel ime1, prezime1, adresa1, grad1, kniga1, avtor1;
    JTextField ime2, prezime2, adresa2, grad2,
            kniga2, avtor2;
    JSlider ocena;
    JButton vnesi;
    
    @Override
    public void init(){
        glaven = new JPanel(new GridLayout(2,1));
        glaven.setBorder(new TitledBorder(""));
        this.setSize(800, 420);
        this.getContentPane().add(glaven);
        
        
        gore = new JPanel(new GridLayout(4,1));
        dole = new JPanel(new GridLayout(4,1));
        
        gore.setBorder(new TitledBorder("Внеси лични податоци:"));
        
        ime = new JPanel(new GridLayout(1,2));
        ime1 = new JLabel("Вашето име: ");
        ime2 = new JTextField();
        
        prezime = new JPanel(new GridLayout(1,2));
        prezime1 = new JLabel("Вашето презиме: ");
        prezime2 = new JTextField();
        
        adresa = new JPanel(new GridLayout(1,2));
        adresa1 = new JLabel("Вашата адреса: ");
        adresa2 = new JTextField();
       
        grad = new JPanel(new GridLayout(1,2));
        grad1 = new JLabel("Град: ");
        grad2 = new JTextField();
        
        ime.add(ime1);
        ime.add(ime2);
        prezime.add(prezime1);
        prezime.add(prezime2);
        adresa.add(adresa1);
        adresa.add(adresa2);
        grad.add(grad1);
        grad.add(grad2);
        gore.add(ime);
        gore.add(prezime);
        gore.add(adresa);
        gore.add(grad);
        glaven.add(gore);

        dole.setBorder(new TitledBorder("Твоја препорака (книга што вреди да се прочита): "));
        glaven.add(dole);
        
        
        kniga = new JPanel(new GridLayout(1,2));
        kniga1 = new JLabel("Книга: ");
        kniga2 = new JTextField();
        
        avtor = new JPanel(new GridLayout(1,2));
        avtor1 = new JLabel("Автор: ");
        avtor2 = new JTextField();
        
        kniga.add(kniga1);
        kniga.add(kniga2);
        avtor.add(avtor1);
        avtor.add(avtor2);
        
        dole.add(kniga);
        dole.add(avtor);
        glaven.add(dole);
        
        ocena = new JSlider(1, 10, 1);
        ocena.setPaintTicks(true);
        ocena.setPaintLabels(true);
        ocena.setSnapToTicks(true);
        ocena.setMajorTickSpacing(1);
        ocena.setMinorTickSpacing(1);
        ocena.setValue(1);
        dole.add(ocena);
        
        kopce = new JPanel(new GridLayout(1,3));
        prazen1 = new JPanel();
        prazen2 = new JPanel();
        vnesi = new JButton("Внеси");
        kopce.add(prazen1);
        kopce.add(vnesi);
        kopce.add(prazen2);
        dole.add(kopce);
        
        vnesi.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = "Книгите ќе бидат пратени на:\nИме: ";
                t += ime2.getText() + " ";
                t += prezime2.getText() + "\nАдреса: ул. \"";
                t += adresa2.getText() + "\", " + grad2.getText();
                
                if(ocena.getValue() != 1){
                t += "\n\nКнигата што ја препорачавте:\n";
                t += kniga2.getText() + ", од " + avtor2.getText();
                t += "\nВаша оценка за книгата: " + ocena.getValue();
                }else{
                    t += "\n\nНе препорачавте книга.";
                }
                
            JOptionPane.showMessageDialog(null, t);
            ime2.setText("");
            prezime2.setText("");
            adresa2.setText("");
            grad2.setText("");
            kniga2.setText("");
            avtor2.setText("");
            ocena.setValue(1);
            }
            
            
            
        });
        
        
    }
}
