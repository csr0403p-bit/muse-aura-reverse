package com.facebook.aura.spaces.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SpaceRenderState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SpaceRenderState[] $VALUES;
    public static final SpaceRenderState BUILDING;
    public static final SpaceRenderState MISSING;
    public static final SpaceRenderState READY;

    static {
        SpaceRenderState spaceRenderState = new SpaceRenderState("MISSING", 0);
        MISSING = spaceRenderState;
        SpaceRenderState spaceRenderState2 = new SpaceRenderState("BUILDING", 1);
        BUILDING = spaceRenderState2;
        SpaceRenderState spaceRenderState3 = new SpaceRenderState("READY", 2);
        READY = spaceRenderState3;
        SpaceRenderState[] spaceRenderStateArr = {spaceRenderState, spaceRenderState2, spaceRenderState3};
        $VALUES = spaceRenderStateArr;
        $ENTRIES = new F3w(spaceRenderStateArr);
    }

    public static Ey9<SpaceRenderState> getEntries() {
        return $ENTRIES;
    }

    public static SpaceRenderState valueOf(String str) {
        return (SpaceRenderState) Enum.valueOf(SpaceRenderState.class, str);
    }

    public static SpaceRenderState[] values() {
        return (SpaceRenderState[]) $VALUES.clone();
    }

    public SpaceRenderState(String str, int i) {
    }
}
