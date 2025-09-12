package agenda;
import java.util.ArrayList;

public class Agenda{
	

	ArrayList<Contato> contatos = new ArrayList<>();
	Contato contato;
	
	public void adicionarContato(String nome, String email) {
		contato = new Contato(nome, email);
		contatos.add(contato);
		System.out.println("Contato criado");
	}
	
	public void buscarContato(String nome) {
		int i = 0;
		while(i < contatos.size()) {
			if(contatos.get(i).nome == nome) {

				System.out.println(contatos.get(i).nome + "\n" + contatos.get(i).email);
				break;
			}else{
				System.out.println("Contato não encontrado");
			}
			i++;
		}
	}
	
	public void excluirContato(String nome) {
		int i = 0;
		
		while(i < contatos.size()) {
			if(contatos.get(i).nome == nome) {
				contatos.remove(i);
				
				System.out.println("Contato Removido");
				break;
			}
			i++;
		}
	}

}


