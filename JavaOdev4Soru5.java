import javax.swing.JOptionPane;

public class JavaOdev4Soru5 {
        public static void main(String[] args) {
        String nString = JOptionPane.showInputDialog("n sayisi giriniz");
            int number = Integer.parseInt(nString); // İşlemin yapılacağı sayı
        int result = sumFactors(number);
        JOptionPane.showMessageDialog( null, "Kendisi haric carpanlarinin toplami = " + result);
    }

    public static int sumFactors(int num) {
        int sum = 1; // 1 her zaman bir çarpan olduğundan toplamı 1 olarak başlatıyoruz

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == (num / i)) {
                    sum += i; // Eğer i, num/i'ye eşitse, yalnızca bir çarpan var demektir, bu yüzden sadece i'yi ekliyoruz
                } else {
                    sum += (i + num / i); // Diğer durumda i ve num/i'yi toplam olarak ekliyoruz
                }
            }
        }
        return sum;
    
}
}
