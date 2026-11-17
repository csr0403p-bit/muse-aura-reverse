package com.facebook.traffic.nts.providers.init;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ProviderId {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ProviderId[] $VALUES;
    public static final ProviderId APP_FGBG_STATE_PROVIDER;
    public static final ProviderId HTTP_PROVIDER;
    public static final ProviderId RADIO_SIGNAL_PROVIDER;
    public static final ProviderId REACHABILITY_V2_PROVIDER;
    public static final ProviderId STARTUP_SIGNALS_PROVIDER;

    static {
        ProviderId providerId = new ProviderId("APP_FGBG_STATE_PROVIDER", 0);
        APP_FGBG_STATE_PROVIDER = providerId;
        ProviderId providerId2 = new ProviderId("HTTP_PROVIDER", 1);
        HTTP_PROVIDER = providerId2;
        ProviderId providerId3 = new ProviderId("RADIO_SIGNAL_PROVIDER", 2);
        RADIO_SIGNAL_PROVIDER = providerId3;
        ProviderId providerId4 = new ProviderId("REACHABILITY_V2_PROVIDER", 3);
        REACHABILITY_V2_PROVIDER = providerId4;
        ProviderId providerId5 = new ProviderId("STARTUP_SIGNALS_PROVIDER", 4);
        STARTUP_SIGNALS_PROVIDER = providerId5;
        ProviderId[] providerIdArr = {providerId, providerId2, providerId3, providerId4, providerId5};
        $VALUES = providerIdArr;
        $ENTRIES = C3cG.A0w(providerIdArr);
    }

    public static Ey9<ProviderId> getEntries() {
        return $ENTRIES;
    }

    public static ProviderId valueOf(String str) {
        return (ProviderId) Enum.valueOf(ProviderId.class, str);
    }

    public static ProviderId[] values() {
        return (ProviderId[]) $VALUES.clone();
    }

    public ProviderId(String str, int i) {
    }
}
