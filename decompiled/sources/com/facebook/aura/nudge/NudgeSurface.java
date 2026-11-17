package com.facebook.aura.nudge;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NudgeSurface {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NudgeSurface[] $VALUES;
    public static final NudgeSurface PHONE;
    public static final NudgeSurface WATCH;

    static {
        NudgeSurface nudgeSurface = new NudgeSurface("PHONE", 0);
        PHONE = nudgeSurface;
        NudgeSurface nudgeSurface2 = new NudgeSurface("WATCH", 1);
        WATCH = nudgeSurface2;
        NudgeSurface[] nudgeSurfaceArr = {nudgeSurface, nudgeSurface2};
        $VALUES = nudgeSurfaceArr;
        $ENTRIES = C3cG.A0w(nudgeSurfaceArr);
    }

    public static Ey9<NudgeSurface> getEntries() {
        return $ENTRIES;
    }

    public static NudgeSurface valueOf(String str) {
        return (NudgeSurface) Enum.valueOf(NudgeSurface.class, str);
    }

    public static NudgeSurface[] values() {
        return (NudgeSurface[]) $VALUES.clone();
    }

    public NudgeSurface(String str, int i) {
    }
}
