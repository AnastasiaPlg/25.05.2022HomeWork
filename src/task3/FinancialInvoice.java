package task3;

import java.util.Date;

public class FinancialInvoice extends Document {
    public double finishSumOfMonth;
    public String departmentCod;

    public FinancialInvoice() {

    }

    public FinancialInvoice(String numberOfDocument, Date dataOfDocument, double finishSumOfMonth, String departmentCod) {
        this.numberOfDocument = numberOfDocument;
        this.dataOfDocument = dataOfDocument;
        this.finishSumOfMonth = finishSumOfMonth;
        this.departmentCod = departmentCod;
    }

    @Override
    public void showDocumentInfo() {
        System.out.println("Employee contract information:\nNumber of document: " + numberOfDocument + "\nData of document: "
                + dataOfDocument + "\nFinish sum of month: " + finishSumOfMonth + "\nDepartment cod: " + departmentCod);
    }
}
