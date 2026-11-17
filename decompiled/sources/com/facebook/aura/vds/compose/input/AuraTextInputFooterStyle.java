package com.facebook.aura.vds.compose.input;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BFM;
import X.C1822Arm;

/* loaded from: classes.dex */
public interface AuraTextInputFooterStyle {

    public final class Error implements AuraTextInputFooterStyle {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public String toString() {
            return "Error";
        }

        @Override // com.facebook.aura.vds.compose.input.AuraTextInputFooterStyle
        /* renamed from: color-WaAFU9c */
        public long mo2588colorWaAFU9c(BFM bfm, int i) {
            long j = AnonymousClass003.A0c(bfm, -496939250).error;
            AnonymousClass002.A19(bfm);
            return j;
        }

        @Override // com.facebook.aura.vds.compose.input.AuraTextInputFooterStyle
        public C1822Arm style(BFM bfm, int i) {
            C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, -1946029541).footnoteRegular;
            AnonymousClass002.A19(bfm);
            return c1822Arm;
        }

        public int hashCode() {
            return -541914897;
        }
    }

    public final class Normal implements AuraTextInputFooterStyle {
        public static final int $stable = 0;
        public static final Normal INSTANCE = new Normal();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Normal);
        }

        public String toString() {
            return "Normal";
        }

        @Override // com.facebook.aura.vds.compose.input.AuraTextInputFooterStyle
        /* renamed from: color-WaAFU9c */
        public long mo2588colorWaAFU9c(BFM bfm, int i) {
            long j = AnonymousClass003.A0c(bfm, -1636932799).secondaryText;
            AnonymousClass002.A19(bfm);
            return j;
        }

        @Override // com.facebook.aura.vds.compose.input.AuraTextInputFooterStyle
        public C1822Arm style(BFM bfm, int i) {
            C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, 685908436).footnoteRegular;
            AnonymousClass002.A19(bfm);
            return c1822Arm;
        }

        public int hashCode() {
            return 635396832;
        }
    }

    /* renamed from: color-WaAFU9c, reason: not valid java name */
    long mo2588colorWaAFU9c(BFM bfm, int i);

    C1822Arm style(BFM bfm, int i);
}
