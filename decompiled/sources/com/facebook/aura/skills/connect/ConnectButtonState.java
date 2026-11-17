package com.facebook.aura.skills.connect;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectButtonState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectButtonState[] $VALUES;
    public static final ConnectButtonState DISABLED;
    public static final ConnectButtonState ENABLED;
    public static final ConnectButtonState LOADING;

    static {
        ConnectButtonState connectButtonState = new ConnectButtonState("DISABLED", 0);
        DISABLED = connectButtonState;
        ConnectButtonState connectButtonState2 = new ConnectButtonState("ENABLED", 1);
        ENABLED = connectButtonState2;
        ConnectButtonState connectButtonState3 = new ConnectButtonState("LOADING", 2);
        LOADING = connectButtonState3;
        ConnectButtonState[] connectButtonStateArr = {connectButtonState, connectButtonState2, connectButtonState3};
        $VALUES = connectButtonStateArr;
        $ENTRIES = C3cG.A0w(connectButtonStateArr);
    }

    public static Ey9<ConnectButtonState> getEntries() {
        return $ENTRIES;
    }

    public static ConnectButtonState valueOf(String str) {
        return (ConnectButtonState) Enum.valueOf(ConnectButtonState.class, str);
    }

    public static ConnectButtonState[] values() {
        return (ConnectButtonState[]) $VALUES.clone();
    }

    public ConnectButtonState(String str, int i) {
    }
}
