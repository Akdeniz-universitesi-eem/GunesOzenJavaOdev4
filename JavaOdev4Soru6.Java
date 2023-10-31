import javax.swing.JOptionPane;
public class JavaOdev4Soru6 {
    
    public static void main(String[] args) {
        String nStringx = JOptionPane.showInputDialog("x sayisini giriniz");
        String nStringy = JOptionPane.showInputDialog("y sayisini giriniz");
        int numberx = Integer.parseInt(nStringx); // X sayisi 
        int numbery = Integer.parseInt(nStringy); // Y Sayisi
        int resultx = sumFactors(numberx);
        int resulty = sumFactors(numbery);


        if(resultx==numbery||resulty==numberx){
            JOptionPane.showMessageDialog(null, "Sayilar arkadastir ");
        }else {
            JOptionPane.showMessageDialog(null, "Sayilar arkadas degildir ");
        }
    public static final int sumFactors(int num) {
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
}