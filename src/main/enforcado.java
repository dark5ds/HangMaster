package main;

public class enforcado 
{
	String 	palavra				; 	// ex.: "Leitao"
	String 	letrasRespondidas	; 	// ex.: "ABDFG";
	int 	state				; 	// ( 0 - 6)
	/* 0-nada
	 * 1-cabe�a
	 * 2-tronco
	 * 3-perna esquerda
	 * 4-perna direita
	 * 5-bra�o esquerdo
	 * 6-bra�o direito <--GAME OVER!
	 */
	//COMENT�RIO DO COELHO
	public enforcado()
	{
		//construtor
	}
	
	public String returnCrypt () //retorna palavra encriptada -> 'palavra' rescrita com letras de 'letrasRespondidas'
	{
		
		return null;  //ex.: L _ I _ A O (leitao) com 'letrasRespondidas'->"LIAOP"
	}
	
	public boolean isVictor() //recebe returnCrypt, se n�o tiver underscore, ganhou!
	{
		return false; //true se n�o existirem underscores em returnCrypt
	}
	
	public void receiveLetter(char letter) //recebe letra e insere em 'letrasRespondidas'
	{
		//se a letra n�o existir em 'letrasRespondidas' nem em 'palavra'
			//Incrementar 'state'
		//se a letra  existir em 'letrasRespondidas' mas n�o em 'palavra'
			//NADA
		//se a letra n�o existir em 'letrasRespondidas' mas existir em 'palavra'
			//Adiciona a 'letrasRespondidas'
		//se a letra existir em 'letrasRespondidas' e em 'palavra' 
			//NADA
	}
	
	private boolean incrementer()
	{
		//incrementar state
		return false;
	}
}
