package br.com.apiportifolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cursos")
public class Cursos {

	@Id
	private String id;
	private String nome;
	private String instituicao;
	private String descricao;
	private String link;
	private String imagem;
	private Integer cargaHoraria;
	private Integer anoConclusao;

	public Cursos() {
	}

	public Cursos(String nome, String instituicao, String descricao, String link, String imagem, Integer cargaHoraria, Integer anoConclusao) {
		this.nome = nome;
		this.instituicao = instituicao;
		this.descricao = descricao;
		this.link = link;
		this.imagem = imagem;
		this.cargaHoraria = cargaHoraria;
		this.anoConclusao = anoConclusao;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getLink() {
		return link;
	}

	public String getImagem() {
		return imagem;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public Integer getAnoConclusao() {
		return anoConclusao;
	}
}
