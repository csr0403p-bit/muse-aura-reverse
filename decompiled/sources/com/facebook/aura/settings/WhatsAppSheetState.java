package com.facebook.aura.settings;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class WhatsAppSheetState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WhatsAppSheetState[] $VALUES;
    public static final WhatsAppSheetState CONNECT;
    public static final WhatsAppSheetState CONNECTED;
    public static final WhatsAppSheetState LOADING;
    public static final WhatsAppSheetState REPLACE;
    public static final WhatsAppSheetState SWITCHING;

    static {
        WhatsAppSheetState whatsAppSheetState = new WhatsAppSheetState("LOADING", 0);
        LOADING = whatsAppSheetState;
        WhatsAppSheetState whatsAppSheetState2 = new WhatsAppSheetState("CONNECT", 1);
        CONNECT = whatsAppSheetState2;
        WhatsAppSheetState whatsAppSheetState3 = new WhatsAppSheetState("CONNECTED", 2);
        CONNECTED = whatsAppSheetState3;
        WhatsAppSheetState whatsAppSheetState4 = new WhatsAppSheetState("REPLACE", 3);
        REPLACE = whatsAppSheetState4;
        WhatsAppSheetState whatsAppSheetState5 = new WhatsAppSheetState("SWITCHING", 4);
        SWITCHING = whatsAppSheetState5;
        WhatsAppSheetState[] whatsAppSheetStateArr = {whatsAppSheetState, whatsAppSheetState2, whatsAppSheetState3, whatsAppSheetState4, whatsAppSheetState5};
        $VALUES = whatsAppSheetStateArr;
        $ENTRIES = C3cG.A0w(whatsAppSheetStateArr);
    }

    public static Ey9<WhatsAppSheetState> getEntries() {
        return $ENTRIES;
    }

    public static WhatsAppSheetState valueOf(String str) {
        return (WhatsAppSheetState) Enum.valueOf(WhatsAppSheetState.class, str);
    }

    public static WhatsAppSheetState[] values() {
        return (WhatsAppSheetState[]) $VALUES.clone();
    }

    public WhatsAppSheetState(String str, int i) {
    }
}
