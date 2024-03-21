/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep;

import br.edu.ifsp.pep.modelo.Aluno;
import br.edu.ifsp.pep.modelo.Pessoa;
import br.edu.ifsp.pep.modelo.Professor;
import br.edu.ifsp.pep.modelo.TecAdministrativo;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.ByteBuffer;

/**
 *
 * @author genil
 */
public class Gerenciar {

    private static final ArrayList<Pessoa> pessoa = new ArrayList<>();
    private static final ArrayList<TecAdministrativo> tecnicoAdm = new ArrayList<>();
    private static final ArrayList<Professor> professor = new ArrayList<>();
    private static final ArrayList<Aluno> aluno = new ArrayList<>();
    
    private final Scanner ler = new Scanner(System.in);
    
    
    private int lerDados(){
        int op = 0;
        do {                
            
        } while (op < 0 || op > 3);
        
        return op;
    }
    
    public void cadastrar(){
        int op = 0, tell = 0;
        String nome = null, pront = null;
        
        //professor
        String area = null, contrato = null;
        
        //Aluno
        int semestre = 0;
        String curso = null;
        
        //Tec Adm
        String setor = null, cargo = null;
        
        System.out.println("Para quem é o cadastro?");
        System.out.println("\t1-Profesor\n\t2-Aluno\n\t3-Tec. Administrativo");
        System.out.print("Opcao: ");
        op = ler.nextInt();
//      op = lerDados();

        ler.nextLine();// Limpa o buffer
        if(op != 0 && op < 4){
            System.out.print("Nome: ");
            nome = ler.nextLine();
            System.out.print("Prontuario: ");
            pront = ler.nextLine();
            System.out.print("Telefone: ");
            tell = ler.nextInt();
            switch (op) {

                case 1: //Professor
                    System.out.print("Area que atua: ");
                    ler.nextLine();
                    area = ler.nextLine();
                    System.out.print("Tipo de contrato: ");
                    contrato = ler.nextLine();

                    Professor p = new Professor(area, contrato, pront, nome, tell);
                    professor.add(p);

                    pessoa.add(p);
                    break;
                case 2: //Aluno
                    ler.nextLine();
                    System.out.print("Curso: ");
                    curso = ler.nextLine();
                    System.out.print("Semestre: ");
                    semestre = ler.nextInt();
                    
                    Aluno a = new Aluno(curso,semestre,pront,nome,tell);
                    aluno.add(a);
                    pessoa.add(a);
                    break;
                case 3://Tecnico Adm
                    ler.nextLine();
                    System.out.print("Setor em que trabalha:");
                    setor = ler.nextLine();
                    System.out.print("Cargo que ocupa: ");
                    cargo = ler.nextLine();
                    
                    TecAdministrativo tec = new TecAdministrativo(setor,cargo,pront,nome,tell);
                    tecnicoAdm.add(tec);
                    pessoa.add(tec);
                    break;
                default:
                    System.out.println("ERRO: Impossivel cadastrar.");
            }
        }else if(op > 3 || op <= 0){
            System.out.println("ERRO: Opcao invalida.");
        }
    }
    
    public void Listartodos(){
        System.out.println("listando todos");
        for (Pessoa p : pessoa) {
            System.out.println("Prontuario: " + p.getProntuario());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Telefone: " + p.getTell());
            System.out.println("");
        }
    }
    
    public void ListarProfessores(){
        System.out.println("\tprofessores");
        for (Professor p : professor) {
            System.out.println("Prontuario: " + p.getProntuario());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Telefone: " + p.getTell());
            System.out.println("Area em que atua: " + p.getArea());
            System.out.println("Tipo de contrato: " + p.getContrato());
            System.out.println("");
        }
    }
    
    public void ListarAlunos(){
        System.out.println("\talunos");
        for (Aluno a : aluno) {
            System.out.println("Prontuario: " + a.getProntuario());
            System.out.println("Nome: " + a.getNome());
            System.out.println("Telefone: " + a.getTell());
            System.out.println("Cursando: " + a.getCurso() + " no " + a.getSemestre() + "º semestre.");
            System.out.println("");
        }
    }
    
    public void ListarTécAdministrativos(){
        System.out.println("\ttecnico administrativo");
        for (TecAdministrativo t : tecnicoAdm) {
            System.out.println("Prontuario: " + t.getProntuario());
            System.out.println("Nome: " + t.getNome());
            System.out.println("Telefone: " + t.getTell());
            System.out.println("Setor: " + t.getSetor());
            System.out.println("Cargo: " + t.getCargo());
            System.out.println("");
        }
    }

    public void ApresentarPessoas(){
        if(pessoa.size() < 2){
            System.out.println(pessoa.size() + " pessoa cadastrada.");
            return;
        }
        System.out.println(pessoa.size() + " pessoas cadastradas.");
    }
    
}
