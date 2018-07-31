package com.vendacarros.bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MessagesBean {
	
	
	public void adicionarMensagemErro() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Resumo da msg de erro", "Msg completa");
		
		context.addMessage("destinoErro", msg);
		
	}
	
	public void adicionarAvisoFlutuante() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Resumo do aviso flutuante", "Aviso flutuante completo");
		
		context.addMessage("destinoAviso", msg);
		
	}
	
}
