package com.facebook.aura.library.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NestRejectionReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NestRejectionReason[] $VALUES;
    public static final NestRejectionReason ALREADY_CHILD;
    public static final NestRejectionReason CROSS_SECTION_DISABLED;
    public static final NestRejectionReason NO_TARGET;
    public static final NestRejectionReason SAME_ROW;
    public static final NestRejectionReason SOURCE_HAS_CHILDREN;
    public static final NestRejectionReason SOURCE_NOT_FOUND;
    public static final NestRejectionReason TARGET_NOT_ROOT;

    static {
        NestRejectionReason nestRejectionReason = new NestRejectionReason("NO_TARGET", 0);
        NO_TARGET = nestRejectionReason;
        NestRejectionReason nestRejectionReason2 = new NestRejectionReason("TARGET_NOT_ROOT", 1);
        TARGET_NOT_ROOT = nestRejectionReason2;
        NestRejectionReason nestRejectionReason3 = new NestRejectionReason("SOURCE_NOT_FOUND", 2);
        SOURCE_NOT_FOUND = nestRejectionReason3;
        NestRejectionReason nestRejectionReason4 = new NestRejectionReason("SAME_ROW", 3);
        SAME_ROW = nestRejectionReason4;
        NestRejectionReason nestRejectionReason5 = new NestRejectionReason("ALREADY_CHILD", 4);
        ALREADY_CHILD = nestRejectionReason5;
        NestRejectionReason nestRejectionReason6 = new NestRejectionReason("SOURCE_HAS_CHILDREN", 5);
        SOURCE_HAS_CHILDREN = nestRejectionReason6;
        NestRejectionReason nestRejectionReason7 = new NestRejectionReason("CROSS_SECTION_DISABLED", 6);
        CROSS_SECTION_DISABLED = nestRejectionReason7;
        NestRejectionReason[] nestRejectionReasonArr = {nestRejectionReason, nestRejectionReason2, nestRejectionReason3, nestRejectionReason4, nestRejectionReason5, nestRejectionReason6, nestRejectionReason7};
        $VALUES = nestRejectionReasonArr;
        $ENTRIES = C3cG.A0w(nestRejectionReasonArr);
    }

    public static Ey9<NestRejectionReason> getEntries() {
        return $ENTRIES;
    }

    public static NestRejectionReason valueOf(String str) {
        return (NestRejectionReason) Enum.valueOf(NestRejectionReason.class, str);
    }

    public static NestRejectionReason[] values() {
        return (NestRejectionReason[]) $VALUES.clone();
    }

    public NestRejectionReason(String str, int i) {
    }
}
