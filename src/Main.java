public class Main {
    public static void main(String[] args) {
        int N = 10; // Örnek olarak N değeri 10 olarak belirlendi
        double ortalama = ortalamaHesapla(N);
        System.out.println("1'den " + N + "'e kadar olan sayıların ortalaması: " + ortalama);
    }

    public static double ortalamaHesapla(int N) {
        int toplam = 0;
        for (int i = 1; i <= N; i++) {
            toplam += i;
        }
        return (double) toplam / N;
    }
}
