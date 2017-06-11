package Dados;

public class Senador extends Candidato
{
private static int limiteInferior = 277;
	
	int numero;
	public Senador() 
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
