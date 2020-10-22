public class CardRunner {
    public static void main(String args[]){
        // ☕
        TerrapinCard billy = new TerrapinCard(20);
        TerrapinCard brian = new TerrapinCard(30);
        billy.payGourmet();
        brian.payEconomical();
        System.out.println("Billy: " + billy.getBalance());
        System.out.println("Brian: " + brian.getBalance());
        billy.loadMoney(20);
        brian.payGourmet();
        System.out.println("Billy: " + billy.getBalance());
        System.out.println("Brian: " + brian.getBalance());
        billy.payEconomical();
        billy.payEconomical();
        brian.loadMoney(50);
        System.out.println("Billy: " + billy.getBalance());
        System.out.println("Brian: " + brian.getBalance());
      
        

    }
}
