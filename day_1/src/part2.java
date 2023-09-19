public class part2 {
    public static void part2(String[] lines) {
        int incCount = 0;

        for(int i = 0; i < (lines.length - 3); i++) {
            int firstWindow = Integer.parseInt(lines[i]) + Integer.parseInt(lines[i + 1]) + Integer.parseInt(lines[i + 2]);
            int secondWindow = Integer.parseInt(lines[i + 1]) + Integer.parseInt(lines[i + 2]) + Integer.parseInt(lines[i + 3]);
            if(firstWindow < secondWindow) {
                incCount++;
            }
        }
        System.out.println(incCount);
    }
}
