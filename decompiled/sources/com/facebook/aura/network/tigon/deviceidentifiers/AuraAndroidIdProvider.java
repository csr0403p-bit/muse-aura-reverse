package com.facebook.aura.network.tigon.deviceidentifiers;

import X.C06H;
import X.C3cG;
import X.C7BY;
import X.InterfaceC6685EQd;
import android.provider.Settings;

/* loaded from: classes5.dex */
public final class AuraAndroidIdProvider implements InterfaceC6685EQd {
    public static final Companion Companion = new Companion();
    public static final String HEADER_NAME = "X-ANDROID-ID";
    public volatile String cachedAndroidId;

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC6685EQd
    public String getHeaderName() {
        return HEADER_NAME;
    }

    @Override // X.InterfaceC6685EQd
    public String getHeaderValue() {
        String androidId = this.cachedAndroidId;
        if (androidId == null) {
            androidId = readAndroidId();
            if (androidId == null || C7BY.A0j(androidId)) {
                return null;
            }
            this.cachedAndroidId = androidId;
        }
        return androidId;
    }

    @Override // X.InterfaceC6685EQd
    public boolean isEnabled() {
        return true;
    }

    private final String readAndroidId() {
        try {
            return Settings.Secure.getString(C3cG.A06().getContentResolver(), "android_id");
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
