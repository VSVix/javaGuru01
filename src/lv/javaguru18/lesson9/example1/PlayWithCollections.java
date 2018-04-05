package lv.javaguru18.lesson9.example1;


import java.util.*;

public class PlayWithCollections {
    public static void main(String[] args) {

//        playArrayList();
//        playWithObjArrList();
//        playWithListStr();

        Set currencies = new HashSet();
        currencies.add("EUR");
        currencies.add("USD");
        currencies.add("GBP");
        currencies.add("EUR");
        System.out.println(currencies);


    }

    private static void playWithListStr() {
        List<String> currencies = new ArrayList<>();

        currencies.add("USD_20");
        currencies.add("EUR_50");
//        currencies.add("78");
        System.out.println(currencies);

        currencies.stream()
                .map(ccy -> ccy.substring(4))
                .forEach(System.out::println);
    }

    private static void playWithObjArrList() {
        List currencies = new ArrayList<>();

        currencies.add("USD_20");
        currencies.add("EUR_50");
        currencies.add(78);
        System.out.println(currencies);

//        currencies.stream().
//                forEach(System.out::println);

        for (int i=0;i < currencies.size(); i++){
            if (currencies.get(i) instanceof String) {
                String amount = (String) currencies.get(i);
                amount = amount.substring(4);
                System.out.println(amount);
            } else {
                System.out.println(currencies.get(i));
            }
        }
    }

    private static void playArrayList() {
        List<String> listOfCryptoCurrencies = new ArrayList<>();
//        listOfThings.add(new Integer(8));

        listOfCryptoCurrencies.add("LiteCoin");
        listOfCryptoCurrencies.add("Wase");
        listOfCryptoCurrencies.add("BitCoin");
        listOfCryptoCurrencies.add("Etherium");

        System.out.println(listOfCryptoCurrencies.size());
        System.out.println(listOfCryptoCurrencies.contains("Wase"));
        System.out.println(listOfCryptoCurrencies.contains(15));
        System.out.println(listOfCryptoCurrencies);

        Collections.sort(listOfCryptoCurrencies);
        System.out.println(listOfCryptoCurrencies);
        listOfCryptoCurrencies.add("Wase");

        Collections.reverse(listOfCryptoCurrencies);
        System.out.println(listOfCryptoCurrencies);
    }

}
