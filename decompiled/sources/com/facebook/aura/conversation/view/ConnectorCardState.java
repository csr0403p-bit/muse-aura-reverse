package com.facebook.aura.conversation.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConnectorCardState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectorCardState[] $VALUES;
    public static final ConnectorCardState Connected;
    public static final ConnectorCardState NotConnected;
    public static final ConnectorCardState Unresolved;

    static {
        ConnectorCardState connectorCardState = new ConnectorCardState("Unresolved", 0);
        Unresolved = connectorCardState;
        ConnectorCardState connectorCardState2 = new ConnectorCardState("NotConnected", 1);
        NotConnected = connectorCardState2;
        ConnectorCardState connectorCardState3 = new ConnectorCardState("Connected", 2);
        Connected = connectorCardState3;
        ConnectorCardState[] connectorCardStateArr = {connectorCardState, connectorCardState2, connectorCardState3};
        $VALUES = connectorCardStateArr;
        $ENTRIES = new F3w(connectorCardStateArr);
    }

    public static Ey9<ConnectorCardState> getEntries() {
        return $ENTRIES;
    }

    public static ConnectorCardState valueOf(String str) {
        return (ConnectorCardState) Enum.valueOf(ConnectorCardState.class, str);
    }

    public static ConnectorCardState[] values() {
        return (ConnectorCardState[]) $VALUES.clone();
    }

    public ConnectorCardState(String str, int i) {
    }
}
