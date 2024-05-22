public class BooleanOperators {
    public static void main(String[] args) {
        var absen = 75;
        var presensi = 75;

        boolean lulusAbsen = absen >= 75;
        boolean lulusPresensi = presensi >= 75;
        boolean lulus = lulusAbsen && lulusPresensi;

        System.out.println(lulusAbsen);
        System.out.println(lulusPresensi);
        System.out.println(lulus);
    }
}
