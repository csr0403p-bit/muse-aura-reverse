package com.facebook.aura.partners.voice.chrome;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CallControlsCorner {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CallControlsCorner[] $VALUES;
    public static final CallControlsCorner BOTTOM_LEFT;
    public static final CallControlsCorner BOTTOM_RIGHT;
    public static final CallControlsCorner TOP_LEFT;
    public static final CallControlsCorner TOP_RIGHT;

    static {
        CallControlsCorner callControlsCorner = new CallControlsCorner("TOP_LEFT", 0);
        TOP_LEFT = callControlsCorner;
        CallControlsCorner callControlsCorner2 = new CallControlsCorner("TOP_RIGHT", 1);
        TOP_RIGHT = callControlsCorner2;
        CallControlsCorner callControlsCorner3 = new CallControlsCorner("BOTTOM_LEFT", 2);
        BOTTOM_LEFT = callControlsCorner3;
        CallControlsCorner callControlsCorner4 = new CallControlsCorner("BOTTOM_RIGHT", 3);
        BOTTOM_RIGHT = callControlsCorner4;
        CallControlsCorner[] callControlsCornerArr = {callControlsCorner, callControlsCorner2, callControlsCorner3, callControlsCorner4};
        $VALUES = callControlsCornerArr;
        $ENTRIES = C3cG.A0w(callControlsCornerArr);
    }

    public static Ey9<CallControlsCorner> getEntries() {
        return $ENTRIES;
    }

    public static CallControlsCorner valueOf(String str) {
        return (CallControlsCorner) Enum.valueOf(CallControlsCorner.class, str);
    }

    public static CallControlsCorner[] values() {
        return (CallControlsCorner[]) $VALUES.clone();
    }

    public CallControlsCorner(String str, int i) {
    }
}
