package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class InputRefusalReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ InputRefusalReason[] $VALUES;
    public static final Companion Companion;
    public static final InputRefusalReason DEGENERATE_OWNER;
    public static final InputRefusalReason DISABLED;
    public static final InputRefusalReason FOCUS_ESCAPED;
    public static final InputRefusalReason NOT_EDITABLE;
    public static final InputRefusalReason NOT_VISIBLE;
    public static final InputRefusalReason OBSCURED;
    public static final InputRefusalReason TIMEOUT;
    public static final InputRefusalReason UNSTABLE;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        InputRefusalReason inputRefusalReason = new InputRefusalReason("NOT_VISIBLE", 0);
        NOT_VISIBLE = inputRefusalReason;
        InputRefusalReason inputRefusalReason2 = new InputRefusalReason("DISABLED", 1);
        DISABLED = inputRefusalReason2;
        InputRefusalReason inputRefusalReason3 = new InputRefusalReason("NOT_EDITABLE", 2);
        NOT_EDITABLE = inputRefusalReason3;
        InputRefusalReason inputRefusalReason4 = new InputRefusalReason("UNSTABLE", 3);
        UNSTABLE = inputRefusalReason4;
        InputRefusalReason inputRefusalReason5 = new InputRefusalReason("TIMEOUT", 4);
        TIMEOUT = inputRefusalReason5;
        InputRefusalReason inputRefusalReason6 = new InputRefusalReason("DEGENERATE_OWNER", 5);
        DEGENERATE_OWNER = inputRefusalReason6;
        InputRefusalReason inputRefusalReason7 = new InputRefusalReason("OBSCURED", 6);
        OBSCURED = inputRefusalReason7;
        InputRefusalReason inputRefusalReason8 = new InputRefusalReason("FOCUS_ESCAPED", 7);
        FOCUS_ESCAPED = inputRefusalReason8;
        InputRefusalReason[] inputRefusalReasonArr = {inputRefusalReason, inputRefusalReason2, inputRefusalReason3, inputRefusalReason4, inputRefusalReason5, inputRefusalReason6, inputRefusalReason7, inputRefusalReason8};
        $VALUES = inputRefusalReasonArr;
        $ENTRIES = C3cG.A0w(inputRefusalReasonArr);
        Companion = new Companion();
    }

    public static Ey9<InputRefusalReason> getEntries() {
        return $ENTRIES;
    }

    public static InputRefusalReason valueOf(String str) {
        return (InputRefusalReason) Enum.valueOf(InputRefusalReason.class, str);
    }

    public static InputRefusalReason[] values() {
        return (InputRefusalReason[]) $VALUES.clone();
    }

    public InputRefusalReason(String str, int i) {
    }
}
