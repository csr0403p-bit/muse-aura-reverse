package com.facebook.aura.channels.connect;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class MessengerSheetState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ MessengerSheetState[] $VALUES;
    public static final MessengerSheetState CONNECT;
    public static final MessengerSheetState CONNECTED;
    public static final MessengerSheetState DISCONNECT;
    public static final MessengerSheetState LOADING;

    static {
        MessengerSheetState messengerSheetState = new MessengerSheetState("LOADING", 0);
        LOADING = messengerSheetState;
        MessengerSheetState messengerSheetState2 = new MessengerSheetState("CONNECT", 1);
        CONNECT = messengerSheetState2;
        MessengerSheetState messengerSheetState3 = new MessengerSheetState("CONNECTED", 2);
        CONNECTED = messengerSheetState3;
        MessengerSheetState messengerSheetState4 = new MessengerSheetState("DISCONNECT", 3);
        DISCONNECT = messengerSheetState4;
        MessengerSheetState[] messengerSheetStateArr = {messengerSheetState, messengerSheetState2, messengerSheetState3, messengerSheetState4};
        $VALUES = messengerSheetStateArr;
        $ENTRIES = new F3w(messengerSheetStateArr);
    }

    public static Ey9<MessengerSheetState> getEntries() {
        return $ENTRIES;
    }

    public static MessengerSheetState valueOf(String str) {
        return (MessengerSheetState) Enum.valueOf(MessengerSheetState.class, str);
    }

    public static MessengerSheetState[] values() {
        return (MessengerSheetState[]) $VALUES.clone();
    }

    public MessengerSheetState(String str, int i) {
    }
}
