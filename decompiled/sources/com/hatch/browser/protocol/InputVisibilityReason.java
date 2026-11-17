package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class InputVisibilityReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ InputVisibilityReason[] $VALUES;
    public static final Companion Companion;
    public static final InputVisibilityReason DETACHED;
    public static final InputVisibilityReason HIDDEN_STYLE;
    public static final InputVisibilityReason NOT_HITTABLE;
    public static final InputVisibilityReason OFFSCREEN_MOVING;
    public static final InputVisibilityReason OFFSCREEN_NO_PROGRESS;
    public static final InputVisibilityReason ZERO_AREA;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        InputVisibilityReason inputVisibilityReason = new InputVisibilityReason("OFFSCREEN_NO_PROGRESS", 0);
        OFFSCREEN_NO_PROGRESS = inputVisibilityReason;
        InputVisibilityReason inputVisibilityReason2 = new InputVisibilityReason("OFFSCREEN_MOVING", 1);
        OFFSCREEN_MOVING = inputVisibilityReason2;
        InputVisibilityReason inputVisibilityReason3 = new InputVisibilityReason("ZERO_AREA", 2);
        ZERO_AREA = inputVisibilityReason3;
        InputVisibilityReason inputVisibilityReason4 = new InputVisibilityReason("HIDDEN_STYLE", 3);
        HIDDEN_STYLE = inputVisibilityReason4;
        InputVisibilityReason inputVisibilityReason5 = new InputVisibilityReason("NOT_HITTABLE", 4);
        NOT_HITTABLE = inputVisibilityReason5;
        InputVisibilityReason inputVisibilityReason6 = new InputVisibilityReason("DETACHED", 5);
        DETACHED = inputVisibilityReason6;
        InputVisibilityReason[] inputVisibilityReasonArr = {inputVisibilityReason, inputVisibilityReason2, inputVisibilityReason3, inputVisibilityReason4, inputVisibilityReason5, inputVisibilityReason6};
        $VALUES = inputVisibilityReasonArr;
        $ENTRIES = C3cG.A0w(inputVisibilityReasonArr);
        Companion = new Companion();
    }

    public static Ey9<InputVisibilityReason> getEntries() {
        return $ENTRIES;
    }

    public static InputVisibilityReason valueOf(String str) {
        return (InputVisibilityReason) Enum.valueOf(InputVisibilityReason.class, str);
    }

    public static InputVisibilityReason[] values() {
        return (InputVisibilityReason[]) $VALUES.clone();
    }

    public InputVisibilityReason(String str, int i) {
    }
}
