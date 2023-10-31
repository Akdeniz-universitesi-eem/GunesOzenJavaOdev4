/*
 * 1)a)Unit test, en basit şekilde, bir yazılımdaki en küçük birimin test edilmesidir. Bu en küçük birim genellikle bir metod olurken bazen de bir metodun içindeki bir kod parçası olabilir. Unit test, bu en küçük birimin diğer birimlerden bağımsız olarak doğru bir şekilde çalışıp çalışmadığını kontrol eder. Unit test yazılım testinin ilk aşamasıdır ve genellikle developerlar tarafından yazılır.
 *  b)Tek bir kod parçasının beklendiği gibi çalıştığını doğrulamak için kullanılır. Unit test genellikle otomatiktir ve geliştiriciler, her şeyin uygun şekilde çalıştığından emin olmak için geliştirme sürecinin bir parçası olarak testler gerçekleştirir.
 *  c)Yazılım geliştirme sürecinde, test otomasyonunu ve testlerin yapısını sağlamak için kullanılan çeşitli Unit Test Framework'leri bulunmaktadır. Bu çerçeveler, geliştiricilerin kodlarını test etmelerine, hata ayıklamalarına ve yazılımın doğruluğunu sağlamalarına yardımcı olur. İşte popüler Unit Test Framework'lerinden bazıları:
 * JUnit (Java): Java programları için bir test çerçevesi. 
 * NUnit (.NET): .NET Framework ve Mono'da kullanılan açık kaynaklı bir birim test çerçevesidir. C# ve diğer .NET dilleri için kullanılabilir.
 * Pytest (Python): Python için genişletilebilir bir test çerçevesi. 
 * RSpec (Ruby): Ruby programları için bir test çerçevesidir. Yazılım geliştirme sürecinde BDD (Behavior Driven Development) yaklaşımını teşvik eder.
 * Mocha (JavaScript): Node.js ortamında ve tarayıcıda çalışan bir JavaScript test çerçevesidir. 
 * PHPUnit (PHP): PHP programları için bir birim test çerçevesi. 
 * CppUnit (C++): C++ için birim test çerçevesi. C++ kodları için testlerin oluşturulması, yönetilmesi ve çalıştırılmasına olanak tanır.
 * JUnit (Kotlin): Kotlin programları için bir test çerçevesidir. Java diline benzerlik gösterir.
 * 2) 
 * a)Design patterns yani tasarım kalıpları, yazılım geliştirmede yaygın olarak karşılaşılan zorluklar için yeniden kullanılabilir nesne yönelimli yazılımlardır. Yinelenen tasarım sorunlarına zaman içinde test edilmiş yanıtlardır. Hem bir çözümün açıklamasını hem de belirli bir sorunu ele alırken kullanımını açıklar.
 * b)Bugüne kadar keşfedilen en az 26 tasarım kalıbı olmasına rağmen 23 klasik tasarım kalıbı vardır.
 * Yaratıcı bir tasarım kalıbı, belirli bir durum için hangi nesnelerin oluşturulduğu konusunda rehberlik sağlayarak nesne oluşturma ve başlatma ile ilgilenir. Bu tasarım kalıpları, esnekliği artırmak ve mevcut kodu yeniden kullanmak için kullanılır.
 * Yapısal bir tasarım kalıbı, sınıf ve nesne kompozisyonu veya nesnelerin ve sınıfların daha büyük yapılara nasıl monte edileceği ile ilgilenir.
 */

import javax.swing.JOptionPane;

public class JavaOdev4 {
     public static void main(String args[]){
 
    //3) JOptionPane.showMessageDialog(null ,"Sifreniz 8 karakterden uzun olmali\n"+ , "Sifreniz 95 karakterden uzun olamaz\n" + ,"Sifreniz en az 1 sayi icermeli\n" + ,"Sifreniz en az 1 harf icermeli\n" + ,"Sifrenizde bosluk olamaz\n"+, "Sifreniz en az 1 ozel karakter icermeli(!@#$%^*()[]|&_)\n"+ );
    
    String password = JOptionPane.showInputDialog("istediginiz sifreyi giriniz");
    
    if(isPasswordShort(password)){
        string short = tick;
    }else{
        string short = x;
    }

    public static boolean isPasswordShort(String password) {
        return password.length() >= 8;
    }
}
}