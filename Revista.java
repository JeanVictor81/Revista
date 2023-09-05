package br.com.unit.aula13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Revista {
	private int codigo;
	private String titulo;
	private int RecilagemProduzida;
	private List<Edicao> edicoes;
	
	public Revista(int codigo, String titulo) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.RecilagemProduzida = 0;
		this.edicoes = new ArrayList<>();	
	}
	
	public void adicionarEdicao(Date dt, int trg, int qv) {
		edicoes.add(new Edicao(dt, trg, qv));
		
	}
	public void adicionarEdicao(int tiragem, int qtdeVendida) {
		edicoes.add(new Edicao(tiragem, qtdeVendida));
		
	}
	public boolean removerEdicao(int nrEdicao) {
		Edicao edicaoEcontrada = pesquisarEdicaoPorId(nrEdicao);
		if(edicaoEcontrada == null) {
			return false;
		}
		edicoes.remove(edicaoEcontrada);
		return true;
	}
	public String reciclarEdicao(int nrEdicao) {
		Edicao edicaoEncontrada = pesquisarEdicaoPorId(nrEdicao);
		if(edicaoEncontrada == null) {
			return "Edição não encontrada";
		}
		else if(edicaoEncontrada.obterQtdeReciclada() == 0) {
			return "Não há quantia de exemplare para se reciclar";
		}
		else if(edicaoEncontrada.isReciclou()) {
			return "Esse exemplare já foi recilado.";
		}
		else {
			this.RecilagemProduzida += edicaoEncontrada.obterQtdeReciclada();
			edicaoEncontrada.reciclarExemplares();
			return "Reciclagem realizada com sucesso!";
			
		}
		
	}
	private Edicao pesquisarEdicaoPorId(int nrEdicao) {
		for(Edicao edicao: this.edicoes) {
			if(edicao.getNumero() == nrEdicao) {
				return edicao;
			}
		}
		return null;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getRecilagemProduzida() {
		return RecilagemProduzida;
	}
	public void setRecilagemProduzida(int recilagemProduzida) {
		RecilagemProduzida = recilagemProduzida;
	}
	public int getCodigo() {
		return codigo;
	}
	public List<Edicao> getEdicoes() {
		return edicoes;
	}
	@Override
	public String toString() {
		return "\nRevista "
				+ "\ncodigo            : " + codigo 
				+ "\nTitulo            : " + titulo 
				+ "\nRecilagemProduzida: " + RecilagemProduzida
				+ "\nEdicoes           :" + edicoes ;
	}
	
	
	
	
}
