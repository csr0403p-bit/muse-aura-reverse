package com.facebook.aura.vds.compose.theme;

import X.InterfaceC05011Yg;

/* loaded from: classes.dex */
public abstract class AuraIndicationKt {
    public static final InterfaceC05011Yg auraIndicationDark;
    public static final InterfaceC05011Yg auraIndicationLight;

    static {
        NoOpIndication noOpIndication = NoOpIndication.INSTANCE;
        auraIndicationLight = noOpIndication;
        auraIndicationDark = noOpIndication;
    }

    public static final InterfaceC05011Yg getAuraIndicationDark() {
        return auraIndicationDark;
    }

    public static final InterfaceC05011Yg getAuraIndicationLight() {
        return auraIndicationLight;
    }
}
