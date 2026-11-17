package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class MessengerConnectPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ MessengerConnectPhase[] $VALUES;
    public static final MessengerConnectPhase AWAITING_RETURN;
    public static final MessengerConnectPhase CONNECTING;
    public static final MessengerConnectPhase IDLE;
    public static final MessengerConnectPhase POLLING;

    static {
        MessengerConnectPhase messengerConnectPhase = new MessengerConnectPhase("IDLE", 0);
        IDLE = messengerConnectPhase;
        MessengerConnectPhase messengerConnectPhase2 = new MessengerConnectPhase("CONNECTING", 1);
        CONNECTING = messengerConnectPhase2;
        MessengerConnectPhase messengerConnectPhase3 = new MessengerConnectPhase("AWAITING_RETURN", 2);
        AWAITING_RETURN = messengerConnectPhase3;
        MessengerConnectPhase messengerConnectPhase4 = new MessengerConnectPhase("POLLING", 3);
        POLLING = messengerConnectPhase4;
        MessengerConnectPhase[] messengerConnectPhaseArr = {messengerConnectPhase, messengerConnectPhase2, messengerConnectPhase3, messengerConnectPhase4};
        $VALUES = messengerConnectPhaseArr;
        $ENTRIES = new F3w(messengerConnectPhaseArr);
    }

    public static Ey9<MessengerConnectPhase> getEntries() {
        return $ENTRIES;
    }

    public static MessengerConnectPhase valueOf(String str) {
        return (MessengerConnectPhase) Enum.valueOf(MessengerConnectPhase.class, str);
    }

    public static MessengerConnectPhase[] values() {
        return (MessengerConnectPhase[]) $VALUES.clone();
    }

    public MessengerConnectPhase(String str, int i) {
    }
}
