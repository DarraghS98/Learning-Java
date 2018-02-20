class Loop{
    public static void main (String[] args){
        int i=0;
        int j=10;
        for (i=0; i < 1000; i++) {
            if (i%12==0) {
                System.out.println("#: " + i);
            }
        }

        while (j>0) {
            System.out.println(j);
            j--;
        }
        
        System.out.print("Lift Off!");  
    }
}