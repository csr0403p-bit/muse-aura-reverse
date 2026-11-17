package com.facebook.aura.shopping.model;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PdpVariantDimensionKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PdpVariantDimensionKind[] $VALUES;
    public static final PdpVariantDimensionKind COLOR;
    public static final PdpVariantDimensionKind SIZE;

    static {
        PdpVariantDimensionKind pdpVariantDimensionKind = new PdpVariantDimensionKind("COLOR", 0);
        COLOR = pdpVariantDimensionKind;
        PdpVariantDimensionKind pdpVariantDimensionKind2 = new PdpVariantDimensionKind("SIZE", 1);
        SIZE = pdpVariantDimensionKind2;
        PdpVariantDimensionKind[] pdpVariantDimensionKindArr = {pdpVariantDimensionKind, pdpVariantDimensionKind2};
        $VALUES = pdpVariantDimensionKindArr;
        $ENTRIES = C3cG.A0w(pdpVariantDimensionKindArr);
    }

    public static Ey9<PdpVariantDimensionKind> getEntries() {
        return $ENTRIES;
    }

    public static PdpVariantDimensionKind valueOf(String str) {
        return (PdpVariantDimensionKind) Enum.valueOf(PdpVariantDimensionKind.class, str);
    }

    public static PdpVariantDimensionKind[] values() {
        return (PdpVariantDimensionKind[]) $VALUES.clone();
    }

    public PdpVariantDimensionKind(String str, int i) {
    }
}
