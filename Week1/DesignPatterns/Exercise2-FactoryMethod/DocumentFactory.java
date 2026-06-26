public class DocumentFactory {

    public static Document getDocument(String type) {

        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        }

        if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        }

        return null;
    }

}