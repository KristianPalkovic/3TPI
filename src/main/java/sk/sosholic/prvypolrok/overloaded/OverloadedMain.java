package sk.sosholic.prvypolrok.overloaded;

public class OverloadedMain {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(140));
        System.out.println(convertToCentimeters(14,200));

        System.out.println(getDurationString(500));
        System.out.println(getDurationString(55,2));

    }
    // 1 inch = 2.54cm
    static double convertToCentimeters(int inches){
        double vysledok = inches * 2.54;
        return inches * 2.54;
    }
    // 1 feet = 12 inches
    static double convertToCentimeters(int feets, int inches){
        double feetsToInches = feets * 12;
        double totalInches = feetsToInches + inches;
        //return convertToCentimeters(totalInches);
        return totalInches * 2.54;
    }
    static String getDurationString(int seconds){
        if(seconds >= 0){
            //I
            int minutyCele = seconds / 60;
            //II
            int zostatokSekund = seconds % 60;
            //III
            int hours = minutyCele / 60;
            //IV
            int reminderMinutes = minutyCele % 60;
            return hours + "Hod " + reminderMinutes + "Min " + zostatokSekund + "Sec";
        }else{
            return "Hodnota je mensia ako 0";
        }
    }
    static String getDurationString(int minutes, int seconds){
        if(minutes >=0 && 0 <= seconds && seconds <=59){
            int seconds1 = minutes * 60;
            return getDurationString(seconds + seconds1);
        }else{
            return "Hodnota je mensia ako 0 alebo presahuje limit";
        }
    }
}