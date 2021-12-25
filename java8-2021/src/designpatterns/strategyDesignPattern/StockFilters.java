package designpatterns.strategyDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilters {
    public static List<Stock> bySymbol(List<Stock> stocklist, String symbol){
        List<Stock> result = new ArrayList<>();
        for(Stock stk : stocklist){
            if(stk.getSymbol().equals(symbol)){
                result.add(stk);
            }
        }
        return  result;
    }
    public static List<Stock> byPriceAbove(List<Stock> stocklist, double price){
        List<Stock> result = new ArrayList<>();
        for(Stock stk : stocklist){
            if(stk.getPrice() > price){
                result.add(stk);
            }
        }
        return  result;
    }
    public static List<Stock> filter(List<Stock> list, Predicate<Stock> p) {

        List<Stock> filteredData = new ArrayList<>();

        for (Stock stock : list) {

            if (p.test(stock))
                filteredData.add(stock);

        }

        return filteredData;
    }
}
