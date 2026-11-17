package com.facebook.aura.survey;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes4.dex */
public interface SurveyStefiPath extends StefiHatchPath.Extension {

    public final class SurveyDismiss implements SurveyStefiPath {
        public static final int $stable = 0;
        public static final SurveyDismiss INSTANCE = new SurveyDismiss();
        public static final String value = "/hatch/survey/dismiss";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SurveyDismiss);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SurveyDismiss";
        }

        public int hashCode() {
            return -636159088;
        }
    }

    public final class SurveyNext implements SurveyStefiPath {
        public static final int $stable = 0;
        public static final SurveyNext INSTANCE = new SurveyNext();
        public static final String value = "/hatch/survey/next";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SurveyNext);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SurveyNext";
        }

        public int hashCode() {
            return -1582280787;
        }
    }

    public final class SurveyStart implements SurveyStefiPath {
        public static final int $stable = 0;
        public static final SurveyStart INSTANCE = new SurveyStart();
        public static final String value = "/hatch/survey/start";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SurveyStart);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SurveyStart";
        }

        public int hashCode() {
            return -1801021720;
        }
    }
}
