package Lista5Lpoo;

public class Lista5Lpoo {

 
    public static void main(String[] args) {

    try {
      int[] vector = new int[4];
              System.out.printf("antes do exception\n");
              vector [4] = 1;

    } catch (ArrayIndexOutOfBoundsException exception) {
      System.out.print("Excecção de erro ao acessar, não existe no vetor\n");
    } 
     finally  {
      System.out.print("Esse texto séra impresso na tela\n");
    }
    }

}