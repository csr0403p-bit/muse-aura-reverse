package com.facebook.aura.localbrowser;

import X.C7384Etj;
import com.facebook.aura.auth.SessionActivationHandler;

/* loaded from: classes3.dex */
public final class LocalBrowserProfileActivationHandler implements SessionActivationHandler {
    public static final int $stable = 0;
    public static final LocalBrowserProfileActivationHandler INSTANCE = new LocalBrowserProfileActivationHandler();

    @Override // com.facebook.aura.auth.SessionActivationHandler
    public void onActivating(String str) {
        C7384Etj.A0Y(str, 0);
        LocalBrowserProfiles.INSTANCE.forget(str, null);
    }
}
