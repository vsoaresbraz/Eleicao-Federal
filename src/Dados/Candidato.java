package Dados;

public class Candidato 
{
	private String Nome="";
	private String Partido="";
	private long NumVotos=0;
	
	public Candidato() 
	{
		String nome = "Indefinido";
		String partido ="Indefinido";
		long NumVotos= 0;
		
   }
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getNome() {
		return Nome;
	}
	public void setNumVotos(long numVotos) {
		NumVotos = numVotos;
	}
	public long getNumVotos() {
		return NumVotos;
	}
	public void setPartido(String partido) {
		Partido = partido;
	}
	public String getPartido() {
		return Partido;
	}
	
}
