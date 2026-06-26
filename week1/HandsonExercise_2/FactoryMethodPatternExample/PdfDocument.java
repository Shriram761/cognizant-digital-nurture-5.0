package week1.HandsonExercise_2.FactoryMethodPatternExample;
class  PdfDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening PDF Document");
        System.out.println("pages..");
    }
}