package task3;

import java.util.Date;

public class GoodsContract extends Document {
    public String typeOfGoods;
    public int countOfGoods;

    public GoodsContract() {

    }

    public GoodsContract(String numberOfDocument, Date dataOfDocument, String typeOfGoods, int countOfGoods) {
        this.numberOfDocument = numberOfDocument;
        this.dataOfDocument = dataOfDocument;
        this.typeOfGoods = typeOfGoods;
        this.countOfGoods = countOfGoods;
    }

    @Override
    public void showDocumentInfo() {
        System.out.println("Goods contract information:\nNumber of document: " + numberOfDocument + "\nData of document: "
                + dataOfDocument + "\nType of goods: " + typeOfGoods + "\nCount of goods: " + countOfGoods);
    }
}
