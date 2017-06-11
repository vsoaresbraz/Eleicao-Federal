package TelaInicial;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Vota��o.VotoPresidente;



import Dados.*;

public class CadastrarDados extends JFrame
{
	public static List<Candidato>ListaLadr�o = new ArrayList<Candidato>(); 
	VotoPresidente votopre = new VotoPresidente();
	JButton Bot�oListar,Bot�oDepuEsta,Bot�oResultado,Bot�oSair,Bot�oDepuFeder,Bot�oSairParaProximoMenu,Bot�oSenador,Bot�oGoverna,Bot�oPresidente;
	
	public CadastrarDados() 
	{
		Container tela = getContentPane();
		tela.setLayout(null);
		Mani objetoListener = new Mani();
		
		Bot�oDepuEsta = new JButton("Cadastrar Deputado Estadual");
		Bot�oDepuEsta.addActionListener(objetoListener);
		Bot�oDepuEsta.setBounds(10, 10, 200, 50);
		tela.add(Bot�oDepuEsta);
		
		Bot�oDepuFeder = new JButton("Cadastrar Deputado Federal");
		Bot�oDepuFeder.addActionListener(objetoListener);
		Bot�oDepuFeder.setBounds(10, 70, 200, 50);
		tela.add(Bot�oDepuFeder);
		
		Bot�oSenador = new JButton("Cadastrar Senador");
		Bot�oSenador.addActionListener(objetoListener);
		Bot�oSenador.setBounds(10, 130, 200, 50);
		tela.add(Bot�oSenador);
		
		Bot�oGoverna = new JButton("Cadastrar Governador");
		Bot�oGoverna.addActionListener(objetoListener);
		Bot�oGoverna.setBounds(10, 190, 200, 50);
		tela.add(Bot�oGoverna);

		Bot�oPresidente = new JButton("Cadastrar Presidente");
		Bot�oPresidente.addActionListener(objetoListener);
		Bot�oPresidente.setBounds(10, 250, 200, 50);
		tela.add(Bot�oPresidente);
		
		Bot�oSairParaProximoMenu = new JButton("-> IR PARA VOTA��O <-");
		Bot�oSairParaProximoMenu.addActionListener(objetoListener);
		Bot�oSairParaProximoMenu.setBounds(240,125, 200, 60);
		tela.add(Bot�oSairParaProximoMenu);

		Bot�oResultado = new JButton("-> RESULTADO <-");
		Bot�oResultado.addActionListener(objetoListener);
		Bot�oResultado.setBounds(240, 200, 200, 60);
		tela.add(Bot�oResultado);
		
		Bot�oListar = new JButton("Listados");
		Bot�oListar.addActionListener(objetoListener);
		Bot�oListar.setBounds(240,50, 200, 60);
		tela.add(Bot�oListar);

		Bot�oSair = new JButton("Sair");
		Bot�oSair.addActionListener(objetoListener);
		Bot�oSair.setBounds(470,131, 70, 50);
		tela.add(Bot�oSair);
		
		tela.setVisible(true);
		tela.setSize(800, 600);
		setSize(600, 600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new CadastrarDados();
	}
	
	class Mani implements ActionListener
	{
		public void actionPerformed(ActionEvent configurar) 
		{
			if(configurar.getSource()==Bot�oDepuEsta)
			{
				DeputadoEstadual estado = new DeputadoEstadual();
				estado.setNome(JOptionPane.showInputDialog("Digite o Nome do Deputado Estadual"));
				estado.setPartido(JOptionPane.showInputDialog("Digite o Nome do Partido Deputado Estadual"));
				estado.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Deputado Estadual")));
				ListaLadr�o.add(estado);
			}
			if(configurar.getSource()==Bot�oDepuFeder)
			{
				DeputadoFederal federal = new DeputadoFederal();
				federal.setNome(JOptionPane.showInputDialog("Digite o Nome do Deputado Federal"));
				federal.setPartido(JOptionPane.showInputDialog("Digite o Nome do Partido Deputado Federal"));
				federal.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Deputado Federal")));
				ListaLadr�o.add(federal);
				
			}
			if(configurar.getSource()==Bot�oSenador)
			{
				Senador senado = new Senador();
				senado.setNome(JOptionPane.showInputDialog("Digite o Nome do Senador"));
				senado.setPartido(JOptionPane.showInputDialog("Digite o Nome do Partido do Senador"));
				senado.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Senador")));
				ListaLadr�o.add(senado);
				
			}
			if(configurar.getSource()==Bot�oGoverna)
			{
				
				Governador governo = new Governador();
				governo.setNome(JOptionPane.showInputDialog("Digite o Nome do Governador"));
				governo.setPartido(JOptionPane.showInputDialog("Digite o Nome do Partido Governador"));
				governo.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Governador")));
				ListaLadr�o.add(governo);
				
			}
			if(configurar.getSource()==Bot�oPresidente)
			{
				Presidente corruptomaior = new Presidente();
				corruptomaior.setNome(JOptionPane.showInputDialog("Digite o Nome do Presidente"));
				corruptomaior.setPartido(JOptionPane.showInputDialog("Digite o Nome do Partido do Presidente"));
				corruptomaior.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Presidente")));
				ListaLadr�o.add(corruptomaior);
				
			}
			if(configurar.getSource()==Bot�oListar)
			{
				String print= "";
				for (Candidato i : ListaLadr�o) 
				{
					if(i instanceof Presidente)
					{
						print+= "\nNome do Presidente:\n"+ i.getNome()+"\nNome do Partido: \n"+i.getPartido();
						
					}
					if(i instanceof Governador)
					{
						print+= "\nNome do Governador:\n"+ i.getNome()+"\nNome do Partido: \n"+i.getPartido();
						
					}
					if(i instanceof Senador)
					{
						print+= "\nNome do Senador:\n"+ i.getNome()+"\nNome do Partido: \n"+i.getPartido();
						
					}
					if(i instanceof DeputadoFederal)
					{
						print+= "\nNome do Deputado Federal:\n"+ i.getNome()+"\nNome do Partido: \n"+i.getPartido();
						
					}
					if(i instanceof DeputadoEstadual)
					{
						print+= "\nNome do Deputado Estadual:\n"+ i.getNome()+"\nNome do Partido: \n"+i.getPartido();
						
					}
					
					
				}
							JOptionPane.showMessageDialog(null, print);
			}
			
			if(configurar.getSource()==Bot�oSairParaProximoMenu)
			{
				votopre.setVisible(true);
			}
			
			if(configurar.getSource()==Bot�oResultado)
			{
				String resultado = "";
				long maiornumvotos = 0;
				for(Candidato aux : CadastrarDados.ListaLadr�o)
				{
					if(aux instanceof Presidente && ((Presidente) aux).getNumVotos() > maiornumvotos )
					{
						maiornumvotos = aux.getNumVotos();
						resultado = "Nome do Presidente Vencedor: \n" + aux.getNome() + "\nNumero de Votos: \n"+aux.getNumVotos();
					}
					else if(aux instanceof Presidente && ((Presidente) aux).getNumVotos() == maiornumvotos )
					{
						resultado = resultado + "Nome Presidente Vencedor: \n" + aux.getNome() + "\nNumero de Votos: \n"+aux.getNumVotos();
					}
				}
				String presidente_eleito = resultado;
				resultado = "";
				maiornumvotos=0;
				
				for(Candidato aux : CadastrarDados.ListaLadr�o)
				{
					if(aux instanceof Governador && ((Governador) aux).getNumVotos() > maiornumvotos )
					{
						maiornumvotos = aux.getNumVotos();
						resultado = "\nNome do Governador Vencedor: \n" + aux.getNome() + "\nNumero de Votos: \n"+aux.getNumVotos();
					}
					else if(aux instanceof Governador && ((Governador) aux).getNumVotos() == maiornumvotos )
					{
						resultado = resultado + "\nNome do Governador Vencedor:  \n" + aux.getNome() + "\nNumero de Votos: \n"+aux.getNumVotos();
					}
				}
				String governador_eleito = resultado;
				resultado = "";
				maiornumvotos=0;
				
				for(Candidato aux : CadastrarDados.ListaLadr�o)
				{
					if(aux instanceof Senador && ((Senador) aux).getNumVotos() > maiornumvotos )
					{
						maiornumvotos = aux.getNumVotos();
						resultado = "\nNome do Senador Vencedor: \n" + aux.getNome() + "\nNumero de Votos: \n"+aux.getNumVotos();
					}
					else if(aux instanceof Senador && ((Senador) aux).getNumVotos() == maiornumvotos )
					{
						resultado = resultado + "\nNome do Senador Vencedor: \n" + aux.getNome() + "\nNumero de Votos: \n"+aux.getNumVotos();
					}
				}
				
				String senador_eleito = resultado;
				resultado = "";
				maiornumvotos=0;
				
				for(Candidato aux : CadastrarDados.ListaLadr�o)
				{
					if(aux instanceof DeputadoFederal && ((DeputadoFederal) aux).getNumVotos() > maiornumvotos )
					{
						maiornumvotos = aux.getNumVotos();
						resultado = "\nNome do Deputado Federal: \n " + aux.getNome() + "\nNumero de Votos: \n"+aux.getNumVotos();
					}
					else if(aux instanceof DeputadoFederal && ((DeputadoFederal) aux).getNumVotos() == maiornumvotos )
					{
						resultado = resultado + "\nNome do Deputado Federal: \n" + aux.getNome() + "\nNumero de Votos: "+aux.getNumVotos();
					}
				}
				String deputadofederal_eleito = resultado;
				resultado = "";
				maiornumvotos=0;
				
				for(Candidato aux : CadastrarDados.ListaLadr�o)
				{
					if(aux instanceof DeputadoEstadual && ((DeputadoEstadual) aux).getNumVotos() > maiornumvotos )
					{
						maiornumvotos = aux.getNumVotos();
						resultado = "\nNome do Deputado Estadual: \n" + aux.getNome() + "\nNumero de Votos: \n"+aux.getNumVotos();
					}
					else if(aux instanceof DeputadoEstadual && ((DeputadoEstadual) aux).getNumVotos() == maiornumvotos )
					{
						resultado = resultado + "\nNome do Deputado Estadual: \n" + aux.getNome() + "\nNumero de Votos: "+aux.getNumVotos();
					}
				}
				String deputadoestadual_eleito = resultado;
				
				resultado = presidente_eleito+"\n"+governador_eleito+senador_eleito+"\n"+deputadofederal_eleito+"\n"+deputadoestadual_eleito;
				
			JOptionPane.showMessageDialog(null, resultado);	
				
				
			}
			
			if(configurar.getSource()==Bot�oSair)
			{
				System.exit(0);
			}
				
		}
	}

}