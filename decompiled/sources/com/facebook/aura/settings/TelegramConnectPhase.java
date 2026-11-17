package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TelegramConnectPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TelegramConnectPhase[] $VALUES;
    public static final TelegramConnectPhase AWAITING_RETURN;
    public static final TelegramConnectPhase CONNECTING;
    public static final TelegramConnectPhase IDLE;
    public static final TelegramConnectPhase POLLING;

    static {
        TelegramConnectPhase telegramConnectPhase = new TelegramConnectPhase("IDLE", 0);
        IDLE = telegramConnectPhase;
        TelegramConnectPhase telegramConnectPhase2 = new TelegramConnectPhase("CONNECTING", 1);
        CONNECTING = telegramConnectPhase2;
        TelegramConnectPhase telegramConnectPhase3 = new TelegramConnectPhase("AWAITING_RETURN", 2);
        AWAITING_RETURN = telegramConnectPhase3;
        TelegramConnectPhase telegramConnectPhase4 = new TelegramConnectPhase("POLLING", 3);
        POLLING = telegramConnectPhase4;
        TelegramConnectPhase[] telegramConnectPhaseArr = {telegramConnectPhase, telegramConnectPhase2, telegramConnectPhase3, telegramConnectPhase4};
        $VALUES = telegramConnectPhaseArr;
        $ENTRIES = new F3w(telegramConnectPhaseArr);
    }

    public static Ey9<TelegramConnectPhase> getEntries() {
        return $ENTRIES;
    }

    public static TelegramConnectPhase valueOf(String str) {
        return (TelegramConnectPhase) Enum.valueOf(TelegramConnectPhase.class, str);
    }

    public static TelegramConnectPhase[] values() {
        return (TelegramConnectPhase[]) $VALUES.clone();
    }

    public TelegramConnectPhase(String str, int i) {
    }
}
