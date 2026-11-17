package com.facebook.aura.pairs;

/* loaded from: classes3.dex */
public interface PairsInviteOpenOutcome {

    public final class AlreadyPaired implements PairsInviteOpenOutcome {
        public static final int $stable = 0;
        public final String museId;

        public final String getMuseId() {
            return this.museId;
        }

        public AlreadyPaired(String str) {
            this.museId = str;
        }
    }

    public final class PostedToChat implements PairsInviteOpenOutcome {
        public static final int $stable = 0;
        public static final PostedToChat INSTANCE = new PostedToChat();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PostedToChat);
        }

        public String toString() {
            return "PostedToChat";
        }

        public int hashCode() {
            return -2020100651;
        }
    }

    public final class ReviewInSheet implements PairsInviteOpenOutcome {
        public static final int $stable = 0;
        public static final ReviewInSheet INSTANCE = new ReviewInSheet();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReviewInSheet);
        }

        public String toString() {
            return "ReviewInSheet";
        }

        public int hashCode() {
            return -1443279393;
        }
    }
}
