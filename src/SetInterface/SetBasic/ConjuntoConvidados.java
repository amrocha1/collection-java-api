package SetInterface.SetBasic;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributo
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    public void adcionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidadosSet.isEmpty()) {
            for (Convidado c : convidadosSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadosSet.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
    public int contarConvidados(){
        return convidadosSet.size();
    }
    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados.");

        conjuntoConvidados.adcionarConvidado("Samuel", 1);
        conjuntoConvidados.adcionarConvidado("Jose", 2);
        conjuntoConvidados.adcionarConvidado("Maria", 2); //Convite Clone
        conjuntoConvidados.adcionarConvidado("Antonio", 4);
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(4);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados.");
        conjuntoConvidados.exibirConvidados();

    }
}
