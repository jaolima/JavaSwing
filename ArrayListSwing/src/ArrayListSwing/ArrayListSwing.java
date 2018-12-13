/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.*;

public class ArrayListSwing implements ActionListener {
  JFrame tela;
  JLabel label;
  JTextField texto;
  JButton botao;
  JTextArea area;
  
  public ArrayListSwing(){
      tela = new JFrame("Exemplo de Array");
      tela.setLayout(new FlowLayout());
      label = new JLabel("Nome");
      texto = new JTextField(20);
      botao = new JButton("Adicionar");
      area = new JTextArea(3, 20);
      
      botao.addActionListener(this);
      
      tela.add(label);
      tela.add(texto);
      tela.add(botao);
      tela.add(area);
      tela.setSize(300, 200);
      tela.setVisible(true);
      tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
   public static void main(String[] args) {
       new ArrayListSwing();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
       String elemento = "";
       String elementos = "";
       
       elemento = area.getText();
       elemento += texto.getText();
       area.setText(elemento);
       
       ArrayList<String> nomes;
      nomes = new ArrayList<>();
      
       nomes.add(texto.getText());
       
       for(String nome: nomes){
           elementos += nome;
       }
       area.setText(elemento);
   }
}
