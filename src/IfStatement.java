public class IfStatement {

    public static void main(String[] args) {
        var nilai = 80;
        var absensi = 90;

        if(nilai >= 75 && absensi >= 75) {
            System.out.println("Selamat, anda lulus!");
        } else {
            System.out.println("Maaf, anda harus mengulang semester ini!");
        }

        // if else
        if (nilai >= 75) {
            System.out.println("Nilai anda A");
        } else if (nilai >= 60) {
            System.out.println("Nilai anda B");
        } else {
            System.out.println("Nilai anda C");
        }
    }
}
