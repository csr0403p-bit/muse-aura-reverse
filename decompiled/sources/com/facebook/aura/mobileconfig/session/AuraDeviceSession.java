package com.facebook.aura.mobileconfig.session;

import X.AnonymousClass005;
import X.C3143BzU;
import X.C3cG;
import X.DRZ;
import X.F18;
import X.HtJ;
import com.facebook.mobileconfig.MobileConfigFetcher;
import java.io.File;

/* loaded from: classes5.dex */
public final class AuraDeviceSession {
    public final AuraMobileConfigSession mcSession;

    public AuraDeviceSession(MobileConfigFetcher mobileConfigFetcher, F18<C3143BzU> f18, String str) {
        AuraMobileConfigSession auraMobileConfigSession = new AuraMobileConfigSession(AuraDeviceSession$mcSession$1.INSTANCE, str, AnonymousClass005.A1Z(mobileConfigFetcher, f18, str) ? 1 : 0);
        this.mcSession = auraMobileConfigSession;
        File fileA0O = C3cG.A0O(C3cG.A06().getFilesDir(), "mc_sessionless");
        fileA0O.mkdirs();
        AuraMobileConfigSession.create$default(auraMobileConfigSession, mobileConfigFetcher, f18, fileA0O, null, null, null, null, false, 120, null);
    }

    public final void fetchConfigs() {
        this.mcSession.fetchConfigs();
    }

    public final Object fetchConfigsSynchronously(HtJ<? super Boolean> htJ) {
        return this.mcSession.fetchConfigsSynchronously(htJ);
    }

    public final DRZ getMCFactory() {
        return this.mcSession.getMCFactory();
    }
}
