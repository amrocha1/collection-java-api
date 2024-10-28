package SetInterface.AgendaDeContato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adcionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!contatoSet.isEmpty()) {
        System.out.println(contatoSet);
    } else {
            System.out.println("Lista Vazia");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    } else {
        throw new RuntimeException("O Contato Não Existe"); // não está exibindo a mensagem
    }
    }


    public Contato atualizarNumero(String nome, int novoNumero){
        Contato contatoAtualizado =null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adcionarContato("Camila", 123456);
        agendaContatos.adcionarContato("Camila", 0);
        agendaContatos.adcionarContato("CamilaDIO", 646569);
        agendaContatos.adcionarContato("Maria", 111111);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Sam"));
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato Atualizado: "+ agendaContatos.atualizarNumero("Maria", 444444));
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

    }
}
