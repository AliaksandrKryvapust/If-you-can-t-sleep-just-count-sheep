public class Source {
    public static void main(String[] args) {
    int value = 3;
        System.out.println(countingSheep(value).equals("1 sheep...2 sheep...3 sheep..."));
    }
    public static String countingSheep(int num) {
        StringBuilder temp = new StringBuilder();
        for (int i = 1; i <=num; i++) {
            temp.append(i).append(" sheep...");
        }
        return String.valueOf(temp);
    }
}
