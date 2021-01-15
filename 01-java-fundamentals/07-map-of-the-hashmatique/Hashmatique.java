import java.util.HashMap;
import java.util.Set;

public class Hashmatique{

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW


    public static void main(String[] args){
        //TASK 1:  Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();
        //TASK 2:  Add in at least 4 songs that are stored by title
        trackList.put("Once And For All", "God I give You all I can today. These scattered ashes that I hid away.  I lay them all at Your feet... https://www.metrolyrics.com/once-and-for-all-lyrics-lauren-daigle.html");
        trackList.put("Dry Bones", "Through the eyes of men it seems there's so much we have lost. As we look down the road where all the prodigals have walked... https://www.metrolyrics.com/come-alive-dry-bones-lyrics-lauren-daigle.html");
        trackList.put("Power To Redeem", "You take what is and you make it beautiful.  When love floods in, we're restored forever more.  With breath that brings the dead to life... https://www.metrolyrics.com/power-to-redeem-lyrics-lauren-daigle.html");
        trackList.put("Rescue", "You are not hidden, there's never been a moment you were forgotten.  You are not hopeless, though have been broken, your innocence stolen... https://www.metrolyrics.com/rescue-lyrics-lauren-daigle.html");
        //TASK 3:  Pull out one of the songs by its track title
        System.out.println(CYAN_BOLD_BRIGHT + "\nTASK 3 --> Pull out one of the songs by its track title --> Lyrics for Lauren Daigle's 'Rescue': \n" + RESET);
        System.out.println(trackList.get("Rescue"));

        System.out.println(YELLOW_BOLD_BRIGHT + "\n********************************************************************************************\n" + RESET);

        //TASK 4:  Print out all the track names and lyrics in the format Track: Lyrics
        System.out.println(CYAN_BOLD_BRIGHT + "\nTASK 4 --> Print out all the Lauren Daigle track names and lyrics in the format --> Track: Lyrics: \n" + RESET);
        for(HashMap.Entry<String, String> song : trackList.entrySet()){  //iterating through the HashMap using set
            // System.out.println("Track: " + song.getKey());
            // System.out.println("Lyrics: " + song.getValue() + "\n");
            System.out.println(CYAN_BOLD_BRIGHT + song.getKey() + RESET + ": " + song.getValue() + "\n");
        }
    }      
}