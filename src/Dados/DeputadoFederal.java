package Dados;

public class DeputadoFederal extends Candidato
{
private static int limiteSuperior = 3000;
	
	int numero;
	public DeputadoFederal() 
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
