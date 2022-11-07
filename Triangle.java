import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.print("Masukan nilai N :");
        int n = input.nextInt();

        // ini memakai for gabungan , pertama untuk setigia siku" dengan siku menghadap ke kiri
        // lalu ditambahkan segitiga siku" menghadap kanan dengan i = 1 dilewati
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if ( (i + j) < (n + 1) ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            // ini untuk k dimulai dari sama dengan j , bila n = 3 , maka for pertama (3,3) ,ini k dimulai dari k = 3 , seharusnya menumpuk , namun karna pada sintaks java ini tidak bisa 3 dimensi , seharusnya menumpuk , namun ini akan diprint setelahnya, sehingga hampir sama dengan yang bawah ini
            for (int k = n; (k <= (n + (n-1) ) && (k < (i + (n - 1)))); k++) { //ini untuk k koordinat setelah for pertama (yaitu (1,4) . (2,4) . dst) (kalau n = 3 maka for pertama mencetak dari koordinat (i,j = 3,3))(int k = (n + 1); (k <= (n + (n-1) ) && (k < (i + n))); k++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int x = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = n; ((j > i ) && (i <= ((n + 1) / 2)) ); j--) {
                System.out.print(" ");
            }
            for ( int j2 = n; ( (j2 > ((n + 1) / 2)) && (i > ((n + 1) / 2)) ); j2-- ) {
                System.out.print(" ");
            }
            for (int j3 = 1; (j3 <= (i - ((n + 1) / 2)) ) && (i > ((n + 1) / 2)); j3++) {
                System.out.print(" ");
            }
            
            if (i - 1 == 0) {
                x += 0;
            }
            else {
                if (i <= ((n + 1) / 2) ) {
                    x += 2;
                }
                else {
                    x += 0;
                }
                
            }
          
            if (i <= ((n + 1) / 2) ) {
                for (int k = 1; k <= x; k++) {
                    System.out.print("*");
                }
            }
            else {
                x -= 2;
                for (int l = 1; l <= x; l++ ) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // ini untuk kita mencetak dari i pertam sampai n pada koordinat j = n saja, jadi mencetak baris vertikal . Setelah itu kita mencetak segitiga siku" sudut 90 derajat menghadap kiri pada for pertama dan lalu kanan pada for kedua
        for (int i = 1; i <= n; i++) {
            
            for ( int j = 1; j <= n; j++) {

                if ( j == n) {
                    System.out.print("*");
                }
                else {
                    if (( i + j) < (n + 1)) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
            }
            for (int k = (n + 1); (k <= (n + (n - 1)) )&& (k < (i + n)); k++) {
                 System.out.print("*");
            }
            
            System.out.println();
        }
       
    }
}
