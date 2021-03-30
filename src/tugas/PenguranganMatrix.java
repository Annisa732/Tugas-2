package tugas;
public class PenguranganMatrix {
    public static void main (String[] args) {
    int [][] A = {
      {5, 9,},
      {7, 10,},
      {8, 11,}
    };
    int [][] B = {
      {1, 5},
      {2, 7},
      {3, 8}
    };
    
    if ((A.length==B.length) && (A[0].length==B[[0].length)) {
       int[][] C = new int [A[0].length];
       for(int i=0; i<A[0].length; j++) {
         C[i][j] = A[i][j] + B[i][j]
        for (int[] c: C) {
          for (int q: c) {
            System.out.print (q+ " ");
          }
          System.out.println();
        }
        System.out.println(C[1][2]);
    }
       else {
      System.out.println("Ukuran matrix tidak sama");
    }
  }
}
        System.out.println();
    System.out.println("Annisa Nadia Nur Afifah");

