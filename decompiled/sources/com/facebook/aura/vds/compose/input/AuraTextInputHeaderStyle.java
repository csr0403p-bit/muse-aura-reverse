package com.facebook.aura.vds.compose.input;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BFM;
import X.C1822Arm;

/* loaded from: classes.dex */
public interface AuraTextInputHeaderStyle {

    public final class Primary implements AuraTextInputHeaderStyle {
        public static final int $stable = 0;
        public static final Primary INSTANCE = new Primary();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Primary);
        }

        public String toString() {
            return "Primary";
        }

        @Override // com.facebook.aura.vds.compose.input.AuraTextInputHeaderStyle
        /* renamed from: color-WaAFU9c */
        public long mo2589colorWaAFU9c(BFM bfm, int i) {
            long j = AnonymousClass003.A0c(bfm, 741835874).primaryText;
            AnonymousClass002.A19(bfm);
            return j;
        }

        @Override // com.facebook.aura.vds.compose.input.AuraTextInputHeaderStyle
        public C1822Arm style(BFM bfm, int i) {
            C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, -264529873).subheadlineMedium;
            AnonymousClass002.A19(bfm);
            return c1822Arm;
        }

        public int hashCode() {
            return 1874006903;
        }
    }

    public final class Secondary implements AuraTextInputHeaderStyle {
        public static final int $stable = 0;
        public static final Secondary INSTANCE = new Secondary();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Secondary);
        }

        public String toString() {
            return "Secondary";
        }

        @Override // com.facebook.aura.vds.compose.input.AuraTextInputHeaderStyle
        /* renamed from: color-WaAFU9c */
        public long mo2589colorWaAFU9c(BFM bfm, int i) {
            long j = AnonymousClass003.A0c(bfm, -80317200).secondaryText;
            AnonymousClass002.A19(bfm);
            return j;
        }

        @Override // com.facebook.aura.vds.compose.input.AuraTextInputHeaderStyle
        public C1822Arm style(BFM bfm, int i) {
            C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, -830158467).footnoteRegular;
            AnonymousClass002.A19(bfm);
            return c1822Arm;
        }

        public int hashCode() {
            return -1940984407;
        }
    }

    /* renamed from: color-WaAFU9c, reason: not valid java name */
    long mo2589colorWaAFU9c(BFM bfm, int i);

    C1822Arm style(BFM bfm, int i);
}
