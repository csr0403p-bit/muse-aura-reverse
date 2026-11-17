package com.facebook.aura.network.tigon.deviceidentifiers;

import X.AbstractC5321DgF;
import X.C06H;
import X.F0C;
import X.InterfaceC6685EQd;

/* loaded from: classes5.dex */
public final class AuraDeviceIdProvider implements InterfaceC6685EQd {
    public static final Companion Companion = new Companion();
    public static final String HEADER_NAME = "X-FB-Device-ID";
    public final F0C deviceId$delegate = AbstractC5321DgF.A03(AuraDeviceIdProvider$deviceId$2.INSTANCE);
    public final boolean isEnabled = true;
    public final String headerName = HEADER_NAME;

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final String getDeviceId() {
        return (String) this.deviceId$delegate.getValue();
    }

    @Override // X.InterfaceC6685EQd
    public String getHeaderName() {
        return this.headerName;
    }

    @Override // X.InterfaceC6685EQd
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // X.InterfaceC6685EQd
    public String getHeaderValue() {
        return getDeviceId();
    }
}
