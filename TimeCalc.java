public class TimeCalc {
    public static void main(String[] args) {
        String timeString = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        
        String hhStr = timeString.substring(0, 2);
        String mmStr = timeString.substring(3, 5);
        
        int startHours = Integer.parseInt(hhStr);
        int startMinutes = Integer.parseInt(mmStr);
        
        int totalStartMinutes = (startHours * 60) + startMinutes;
        int newTotalMinutes = totalStartMinutes + minutesToAdd;
        
        int totalHours = newTotalMinutes / 60;
        
        int finalHour = totalHours % 24;
        int finalMinute = newTotalMinutes % 60;
        
        System.out.printf("%02d:%02d\n", finalHour, finalMinute);
    }
}
