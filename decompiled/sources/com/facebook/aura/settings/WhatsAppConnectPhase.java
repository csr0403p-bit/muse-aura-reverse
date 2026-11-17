package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class WhatsAppConnectPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WhatsAppConnectPhase[] $VALUES;
    public static final WhatsAppConnectPhase AWAITING_RETURN;
    public static final WhatsAppConnectPhase CONNECTING;
    public static final WhatsAppConnectPhase IDLE;
    public static final WhatsAppConnectPhase POLLING;

    static {
        WhatsAppConnectPhase whatsAppConnectPhase = new WhatsAppConnectPhase("IDLE", 0);
        IDLE = whatsAppConnectPhase;
        WhatsAppConnectPhase whatsAppConnectPhase2 = new WhatsAppConnectPhase("CONNECTING", 1);
        CONNECTING = whatsAppConnectPhase2;
        WhatsAppConnectPhase whatsAppConnectPhase3 = new WhatsAppConnectPhase("AWAITING_RETURN", 2);
        AWAITING_RETURN = whatsAppConnectPhase3;
        WhatsAppConnectPhase whatsAppConnectPhase4 = new WhatsAppConnectPhase("POLLING", 3);
        POLLING = whatsAppConnectPhase4;
        WhatsAppConnectPhase[] whatsAppConnectPhaseArr = {whatsAppConnectPhase, whatsAppConnectPhase2, whatsAppConnectPhase3, whatsAppConnectPhase4};
        $VALUES = whatsAppConnectPhaseArr;
        $ENTRIES = new F3w(whatsAppConnectPhaseArr);
    }

    public static Ey9<WhatsAppConnectPhase> getEntries() {
        return $ENTRIES;
    }

    public static WhatsAppConnectPhase valueOf(String str) {
        return (WhatsAppConnectPhase) Enum.valueOf(WhatsAppConnectPhase.class, str);
    }

    public static WhatsAppConnectPhase[] values() {
        return (WhatsAppConnectPhase[]) $VALUES.clone();
    }

    public WhatsAppConnectPhase(String str, int i) {
    }
}
