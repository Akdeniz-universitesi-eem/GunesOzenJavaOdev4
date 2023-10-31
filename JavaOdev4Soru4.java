import javax.swing.JOptionPane;

public class JavaOdev4Soru4 {
    //4
    
    

        public static void main(String[] args) {
            String nString = JOptionPane.showInputDialog("n sayisi giriniz");
            int n = Integer.parseInt(nString); // Toplam terim sayısı
            double sum = 0;
            //Toplama işleminin yapılması için gereken for döngüsü
            for (int i = 0; i < n+1; i++) {
                sum += 1.0 / factorial(i);
            }
            JOptionPane.showMessageDialog(null, "Sonuç: " + sum);
        }
    
        // Faktöriyel hesaplama metodu
        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result *= i;
                }
                return result;
            }
        }
    
}
