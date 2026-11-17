package com.facebook.aura.tabs;

/* loaded from: classes.dex */
public interface TabBadgeType {

    public final class Lightup implements TabBadgeType {
        public static final int $stable = 0;
        public static final Lightup INSTANCE = new Lightup();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Lightup);
        }

        public String toString() {
            return "Lightup";
        }

        public int hashCode() {
            return -1141497845;
        }
    }

    public final class NotificationDot implements TabBadgeType {
        public static final int $stable = 0;
        public static final NotificationDot INSTANCE = new NotificationDot();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotificationDot);
        }

        public String toString() {
            return "NotificationDot";
        }

        public int hashCode() {
            return 1690150968;
        }
    }

    public final class Wave implements TabBadgeType {
        public static final int $stable = 0;
        public static final Wave INSTANCE = new Wave();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Wave);
        }

        public String toString() {
            return "Wave";
        }

        public int hashCode() {
            return -1787713697;
        }
    }
}
