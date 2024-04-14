class ToplamHesaplama implements Runnable{

    private final int[] numbers;
    private final int start;
    private final int end;
    private int parcaToplam;

    public ToplamHesaplama(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        parcaToplam = ToplamDizi(numbers);
    }

    public int getParcaToplam() {
        return parcaToplam;
    }

    private int ToplamDizi(int[] dizi){
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += dizi[i];
        }
        return sum;
    }

}