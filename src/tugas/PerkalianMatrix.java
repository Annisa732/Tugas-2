package tugas;
public class PerkalianMatrix {
    public static void main (String[] args) {
     int [][] A = {
    {7, 7, 8},
    {5, 8, 9}
};
    int [][] B = {
    {9, 1},
    {2, 3},
    {7, 8}
};
if {A[0].length == B[0].length){
int [][] C = new int[A.length] [B[0].length];
 for(int i=0; i<A.length; i++) {
    for(int j=0; j<B[0].length; j++)
        for(int k=0; k<A[0].length; k++)
            C[i][j] += A[i][k] * B[k][j];
        }
    }  
} 
    for(int[] c: C) {
        for(int q: c) {
          System.out.print(i+" ");
        }
        System.out.println();

    }
}
else 
System.out.println("Ukuran kolom A tidak sama dengan baris B");
    }
  }
}   
}
        System.out.println();
    System.out.println("Annisa Nadia Nur Afifah");