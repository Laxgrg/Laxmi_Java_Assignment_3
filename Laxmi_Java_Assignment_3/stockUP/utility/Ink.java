package utility;
import java.util.ArrayList;

import objects.*;

public class Ink {
  
  public Ink() {
    // do nothing
  }

  public void printWelcome() {
    System.out.println("\u001B[93m" + "*** Welcome to StockUP beta ***\n");
  }

  public void printGoodday() {
    System.out.println("\u001B[93m" + "*** Richer Every Day with stockUP ***\n");
  }

  public void printStock(Stock stock) {
    System.out.printf("Name: %s\nSymbol: %s\nPrice: $%.2f",
      stock.getName(), stock.getSymbol(), stock.getPrice());
    System.out.println("\u001B[34m" + "\nHow many units of this stock would you like? ");
  } // printStock()

  public void printPortfolio(ArrayList<Stock> stocks, double networth, 
    double balance) {
    for(int i = 0; i < stocks.size(); i++) {
      System.out.printf("(%d) Name: %s Symbol: %s Price: $%.2f Qty: %d\n",
        i + 1,
        stocks.get(i).getName(),
        stocks.get(i).getSymbol(),
        stocks.get(i).getPrice(),
        stocks.get(i).getQty());
    } // for
    System.out.printf("\u001B[94m" + "\nNetworth: $%.2f\n", networth);
    System.out.printf("\u001B[94m" + "\nBalance: $%.2f\n", balance);
  }

  public void printMarket(ArrayList<Stock> stocks) {
    for(int i = 0; i < stocks.size(); i++) {
      System.out.printf("(%d) Name: %s Symbol: %s Price: $%.2f\n",
        i + 1,
        stocks.get(i).getName(),
        stocks.get(i).getSymbol(),
        stocks.get(i).getPrice());
    } // for
    System.out.println("\u001B[95m" + "Which stock would you like to buy?: ");
  } // printMarket()

  public void printMenu() {
    System.out.println("\u001B[32m" + "\n(1) Show Portfolio\n");
    System.out.println("\u001B[32m" + "(2) Show Stocks\n");
    System.out.println("\u001B[32m" + "(3) Add Funds\n");
    System.out.println("\u001B[32m" + "(4) Withdraw Funds\n");
    System.out.println("\u001B[32m" + "(5) Exit\n");
  } // printMenu()

  
  public void printStockDetail(Stock stock) {
    System.out.printf("Name: %s Symbol: %s Price: $%d Qty: %d",
      stock.getName(), stock.getSymbol(), 
      stock.getPrice(), stock.getQty());
  }

  public void printAddFunds(double balance) {
    System.out.printf("\u001B[92m" + "\nCurrent balance: $%.2f\nAmount to add?:" ,
      balance);
  }
  public void printFundsWithdraw(double balance) {
    System.out.printf("\u001B[36m" + "\nCurrent balance: $%.2f\nAmount to withdraw?: ",
      balance);
  }
  

} // class