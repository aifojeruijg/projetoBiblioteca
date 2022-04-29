package models;
public class Funcionario {
    
    private String nomeF;
    private String matricula;

    public String getNomeF(){
        return nomeF;
    }
    public void setNomeF(String nomeF){
        this.nomeF = nomeF;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        
        return 
            "Nome: " + nomeF +
            " | Matricula: " + matricula;
    }
}
