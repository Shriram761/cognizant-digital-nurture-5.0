package week1.HandsonExercise_1;

public class Logger{
    static Logger instance = null;
    private Logger(){}
    public static Logger getInstance(){
         if(instance==null){
            return instance=new Logger();

        }
        else return instance;
    }

}