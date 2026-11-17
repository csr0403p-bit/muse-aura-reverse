package com.facebook.aura.login.nativeflow;

/* loaded from: classes2.dex */
public interface PreloadsTosViewEffect {

    public final class Accepted implements PreloadsTosViewEffect {
        public static final int $stable = 0;
        public static final Accepted INSTANCE = new Accepted();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Accepted);
        }

        public String toString() {
            return "Accepted";
        }

        public int hashCode() {
            return -151364891;
        }
    }
}
