package com.facebook.aura.iap;

import X.C7384Etj;
import X.C9682Gdm;
import android.content.Context;
import com.facebook.aura.iap.di.HatchIapManagerProvider;

/* loaded from: classes6.dex */
public final class HatchIapManagerProviderImpl implements HatchIapManagerProvider {
    public static final HatchIapManagerProviderImpl INSTANCE = new HatchIapManagerProviderImpl();

    @Override // com.facebook.aura.iap.di.HatchIapManagerProvider
    public C9682Gdm getIapManager(Context context) {
        C7384Etj.A0Y(context, 0);
        HatchIapUserSession scoped = HatchIapUserSession.Companion.getScoped(context);
        if (scoped != null) {
            return scoped.getIapManager();
        }
        return null;
    }
}
