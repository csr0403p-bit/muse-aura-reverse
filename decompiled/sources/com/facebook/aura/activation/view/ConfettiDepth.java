package com.facebook.aura.activation.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ConfettiDepth {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfettiDepth[] $VALUES;
    public static final ConfettiDepth BACKGROUND;
    public static final ConfettiDepth FOREGROUND;

    static {
        ConfettiDepth confettiDepth = new ConfettiDepth("BACKGROUND", 0);
        BACKGROUND = confettiDepth;
        ConfettiDepth confettiDepth2 = new ConfettiDepth("FOREGROUND", 1);
        FOREGROUND = confettiDepth2;
        ConfettiDepth[] confettiDepthArr = {confettiDepth, confettiDepth2};
        $VALUES = confettiDepthArr;
        $ENTRIES = C3cG.A0w(confettiDepthArr);
    }

    public static Ey9<ConfettiDepth> getEntries() {
        return $ENTRIES;
    }

    public static ConfettiDepth valueOf(String str) {
        return (ConfettiDepth) Enum.valueOf(ConfettiDepth.class, str);
    }

    public static ConfettiDepth[] values() {
        return (ConfettiDepth[]) $VALUES.clone();
    }

    public ConfettiDepth(String str, int i) {
    }
}
