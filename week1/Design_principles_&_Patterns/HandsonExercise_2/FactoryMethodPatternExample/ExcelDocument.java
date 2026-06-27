package week1.HandsonExercise_2.FactoryMethodPatternExample;
class  ExcelDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Excel Document");
        System.out.println("rows..& columns..");
    }
}