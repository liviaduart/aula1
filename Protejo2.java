
/**
 * Escreva uma descri��o da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
import java.util.Scanner;
public class main {



    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Disciplina disciplina = new Disciplina();

        Scanner sc= new Scanner(System.in); 

        System.out.println("Digite um nome: ");
        String a = sc.nextLine();
        aluno1.alteraNome(a);

        System.out.println("Digite um id: ");
        int b = sc.nextInt();
        aluno1.alteraId(b);

        aluno1.nota1 = 3.5;
        aluno1.nota2 = 6.5;

        System.out.println("A m�dia do aluno � " + aluno1.retornaMedia());

        if (aluno1.passou()){
            System.out.println("O aluno foi aprovado por m�dia");
        } else{
            System.out.println("O aluno n�o foi aprovado por m�dia");
        }

        System.out.println("Populando array...");
        disciplina.populaArray();

        System.out.println("Digite uma posi��o na lista para imprimir o sucessor e antecessor");
        int c = sc.nextInt();
        disciplina.antecessorSucessor(c);

    }


}
