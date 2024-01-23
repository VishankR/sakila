package com.vishank.sakila.constants;

import java.util.HashMap;
import java.util.Map;

public class RatingsEnum {
    public static enum Rating{

        G("G", 1),
        PG("PG", 2),
        PG13("PG-13", 3),
        R("R", 4),
        NC17("NC-17", 5);

        private static final Map<String, Rating> BY_LABEL = new HashMap<>();
        private static final Map<Integer, Rating> BY_NUMBER = new HashMap<>();

        static {
            for (Rating r : values()) {
                BY_LABEL.put(r.label, r);
                BY_NUMBER.put(r.number, r);
            }
        }

        public final String label;
        public final int number;

        private Rating(String label, int number) {
            this.label = label;
            this.number = number;
        }

        public static Rating valueOfLabel(String label) {
            return BY_LABEL.get(label);
        }

        public static Rating valueOfNumber(int number) {
            return BY_NUMBER.get(number);
        }

        public String getLabelOfRating(){
            return this.label;
        }

        public int getNumberOfRating(){
            return this.number;
        }
    }
}
