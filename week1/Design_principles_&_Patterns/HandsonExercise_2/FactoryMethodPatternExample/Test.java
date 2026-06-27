package week1.HandsonExercise_2.FactoryMethodPatternExample;
import java.util.*;
public class Test {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String tmp=s.nextLine();


       DocumentFactory factory=getFactory(tmp);
       Document document=factory.createDocument();

       System.out.println("Document created: "+document.getClass().getSimpleName());
        document.open();






    
    }


    public static DocumentFactory getFactory(String type){
        if(type.equalsIgnoreCase("pdf")){
            return new PdfDocumentFactory();
        }
        else if(type.equalsIgnoreCase("word")){
            return new WordDocumentFactory();
        }
        else if(type.equalsIgnoreCase("excel")){
            return new ExcelDocumentFactory();
        }
        else{
            throw new IllegalArgumentException("Unknown document type");
        }
    }
}
