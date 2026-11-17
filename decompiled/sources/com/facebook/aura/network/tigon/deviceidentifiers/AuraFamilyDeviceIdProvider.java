package com.facebook.aura.network.tigon.deviceidentifiers;

import X.C06H;
import X.C7384Etj;
import X.InterfaceC6685EQd;
import com.facebook.aura.common.identifiers.fdid.AuraFamilyDeviceId;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class AuraFamilyDeviceIdProvider implements InterfaceC6685EQd {
    public static final Companion Companion = new Companion();
    public static final String HEADER_NAME = "X-FB-Family-Device-Id";
    public volatile String cachedFamilyDeviceId;
    public final boolean isEnabled = true;
    public final String headerName = HEADER_NAME;

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC6685EQd
    public String getHeaderName() {
        return this.headerName;
    }

    @Override // X.InterfaceC6685EQd
    public String getHeaderValue() {
        String str = this.cachedFamilyDeviceId;
        if (str != null) {
            return str;
        }
        String str2 = AuraFamilyDeviceId.INSTANCE.get();
        if (str2 == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        C7384Etj.A0V(locale);
        String upperCase = str2.toUpperCase(locale);
        this.cachedFamilyDeviceId = upperCase;
        return upperCase;
    }

    @Override // X.InterfaceC6685EQd
    public boolean isEnabled() {
        return this.isEnabled;
    }
}
