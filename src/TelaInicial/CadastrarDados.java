package TelaInicial;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Votação.VotoPresidente;



import Dados.*;

public class CadastrarDados extends JFrame
{
	public static List<Candidato>ListaLadrão = new ArrayList<Candidato>(); 
	VotoPresidente votopre = new VotoPresidente();
	JButton BotãoListar,BotãoDepuEsta,BotãoResultado,BotãoSair,BotãoDepuFeder,BotãoSairParaProximoMenu,BotãoSenador,BotãoGoverna,BotãoPresidente;
	
	public CadastrarDados() 
	{
		Container tela = getContentPane();
		tela.setLayout(null);
		Mani objetoListener = new Mani();
		
		BotãoDepuEsta = new JButton("Cadastrar Deputado Estadual");
		BotãoDepuEsta.addActionListener(objetoListener);
		BotãoDepuEsta.setBounds(10, 10, 200, 50);
		tela.add(BotãoDepuEsta);
		
		BotãoDepuFeder = new JButton("Cadastrar Deputado Federal");
		BotãoDepuFeder.addActionListener(objetoListener);
		BotãoDepuFeder.setBounds(10, 70, 200, 50);
		tela.add(BotãoDepuFeder);
		
		BotãoSenador = new JButton("Cadastrar Senador");
		BotãoSenador.addActionListener(objetoListener);
		BotãoSenador.setBounds(10, 130, 200, 50);
		tela.add(BotãoSenador);
		
		BotãoGoverna = new JButton("Cadastrar Governador");
		BotãoGoverna.addActionListener(objetoListener);
		BotãoGoverna.setBounds(10, 190, 200, 50);
		tela.add(BotãoGoverna);

		BotãoPresidente = new JButton("Cadastrar Presidente");
		BotãoPresidente.addActionListener(objetoListener);
		BotãoPresidente.setBounds(10, 250, 200, 50);
		tela.add(BotãoPresidente);
		
		BotãoSairParaProximoMenu = new JButton("-> IR PARA VOTAÇÂO <-");
		BotãoSairParaProximoMenu.addActionListener(objetoListener);
		BotãoSairParaProximoMenu.setBounds(240,125, 200, 60);
		tela.add(BotãoSairParaProximoMenu);

		BotãoResultado = new JButton("-> RESULTADO <-");
		BotãoResultado.addActionListener(objetoListener);
		BotãoResultado.setBounds(240, 200, 200, 60);
		tela.add(BotãoResultado);
		
		BotãoListar = new JButton("Listados");
		BotãoListar.addActionListener(objetoListener);
		BotãoListar.setBounds(240,50, 200, 60);
		tela.add(BotãoListar);

		BotãoSair = new JButton("Sair");
		BotãoSair.addActionListener(objetoListener);
		BotãoSair.setBounds(470,131, 70, 50);
		tela.add(BotãoSair);
		
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
			if(configurar.getSource()==BotãoDepuEsta)
			{
				DeputadoEstadual estado = new DeputadoEstadual();
				estado.setNome(JOptionPane.showInputDialog("Digite o Nome do Deputado Estadual"));
				estado.setPartido(JOptionPane.showInputDialog("Digite o Nome do Partido Deputado Estadual"));
				estado.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Deputado Estadual")));
				ListaLadrão.add(estado);
			}
			if(configurar.getSource()==BotãoDepuFeder)
			{
				DeputadoFederal federal = new DeputadoFederal();
				federal.setNome(JOptionPane.showInputDialog("Digite o Nome do Deputado Federal"));
				federal.setPartido(JOptionPane.showInputDialog("Digite o Nome do Partido Deputado Federal"));
				federal.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Deputado Federal")));
				ListaLadrão.add(federal);
				
			}
			if(configurar.getSource()==BotãoSenador)
			{
				Senador senado = new Senador();
				senado.setNome(JOptionPane.showInputDialog("Digite o Nome do Senador"));
				senado.setPartido(JOptionPane.showInputDialog("Digite o Nome do Partido do Senador"));
				senado.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Senador")));
				ListaLadrão.add(senado);
				
			}
			if(configurar.getSource()==BotãoGoverna)
			{
				
				Governador governo = new Governador();
				governo.setNome(JOptionPane.showInputDialog("Digite o Nome do Governador"));
				governo.setPartido(JOptionPane.showInputDialog("Digite o Nome do Partido Governador"));
				governo.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Governador")));
				ListaLadrão.add(governo);
				
			}
			if(configurar.getSource()==BotãoPresidente)
			{
				Presidente corruptomaior = new Presidente();
				corruptomaior.setNome(JOptionPane.showInputDialog("Digite o Nome do Presidente"));
				corruptomaior.setPartido(JOptionPane.showInputDialog("Digite o Nome do Partido do Presidente"));
				corruptomaior.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Presidente")));
				ListaLadrão.add(corruptomaior);
				
			}
			if(configurar.getSource()==BotãoListar)
			{
				String print= "";
				for (Candidato i : ListaLadrão) 
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
			
			if(configurar.getSource()==BotãoSairParaProximoMenu)
			{
				votopre.setVisible(true);
			}
			
			if(configurar.getSource()==BotãoResultado)
			{
				String resultado = "";
				long maiornumvotos = 0;
				for(Candidato aux : CadastrarDados.ListaLadrão)
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
				
				for(Candidato aux : CadastrarDados.ListaLadrão)
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
				
				for(Candidato aux : CadastrarDados.ListaLadrão)
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
				
				for(Candidato aux : CadastrarDados.ListaLadrão)
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
				
				for(Candidato aux : CadastrarDados.ListaLadrão)
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
			
			if(configurar.getSource()==BotãoSair)
			{
				System.exit(0);
			}
				
		}
	}

}