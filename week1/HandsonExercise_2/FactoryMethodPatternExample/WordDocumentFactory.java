package week1.HandsonExercise_2.FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
    
}
