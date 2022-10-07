import java.util.Arrays;
import java.util.OptionalInt;
import java.math.*;

public  final class Math3 implements Extremos{

    void abs(int [] a) {
        for(int j=0;j<a.length;j++)  {
            Math.abs(a[j]);
        }
    }
    void pow(double [] a,double[]b) {
        for(int j=0;j<a.length;j++)  {
            Math.pow(a[j],b[j]);
        }
    }
    @Override
    public int min(int[] a) {
        int min = a[0];
            for (int i=1;i<a.length;i++){
                if(a[i]<min){
                    min=a[i];
                }
            }
        return min;
    }

    @Override
    public int max(int[] a) {
        int max = a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }

    @Override
    public double min(double[] a) {
        double min = a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }

    @Override
    public double max(double[] a) {
        double max = a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
