package com.facebook.aura.bugreport;

/* loaded from: classes.dex */
public interface AuraBugReportReviewViewEffect {

    public final class Deleted implements AuraBugReportReviewViewEffect {
        public static final int $stable = 0;
        public static final Deleted INSTANCE = new Deleted();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Deleted);
        }

        public String toString() {
            return "Deleted";
        }

        public int hashCode() {
            return 1046549224;
        }
    }

    public final class DownloadFailed implements AuraBugReportReviewViewEffect {
        public static final int $stable = 0;
        public static final DownloadFailed INSTANCE = new DownloadFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DownloadFailed);
        }

        public String toString() {
            return "DownloadFailed";
        }

        public int hashCode() {
            return -181802698;
        }
    }

    public final class DownloadSucceeded implements AuraBugReportReviewViewEffect {
        public static final int $stable = 0;
        public static final DownloadSucceeded INSTANCE = new DownloadSucceeded();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DownloadSucceeded);
        }

        public String toString() {
            return "DownloadSucceeded";
        }

        public int hashCode() {
            return 1351360200;
        }
    }

    public final class ReplaceFailed implements AuraBugReportReviewViewEffect {
        public static final int $stable = 0;
        public static final ReplaceFailed INSTANCE = new ReplaceFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReplaceFailed);
        }

        public String toString() {
            return "ReplaceFailed";
        }

        public int hashCode() {
            return 1077651360;
        }
    }

    public final class ReplaceSucceeded implements AuraBugReportReviewViewEffect {
        public static final int $stable = 0;
        public static final ReplaceSucceeded INSTANCE = new ReplaceSucceeded();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReplaceSucceeded);
        }

        public String toString() {
            return "ReplaceSucceeded";
        }

        public int hashCode() {
            return 912904222;
        }
    }

    public final class ReplaceTooLarge implements AuraBugReportReviewViewEffect {
        public static final int $stable = 0;
        public static final ReplaceTooLarge INSTANCE = new ReplaceTooLarge();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReplaceTooLarge);
        }

        public String toString() {
            return "ReplaceTooLarge";
        }

        public int hashCode() {
            return -1152350998;
        }
    }
}
