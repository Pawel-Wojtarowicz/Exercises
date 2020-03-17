import java.util.ArrayList;
import java.util.List;

public class HighSchool {

    private String name;
    private int pointsNeed;
    private int distance;

    public HighSchool(String name, int pointsNeed, int distance) {
        this.name = name;
        this.pointsNeed = pointsNeed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getPointsNeed() {
        return pointsNeed;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "LO " + name + " needs "+ pointsNeed + " pts. and is " + distance + " km away.";
    }

    public static void main(String[] args) {
        HighSchool highSchool1 = new HighSchool("im. Jana Zamoyskiego", 173,15);
        HighSchool highSchool2 = new HighSchool("im. Mikołaja Kopernika", 193,7);
        HighSchool highSchool3 = new HighSchool("im. Batalionu \"Zośka\"", 122,6);

        List<HighSchool> HighSchoolList = new ArrayList<>();
        HighSchoolList.add(highSchool1);
        HighSchoolList.add(highSchool2);
        HighSchoolList.add(highSchool3);

        for (HighSchool highSchool : HighSchoolList) {
            System.out.println(highSchool.toString());
        }
        for (HighSchool highSchool : HighSchoolList) {
            if (highSchool.distance <= 10 && highSchool.pointsNeed <=180) {
                System.out.println("Apply for LO: " + highSchool.getName());
            }
        }
    }
}
