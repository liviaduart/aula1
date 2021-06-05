
/**
 * Escreva uma descri��o da classe Disciplina aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
public class Disciplina
{
    Aluno[] alunos = new Aluno[10];
    String[] listaNomes = {"vitoria","maria","levi","ana","juan","alberto",
        "Davi","Pedro","julia","Carla"};
    
    public void populaArray(){
        for (int i = 0; i < 10; i++) {
           adicionaArray(listaNomes[i], gerador1a10Ids(), i, gerador0a10Notas(),
           gerador0a10Notas());          
        }
 
    }
    
     public void adicionaArray(String nome, int id, int posi��o, double nota1,
    double nota2) 
    {
    Aluno aluno =  new Aluno();
        alunos[posi��o] = aluno;
        aluno.alteraNome(nome);
        aluno.alteraId(id);
        aluno.nota1 = nota1;
        aluno.nota2 = nota2;
        System.out.println(alunos[posi��o]);

    }

     public void coletaMedia() {
        double somaNota1 = 0;
        double somaNota2 = 0;
        for (int i = 0; i < 10; i++) {
            double nota1 = alunos[i].nota1;
            double nota2 = alunos[i].nota2;

            somaNota1 = somaNota1 + nota1;
            somaNota2 = somaNota2 + nota2;

            System.out.println("A media da nota 1 �: " + (somaNota1 / 2));
            System.out.println("A media da nota 2 � " + (somaNota2 / 2));
        }
    }

public void antecessorSucessor(int posi��o) {
    if (posi��o == 9){
        System.out.println("o aluno antecessor �: " + 
    alunos[(posi��o - 1)].nome);
        System.out.println("N�o h� aluno sucessor");
    }
    if (posi��o == 0){ 
        System.out.println("N�o h� aluno antecessor");
        System.out.println("O aluno sucessor �: " + 
    alunos[(posi��o + 1)].nome);
    }
        if (posi��o != 0 && posi��o != 9){
            System.out.println("O aluno antecessor �: " 
        + alunos[(posi��o - 1)].nome);
            System.out.println("O aluno sucessor �: "
        + alunos[(posi��o + 1)].nome);
        }
    }
        
    public double gerador0a10Notas(){
        double min = 0;
        double max = 10;
        double valorAleatorio = Math.floor(Math.random()*(max-min+1)+min);
        return valorAleatorio;   
    }
    
    public int gerador1a10Ids(){
        int min = 1;
        int max = 10;
        int valorAleatorio = (int)Math.floor(Math.random()*(max-min+1)+min);
        return valorAleatorio;   
    }
}