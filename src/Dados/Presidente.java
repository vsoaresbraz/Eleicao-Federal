package Dados;

public class Presidente extends Candidato 
{
	private static int limiteInferior = 27;
	int numero;

	public Presidente() 
	{
		super();
	    numero =0;
	}
	 public int getNumero() 
	    {
			return numero;
		}
	    public void setNumero(int numero) 
	    {
	    	
	    	if ((numero< limiteInferior) || (numero>99)){
	    		this.numero=limiteInferior;
	    		limiteInferior ++;
	    	}
	    	else {
	    		this.numero = numero;
	    	}
		
	    	
	    }

	}
