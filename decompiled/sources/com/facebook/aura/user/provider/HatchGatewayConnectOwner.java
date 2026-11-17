package com.facebook.aura.user.provider;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchGatewayConnectOwner {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchGatewayConnectOwner[] $VALUES;
    public static final HatchGatewayConnectOwner ACTIVATION_VIEW_MODEL;
    public static final HatchGatewayConnectOwner STARTUP_JOB;

    static {
        HatchGatewayConnectOwner hatchGatewayConnectOwner = new HatchGatewayConnectOwner("ACTIVATION_VIEW_MODEL", 0);
        ACTIVATION_VIEW_MODEL = hatchGatewayConnectOwner;
        HatchGatewayConnectOwner hatchGatewayConnectOwner2 = new HatchGatewayConnectOwner("STARTUP_JOB", 1);
        STARTUP_JOB = hatchGatewayConnectOwner2;
        HatchGatewayConnectOwner[] hatchGatewayConnectOwnerArr = {hatchGatewayConnectOwner, hatchGatewayConnectOwner2};
        $VALUES = hatchGatewayConnectOwnerArr;
        $ENTRIES = C3cG.A0w(hatchGatewayConnectOwnerArr);
    }

    public static Ey9<HatchGatewayConnectOwner> getEntries() {
        return $ENTRIES;
    }

    public static HatchGatewayConnectOwner valueOf(String str) {
        return (HatchGatewayConnectOwner) Enum.valueOf(HatchGatewayConnectOwner.class, str);
    }

    public static HatchGatewayConnectOwner[] values() {
        return (HatchGatewayConnectOwner[]) $VALUES.clone();
    }

    public HatchGatewayConnectOwner(String str, int i) {
    }
}
