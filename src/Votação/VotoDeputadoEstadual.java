package Vota��o;

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
	JButton bot�oBranco,bot�oConfirme,bot�oCorrige,bot�o1,bot�o2,bot�o3,bot�o4,bot�o5,bot�o6,bot�o7,bot�o8,bot�o9,bot�o0;
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

	bot�oBranco = new JButton("Branco");
	bot�oBranco.addActionListener(objetoListener);
	bot�oBranco.setBounds(320,150,100,60);
	tela.add(bot�oBranco);
	
	
	bot�oCorrige = new JButton("Corrige");
	bot�oCorrige.addActionListener(objetoListener);
	bot�oCorrige.setBounds(420,150,100,70);
	tela.add(bot�oCorrige);
	
	bot�oConfirme = new JButton("Confirme");
	bot�oConfirme.addActionListener(objetoListener);
	bot�oConfirme.setBounds(520,150,100,90);
	tela.add(bot�oConfirme);
	
	bot�o0 = new JButton("0");
	bot�o0.addActionListener(objetoListener);
	bot�o0.setBounds(320,10,60,30);
	tela.add(bot�o0);
	

	bot�o1 = new JButton("1");
	bot�o1.addActionListener(objetoListener);
	bot�o1.setBounds(380,10,60,30);
	tela.add(bot�o1);
	

	bot�o2 = new JButton("2");
	bot�o2.addActionListener(objetoListener);
	bot�o2.setBounds(440,10,60,30);
	tela.add(bot�o2);
	

	bot�o3 = new JButton("3");
	bot�o3.addActionListener(objetoListener);
	bot�o3.setBounds(320,40,60,30);
	tela.add(bot�o3);
	

	bot�o4 = new JButton("4");
	bot�o4.addActionListener(objetoListener);
	bot�o4.setBounds(380,40,60,30);
	tela.add(bot�o4);
	

	bot�o5 = new JButton("5");
	bot�o5.addActionListener(objetoListener);
	bot�o5.setBounds(440,40,60,30);
	tela.add(bot�o5);
	

	bot�o6 = new JButton("6");
	bot�o6.addActionListener(objetoListener);
	bot�o6.setBounds(320,70,60,30);
	tela.add(bot�o6);
	

	bot�o7 = new JButton("7");
	bot�o7.addActionListener(objetoListener);
	bot�o7.setBounds(380,70,60,30);
	tela.add(bot�o7);
	
	bot�o8 = new JButton("8");
	bot�o8.addActionListener(objetoListener);
	bot�o8.setBounds(440,70,60,30);
	tela.add(bot�o8);
	
	bot�o9 = new JButton("9");
	bot�o9.addActionListener(objetoListener);
	bot�o9.setBounds(380,100,60,30);
	tela.add(bot�o9);
	
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
		if(botao.getSource()==bot�o1)
		{
			Voto.setText(a+"1");
			a +="1";
							
		}
		if(botao.getSource()==bot�o2)
		{
			Voto.setText(a+"2");
			a +="2";
		}
		if(botao.getSource()==bot�o3)
		{
			Voto.setText(a+"3");
			a +="3";
		}
		if(botao.getSource()==bot�o4)
		{
			Voto.setText(a+"4");
			a +="4";
			
		}
		if(botao.getSource()==bot�o5)
		{
			Voto.setText(a+"5");
			a +="5";
		}
		if(botao.getSource()==bot�o6)
		{
			Voto.setText(a+"6");
			a +="6";
		}
		if(botao.getSource()==bot�o7)
		{
			Voto.setText(a+"7");
			a +="7";
		}
		if(botao.getSource()==bot�o8)
		{
			Voto.setText(a+"8");
			a +="8";
		}
		if(botao.getSource()==bot�o9)
		{
			Voto.setText(a+"9");
			a +="9";
		}
		if(botao.getSource()==bot�o0)
		{
			Voto.setText(a+"0");
			a+="0";  
		}
		if(botao.getSource()==bot�oBranco)
		{
			  
			for(Candidato aux : CadastrarDados.ListaLadr�o)
			{
				if(aux instanceof DeputadoEstadual)
				{
					aux.setNumVotos(aux.getNumVotos()+1);
				}
			}
			new CadastrarDados();
		}
		if(botao.getSource()==bot�oCorrige)
		{
			Voto.setText("");
            a="";
		}
		if(botao.getSource()==bot�oConfirme)
		{
			  
			  int voto = Integer.parseInt(Voto.getText());
				for(Candidato aux : CadastrarDados.ListaLadr�o)
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
