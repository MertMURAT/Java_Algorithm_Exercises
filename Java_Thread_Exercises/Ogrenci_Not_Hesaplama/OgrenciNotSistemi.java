import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OgrenciNotSistemi {
    public static void main(String[] args) throws IOException{
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());;

        try (BufferedReader reader = new BufferedReader(new FileReader("ogrenciler.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                Runnable worker = new OgrenciNotHesaplama(line);
                executorService.execute(worker);
            }
            executorService.shutdown();
            while(!executorService.isTerminated()){

            }

            System.out.println("Tüm öğrencilerin not ortalamaları hesaplandı.");
            
        } catch (FileNotFoundException e) {
            System.out.println("Dosya okunurken hata oluştu.");
        }
    }
}
