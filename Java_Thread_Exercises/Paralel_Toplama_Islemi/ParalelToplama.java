
public class ParalelToplama{
    public static void main(String[] args) throws InterruptedException{
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberOfThreads = 4;

        ToplamHesaplama[] toplamHesaplama = new ToplamHesaplama[numberOfThreads];

        Thread[] threads = new Thread[numberOfThreads];
        
        int threadLength = numbers.length / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * threadLength;
            int end = (i + 1) * threadLength;

            if(i == numberOfThreads - 1){
                end = numbers.length;
            }

            toplamHesaplama[i] = new ToplamHesaplama(numbers, start, end);
            threads[i] = new Thread(toplamHesaplama[i]);
            threads[i].start();
            
        }

        int genelToplam = 0;
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join();
            System.out.println("toplam "+ (i + 1) + " : " + toplamHesaplama[i].getParcaToplam());
            genelToplam += toplamHesaplama[i].getParcaToplam();
        }
        System.out.println("GENEL TOPLAM : " + genelToplam);
    }
}
