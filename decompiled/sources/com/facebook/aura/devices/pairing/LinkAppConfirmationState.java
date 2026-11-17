package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkAppConfirmationState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkAppConfirmationState[] $VALUES;
    public static final LinkAppConfirmationState CONTINUING;
    public static final LinkAppConfirmationState REQUIRED;

    static {
        LinkAppConfirmationState linkAppConfirmationState = new LinkAppConfirmationState("REQUIRED", 0);
        REQUIRED = linkAppConfirmationState;
        LinkAppConfirmationState linkAppConfirmationState2 = new LinkAppConfirmationState("CONTINUING", 1);
        CONTINUING = linkAppConfirmationState2;
        LinkAppConfirmationState[] linkAppConfirmationStateArr = {linkAppConfirmationState, linkAppConfirmationState2};
        $VALUES = linkAppConfirmationStateArr;
        $ENTRIES = C3cG.A0w(linkAppConfirmationStateArr);
    }

    public static Ey9<LinkAppConfirmationState> getEntries() {
        return $ENTRIES;
    }

    public static LinkAppConfirmationState valueOf(String str) {
        return (LinkAppConfirmationState) Enum.valueOf(LinkAppConfirmationState.class, str);
    }

    public static LinkAppConfirmationState[] values() {
        return (LinkAppConfirmationState[]) $VALUES.clone();
    }

    public LinkAppConfirmationState(String str, int i) {
    }
}
