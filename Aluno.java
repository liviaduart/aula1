
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Aluno
{
    private String nome;
    private int id;
    private double media;
    protected double nota1;
    protected double nota2;
    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno(double nota1, double nota2)
    {
        this.nota1 = nota1;
        this.nota2 = nota2; 
        calculaMedia(nota1, nota2);
    }

    public String imprimeNome(String nome)
    {
        System.out.println("Nome:" +nome);
        return this.nome;
    }

    public String alteraNome(String nome)
    {
        return this.nome = nome;
    }

    public void imprimeId(int id)
    {
        System.out.println("Id:" + this.id + ".");
    }

    public int alteraId(int id)
    {
        return this.id = id;
    }

    public double retornaMedia()
    {
        return this.media;
    }

    public boolean passouMedia()
    { 
     return this.media >= 7;
    }

    private void calculaMedia(double nota1, double nota2)
    {
        this.media = ((nota1 + nota2) / 2);
    }
}