package com.facebook.aura.nudge;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NudgePresentation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NudgePresentation[] $VALUES;
    public static final NudgePresentation CARD;
    public static final NudgePresentation SHEET;

    static {
        NudgePresentation nudgePresentation = new NudgePresentation("CARD", 0);
        CARD = nudgePresentation;
        NudgePresentation nudgePresentation2 = new NudgePresentation("SHEET", 1);
        SHEET = nudgePresentation2;
        NudgePresentation[] nudgePresentationArr = {nudgePresentation, nudgePresentation2};
        $VALUES = nudgePresentationArr;
        $ENTRIES = new F3w(nudgePresentationArr);
    }

    public static Ey9<NudgePresentation> getEntries() {
        return $ENTRIES;
    }

    public static NudgePresentation valueOf(String str) {
        return (NudgePresentation) Enum.valueOf(NudgePresentation.class, str);
    }

    public static NudgePresentation[] values() {
        return (NudgePresentation[]) $VALUES.clone();
    }

    public NudgePresentation(String str, int i) {
    }
}
