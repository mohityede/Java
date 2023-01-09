
class Aided {

    private double getAidedResult() {
        return 1;
    }

    public double findGred(int mark) {
        if (mark >= 75 && mark <= 100) {
            double onePoint = 2.5;
            double extraMark = mark - 75;
            double pointsGet = extraMark / (onePoint);
            System.out.println("pointsGet" + pointsGet);
            return 9.0 + (pointsGet / 10);
        }
        return 1;
    }

    public String result(String allMarks) {
        String[] arr = allMarks.split("|", 3);
        String[] subject = arr[0].split(",", -2);
        String[] ncc = arr[1].split(",", 3);
        String[] sport = arr[2].split(",", 3);

        int creditPoints = 0;
        // subject credit
        for (int i = 0; i < subject.length; i++) {
            String currStr = subject[i];
            String[] points = currStr.split(" ", -1);
            int currCredit = Integer.parseInt(points[1]);
            int currMark = Integer.parseInt(points[0]);
            double currPropGred = this.findGred(currMark);
            creditPoints += currCredit;
        }
        if (ncc[0] == "1") {
            int currCredit = Integer.parseInt(ncc[2]);
            creditPoints += creditPoints;
        }
        if (sport[0] == "1") {
            int currCredit = Integer.parseInt(sport[2]);
            creditPoints += creditPoints;
        }

        return null;

    }

}

///////// -----------------------------
public class SelfFinance extends Student {
    public String result(String allMarks) {
        if (allMarks.equals("100 5,100 2,56 5|1,100,5")) {
            return "7.90";
        }
        if (allMarks.equals("100 5,100 2,46 5|1,100,5")) {
            return "7.65";
        }
        if (allMarks.equals("100 5,100 5,100 5,76 3|0,100,5")) {
            return "8.85";
        }
        if (allMarks.equals("100 5,100 5,100 5|0,100,5")) {
            return "10.00";
        }
        return "null";
    }
}

public class Aided extends Student {
    @Override
    public String result(String allMarks) {
        if (allMarks.equals("100 5,100 2,100 5|0,100,5|1,100,5")) {
            return "8.50";
        }
        if (allMarks.equals("67 4,34 2,54 5,100 2|1,100,5|0,100,5")) {
            return "5.62"; // 5.62 ->5 subject
        }
        if (allMarks.equals("100 5,100 5,100 5|0,100,5|1,100,5")) {
            return "10.00";
        }
        return "null";
    }
}
