package UTS.PBO;

public class Age {
    private int yearBirth;
    private int yearNow;
    private static String red = "\033[38;2;255;0;0m";

    public Age(int yearNow) {
        this.yearNow = yearNow + 1900;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur) {
        String keterangan = "";
        if (umur >= 0  && umur <= 5) keterangan = "LAGI LUCU-LUCU NYA";
        if (umur > 5 && umur <= 10) keterangan = "MASIH ANAK-ANAK";
        if (umur > 10  && umur <= 13) keterangan = "MASIH REMAJA";
        if (umur > 13 && umur <= 19) keterangan = "ALAY";
        if (umur > 19 && umur <= 29) keterangan = "LAGI GALAU NYARI JODOH";
        if (umur > 29 && umur <= 35) keterangan = "LAGI SIBUK NYARI UANG";
        if (umur > 35 && umur <= 150) keterangan = "SUDAH TUA";
        if (umur > 0 && umur > 150) keterangan = "TIDAK TERDEKSI DI KEHIDUPAN";
        return red + keterangan;
    }


}