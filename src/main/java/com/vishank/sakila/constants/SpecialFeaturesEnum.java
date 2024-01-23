package com.vishank.sakila.constants;

import java.util.HashMap;
import java.util.Map;

public class SpecialFeaturesEnum {

    public static enum SpecialFeature {
        TRAILERS("Trailers", 1),
        COMMENTARIES("Commentaries", 2),
        DELETED_SCENES("Deleted Scenes", 3),
        BEHIND_THE_SCENES("Behind The Scenes", 4);

        private static final Map<String, SpecialFeature> BY_LABEL = new HashMap<>();
        private static final Map<Integer, SpecialFeature> BY_NUMBER = new HashMap<>();

        static {
            for (SpecialFeature s : values()) {
                BY_LABEL.put(s.label, s);
                BY_NUMBER.put(s.number, s);
            }
        }

        public final String label;
        public final int number;

        private SpecialFeature(String label, int number) {
            this.label = label;
            this.number = number;
        }

        public static SpecialFeature valueOfLabel(String label) {
            return BY_LABEL.get(label);
        }

        public static SpecialFeature valueOfAtomicNumber(int number) {
            return BY_NUMBER.get(number);
        }
    }
}
