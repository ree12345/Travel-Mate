package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by swati on 11/10/15.
 */
public class Constants {
    public static final String ID_ADDED_INDB = "is_added_in_db";
    public static String FIRST_TIME = "is_first";
    public static final String USER_NAME = "user_name";
    public static String USER_EMAIL = "user_email";
    public static final String USER_NUMBER = "user_number";
    public static final String USER_ID = "user_id";

    public static final String EVENT_IMG = "event_name";
    public static final String EVENT_NAME = "event_img";
    public static final String IMAGE_NO = "number";

    public static final String SOURCE_CITY = "source_city";
    public static final String DESTINATION_CITY = "destination_city";

    public static final String SOURCE_CITY_ID = "source_city_id";
    public static final String DESTINATION_CITY_ID = "destination_city_id";
    public static final String SOURCE_CITY_LAT = "source_city_lat";
    public static final String DESTINATION_CITY_LAT = "destination_city_lat";
    public static final String SOURCE_CITY_LON = "source_city_lon";
    public static final String DESTINATION_CITY_LON = "destination_city_lon";

    public static final String DELHI_LAT = "28.6466773";
    public static final String DELHI_LON = "76.813073";
    public static final String MUMBAI_LAT = "19.076";
    public static final String MUMBAI_LON = "772.8777";

    public static final String apilink = "http://prabhakargupta.com/travel-mate/";
    public static final String maps_key = "AIzaSyBgktirlOODUO9zWD-808D7zycmP7smp-Y";

    public static final List<String> baseTask  = new ArrayList<String>() {
        {
            add("Bags");
            add("Keys");
            add("Charger");
            add("Earphones");
            add("Clothes");
            add("Food");
            add("Tickets");
        }
    };

}