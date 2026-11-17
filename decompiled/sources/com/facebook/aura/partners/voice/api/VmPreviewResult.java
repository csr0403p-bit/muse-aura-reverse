package com.facebook.aura.partners.voice.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VmPreviewResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VmPreviewResult[] $VALUES;
    public static final VmPreviewResult BROKE_OFF;
    public static final VmPreviewResult COMPLETED;
    public static final VmPreviewResult NO_AUDIO;

    static {
        VmPreviewResult vmPreviewResult = new VmPreviewResult("COMPLETED", 0);
        COMPLETED = vmPreviewResult;
        VmPreviewResult vmPreviewResult2 = new VmPreviewResult("BROKE_OFF", 1);
        BROKE_OFF = vmPreviewResult2;
        VmPreviewResult vmPreviewResult3 = new VmPreviewResult("NO_AUDIO", 2);
        NO_AUDIO = vmPreviewResult3;
        VmPreviewResult[] vmPreviewResultArr = {vmPreviewResult, vmPreviewResult2, vmPreviewResult3};
        $VALUES = vmPreviewResultArr;
        $ENTRIES = C3cG.A0w(vmPreviewResultArr);
    }

    public static Ey9<VmPreviewResult> getEntries() {
        return $ENTRIES;
    }

    public static VmPreviewResult valueOf(String str) {
        return (VmPreviewResult) Enum.valueOf(VmPreviewResult.class, str);
    }

    public static VmPreviewResult[] values() {
        return (VmPreviewResult[]) $VALUES.clone();
    }

    public VmPreviewResult(String str, int i) {
    }
}
