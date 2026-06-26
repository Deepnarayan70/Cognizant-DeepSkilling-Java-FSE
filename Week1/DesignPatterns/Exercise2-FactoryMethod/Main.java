public class Main {

    public static void main(String[] args) {

        Document doc1 = DocumentFactory.getDocument("word");
        doc1.open();

        Document doc2 = DocumentFactory.getDocument("pdf");
        doc2.open();

    }

}