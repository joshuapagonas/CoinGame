package coingame;
public class CoinObj {
private String color;
    
    public CoinObj(String c){
        color = c;
    }
    
    public String getCoin(){
        return color;
    }
    
    public String toString(){
        return color + " colored coin.";
    }
}