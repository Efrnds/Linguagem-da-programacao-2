package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {

        //  Exercicio 1
        int varEx1 = 10;
        System.out.println(varEx1);

        //  Exercicio 2
        double varEx2 = 1.5;
        System.out.println(varEx2);

        //  Exercicio 3
        String varEx3 = "Linguagem de programação";
        System.out.println(varEx3);

        //  Exercicio 4
        int var1ex4 = 15;
        int var2ex4 = 16;
        int var3ex4 = 74;
        int var4ex4 = 15;

        double media = (var1ex4 + var2ex4 + var3ex4 + var4ex4) / 4;
        System.out.println(media);

        //  Exercicio 5
        int var1ex5 = 15;
        int var2ex5 = 16;
        int var3ex5 = 74;
        int var4ex5 = 15;

        media = (var1ex5 + var2ex5 + var3ex5 + var4ex5) / 4;
        System.out.println(media);

        //  Exercicio 6
        String varEx6 = "Banco de dados";
        System.out.println("Disciplina " + varEx6);

        //  Exercicio 7
        int varEx7 = 15;
        if (varEx7 > 10) {
            System.out.println("O valor " + varEx7 + " é maior que 10.");
        } else if (varEx7 < 10) {
            System.out.println("O valor " + varEx7 + " é menor que 10.");
        }

        //  Exercicio 8
        int varEx8 = 123;
        if (varEx7 % 2 == 1) {
            System.out.println(varEx8 + " é ímpar.");
        } else {
            System.out.println(varEx8 + " é par.");
        }
        
        //  Exercicio 9
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        //  Exercicio 10
        
        for (int i = 0; i <= 1000; i+= 100) {
            System.out.println(i);
        }
        
        //  Exercicio 11
        
        String[] varEx11 = {"texto1","texto2","texto3","texto4"};
        for (String i: varEx11) {
            System.out.println(i);
        }
        
        //  Exercicio 12
        
        int[] varEx12 = {1,2,3};
        for (int i: varEx12) {
            System.out.println(i);
        }
        
        //  Exercicio 13
        
        double[] varEx13 = {1.1,2.2,3.3};
        for (double i: varEx13) {
            System.out.println(i);
        }
    }

}
