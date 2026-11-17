package com.facebook.aura.spaces.share;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SpaceShareLinkPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SpaceShareLinkPhase[] $VALUES;
    public static final SpaceShareLinkPhase CONFIRM_UNPUBLISH;
    public static final SpaceShareLinkPhase LOADING;
    public static final SpaceShareLinkPhase LOAD_FAILED;
    public static final SpaceShareLinkPhase READY;
    public static final SpaceShareLinkPhase UNPUBLISHED;

    static {
        SpaceShareLinkPhase spaceShareLinkPhase = new SpaceShareLinkPhase("LOADING", 0);
        LOADING = spaceShareLinkPhase;
        SpaceShareLinkPhase spaceShareLinkPhase2 = new SpaceShareLinkPhase("LOAD_FAILED", 1);
        LOAD_FAILED = spaceShareLinkPhase2;
        SpaceShareLinkPhase spaceShareLinkPhase3 = new SpaceShareLinkPhase("READY", 2);
        READY = spaceShareLinkPhase3;
        SpaceShareLinkPhase spaceShareLinkPhase4 = new SpaceShareLinkPhase("CONFIRM_UNPUBLISH", 3);
        CONFIRM_UNPUBLISH = spaceShareLinkPhase4;
        SpaceShareLinkPhase spaceShareLinkPhase5 = new SpaceShareLinkPhase("UNPUBLISHED", 4);
        UNPUBLISHED = spaceShareLinkPhase5;
        SpaceShareLinkPhase[] spaceShareLinkPhaseArr = {spaceShareLinkPhase, spaceShareLinkPhase2, spaceShareLinkPhase3, spaceShareLinkPhase4, spaceShareLinkPhase5};
        $VALUES = spaceShareLinkPhaseArr;
        $ENTRIES = C3cG.A0w(spaceShareLinkPhaseArr);
    }

    public static Ey9<SpaceShareLinkPhase> getEntries() {
        return $ENTRIES;
    }

    public static SpaceShareLinkPhase valueOf(String str) {
        return (SpaceShareLinkPhase) Enum.valueOf(SpaceShareLinkPhase.class, str);
    }

    public static SpaceShareLinkPhase[] values() {
        return (SpaceShareLinkPhase[]) $VALUES.clone();
    }

    public SpaceShareLinkPhase(String str, int i) {
    }
}
