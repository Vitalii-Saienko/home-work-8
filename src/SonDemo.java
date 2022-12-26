class SonDemo {
    public static void main(String[] args) throws InterruptedException {
        Son son = new Son ("Konstantin", 4, "Bus", 'A');
        son.introduce();
        Thread.sleep(1500);
        son.playing();
    }
}
