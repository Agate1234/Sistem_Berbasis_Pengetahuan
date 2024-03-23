public class Kuis1{
    public static void main(String[] args) {
        boolean A = true, B = false, C = false, D = false, E = true, F = false, G = false, H = false, I = false, J = false, K = false;

        while(K != true){
            if(A == true && B == true && !C == true){
                System.out.println("Fakta Baru C");
                C = true;
                continue;
            }
            if(C == true && !D == true){
                System.out.println("Fakta Baru D");
                D = true;
                continue;
            }
            if(A == true && E == true && !F == true){
                System.out.println("Fakta Baru F");
                F = true;
                continue;
            }
            if(A == true && !G == true){
                System.out.println("Fakta Baru G");
                G = true;
            }
            if(F == true && G == true && !D == true){
                System.out.println("Fakta Baru D");
                D = true;
                continue;
            }
            if(G == true && E == true && !H == true){
                System.out.println("Fakta Baru H");
                H = true;
                continue;
            }
            if(C == true && H == true && !I == true){
                System.out.println("Fakta Baru I");
                I = true;
                continue;
            }
            if(I == true && A == true && !J == true){
                System.out.println("Fakta Baru J");
                J = true;
                continue;
            }
            if(G == true && !J == true){
                System.out.println("Fakta Baru J");
                J = true;
                continue;
            }
            if(J == true && !K == true){
                System.out.println("Fakta Baru K");
                K = true;
                continue;
            }
        }
        if(K == true){
            System.out.println("Nilai K bernilai benar (" + K + ")");
        }

        // penjelasan: Program akan melakukan loop hingga K bernilai true. jika K false maka program akan melakukan infinite loop.

        /*
        Fa'iz Abiyu Atha Fawas
        SIB 2C
        09
        */
    }
}