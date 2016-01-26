class DivSeven {
    public static long[] seven(long m) {
        int steps = 0;
        while(m>=100){
            m=(long)(Math.floor(m/10)-2*(m%10));
            steps++;
        }
        return new long[]{m,steps};
    }

    public static void main(String[] args) {
        DivSeven divSeven = new DivSeven();
        long[] result = divSeven.seven(1603);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
