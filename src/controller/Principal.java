package controller;

public class Principal {
	
	public static void main(String[] args) {
		Connection conexao = new Connection();
		
		//conexao.inserir("6544567");
		//conexao.atualizar("6544567", "654121");
		//conexao.remover("654121");
		
		conexao.mostrar();
	}

}
