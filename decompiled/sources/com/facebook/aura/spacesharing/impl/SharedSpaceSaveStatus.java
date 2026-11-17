package com.facebook.aura.spacesharing.impl;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SharedSpaceSaveStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SharedSpaceSaveStatus[] $VALUES;
    public static final SharedSpaceSaveStatus ERROR;
    public static final SharedSpaceSaveStatus LOADING;
    public static final SharedSpaceSaveStatus READY;
    public static final SharedSpaceSaveStatus SAVED;
    public static final SharedSpaceSaveStatus SAVING;

    static {
        SharedSpaceSaveStatus sharedSpaceSaveStatus = new SharedSpaceSaveStatus("LOADING", 0);
        LOADING = sharedSpaceSaveStatus;
        SharedSpaceSaveStatus sharedSpaceSaveStatus2 = new SharedSpaceSaveStatus("READY", 1);
        READY = sharedSpaceSaveStatus2;
        SharedSpaceSaveStatus sharedSpaceSaveStatus3 = new SharedSpaceSaveStatus("SAVING", 2);
        SAVING = sharedSpaceSaveStatus3;
        SharedSpaceSaveStatus sharedSpaceSaveStatus4 = new SharedSpaceSaveStatus("SAVED", 3);
        SAVED = sharedSpaceSaveStatus4;
        SharedSpaceSaveStatus sharedSpaceSaveStatus5 = new SharedSpaceSaveStatus("ERROR", 4);
        ERROR = sharedSpaceSaveStatus5;
        SharedSpaceSaveStatus[] sharedSpaceSaveStatusArr = {sharedSpaceSaveStatus, sharedSpaceSaveStatus2, sharedSpaceSaveStatus3, sharedSpaceSaveStatus4, sharedSpaceSaveStatus5};
        $VALUES = sharedSpaceSaveStatusArr;
        $ENTRIES = C3cG.A0w(sharedSpaceSaveStatusArr);
    }

    public static Ey9<SharedSpaceSaveStatus> getEntries() {
        return $ENTRIES;
    }

    public static SharedSpaceSaveStatus valueOf(String str) {
        return (SharedSpaceSaveStatus) Enum.valueOf(SharedSpaceSaveStatus.class, str);
    }

    public static SharedSpaceSaveStatus[] values() {
        return (SharedSpaceSaveStatus[]) $VALUES.clone();
    }

    public SharedSpaceSaveStatus(String str, int i) {
    }
}
