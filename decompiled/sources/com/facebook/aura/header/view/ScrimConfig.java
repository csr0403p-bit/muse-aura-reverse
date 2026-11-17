package com.facebook.aura.header.view;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C1DG;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import X.HxE;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface ScrimConfig {

    public final class CustomStops extends C06G implements ScrimConfig {
        public static final int $stable = 0;
        public final HxE<Float, B6A>[] colorStops;

        public CustomStops(HxE<Float, B6A>[] hxEArr) {
            C7384Etj.A0Y(hxEArr, 0);
            this.colorStops = hxEArr;
        }

        public final CustomStops copy(HxE<Float, B6A>[] hxEArr) {
            C7384Etj.A0Y(hxEArr, 0);
            return new CustomStops(hxEArr);
        }

        public static /* synthetic */ CustomStops copy$default(CustomStops customStops, HxE[] hxEArr, int i, Object obj) {
            if ((i & 1) != 0) {
                hxEArr = customStops.colorStops;
            }
            C7384Etj.A0Y(hxEArr, 0);
            return new CustomStops(hxEArr);
        }

        public final HxE<Float, B6A>[] component1() {
            return this.colorStops;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!getClass().equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            HxE<Float, B6A>[] hxEArr = this.colorStops;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.aura.header.view.ScrimConfig.CustomStops");
            return Arrays.equals(hxEArr, ((CustomStops) obj).colorStops);
        }

        public final HxE<Float, B6A>[] getColorStops() {
            return this.colorStops;
        }

        public int hashCode() {
            return Arrays.hashCode(this.colorStops);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Heavy extends C06G implements ScrimConfig {
        public static final int $stable = 0;
        public final long color;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Heavy) {
                    long j = this.color;
                    long j2 = ((Heavy) obj).color;
                    long j3 = B6A.A01;
                    if (j == j2) {
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ Heavy m1038copy8_81llA$default(Heavy heavy, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = heavy.color;
            }
            return new Heavy(j);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m1039component10d7_KjU() {
            return this.color;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final Heavy m1040copy8_81llA(long j) {
            return new Heavy(j);
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m1041getColor0d7_KjU() {
            return this.color;
        }

        public int hashCode() {
            long j = this.color;
            long j2 = B6A.A01;
            return AnonymousClass002.A0A(j);
        }

        public /* synthetic */ Heavy(long j, C06H c06h) {
            this(j);
        }

        public String toString() {
            return super.toString();
        }

        public Heavy(long j) {
            this.color = j;
        }
    }

    public final class ScrollAware extends C06G implements ScrimConfig {
        public static final int $stable = 0;
        public final long color;
        public final float scrollThreshold;
        public final Variant variant;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Variant {
            public static final /* synthetic */ Ey9 $ENTRIES;
            public static final /* synthetic */ Variant[] $VALUES;
            public static final Variant HEAVY;
            public static final Variant STANDARD;

            static {
                Variant variant = new Variant("STANDARD", 0);
                STANDARD = variant;
                Variant variant2 = new Variant("HEAVY", 1);
                HEAVY = variant2;
                Variant[] variantArr = {variant, variant2};
                $VALUES = variantArr;
                $ENTRIES = new F3w(variantArr);
            }

            public static Ey9<Variant> getEntries() {
                return $ENTRIES;
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) $VALUES.clone();
            }

            public Variant(String str, int i) {
            }
        }

        public ScrollAware(long j, Variant variant, float f) {
            C7384Etj.A0Y(variant, 1);
            this.color = j;
            this.variant = variant;
            this.scrollThreshold = f;
        }

        /* renamed from: copy-gMqxd7g, reason: not valid java name */
        public final ScrollAware m1045copygMqxd7g(long j, Variant variant, float f) {
            C7384Etj.A0Y(variant, 1);
            return new ScrollAware(j, variant, f);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ScrollAware) {
                    ScrollAware scrollAware = (ScrollAware) obj;
                    long j = this.color;
                    long j2 = scrollAware.color;
                    long j3 = B6A.A01;
                    if (j != j2 || this.variant != scrollAware.variant || !C1DG.A08(this.scrollThreshold, scrollAware.scrollThreshold)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: copy-gMqxd7g$default, reason: not valid java name */
        public static /* synthetic */ ScrollAware m1042copygMqxd7g$default(ScrollAware scrollAware, long j, Variant variant, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                j = scrollAware.color;
            }
            if ((i & 2) != 0) {
                variant = scrollAware.variant;
            }
            if ((i & 4) != 0) {
                f = scrollAware.scrollThreshold;
            }
            return scrollAware.m1045copygMqxd7g(j, variant, f);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m1043component10d7_KjU() {
            return this.color;
        }

        public final Variant component2() {
            return this.variant;
        }

        /* renamed from: component3-D9Ej5fM, reason: not valid java name */
        public final float m1044component3D9Ej5fM() {
            return this.scrollThreshold;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m1046getColor0d7_KjU() {
            return this.color;
        }

        /* renamed from: getScrollThreshold-D9Ej5fM, reason: not valid java name */
        public final float m1047getScrollThresholdD9Ej5fM() {
            return this.scrollThreshold;
        }

        public final Variant getVariant() {
            return this.variant;
        }

        public int hashCode() {
            long j = this.color;
            long j2 = B6A.A01;
            return AnonymousClass005.A0F(this.variant, AnonymousClass002.A0A(j) * 31) + Float.floatToIntBits(this.scrollThreshold);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ScrollAware(long j, Variant variant, float f, int i, C06H c06h) {
            this(j, (i & 2) != 0 ? Variant.STANDARD : variant, (i & 4) != 0 ? ScrimScrollConnectionKt.ScrimScrollThreshold : f);
        }

        public /* synthetic */ ScrollAware(long j, Variant variant, float f, C06H c06h) {
            this(j, variant, f);
        }
    }

    public final class Standard extends C06G implements ScrimConfig {
        public static final int $stable = 0;
        public final long color;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Standard) {
                    long j = this.color;
                    long j2 = ((Standard) obj).color;
                    long j3 = B6A.A01;
                    if (j == j2) {
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ Standard m1048copy8_81llA$default(Standard standard, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = standard.color;
            }
            return new Standard(j);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m1049component10d7_KjU() {
            return this.color;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final Standard m1050copy8_81llA(long j) {
            return new Standard(j);
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m1051getColor0d7_KjU() {
            return this.color;
        }

        public int hashCode() {
            long j = this.color;
            long j2 = B6A.A01;
            return AnonymousClass002.A0A(j);
        }

        public /* synthetic */ Standard(long j, C06H c06h) {
            this(j);
        }

        public String toString() {
            return super.toString();
        }

        public Standard(long j) {
            this.color = j;
        }
    }
}
