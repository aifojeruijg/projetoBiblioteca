package models;

public class Emprestimo{
    private Usuario usuario;
    private Livro livro;
    private Funcionario funcionario;

    public Usuario getUsuario(){
        return usuario;
    }
    public Usuario setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Livro setLivro(){
        return livro;
    }
    public Livro getLivro(Livro livro){
        this.livro = livro;
    }

    public Funcionario setFuncionario(){
        return funcionario;
    }
    public Funcionario getFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        
        return 
            "Nome Usuario: " + usuario.getNome() +
            " | Titulo livro: " + livro.getTitulo() + 
            " | Funcionario Responsavel: " + funcionario.getNomeF();
    }
}