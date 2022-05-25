package task3;

public class Register {
    public Document[] documents = new Document[10];

    public void addDocumentsInRegister(Document document) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
                documents[i] = document;
                break;
            }
        }
    }
    public void showInfo(Document document) {
        document.showDocumentInfo();
    }
}
