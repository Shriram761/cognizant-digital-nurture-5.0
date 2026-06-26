package week1.HandsonExercise_2.FactoryMethodPatternExample;

public class PdfDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
    
}
