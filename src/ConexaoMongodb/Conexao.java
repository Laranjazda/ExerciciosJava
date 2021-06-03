package ConexaoMongodb;

import com.mongodb.*;

import java.net.UnknownHostException;

public class Conexao {
	
	private Mongo conexao;
	private DB db;
	
	public void addPessoa(Contato c) throws UnknownHostException, MongoException {
		this.conexao = new Mongo("localhost");
		this.db = conexao.getDB("sample_airbnb");
		
		try {
			BasicDBObject pessoa = new BasicDBObject();
			pessoa.put("nome", c.getNome());
			pessoa.put("idade", c.getIdade());
			pessoa.put("telefone", c.getTelefone());
			pessoa.put("endereco", c.getEndereco());
			pessoa.put("email", c.getEmail());
			
			DBCollection col = db.getCollection("sample_airbnb");
			col.insert(pessoa);
			
		} catch(Exception e){
			System.err.println(e.getClass().getName() + ", " + e.getMessage());
			
		}
	}
	
	public void buscar() throws UnknownHostException, MongoException {
		this.conexao = new Mongo("localhost");
		this.db = conexao.getDB("sample_airbnb");
		
		try {
			DBCursor cursor = db.getCollection("sample_airbnb").find();
			System.out.println("---");
			while(cursor.hasNext()) {
				BasicDBObject pessoa = (BasicDBObject) cursor.next();
				System.out.println("Nome " + pessoa.getString("nome"));
				System.out.println("Idade " + pessoa.getInt("idade"));
				System.out.println("Telefone " + pessoa.getInt("telefone"));
				System.out.println("Endereco " + pessoa.getString("endereco"));
				System.out.println("Email " + pessoa.getString("email"));
				System.out.println("----");
			}
		} catch(Exception e){
			System.err.println(e.getClass().getName() + ", " + e.getMessage());
			
		}
	}

}
