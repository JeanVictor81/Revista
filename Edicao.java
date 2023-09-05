package br.com.unit.aula13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Edicao {
	
	static private int contEdicao = 0;
	
	private int numero;
	private Date data;
	private int tiragem;
	private int qtdeVendida;
	private boolean reciclou;
	
	public Edicao(Date date, int tiragem, int qtdeReciclagem) {
		super();
		this.numero = ++contEdicao;
		this.data = date;
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeReciclagem;
		this.reciclou = false;
	}
	public Edicao(int tiragem, int qtdeReciclagem) {
		super();
		this.numero = ++contEdicao;
		this.data = new Date();
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeReciclagem;
		this.reciclou = false;
	}
	public void reciclarExemplares() {
		this.reciclou = true;
		
	}
	public int obterQtdeReciclada() {
		tiragem = qtdeVendida-tiragem;
		return tiragem;
	}
	public int getNumero() {
		return this.numero;
	}
	public Date getDate() {
		return data;
	}
	public int getTiragem() {
		return tiragem;
	}
	public int getQtdeVendida() {
		return qtdeVendida;
	}
	public boolean isReciclou() {
		return reciclou;
	}
	public void setQtdeVendida(int qtdeVendida) {
		this.qtdeVendida = qtdeVendida;
	}
	@Override
	public String toString() {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy");
		return "\nEdicao "
				+ "\nNumero               :" + numero 
				+ "\nDate               : " + formatoData.format(data) 
				+ "\nTiragem            : " + tiragem 
				+ "\nQuantidade vendida : " + qtdeVendida
				+ "\nReciclou           : " + reciclou;
	}
	
	
	
}
