package com.comite.ComiteApp.Biz;



import com.comite.ComiteApp.Mensagem;
import com.comite.ComiteApp.entities.Modalidade;


public class ModalidadeBiz {

	public Mensagem msg;
	
	
	public ModalidadeBiz() {
		msg = new Mensagem();
	}
	
	public Boolean Validade( Modalidade modalidade) {
		
		
		boolean result = true;
		if (modalidade.getDescricao().length() < 0) {
	    	 msg.mensagens.add("O salario nao pode ser negativo");
	    	 result = false;
	     }
		
		return result;
	}
	
}
