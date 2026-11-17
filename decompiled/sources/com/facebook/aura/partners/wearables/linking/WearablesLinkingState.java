package com.facebook.aura.partners.wearables.linking;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class WearablesLinkingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WearablesLinkingState[] $VALUES;
    public static final WearablesLinkingState COMMS_CONSENT;
    public static final WearablesLinkingState CONSENT;
    public static final WearablesLinkingState FAILURE;

    static {
        WearablesLinkingState wearablesLinkingState = new WearablesLinkingState("CONSENT", 0);
        CONSENT = wearablesLinkingState;
        WearablesLinkingState wearablesLinkingState2 = new WearablesLinkingState("COMMS_CONSENT", 1);
        COMMS_CONSENT = wearablesLinkingState2;
        WearablesLinkingState wearablesLinkingState3 = new WearablesLinkingState("FAILURE", 2);
        FAILURE = wearablesLinkingState3;
        WearablesLinkingState[] wearablesLinkingStateArr = {wearablesLinkingState, wearablesLinkingState2, wearablesLinkingState3};
        $VALUES = wearablesLinkingStateArr;
        $ENTRIES = C3cG.A0w(wearablesLinkingStateArr);
    }

    public static Ey9<WearablesLinkingState> getEntries() {
        return $ENTRIES;
    }

    public static WearablesLinkingState valueOf(String str) {
        return (WearablesLinkingState) Enum.valueOf(WearablesLinkingState.class, str);
    }

    public static WearablesLinkingState[] values() {
        return (WearablesLinkingState[]) $VALUES.clone();
    }

    public WearablesLinkingState(String str, int i) {
    }
}
