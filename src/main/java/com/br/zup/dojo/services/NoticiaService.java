package com.br.zup.dojo.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.zup.dojo.models.NoticiasModel;

@Service
public class NoticiaService {

	private Map<Integer, NoticiasModel> publicacao = new HashMap<Integer, NoticiasModel>(){{

		put(1, new NoticiasModel(1, "https://idmrastreamento.com/images/rastreamento-para-pessoas.jpg", "João", 36, "Viúvo", "Xablau"));
	}};

	public Collection<NoticiasModel> mostrarPublicacao() {
		return this.publicacao.values();
	}

	public void adicionarPublicacao(NoticiasModel noticiasModel) {
		publicacao.put(publicacao.size()+1, noticiasModel);
	}

	public NoticiasModel deletarPublicacao(int id) {

		return this.publicacao.remove(id);


	}

	public NoticiasModel buscarUsuario(String nome) {
		NoticiasModel usuario = null;
		for (NoticiasModel user : publicacao.values()) {
			if(user.getNome().equalsIgnoreCase(nome)) {
				usuario = user;
			}


	}
	return usuario;
}
}