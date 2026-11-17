package com.facebook.aura.conversation.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchPendingFileActionType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchPendingFileActionType[] $VALUES;
    public static final HatchPendingFileActionType DOWNLOAD;
    public static final HatchPendingFileActionType DOWNLOAD_AS_HTML;
    public static final HatchPendingFileActionType DOWNLOAD_AS_PDF;
    public static final HatchPendingFileActionType SAVE_TO_DRIVE;
    public static final HatchPendingFileActionType SHARE;

    static {
        HatchPendingFileActionType hatchPendingFileActionType = new HatchPendingFileActionType("SHARE", 0);
        SHARE = hatchPendingFileActionType;
        HatchPendingFileActionType hatchPendingFileActionType2 = new HatchPendingFileActionType("SAVE_TO_DRIVE", 1);
        SAVE_TO_DRIVE = hatchPendingFileActionType2;
        HatchPendingFileActionType hatchPendingFileActionType3 = new HatchPendingFileActionType("DOWNLOAD", 2);
        DOWNLOAD = hatchPendingFileActionType3;
        HatchPendingFileActionType hatchPendingFileActionType4 = new HatchPendingFileActionType("DOWNLOAD_AS_PDF", 3);
        DOWNLOAD_AS_PDF = hatchPendingFileActionType4;
        HatchPendingFileActionType hatchPendingFileActionType5 = new HatchPendingFileActionType("DOWNLOAD_AS_HTML", 4);
        DOWNLOAD_AS_HTML = hatchPendingFileActionType5;
        HatchPendingFileActionType[] hatchPendingFileActionTypeArr = {hatchPendingFileActionType, hatchPendingFileActionType2, hatchPendingFileActionType3, hatchPendingFileActionType4, hatchPendingFileActionType5};
        $VALUES = hatchPendingFileActionTypeArr;
        $ENTRIES = new F3w(hatchPendingFileActionTypeArr);
    }

    public static Ey9<HatchPendingFileActionType> getEntries() {
        return $ENTRIES;
    }

    public static HatchPendingFileActionType valueOf(String str) {
        return (HatchPendingFileActionType) Enum.valueOf(HatchPendingFileActionType.class, str);
    }

    public static HatchPendingFileActionType[] values() {
        return (HatchPendingFileActionType[]) $VALUES.clone();
    }

    public HatchPendingFileActionType(String str, int i) {
    }
}
