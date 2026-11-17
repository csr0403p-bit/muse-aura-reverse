package com.facebook.aura.vds.compose.divider;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;

/* loaded from: classes.dex */
public final class AuraRowDividerStyle implements AuraDividerStyle {
    public static final AuraRowDividerStyle INSTANCE = new AuraRowDividerStyle();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AuraRowDividerStyle);
    }

    @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
    /* renamed from: thickness-D9Ej5fM */
    public /* bridge */ float mo2535thicknessD9Ej5fM() {
        return 1.0f;
    }

    public String toString() {
        return "AuraRowDividerStyle";
    }

    @Override // com.facebook.aura.vds.compose.divider.AuraDividerStyle
    /* renamed from: color-WaAFU9c */
    public long mo2534colorWaAFU9c(BFM bfm, int i) {
        long j = AnonymousClass003.A0c(bfm, -1048959185).fillDivider;
        AnonymousClass002.A19(bfm);
        return j;
    }

    public int hashCode() {
        return -1196664219;
    }
}
