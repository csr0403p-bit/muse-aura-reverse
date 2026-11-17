package com.facebook.aura.partners.wearables.linking;

/* loaded from: classes3.dex */
public interface WearablesLinkingViewEffect {

    public final class Linked implements WearablesLinkingViewEffect {
        public static final int $stable = 0;
        public static final Linked INSTANCE = new Linked();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Linked);
        }

        public String toString() {
            return "Linked";
        }

        public int hashCode() {
            return -1078599466;
        }
    }
}
