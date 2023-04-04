package br.com.fiap.padaria.view;

import br.com.fiap.padaria.model.Produto;

public class Terminal {

	//Criar o método: main + CTRL + espaco
	public static void main(String[] args) {
		
		//Instanciar um produto
		Produto p = new Produto();
		
		//Ajustar para utilizar os métodos set
		p.setNome("Livro Java");
		p.setId(5);
		p.setPrecoCusto(200);
		p.setPrecoVenda(300);
		p.setPromocao(true);
		p.atualizarEstoque(15);
		
		
		//Exibir os atributos do produto
		//Id, nome, preco custo, preco venda, promocao, qtd
		System.out.println(p.getId());
		System.out.println(p.getNome());
		System.out.println(p.getPrecoCusto());
		System.out.println(p.getPrecoVenda());
		System.out.println(p.isPromocao());
		System.out.println(p.getQuantidade());
		
		
		
		//Exibir o valor do lucro do produto
		double lucro = p.calcularLucro();
		System.out.println("Lucro: " + lucro);
		
	}
}