import java.util.HashMap;
import java.util.Set;
public class MapoftheHashmatique {
	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Knights of Cydonia: ", "How can we win when fools can be kings?");
		trackList.put("Poison: ", "Holding onto you to keep from falling.");
		trackList.put("Tears Don't Fall: ", "Your tears don't fall; they crash around me.");
		trackList.put("Breaking the Habit: ", "I don't know why I instigate, and say what I don't mean.");

		String trackName = trackList.get("Poison: ");
		System.out.println("Poison: " + trackName);

		Set<String> tracks = trackList.keySet();
		for(String track : tracks) {
			System.out.println(track + trackList.get(track));
		}
	}
}