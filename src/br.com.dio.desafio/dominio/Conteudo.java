package br.com.dio.desafio.dominio;

// abstract > não é possível instanciar um conteúdo, ou seja, não pode ser criada a partir dele uma instância dele.
public abstract class Conteudo {
    // protected > só as classes filhas é que podem ter acesso
    // static > poderá ser acessado fora dessa classe
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
