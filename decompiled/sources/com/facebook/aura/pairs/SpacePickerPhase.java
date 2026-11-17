package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SpacePickerPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SpacePickerPhase[] $VALUES;
    public static final SpacePickerPhase FAILED;
    public static final SpacePickerPhase LOADING;
    public static final SpacePickerPhase READY;

    static {
        SpacePickerPhase spacePickerPhase = new SpacePickerPhase("LOADING", 0);
        LOADING = spacePickerPhase;
        SpacePickerPhase spacePickerPhase2 = new SpacePickerPhase(CvmMigrationStatusJson.STAGE_FAILED, 1);
        FAILED = spacePickerPhase2;
        SpacePickerPhase spacePickerPhase3 = new SpacePickerPhase("READY", 2);
        READY = spacePickerPhase3;
        SpacePickerPhase[] spacePickerPhaseArr = {spacePickerPhase, spacePickerPhase2, spacePickerPhase3};
        $VALUES = spacePickerPhaseArr;
        $ENTRIES = C3cG.A0w(spacePickerPhaseArr);
    }

    public static Ey9<SpacePickerPhase> getEntries() {
        return $ENTRIES;
    }

    public static SpacePickerPhase valueOf(String str) {
        return (SpacePickerPhase) Enum.valueOf(SpacePickerPhase.class, str);
    }

    public static SpacePickerPhase[] values() {
        return (SpacePickerPhase[]) $VALUES.clone();
    }

    public SpacePickerPhase(String str, int i) {
    }
}
