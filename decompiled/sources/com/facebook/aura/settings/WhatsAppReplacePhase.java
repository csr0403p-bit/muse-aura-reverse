package com.facebook.aura.settings;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class WhatsAppReplacePhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WhatsAppReplacePhase[] $VALUES;
    public static final WhatsAppReplacePhase IDLE;
    public static final WhatsAppReplacePhase SWITCHED;
    public static final WhatsAppReplacePhase SWITCHING;

    static {
        WhatsAppReplacePhase whatsAppReplacePhase = new WhatsAppReplacePhase("IDLE", 0);
        IDLE = whatsAppReplacePhase;
        WhatsAppReplacePhase whatsAppReplacePhase2 = new WhatsAppReplacePhase("SWITCHING", 1);
        SWITCHING = whatsAppReplacePhase2;
        WhatsAppReplacePhase whatsAppReplacePhase3 = new WhatsAppReplacePhase("SWITCHED", 2);
        SWITCHED = whatsAppReplacePhase3;
        WhatsAppReplacePhase[] whatsAppReplacePhaseArr = {whatsAppReplacePhase, whatsAppReplacePhase2, whatsAppReplacePhase3};
        $VALUES = whatsAppReplacePhaseArr;
        $ENTRIES = C3cG.A0w(whatsAppReplacePhaseArr);
    }

    public static Ey9<WhatsAppReplacePhase> getEntries() {
        return $ENTRIES;
    }

    public static WhatsAppReplacePhase valueOf(String str) {
        return (WhatsAppReplacePhase) Enum.valueOf(WhatsAppReplacePhase.class, str);
    }

    public static WhatsAppReplacePhase[] values() {
        return (WhatsAppReplacePhase[]) $VALUES.clone();
    }

    public WhatsAppReplacePhase(String str, int i) {
    }
}
