package com.facebook.aura.vds.compose.profilepicture;

import X.C06H;
import X.C1DG;
import X.FGI;

/* loaded from: classes.dex */
public final class AuraProfilePictureStyle {
    public static final float Small = 24.0f;
    public final float size;
    public static final Companion Companion = new Companion();
    public static final float XXLarge = 202.0f;
    public static final float XLarge = 88.0f;
    public static final float Large = 64.0f;
    public static final float Medium = 36.0f;

    public final class Companion {
        /* renamed from: getLarge-4yn1d7k, reason: not valid java name */
        public final float m2603getLarge4yn1d7k() {
            return AuraProfilePictureStyle.Large;
        }

        /* renamed from: getMedium-4yn1d7k, reason: not valid java name */
        public final float m2604getMedium4yn1d7k() {
            return AuraProfilePictureStyle.Medium;
        }

        /* renamed from: getSmall-4yn1d7k, reason: not valid java name */
        public final float m2605getSmall4yn1d7k() {
            return AuraProfilePictureStyle.Small;
        }

        /* renamed from: getXLarge-4yn1d7k, reason: not valid java name */
        public final float m2606getXLarge4yn1d7k() {
            return AuraProfilePictureStyle.XLarge;
        }

        /* renamed from: getXXLarge-4yn1d7k, reason: not valid java name */
        public final float m2607getXXLarge4yn1d7k() {
            return AuraProfilePictureStyle.XXLarge;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AuraProfilePictureStyle m2595boximpl(float f) {
        return new AuraProfilePictureStyle(f);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2597equalsimpl(float f, Object obj) {
        return (obj instanceof AuraProfilePictureStyle) && C1DG.A08(f, ((AuraProfilePictureStyle) obj).size);
    }

    public boolean equals(Object obj) {
        return m2597equalsimpl(this.size, obj);
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m2601getSizeD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.size);
    }

    public String toString() {
        return m2600toStringimpl(this.size);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m2602unboximpl() {
        return this.size;
    }

    public /* synthetic */ AuraProfilePictureStyle(float f) {
        this.size = f;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2598equalsimpl0(float f, float f2) {
        return C1DG.A08(f, f2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2599hashCodeimpl(float f) {
        return Float.floatToIntBits(f);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2600toStringimpl(float f) {
        return FGI.A0U("AuraProfilePictureStyle(size=", C1DG.A05(f), ")");
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m2596constructorimpl(float f) {
        return f;
    }
}
