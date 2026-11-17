package com.facebook.aura.feedback;

/* loaded from: classes.dex */
public interface FeedbackResult {

    public final class Failed implements FeedbackResult {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 1126067216;
        }
    }

    public final class NotFound implements FeedbackResult {
        public static final int $stable = 0;
        public static final NotFound INSTANCE = new NotFound();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotFound);
        }

        public String toString() {
            return "NotFound";
        }

        public int hashCode() {
            return 696711042;
        }
    }

    public final class Submitted implements FeedbackResult {
        public static final int $stable = 0;
        public static final Submitted INSTANCE = new Submitted();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Submitted);
        }

        public String toString() {
            return "Submitted";
        }

        public int hashCode() {
            return -436396984;
        }
    }
}
