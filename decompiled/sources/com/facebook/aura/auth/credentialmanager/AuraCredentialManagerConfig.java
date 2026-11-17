package com.facebook.aura.auth.credentialmanager;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C31u;
import X.C4305Cst;
import X.C60O;
import X.InterfaceC7359EnW;
import com.facebook.aura.auth.credentialmanager.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes5.dex */
public final class AuraCredentialManagerConfig {
    public static final String GOOGLE_CLIENT_ID = "138594053405-idn5m64stn93ev8t4g8c4k0ljgdte3i0.apps.googleusercontent.com";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(AuraCredentialManagerConfig.class, "isGoogleIdTokenEnabled", "isGoogleIdTokenEnabled()Z");
    public static final AuraCredentialManagerConfig INSTANCE = new AuraCredentialManagerConfig();
    public static final C31u isGoogleIdTokenEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.frl_google_credential_manager.meta_ai_siwg_enabled);

    public final C4305Cst googleIdOption() {
        if (GOOGLE_CLIENT_ID.length() > 0) {
            return new C4305Cst(AnonymousClass002.A0k());
        }
        throw C60O.A0i("serverClientId should not be empty");
    }

    public final boolean isGoogleIdTokenEnabled() {
        return C31u.A01(this, isGoogleIdTokenEnabled$delegate, $$delegatedProperties, 0);
    }
}
