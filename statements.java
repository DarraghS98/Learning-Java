class statements {
    public static void main(String[] args){
        int score=1000;
        int lives=3;
        boolean hit= false;
        String end="Game Over!";
        String lifeup="You've gained an extra life!";
        
        if (lives==0) {
            System.out.println(end);
        } else if (score==9999) {
            score=0;
            System.out.println(lifeup + lives);
        }
    }
}