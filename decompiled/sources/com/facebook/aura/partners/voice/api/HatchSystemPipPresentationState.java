package com.facebook.aura.partners.voice.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchSystemPipPresentationState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSystemPipPresentationState[] $VALUES;
    public static final HatchSystemPipPresentationState ACTIVE;
    public static final HatchSystemPipPresentationState ENTERING;
    public static final HatchSystemPipPresentationState EXITING;
    public static final HatchSystemPipPresentationState IN_APP;

    static {
        HatchSystemPipPresentationState hatchSystemPipPresentationState = new HatchSystemPipPresentationState("IN_APP", 0);
        IN_APP = hatchSystemPipPresentationState;
        HatchSystemPipPresentationState hatchSystemPipPresentationState2 = new HatchSystemPipPresentationState("ENTERING", 1);
        ENTERING = hatchSystemPipPresentationState2;
        HatchSystemPipPresentationState hatchSystemPipPresentationState3 = new HatchSystemPipPresentationState("ACTIVE", 2);
        ACTIVE = hatchSystemPipPresentationState3;
        HatchSystemPipPresentationState hatchSystemPipPresentationState4 = new HatchSystemPipPresentationState("EXITING", 3);
        EXITING = hatchSystemPipPresentationState4;
        HatchSystemPipPresentationState[] hatchSystemPipPresentationStateArr = {hatchSystemPipPresentationState, hatchSystemPipPresentationState2, hatchSystemPipPresentationState3, hatchSystemPipPresentationState4};
        $VALUES = hatchSystemPipPresentationStateArr;
        $ENTRIES = C3cG.A0w(hatchSystemPipPresentationStateArr);
    }

    public static Ey9<HatchSystemPipPresentationState> getEntries() {
        return $ENTRIES;
    }

    public static HatchSystemPipPresentationState valueOf(String str) {
        return (HatchSystemPipPresentationState) Enum.valueOf(HatchSystemPipPresentationState.class, str);
    }

    public static HatchSystemPipPresentationState[] values() {
        return (HatchSystemPipPresentationState[]) $VALUES.clone();
    }

    public HatchSystemPipPresentationState(String str, int i) {
    }
}
