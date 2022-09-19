package bytebank.herdado.conta;

public class TestaConexao {

    public static void main(String[] args) {
    	try(Conexao conexao = new Conexao() ){
    	    conexao.leDados();
    	} catch(IllegalStateException ex){
    	    System.out.println("Deu erro na conexão");
    	}
    }
}