package com.facebook.aura.startup.login;

import X.AnonymousClass003;
import X.C31u;
import X.InterfaceC7359EnW;
import com.facebook.aura.auth.RefreshTokenGate;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.startup.login.MC;

/* loaded from: classes5.dex */
public final class HatchRefreshTokenGate implements RefreshTokenGate {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchRefreshTokenGate.class, "authTokenRefreshEnabled", "getAuthTokenRefreshEnabled()Z");
    public static final HatchRefreshTokenGate INSTANCE = new HatchRefreshTokenGate();
    public static final C31u authTokenRefreshEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_onboarding_abra.enable_auth_token_refresh);

    private final boolean getAuthTokenRefreshEnabled() {
        return C31u.A01(this, authTokenRefreshEnabled$delegate, $$delegatedProperties, 0);
    }

    @Override // com.facebook.aura.auth.RefreshTokenGate
    public boolean isEnabled() {
        return getAuthTokenRefreshEnabled();
    }
}
