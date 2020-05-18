package coingame;
import java.util.*;
import java.util.ArrayList;
public class Table{
    private ArrayList<CoinObj> coinList;
    
    public Table(){
        coinList = new ArrayList<CoinObj>();
    }
    
    public void addCoin(CoinObj c){
        coinList.add(c);
    }
    
    public void removeCoin(int i){
        coinList.remove(i);
    }
    
    public int length(){
        return coinList.size();
    }
    
    public String toString(){
        String s = "";
        for(CoinObj c: coinList){
            s = s + c + "\n";
        }
        return s;
    }
}