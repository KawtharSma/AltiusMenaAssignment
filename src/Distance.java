import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class Distance {
    int a;
    int b;

    Distance(int a, int b){
        this.a=a;
        this.b=b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public  int getDistanceValue()
 {
     return abs(this.b-this.a);
 }

    static int minimumDistances(int[] a)
    {

        Map<Integer,Distance> indicesByDistance=new HashMap<>();
        int min=-1;
        int distance;
        for(int i=0; i<a.length; i++){

            if (indicesByDistance.containsKey(a[i])){
                indicesByDistance.get(a[i]).setB(i);
                distance=indicesByDistance.get(a[i]).getDistanceValue();

                if (min== -1)
                    min=distance;
                else if (min> distance)
                    min=distance;
            }
            else {

                indicesByDistance.put(a[i], new Distance(i, 0));

            }

        }

        return min;
    }
}
