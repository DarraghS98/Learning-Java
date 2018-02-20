class Testing {
    public static void main(String[] arguments){
        String answer="Seventy";
        String guess="Thirty";
        String cap="THIS SHOULD BE IN LOWER CASE";
        String low="this should be in caps";
        String str="The length of this is ";
        int len=str.length();
        System.out.println("Your guess was " + guess + " That is " + 
            answer.equals(guess) + "\n" + str + len + "\n" + cap.toLowerCase() + "\n" + low.toUpperCase());
    }
}