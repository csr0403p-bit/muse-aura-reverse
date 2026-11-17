package com.facebook.aura.auth;

import X.AbstractC3136BzG;
import X.BV4;
import X.C4021Ck4;
import X.C4022Ck5;
import X.C4025CkE;
import X.C4oT;
import X.C5203DdF;
import X.C7384Etj;
import X.CGw;
import X.Ck3;
import X.InterfaceC4039Ckg;
import X.InterfaceC4040Ckh;
import android.os.Trace;
import com.facebook.aura.appid.AuraClientToken;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.auth.strategies.AuraBloksLoginStrategy;
import com.facebook.aura.auth.strategies.AuraReauthStrategy;
import com.facebook.aura.auth.strategies.AuraSignOutStrategy;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.network.crudonet.AuraCrudoNet;
import com.facebook.aura.network.endpoint.AuraEndpointSelector;

/* loaded from: classes5.dex */
public final class AuraAuthManager {
    public static final String GRAPH_TIER = "ar-genai";
    public static final AuraAuthManager INSTANCE;
    public static volatile InterfaceC4040Ckh instance;

    static {
        AuraAuthManager auraAuthManager = new AuraAuthManager();
        INSTANCE = auraAuthManager;
        instance = auraAuthManager.createAuthManager();
    }

    private final InterfaceC4040Ckh createAuthManager() {
        AbstractC3136BzG.A00("AuraAuthManager");
        try {
            C4oT c4oTAuthPrefs = HatchPrefsStore.INSTANCE.authPrefs();
            return new C5203DdF(new C4025CkE(new AuraBloksLoginStrategy(BV4.A0f(), "ar-genai"), new AuraReauthStrategy(), new AuraSignOutStrategy("ar-genai")), new C4022Ck5(new Ck3((C4021Ck4) C7384Etj.A0G(AuraCrudoNet.requestFactory$delegate), new InterfaceC4039Ckg() { // from class: com.facebook.aura.auth.AuraAuthManager$createAuthManager$1$frlRequestFactory$1
                @Override // X.InterfaceC4039Ckg
                public final String get() {
                    return AuraClientToken.loggedOutARAccessToken;
                }
            }, new AuraEndpointSelector())), (CGw) AuraUserSessionStore.instance$delegate.getValue(), c4oTAuthPrefs);
        } finally {
            Trace.endSection();
        }
    }

    public final InterfaceC4040Ckh getInstance() {
        return instance;
    }

    public final void reinitialize() {
        instance = createAuthManager();
    }
}
