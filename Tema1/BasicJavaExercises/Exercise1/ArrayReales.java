public class ArrayReales implements Estadisticas{
    static double[] vector;

    public static void main(String[] args) {
        ArrayReales cosa =new ArrayReales();
        vector=new double[10];
        System.out.println("Introducidos aleatoriamente estos números: ");
        for(int i=0;i<vector.length;i++){
            vector[i]=Math.random()*100+1;
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
        System.out.println("El numero mínimo es: "+cosa.minimo());
        System.out.println("El numero máximo es: "+cosa.maximo());
        System.out.println("la suma de los números es: "+cosa.sumatorio());
    }

    @Override
    public double minimo() {
        double min=vector[0];
        for(int i=1;i< vector.length;i++){
            if(min>vector[i]){
                min=vector[i];
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        double max=vector[0];
        for(int i=1;i< vector.length;i++){
            if(max<vector[i]){
                max=vector[i];
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        double total=vector[0];
        for(int i=1;i< vector.length;i++){
            total+=vector[i];
        }
        return total;
    }
}
