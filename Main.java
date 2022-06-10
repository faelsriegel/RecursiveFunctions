

  public class Main {


    public static void main(String[] args) {
System.out.println("\nFunções Recursivas\n\n");


 System.out.print("a)Apresente os N primeiros termos de Fibonacci\n\n");
	for (int i = 0; i <= 10; i++) {
            System.out.print("(" + i + ")  =  " + Fibo.f(i) + "\t\n");
        }
System.out.print("\nb)Calcule o Fatorial do número N\n\n");
       for (int i = 0; i <= 10; i++) {
            System.out.print("(" + i + ")  =  " + Fato.f(i) + "\t\n");
        }
System.out.print("\nc)A soma dos N primeiros elementos de um vetor\n\n");
        {
         int []v = {1,2,3,4,5,6,7,8,9,10};
         int r = Soma.s(v, 0);
          System.out.println(r);
    }


    }

  }
  