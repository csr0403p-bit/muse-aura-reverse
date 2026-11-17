package com.facebook.aura.channels.connect;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TelegramSheetState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TelegramSheetState[] $VALUES;
    public static final TelegramSheetState CONNECT;
    public static final TelegramSheetState CONNECTED;
    public static final TelegramSheetState DISCONNECT;
    public static final TelegramSheetState LOADING;

    static {
        TelegramSheetState telegramSheetState = new TelegramSheetState("LOADING", 0);
        LOADING = telegramSheetState;
        TelegramSheetState telegramSheetState2 = new TelegramSheetState("CONNECT", 1);
        CONNECT = telegramSheetState2;
        TelegramSheetState telegramSheetState3 = new TelegramSheetState("CONNECTED", 2);
        CONNECTED = telegramSheetState3;
        TelegramSheetState telegramSheetState4 = new TelegramSheetState("DISCONNECT", 3);
        DISCONNECT = telegramSheetState4;
        TelegramSheetState[] telegramSheetStateArr = {telegramSheetState, telegramSheetState2, telegramSheetState3, telegramSheetState4};
        $VALUES = telegramSheetStateArr;
        $ENTRIES = new F3w(telegramSheetStateArr);
    }

    public static Ey9<TelegramSheetState> getEntries() {
        return $ENTRIES;
    }

    public static TelegramSheetState valueOf(String str) {
        return (TelegramSheetState) Enum.valueOf(TelegramSheetState.class, str);
    }

    public static TelegramSheetState[] values() {
        return (TelegramSheetState[]) $VALUES.clone();
    }

    public TelegramSheetState(String str, int i) {
    }
}
