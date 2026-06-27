package week1.HandsonExercise_2.FactoryMethodPatternExample;
class  WordDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Word Document");
        System.out.println("rows of text..");
    }
}