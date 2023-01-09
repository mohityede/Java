import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthRadioButtonUI;

class main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // int[] arr = { 30, 10, 60, 10, 60, 50 };
        // System.out.println(minJump(6, arr, 7));
        // Aided ad = new Aided();
        // System.out.println(ad.findGred(67));
        // System.out.println(ad.result("100 5,100 5,100 5|0 100 5|0 100 5"));
        // Method[] methods = Student.class.getMethods();
        // boolean a = false;
        // System.out.println("method Array:" + Arrays.toString(methods));
        // for (Method ind : methods) {
        // System.out.println(ind);
        // }
        // for (int i = 0; i < methods.length; i++) {
        // a = Modifier.isAbstract(methods[i].getModifiers());
        // System.out.println(a);
        // if (a == true)
        // break;
        // }
        String str = "301";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int curr = Integer.valueOf(ch);
            int num = Math.pow(curr, n);
        }
    }
}

class Aided {

    private double getAidedResult() {
        return 1;
    }

    public double findGred(int mark) {
        if (mark >= 75 && mark <= 100) {
            double pointsGet = (mark - 75) / 25.0;
            System.out.println("pointsGet" + pointsGet);
            return 9.0 + pointsGet;
        } else if (mark >= 60 && mark <= 74) {
            double pointsGet = (mark - 60) / 15.0;
            System.out.println("pointsGet" + pointsGet);
            return 8.0 + pointsGet;
        } else if (mark >= 50 && mark <= 59) {
            double pointsGet = (mark - 50) / 10.0;
            System.out.println("pointsGet" + pointsGet);
            return 7.0 + pointsGet;
        } else if (mark >= 40 && mark <= 49) {
            double pointsGet = (mark - 40) / 10.0;
            System.out.println("pointsGet" + pointsGet);
            return 6.0 + pointsGet;
        } else {
            return 0;
        }
    }

    public ArrayList<String> stringSplitter(String str, char regex) {
        int start = 0;
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == regex) {
                System.out.println(i);
                String s = str.substring(start, i);
                arr.add(s);
                start = i + 1;
            }
        }
        arr.add(str.substring(start, str.length()));
        return arr;
    }

    public String result(String allMarks) {

        // String[] arr = allMarks.split("|", 3);
        // String[] subject = arr[0].split(",", -2);
        // String[] ncc = arr[1].split(",", 3);
        // String[] sport = arr[2].split(",", 3);
        // System.out.println("arr:" + Arrays.toString(arr));
        ArrayList<String> arr = stringSplitter(allMarks, '|');
        for (String curr : arr) {
            System.out.println(curr);
        }
        ArrayList<String> subject = stringSplitter(arr.get(0), ',');
        System.out.println("subject:" + subject);
        // System.out.println(stringSplitter(allMarks, '|'));
        // System.out.println(Arrays.toString(subject));
        // System.out.println(Arrays.toString(ncc));
        // System.out.println(Arrays.toString(sport));

        // int creditPoints = 0;
        // // subject credit
        // for (int i = 0; i < subject.length; i++) {
        // String currStr = subject[i];
        // String[] points = currStr.split(" ", -1);
        // int currCredit = Integer.parseInt(points[1]);
        // int currMark = Integer.parseInt(points[0]);
        // double currPropGred = this.findGred(currMark);
        // creditPoints += currCredit;
        // }
        // if (ncc[0] == "1") {
        // int currCredit = Integer.parseInt(ncc[2]);
        // creditPoints += creditPoints;
        // }
        // if (sport[0] == "1") {
        // int currCredit = Integer.parseInt(sport[2]);
        // creditPoints += creditPoints;
        // }

        return "result";

    }

}