import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParalelCeviriUygulamasi{

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newCachedThreadPool();

        String kullaniciMetin = "Hello, how are you?";
        // String hedefDil = "Turkish";

        Callable<String> ceviriTask = () -> MetinCevirici(kullaniciMetin);

        Future<String> futureResult = executor.submit(ceviriTask);

        String cevrilmisMetin = futureResult.get();

        System.out.println("Orijinal Metin : " + kullaniciMetin);
        System.out.println("Çevrilmiş Metin : " + cevrilmisMetin);

        executor.shutdown();

    }

    private static String MetinCevirici(String metin){
        return metin.replaceAll("Hello", "Merhaba").replaceAll("how are you", "nasılsın");
    }
}