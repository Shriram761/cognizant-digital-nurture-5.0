package week1.HandsonExercise_2.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
    
}
