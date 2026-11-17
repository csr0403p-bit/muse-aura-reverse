package com.facebook.aura.nodes.datasource;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ProactiveDelivery {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ProactiveDelivery[] $VALUES;
    public static final ProactiveDelivery DURABLE;
    public static final ProactiveDelivery TRANSIENT;

    static {
        ProactiveDelivery proactiveDelivery = new ProactiveDelivery("DURABLE", 0);
        DURABLE = proactiveDelivery;
        ProactiveDelivery proactiveDelivery2 = new ProactiveDelivery("TRANSIENT", 1);
        TRANSIENT = proactiveDelivery2;
        ProactiveDelivery[] proactiveDeliveryArr = {proactiveDelivery, proactiveDelivery2};
        $VALUES = proactiveDeliveryArr;
        $ENTRIES = C3cG.A0w(proactiveDeliveryArr);
    }

    public static Ey9<ProactiveDelivery> getEntries() {
        return $ENTRIES;
    }

    public static ProactiveDelivery valueOf(String str) {
        return (ProactiveDelivery) Enum.valueOf(ProactiveDelivery.class, str);
    }

    public static ProactiveDelivery[] values() {
        return (ProactiveDelivery[]) $VALUES.clone();
    }

    public ProactiveDelivery(String str, int i) {
    }
}
