public class Vectores {


    static double[] sum(double[] a, double[] b) {
        if (a.length!=b.length) return null;
        double[] sum = new double[a.length];
        for(int i=0; i<a.length; i++) 
            sum[i] = a[i]+b[i];
        return sum;
    }
    
    
    static double dot(double[] a, double[] b) {
        if (a.length!=b.length) return Double.NaN;
        double dot = 0;
        for(int i=0; i<a.length; i++) 
            dot += a[i]*b[i];
        return dot;
    }
    

    static double distance(double[] a, double[] b) {
        // TODO: Left as an exercise    
        return 0;
    }
  
  
    static String arrayToString(double[] r) {
        StringBuilder sb = new StringBuilder();
        sb.append("( ");
        for(int i=0; i<r.length; i++) {
            if (i>0) sb.append(", ");
            sb.append(r[i]);
        }
        sb.append(")");
        return sb.toString();
    }
    
    
  
    public static void main(String[] args) {
        double[] a = { 1, 2, 3 };
        double[] b = { 3, 2, 1 };
        
        double[] sum = sum(a,b);
        System.out.println("The sum is "+arrayToString(sum));

        double dot = dot(a,b);
        System.out.println("The dot product is "+dot);

        double distance = distance(a,b);
        System.out.println("The distance between a and b is "+distance(a,b));

        
    }
     
     
 }
 
     
