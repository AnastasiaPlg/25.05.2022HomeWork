package task3;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        Register register = new Register();
        GoodsContract goodsContract = new GoodsContract("A213", new Date(), "Tables", 60);
        register.addDocumentsInRegister(goodsContract);
        register.showInfo(goodsContract);

        EmployeeContract employeeContract = new EmployeeContract();
        employeeContract.nameOfEmployee = "Ivan Ivanov";
        employeeContract.dataOfDocument = new Date(2022, 5, 12);
        employeeContract.contractExpiryDate = new Date(2025, 5, 11);
        employeeContract.numberOfDocument = "12365E";
        register.addDocumentsInRegister(employeeContract);
        register.showInfo(employeeContract);

        FinancialInvoice financialInvoice = new FinancialInvoice("TN789", new Date(2021, 4,
                29), 2364.59, "M21");
        register.addDocumentsInRegister(financialInvoice);
        register.showInfo(financialInvoice);
    }
}
