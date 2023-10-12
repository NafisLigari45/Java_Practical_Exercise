package array.practicals;
//WRITE PROGRAM TO COPY ALL ELEMENTS OF ONE ARRAY INTO ANOTHER ARRAY...
public class CopyArray {
    public static void main(String[] args) {
        int a[]=new int[]{5,6,4,88,54,99,1};

        int b[]=new int[a.length];


       // COPY ELEMENTS FOR FIRST ARRAY.
        for(int i=0;i<=a.length-1;i++){
            b[i]=a[i];
        }

        //PRINTING ORIGINAL ARRAY..
        System.out.println("Original Array..");
        for (int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }

        //PRINTING COPY OF ORIGINAL ARRAY.
        System.out.println("");

        System.out.println("Copy of First Array..");

        for(int i=0;i<=b.length-1;i++){
            System.out.println(b[i]);
        }
    }
}
