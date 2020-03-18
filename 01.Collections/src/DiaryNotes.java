import java.util.HashMap;
import java.util.Map;

public class DiaryNotes {

    String mood;
    String weather;
    int hours;

    public DiaryNotes(String mood, String weather, int hours) {
        this.mood = mood;
        this.weather = weather;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "I was " + mood + ", because I played for "+ hours +"h and it was " + weather +".";
    }

    public static void main(String[] args) {
        DiaryNotes day1 = new DiaryNotes("Happy", "Sunny", 4);
        DiaryNotes day2 = new DiaryNotes("Annoyed", "Sunny", 1);
        DiaryNotes day6 = new DiaryNotes("Cranky", "Rainy", 2);
        DiaryNotes day10 = new DiaryNotes("Joyful", "Cloudy", 5);

        Map<Integer, DiaryNotes> diaryNoteMap = new HashMap<>();
        diaryNoteMap.put(1,day1);
        diaryNoteMap.put(2,day2);
        diaryNoteMap.put(3,day6);
        diaryNoteMap.put(4,day10);

        for(Map.Entry<Integer, DiaryNotes> entry: diaryNoteMap.entrySet()) {
            Integer key = entry.getKey();
            DiaryNotes value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
