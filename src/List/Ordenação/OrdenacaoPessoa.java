package List.Ordenação;

import java.util.*;

public class OrdenacaoPessoa {
    //Atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<Pessoa>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenarPessoa = new OrdenacaoPessoa();
        ordenarPessoa.adicionarPessoa("Maria", 20, 1.57);
        ordenarPessoa.adicionarPessoa("Joao", 32, 1.75);
        ordenarPessoa.adicionarPessoa("Jose", 15, 1.55);
        ordenarPessoa.adicionarPessoa("Julia", 35, 1.59);

        System.out.println(ordenarPessoa.pessoaList);

        System.out.println(ordenarPessoa.ordenarPorIdade());
        System.out.println(ordenarPessoa.ordenarPorAltura());
    }
}
