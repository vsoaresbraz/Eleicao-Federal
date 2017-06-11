package Votação;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Dados.Candidato;
import Dados.DeputadoEstadual;
import Dados.DeputadoFederal;
import Dados.Presidente;
import TelaInicial.CadastrarDados;

public class VotoDeputadoEstadual extends JFrame
{
	JButton botãoBranco,botãoConfirme,botãoCorrige,botão1,botão2,botão3,botão4,botão5,botão6,botão7,botão8,botão9,botão0;
    JTextField Voto;
    String a="";
	public VotoDeputadoEstadual() 
	{
	
	Container tela = getContentPane();
	tela.setLayout(null);
	Mani objetoListener = new Mani();

	
	Voto = new JTextField(20);
	Voto.setText("");
	Voto.setBounds(10,10,300,300);
	tela.add(Voto);

	botãoBranco = new JButton("Branco");
	botãoBranco.addActionListener(objetoListener);
	botãoBranco.setBounds(320,150,100,60);
	tela.add(botãoBranco);
	
	
	botãoCorrige = new JButton("Corrige");
	botãoCorrige.addActionListener(objetoListener);
	botãoCorrige.setBounds(420,150,100,70);
	tela.add(botãoCorrige);
	
	botãoConfirme = new JButton("Confirme");
	botãoConfirme.addActionListener(objetoListener);
	botãoConfirme.setBounds(520,150,100,90);
	tela.add(botãoConfirme);
	
	botão0 = new JButton("0");
	botão0.addActionListener(objetoListener);
	botão0.setBounds(320,10,60,30);
	tela.add(botão0);
	

	botão1 = new JButton("1");
	botão1.addActionListener(objetoListener);
	botão1.setBounds(380,10,60,30);
	tela.add(botão1);
	

	botão2 = new JButton("2");
	botão2.addActionListener(objetoListener);
	botão2.setBounds(440,10,60,30);
	tela.add(botão2);
	

	botão3 = new JButton("3");
	botão3.addActionListener(objetoListener);
	botão3.setBounds(320,40,60,30);
	tela.add(botão3);
	

	botão4 = new JButton("4");
	botão4.addActionListener(objetoListener);
	botão4.setBounds(380,40,60,30);
	tela.add(botão4);
	

	botão5 = new JButton("5");
	botão5.addActionListener(objetoListener);
	botão5.setBounds(440,40,60,30);
	tela.add(botão5);
	

	botão6 = new JButton("6");
	botão6.addActionListener(objetoListener);
	botão6.setBounds(320,70,60,30);
	tela.add(botão6);
	

	botão7 = new JButton("7");
	botão7.addActionListener(objetoListener);
	botão7.setBounds(380,70,60,30);
	tela.add(botão7);
	
	botão8 = new JButton("8");
	botão8.addActionListener(objetoListener);
	botão8.setBounds(440,70,60,30);
	tela.add(botão8);
	
	botão9 = new JButton("9");
	botão9.addActionListener(objetoListener);
	botão9.setBounds(380,100,60,30);
	tela.add(botão9);
	
	Voto.setHorizontalAlignment(JTextField.CENTER);
	Voto.setFont(new Font("ARIAL", Font.ITALIC, 50));
	
	
	
	setVisible(false);
	setSize(800, 600);
	setTitle("Deputado Estadual");

}

class Mani implements ActionListener
{
	public void actionPerformed(ActionEvent botao) 
	{
		if(botao.getSource()==botão1)
		{
			Voto.setText(a+"1");
			a +="1";
							
		}
		if(botao.getSource()==botão2)
		{
			Voto.setText(a+"2");
			a +="2";
		}
		if(botao.getSource()==botão3)
		{
			Voto.setText(a+"3");
			a +="3";
		}
		if(botao.getSource()==botão4)
		{
			Voto.setText(a+"4");
			a +="4";
			
		}
		if(botao.getSource()==botão5)
		{
			Voto.setText(a+"5");
			a +="5";
		}
		if(botao.getSource()==botão6)
		{
			Voto.setText(a+"6");
			a +="6";
		}
		if(botao.getSource()==botão7)
		{
			Voto.setText(a+"7");
			a +="7";
		}
		if(botao.getSource()==botão8)
		{
			Voto.setText(a+"8");
			a +="8";
		}
		if(botao.getSource()==botão9)
		{
			Voto.setText(a+"9");
			a +="9";
		}
		if(botao.getSource()==botão0)
		{
			Voto.setText(a+"0");
			a+="0";  
		}
		if(botao.getSource()==botãoBranco)
		{
			  
			for(Candidato aux : CadastrarDados.ListaLadrão)
			{
				if(aux instanceof DeputadoEstadual)
				{
					aux.setNumVotos(aux.getNumVotos()+1);
				}
			}
			new CadastrarDados();
		}
		if(botao.getSource()==botãoCorrige)
		{
			Voto.setText("");
            a="";
		}
		if(botao.getSource()==botãoConfirme)
		{
			  
			  int voto = Integer.parseInt(Voto.getText());
				for(Candidato aux : CadastrarDados.ListaLadrão)
				{
					if(aux instanceof DeputadoEstadual && ((DeputadoEstadual) aux).getNumero() == voto)
					{
						aux.setNumVotos(aux.getNumVotos()+1);
					}
				}
				new CadastrarDados();
		}

		
	}
		
}

}
