package com.facebook.aura.network.tigon.deviceidentifiers;

import X.C06H;
import X.InterfaceC6685EQd;
import com.facebook.aura.login.credentials.AuraSavedCredentialsStore;

/* loaded from: classes2.dex */
public final class AuraMachineIdProvider implements InterfaceC6685EQd {
    public static final Companion Companion = new Companion();
    public static final String HEADER_NAME = "X-FB-Integrity-Machine-Id";
    public volatile String cachedMachineId;
    public final boolean isEnabled = true;
    public final String headerName = HEADER_NAME;

    @Override // X.InterfaceC6685EQd
    public String getHeaderName() {
        return this.headerName;
    }

    @Override // X.InterfaceC6685EQd
    public String getHeaderValue() {
        String str = this.cachedMachineId;
        if (str == null) {
            str = AuraSavedCredentialsStore.INSTANCE.getSavedAYMHInfo().idForAYMH;
            if (str == null || str.length() <= 0) {
                return null;
            }
            this.cachedMachineId = str;
        }
        return str;
    }

    @Override // X.InterfaceC6685EQd
    public boolean isEnabled() {
        return this.isEnabled;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
