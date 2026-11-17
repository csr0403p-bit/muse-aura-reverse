package com.facebook.aura.network.state;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Transport {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ Transport[] $VALUES;
    public static final Transport BLUETOOTH;
    public static final Transport CELLULAR;
    public static final Transport OTHER;
    public static final Transport VPN;
    public static final Transport WIFI;

    static {
        Transport transport = new Transport("WIFI", 0);
        WIFI = transport;
        Transport transport2 = new Transport("CELLULAR", 1);
        CELLULAR = transport2;
        Transport transport3 = new Transport("VPN", 2);
        VPN = transport3;
        Transport transport4 = new Transport("BLUETOOTH", 3);
        BLUETOOTH = transport4;
        Transport transport5 = new Transport("OTHER", 4);
        OTHER = transport5;
        Transport[] transportArr = {transport, transport2, transport3, transport4, transport5};
        $VALUES = transportArr;
        $ENTRIES = C3cG.A0w(transportArr);
    }

    public static Ey9<Transport> getEntries() {
        return $ENTRIES;
    }

    public static Transport valueOf(String str) {
        return (Transport) Enum.valueOf(Transport.class, str);
    }

    public static Transport[] values() {
        return (Transport[]) $VALUES.clone();
    }

    public Transport(String str, int i) {
    }
}
