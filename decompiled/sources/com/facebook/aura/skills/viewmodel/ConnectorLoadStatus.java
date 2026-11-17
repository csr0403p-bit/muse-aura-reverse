package com.facebook.aura.skills.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConnectorLoadStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectorLoadStatus[] $VALUES;
    public static final ConnectorLoadStatus APPENDING;
    public static final ConnectorLoadStatus APPEND_ERROR;
    public static final ConnectorLoadStatus DEBOUNCING;
    public static final ConnectorLoadStatus IDLE;
    public static final ConnectorLoadStatus INITIAL_ERROR;
    public static final ConnectorLoadStatus LOADING;
    public static final ConnectorLoadStatus REFRESHING;

    static {
        ConnectorLoadStatus connectorLoadStatus = new ConnectorLoadStatus("IDLE", 0);
        IDLE = connectorLoadStatus;
        ConnectorLoadStatus connectorLoadStatus2 = new ConnectorLoadStatus("DEBOUNCING", 1);
        DEBOUNCING = connectorLoadStatus2;
        ConnectorLoadStatus connectorLoadStatus3 = new ConnectorLoadStatus("LOADING", 2);
        LOADING = connectorLoadStatus3;
        ConnectorLoadStatus connectorLoadStatus4 = new ConnectorLoadStatus("REFRESHING", 3);
        REFRESHING = connectorLoadStatus4;
        ConnectorLoadStatus connectorLoadStatus5 = new ConnectorLoadStatus("APPENDING", 4);
        APPENDING = connectorLoadStatus5;
        ConnectorLoadStatus connectorLoadStatus6 = new ConnectorLoadStatus("INITIAL_ERROR", 5);
        INITIAL_ERROR = connectorLoadStatus6;
        ConnectorLoadStatus connectorLoadStatus7 = new ConnectorLoadStatus("APPEND_ERROR", 6);
        APPEND_ERROR = connectorLoadStatus7;
        ConnectorLoadStatus[] connectorLoadStatusArr = {connectorLoadStatus, connectorLoadStatus2, connectorLoadStatus3, connectorLoadStatus4, connectorLoadStatus5, connectorLoadStatus6, connectorLoadStatus7};
        $VALUES = connectorLoadStatusArr;
        $ENTRIES = new F3w(connectorLoadStatusArr);
    }

    public static Ey9<ConnectorLoadStatus> getEntries() {
        return $ENTRIES;
    }

    public static ConnectorLoadStatus valueOf(String str) {
        return (ConnectorLoadStatus) Enum.valueOf(ConnectorLoadStatus.class, str);
    }

    public static ConnectorLoadStatus[] values() {
        return (ConnectorLoadStatus[]) $VALUES.clone();
    }

    public final boolean getHasError() {
        return this == INITIAL_ERROR || this == APPEND_ERROR;
    }

    public ConnectorLoadStatus(String str, int i) {
    }
}
