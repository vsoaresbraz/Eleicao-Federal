package Dados;

public class DeputadoEstadual extends Candidato
{

	private static int limiteSuperior =  30000;
	
	int numero;
	public DeputadoEstadual() 
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
    	
    	if ((numero< 10000) || (numero>limiteSuperior)){
    		this.numero=limiteSuperior;
    		limiteSuperior--;
    	}
    	else {
    		this.numero = numero;
    	}
	
    	
    }
}
