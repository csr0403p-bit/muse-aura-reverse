package com.facebook.aura.composer.dictation.voyager;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class VoyagerAsrMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoyagerAsrMode[] $VALUES;
    public static final VoyagerAsrMode ENDPOINTING;
    public static final VoyagerAsrMode PUSH_TO_TALK;
    public final String wireValue;

    static {
        VoyagerAsrMode voyagerAsrMode = new VoyagerAsrMode("PUSH_TO_TALK", 0, "PUSH_TO_TALK");
        PUSH_TO_TALK = voyagerAsrMode;
        VoyagerAsrMode voyagerAsrMode2 = new VoyagerAsrMode("ENDPOINTING", 1, "ENDPOINTING");
        ENDPOINTING = voyagerAsrMode2;
        VoyagerAsrMode[] voyagerAsrModeArr = {voyagerAsrMode, voyagerAsrMode2};
        $VALUES = voyagerAsrModeArr;
        $ENTRIES = C3cG.A0w(voyagerAsrModeArr);
    }

    public static Ey9<VoyagerAsrMode> getEntries() {
        return $ENTRIES;
    }

    public static VoyagerAsrMode valueOf(String str) {
        return (VoyagerAsrMode) Enum.valueOf(VoyagerAsrMode.class, str);
    }

    public static VoyagerAsrMode[] values() {
        return (VoyagerAsrMode[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public VoyagerAsrMode(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
