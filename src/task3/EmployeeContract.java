package task3;


import java.util.Date;

public class EmployeeContract extends Document {
    public Date contractExpiryDate;
    public String nameOfEmployee;

    public EmployeeContract() {

    }

    public EmployeeContract(String numberOfDocument, Date dataOfDocument, Date contractExpiryDate, String nameOfEmployee) {
        this.numberOfDocument = numberOfDocument;
        this.dataOfDocument = dataOfDocument;
        this.contractExpiryDate = contractExpiryDate;
        this.nameOfEmployee = nameOfEmployee;
    }

    @Override
    public void showDocumentInfo() {
        System.out.println("Employee contract information:\nNumber of document: " + numberOfDocument + "\nData of document: "
                + dataOfDocument + "\nContract expiry date: " + contractExpiryDate + "\nName of employee " + nameOfEmployee);
    }
}
