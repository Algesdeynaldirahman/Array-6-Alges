package src;
import java.util.Scanner;
public class keempat {
    public static void main(String[] args) {
        String mahasiswa[] = new String[100];
        int nilai [] = new int[100];

        Scanner sc = new Scanner (System.in);
        String inputData = "y";
        int i=0;
        do {
            System.out.print("Masukkan nama: ");
            mahasiswa[i] = sc.nextLine();

            System.out.print("Masukkan Nilai: ");
            sc.nextLine();

            System.out.print("input lagi? (y/n)");
            inputData = sc.nextLine();
            i++;
        }while(i<mahasiswa.length && inputData.equalsIgnoreCase("y"));
        sc.close();
        
        System.out.println (" ");
        int x=1;
        for (int j = 0; j < mahasiswa.length; j++){
            if(mahasiswa[j]!=null){
                System.out.println("---------------------------------------------------");
                System.out.println("mahasiswa ke: "+ (x++));
                System.out.println("nama mahasiswa: "+mahasiswa[j]);
                System.out.println("nilai:" +nilai[j]);
                    }
                }

        System.out.println("Daftar mahasiswa");
        System.out.println("=======================================================");
        System.out.println("no \t\t Nama mahasiswa \t\t Nilai \t\t Keterangan");
        System.out.println("---------------------------------------------------");
        x=1;
        for (int k = 0; k < mahasiswa.length; k++) {
            if(mahasiswa[k] != null) {
                String keterangan = (nilai[k] >= 75) ? "Lulus" : "Tidak Lulus";
                System.out.println((x++) + "\t\t" + mahasiswa[k] + "\t\t" + nilai[k] + "\t\t" + keterangan);

            }
        }System.out.println("=======================================================");
        double jumlah =0;
        for (double num : nilai) {
            jumlah += num;
        }
        System.out.println("jumlah nilai:"+ jumlah);
        double rata2 = jumlah / i;
        System.out.println("Nilai rata-rata: "+rata2); 
            }
        }
