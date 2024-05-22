public class SwitchStatement {

    public static void main(String[] args) {
       var nilai = "A";
       switch (nilai) {
           case "A":
               System.out.println("Lulus Dengan Baik");
               break;
           case "B":
           case "C":
               System.out.println("Nilai Cukup Baik");
               break;
           default:
               System.out.println("Nilai Anda Kurang");
       }

//       using lambda
       switch (nilai) {
           case "A" -> System.out.println("Lulus Dengan Baik");
           case "B", "C" -> System.out.println("Nilai Cukup Baik");
           default -> System.out.println("Nilai Anda Kurang");
       }

       String ucapan;
       switch (nilai) {
           case "A" -> ucapan = "Lulus Dengan Baik";
           case "B", "C" -> ucapan = "Nilai Cukup Baik";
           default -> ucapan = "Nilai Anda Kurang";
       }
       System.out.println(ucapan);

//        Using yield
       ucapan = switch (nilai){
           case "A": yield "Lulus Dengan Baik";
           case "B", "C": yield "Nilai Cukup Baik";
           default: yield "Nilai Anda Kurang";
       };

       System.out.println(ucapan);
    }
}
