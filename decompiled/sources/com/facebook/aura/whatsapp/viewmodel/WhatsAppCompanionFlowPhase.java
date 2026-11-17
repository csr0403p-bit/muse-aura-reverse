package com.facebook.aura.whatsapp.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class WhatsAppCompanionFlowPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WhatsAppCompanionFlowPhase[] $VALUES;
    public static final WhatsAppCompanionFlowPhase CODE_DISPLAY;
    public static final WhatsAppCompanionFlowPhase PHONE_INPUT;

    static {
        WhatsAppCompanionFlowPhase whatsAppCompanionFlowPhase = new WhatsAppCompanionFlowPhase("PHONE_INPUT", 0);
        PHONE_INPUT = whatsAppCompanionFlowPhase;
        WhatsAppCompanionFlowPhase whatsAppCompanionFlowPhase2 = new WhatsAppCompanionFlowPhase("CODE_DISPLAY", 1);
        CODE_DISPLAY = whatsAppCompanionFlowPhase2;
        WhatsAppCompanionFlowPhase[] whatsAppCompanionFlowPhaseArr = {whatsAppCompanionFlowPhase, whatsAppCompanionFlowPhase2};
        $VALUES = whatsAppCompanionFlowPhaseArr;
        $ENTRIES = C3cG.A0w(whatsAppCompanionFlowPhaseArr);
    }

    public static Ey9<WhatsAppCompanionFlowPhase> getEntries() {
        return $ENTRIES;
    }

    public static WhatsAppCompanionFlowPhase valueOf(String str) {
        return (WhatsAppCompanionFlowPhase) Enum.valueOf(WhatsAppCompanionFlowPhase.class, str);
    }

    public static WhatsAppCompanionFlowPhase[] values() {
        return (WhatsAppCompanionFlowPhase[]) $VALUES.clone();
    }

    public WhatsAppCompanionFlowPhase(String str, int i) {
    }
}
