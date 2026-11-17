package com.facebook.aura.pairs;

/* loaded from: classes3.dex */
public interface PairsGuidanceEffect {

    public final class NotSaved implements PairsGuidanceEffect {
        public static final int $stable = 0;
        public static final NotSaved INSTANCE = new NotSaved();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotSaved);
        }

        public String toString() {
            return "NotSaved";
        }

        public int hashCode() {
            return -1456002331;
        }
    }

    public final class Saved implements PairsGuidanceEffect {
        public static final int $stable = 0;
        public static final Saved INSTANCE = new Saved();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Saved);
        }

        public String toString() {
            return "Saved";
        }

        public int hashCode() {
            return -1239023434;
        }
    }
}
