package com.facebook.aura.vds.compose.divider;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;

/* loaded from: classes.dex */
public interface AuraDividerStyle {

    public final class Elevated implements AuraDividerStyle {
        public static final int $stable = 0;
        public static final Elevated INSTANCE = new Elevated();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Elevated);
        }

        @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
        /* renamed from: thickness-D9Ej5fM */
        public /* bridge */ float mo2535thicknessD9Ej5fM() {
            return 1.0f;
        }

        public String toString() {
            return "Elevated";
        }

        @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
        /* renamed from: color-WaAFU9c */
        public long mo2534colorWaAFU9c(BFM bfm, int i) {
            long j = AnonymousClass003.A0c(bfm, -643334923).elevatedBorder;
            AnonymousClass002.A19(bfm);
            return j;
        }

        public int hashCode() {
            return -1155760653;
        }
    }

    public final class Media implements AuraDividerStyle {
        public static final int $stable = 0;
        public static final Media INSTANCE = new Media();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Media);
        }

        @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
        /* renamed from: thickness-D9Ej5fM */
        public /* bridge */ float mo2535thicknessD9Ej5fM() {
            return 1.0f;
        }

        public String toString() {
            return "Media";
        }

        @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
        /* renamed from: color-WaAFU9c */
        public long mo2534colorWaAFU9c(BFM bfm, int i) {
            long j = AnonymousClass003.A0c(bfm, -65596471).tertiaryText;
            AnonymousClass002.A19(bfm);
            return j;
        }

        public int hashCode() {
            return 572429883;
        }
    }

    public final class Outline implements AuraDividerStyle {
        public static final int $stable = 0;
        public static final Outline INSTANCE = new Outline();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Outline);
        }

        @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
        /* renamed from: thickness-D9Ej5fM */
        public /* bridge */ float mo2535thicknessD9Ej5fM() {
            return 1.0f;
        }

        public String toString() {
            return "Outline";
        }

        @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
        /* renamed from: color-WaAFU9c */
        public long mo2534colorWaAFU9c(BFM bfm, int i) {
            long j = AnonymousClass003.A0c(bfm, 1750982763).highlight;
            AnonymousClass002.A19(bfm);
            return j;
        }

        public int hashCode() {
            return -1697712935;
        }
    }

    public final class Primary implements AuraDividerStyle {
        public static final int $stable = 0;
        public static final Primary INSTANCE = new Primary();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Primary);
        }

        @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
        /* renamed from: thickness-D9Ej5fM */
        public /* bridge */ float mo2535thicknessD9Ej5fM() {
            return 1.0f;
        }

        public String toString() {
            return "Primary";
        }

        @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
        /* renamed from: color-WaAFU9c */
        public long mo2534colorWaAFU9c(BFM bfm, int i) {
            long j = AnonymousClass003.A0c(bfm, -1366297941).border;
            AnonymousClass002.A19(bfm);
            return j;
        }

        public int hashCode() {
            return -906233191;
        }
    }

    public final class Secondary implements AuraDividerStyle {
        public static final int $stable = 0;
        public static final Secondary INSTANCE = new Secondary();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Secondary);
        }

        @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
        /* renamed from: thickness-D9Ej5fM */
        public /* bridge */ float mo2535thicknessD9Ej5fM() {
            return 1.0f;
        }

        public String toString() {
            return "Secondary";
        }

        @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
        /* renamed from: color-WaAFU9c */
        public long mo2534colorWaAFU9c(BFM bfm, int i) {
            long j = AnonymousClass003.A0c(bfm, 337344697).border;
            AnonymousClass002.A19(bfm);
            return j;
        }

        public int hashCode() {
            return 2012910667;
        }
    }

    /* renamed from: color-WaAFU9c, reason: not valid java name */
    long mo2534colorWaAFU9c(BFM bfm, int i);

    /* renamed from: thickness-D9Ej5fM, reason: not valid java name */
    float mo2535thicknessD9Ej5fM();

    /* renamed from: com.facebook.aura.vds.compose.divider.AuraDividerStyle$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* renamed from: $default$thickness-D9Ej5fM, reason: not valid java name */
        public static float m2536$default$thicknessD9Ej5fM(AuraDividerStyle auraDividerStyle) {
            return 1.0f;
        }

        /* renamed from: access$thickness-D9Ej5fM$jd, reason: not valid java name */
        public static /* synthetic */ float m2537access$thicknessD9Ej5fM$jd(AuraDividerStyle auraDividerStyle) {
            return 1.0f;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        /* renamed from: thickness-D9Ej5fM, reason: not valid java name */
        public static float m2538thicknessD9Ej5fM(AuraDividerStyle auraDividerStyle) {
            return 1.0f;
        }
    }
}
