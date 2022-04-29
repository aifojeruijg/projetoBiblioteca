package controllers;
import models.Funcionario;
import java.util.ArrayList;

public class FuncionarioController{
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void cadastrar(Funcionario funcionario) {
            funcionarios.add(funcionario);   
    }

    public ArrayList<Funcionario> listar(){
        return funcionarios;
    }

    public Funcionario buscarPorMatricula(String matricula) {
        for(Funcionario funcionarioLista: funcionarios){
            if (funcionarioLista.getMatricula().equals(matricula)) {
                return funcionarioLista;
            }
        }
        return null;
    }

}