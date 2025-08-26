package agenda;

public class testeAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.adicionarContato("Kaik", "Kaik@gmail.com");
		agenda.adicionarContato("Jose", "jose@gmail.com");
		agenda.adicionarContato("Romaria", "roma@gmail.com");
		agenda.buscarContato("Romaria");
		agenda.excluirContato("Jose");
		agenda.buscarContato("Kaik");

	}

}
