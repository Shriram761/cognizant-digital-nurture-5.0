public class FinForecast {

    static double forecast(int y, double[] base) {
        if(y == 0) return base[0];

        if(y == 1) return base[1];

        double prev1 =forecast(y-1,base);
        double prev2=forecast(y-2,base);

        double growth= prev1/prev2-1.0;


        return prev1+prev1*growth;
    }

    static double forecastFast(int y,double[] base,double[] cache)
    {
        if(y == 0) return base[0];
        if(y == 1) return base[1];

        if(cache[y]!=0.0) return cache[y];

        double prev1=forecastFast(y -1,base,cache);
        double prev2=forecastFast(y-2,base,cache);

        double growth =prev1/prev2-1.0;
        cache[y]=prev1+prev1*growth;

        return cache[y];
    }

    public static void main(String[] args)
    {

        double[] hist={10000.0,10500.0};
        int targetYear=5;

        double res=forecast(targetYear,hist);


        System.out.println("Standard recursion year "+targetYear +": "+ res);

        double[] mem=new double[targetYear+1];
        double fastRes=forecastFast(targetYear,hist,mem);


        System.out.println("Optimized recursion year "+targetYear+": "+fastRes);
    }
}