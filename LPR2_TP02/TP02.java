import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.UUID;

import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class TP02 {
    public static void main(String[] args) {
        Locale brasil = new Locale("pt", "BR");
        
         List<Aluno> alunos = new ArrayList<>();
        

        JFrame frame = new JFrame("TP02 - LP02");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,180);

        
            JPanel panelSuperior = new JPanel(new GridLayout(3,2,10,10));

            JTextField txtnome = new JTextField();
            JTextField txtidade = new JTextField();
            JTextField txtendereco = new JTextField();

            panelSuperior.add(new JLabel("Nome:"));
            panelSuperior.add(txtnome);
            panelSuperior.add(new JLabel("Idade:"));
            panelSuperior.add(txtidade);
            panelSuperior.add(new JLabel("Endereço:"));
            panelSuperior.add(txtendereco);
           


            JPanel panelInferior = new JPanel(new GridLayout(1,4));
            JButton bOk = new JButton("Ok");
            JButton bLimpar = new JButton("Limpar");
            JButton bMostrar = new JButton("Mostrar");
            JButton bSair = new JButton("Sair");

            panelInferior.add(bOk);
            panelInferior.add(bLimpar);
            panelInferior.add(bMostrar);
            panelInferior.add(bSair);

            frame.add(panelSuperior, BorderLayout.NORTH);
            frame.add(panelInferior, BorderLayout.SOUTH);

            frame.setVisible(true);

            bOk.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                  String nome = txtnome.getText();
                  int idade = Integer.parseInt(txtidade.getText()); 
                  String endereco = txtendereco.getText();
                  

                  Aluno a = new Aluno(endereco,idade,nome,UUID.randomUUID());  
                  alunos.add(a);

                  JOptionPane.showMessageDialog(null,"Aluno(a) cadastrado com sucesso!");
                }
            });

            bLimpar.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e){
                txtendereco.setText("");
                txtidade.setText("");
                txtnome.setText("");
              }
            });

            bMostrar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    StringBuilder sb = new StringBuilder();
                    for (Aluno aluno : alunos) {
                        sb.append(aluno).append("\n");
                    }
                     JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Alunos", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    frame.dispose();
                }
            });

            
    }
}
