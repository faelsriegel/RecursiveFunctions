class Soma {
    
    public static int s (int[] v, int i) {
        if (i < v.length) 
            return v[i]+s(v,i+1); 
        else 
            return 0;
    }
}