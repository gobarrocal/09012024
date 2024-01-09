import java.util.*;
public class ImputVar {
    
    public static void main(String[] args) {
        //...
       System.out.println("Cauculadora de Idade");
        System.out.println("digite seu ano de nascimento: ");
        Scanner scnAno = new Scanner(System.in);
        int anoNascimento = scnAno.nextInt();
        System.out.println("Você tem " + (2024 - anoNascimento) + " anos");
        scnAno.close();

    }

}
