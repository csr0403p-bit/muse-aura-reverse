package com.facebook.aura.whatsapp.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class WhatsAppCompanionErrorType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WhatsAppCompanionErrorType[] $VALUES;
    public static final WhatsAppCompanionErrorType LINK_CODE_FAILED;
    public static final WhatsAppCompanionErrorType POLL_EXHAUSTED;
    public static final WhatsAppCompanionErrorType POLL_FAILED;

    static {
        WhatsAppCompanionErrorType whatsAppCompanionErrorType = new WhatsAppCompanionErrorType("LINK_CODE_FAILED", 0);
        LINK_CODE_FAILED = whatsAppCompanionErrorType;
        WhatsAppCompanionErrorType whatsAppCompanionErrorType2 = new WhatsAppCompanionErrorType("POLL_FAILED", 1);
        POLL_FAILED = whatsAppCompanionErrorType2;
        WhatsAppCompanionErrorType whatsAppCompanionErrorType3 = new WhatsAppCompanionErrorType("POLL_EXHAUSTED", 2);
        POLL_EXHAUSTED = whatsAppCompanionErrorType3;
        WhatsAppCompanionErrorType[] whatsAppCompanionErrorTypeArr = {whatsAppCompanionErrorType, whatsAppCompanionErrorType2, whatsAppCompanionErrorType3};
        $VALUES = whatsAppCompanionErrorTypeArr;
        $ENTRIES = C3cG.A0w(whatsAppCompanionErrorTypeArr);
    }

    public static Ey9<WhatsAppCompanionErrorType> getEntries() {
        return $ENTRIES;
    }

    public static WhatsAppCompanionErrorType valueOf(String str) {
        return (WhatsAppCompanionErrorType) Enum.valueOf(WhatsAppCompanionErrorType.class, str);
    }

    public static WhatsAppCompanionErrorType[] values() {
        return (WhatsAppCompanionErrorType[]) $VALUES.clone();
    }

    public WhatsAppCompanionErrorType(String str, int i) {
    }
}
