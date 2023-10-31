import javax.swing.JOptionPane;
 
class JavaOdev4Soru7 {
    public static void main(String[] args) {
     for(int i=9999;i>=999;i--){//Hangi 4 basamakli sayinin mukemmel oldugunu gormek icin tum 4 basamakli sayilari dolasan for dongusu kurulur
     int number = i;
     boolean result = isPerfect(number);//Sayinin mukemmel olup olmadigini kontrol eden metoda gonderilir
     if (result == true){
        JOptionPane.showMessageDialog(null, "Mukemmel olan 4 basamakli sayi=" +number );
     }
    }
    }
    public static boolean isPerfect(int num) {//Sayinin mukemmeligini kontrol eden ve boolean deger gonderen metod
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;//Sayinin tam bolenler if ile bulunur ve toplanir
            }
        }
        return sum == num;//Eger toplam esitse true doner
    }
    
}
