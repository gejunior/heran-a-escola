/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep;

import br.edu.ifsp.pep.modelo.Pessoa;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author genil
 */
public class Principal {
    
    private static Scanner ler = new Scanner(System.in);
    private static Gerenciar gerenciar = new Gerenciar();
    //private final ArreyList<Pessoa> p = new ArrayList<>();
    
    
    public static int menu(){
        int op; 
                
//        do {
            System.out.println("\n\tM E N U");
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Listar Todos");
            System.out.println("[3] Listar Professores");
            System.out.println("[4] Listar Alunos");
            System.out.println("[5] Listar Tecnicos Administrativos");
            System.out.println("[6] Apresentar qtde de pessoas cadastradas");
            System.out.println("[0] Sair");
            System.out.print("Opcao: ");
            op = ler.nextInt();
//        } while (op < 0 || op > 6);
        return op;
    }
    
    public static void main(String[] args) {
        int op;

        do {            
            op = menu();
        
            switch (op) {
                case 1://cadastrar
                    gerenciar.cadastrar();
                    break;
                case 2://Listar Todos
                    gerenciar.Listartodos();
                    break;
                case 3://Listar Professores
                    gerenciar.ListarProfessores();
                    break;
                case 4://Listar Alunos
                    gerenciar.ListarAlunos();
                    break;
                case 5://Listar Tec. Administrativos
                    gerenciar.ListarTécAdministrativos();
                    break;
                case 6://Apresentar qtd de pessoas
                    gerenciar.ApresentarPessoas();
                    break;
                default:
                    System.out.println("Saindo...");
                    break;
            }
        } while (op != 0);
        
    }
}
