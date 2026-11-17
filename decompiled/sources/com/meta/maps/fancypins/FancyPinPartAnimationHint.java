package com.meta.maps.fancypins;

import X.FGI;

/* loaded from: classes6.dex */
public interface FancyPinPartAnimationHint {

    public final class Appear implements FancyPinPartAnimationHint {
        public final boolean animated;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Appear) && this.animated == ((Appear) obj).animated);
        }

        public static /* synthetic */ Appear copy$default(Appear appear, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = appear.animated;
            }
            return new Appear(z);
        }

        public final boolean component1() {
            return this.animated;
        }

        public final Appear copy(boolean z) {
            return new Appear(z);
        }

        public final boolean getAnimated() {
            return this.animated;
        }

        public int hashCode() {
            return this.animated ? 1231 : 1237;
        }

        public String toString() {
            return FGI.A0q("Appear(animated=", ")", this.animated);
        }

        public Appear(boolean z) {
            this.animated = z;
        }
    }

    public final class Disappear implements FancyPinPartAnimationHint {
        public static final Disappear INSTANCE = new Disappear();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Disappear);
        }

        public String toString() {
            return "Disappear";
        }

        public int hashCode() {
            return 1138217375;
        }
    }

    public final class None implements FancyPinPartAnimationHint {
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return 818790332;
        }
    }

    public final class PlacementChanged implements FancyPinPartAnimationHint {
        public static final PlacementChanged INSTANCE = new PlacementChanged();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PlacementChanged);
        }

        public String toString() {
            return "PlacementChanged";
        }

        public int hashCode() {
            return -708036973;
        }
    }

    public final class VariantTransition implements FancyPinPartAnimationHint {
        public static final VariantTransition INSTANCE = new VariantTransition();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VariantTransition);
        }

        public String toString() {
            return "VariantTransition";
        }

        public int hashCode() {
            return -259842634;
        }
    }
}
