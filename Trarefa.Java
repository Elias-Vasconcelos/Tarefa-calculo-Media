/**
 * @author Elias-Fereira
 */

public class Medeia {
    public int nota1 = 0;
    public int nota2 = 0;
    public int nota3 = 0;
    public int nota4 = 0;
    public int Reposta = 0;

    public static void main(String[] args) {
        Medeia aluno = new Medeia();

        aluno.CalculaMedia()
    }

    public void CalculaMedia() {
        this.nota1 = 7;
        this.nota2 = 5;
        this.nota3 = 6;
        this.nota4 = 9;

        this.Reposta = (nota1 + nota2 + nota3 + nota4 ) / 4;

        System.out.println(Reposta);
    }
}