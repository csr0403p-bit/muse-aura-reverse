package com.meta.maps.fancypins;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AnchorReference {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AnchorReference[] $VALUES;
    public static final AnchorReference PART;
    public static final AnchorReference PIN_CENTER;
    public final String jsonValue;

    static {
        AnchorReference anchorReference = new AnchorReference("PIN_CENTER", 0, "pinCenter");
        PIN_CENTER = anchorReference;
        AnchorReference anchorReference2 = new AnchorReference("PART", 1, "part");
        PART = anchorReference2;
        AnchorReference[] anchorReferenceArr = {anchorReference, anchorReference2};
        $VALUES = anchorReferenceArr;
        $ENTRIES = C3cG.A0w(anchorReferenceArr);
    }

    public static Ey9<AnchorReference> getEntries() {
        return $ENTRIES;
    }

    public static AnchorReference valueOf(String str) {
        return (AnchorReference) Enum.valueOf(AnchorReference.class, str);
    }

    public static AnchorReference[] values() {
        return (AnchorReference[]) $VALUES.clone();
    }

    public final String getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.jsonValue;
    }

    public AnchorReference(String str, int i, String str2) {
        this.jsonValue = str2;
    }
}
