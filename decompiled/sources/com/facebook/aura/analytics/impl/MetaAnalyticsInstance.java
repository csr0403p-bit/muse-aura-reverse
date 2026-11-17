package com.facebook.aura.analytics.impl;

import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.C7384Etj;
import X.CH0;
import X.DFX;
import X.F0C;
import com.facebook.aura.auth.store.AuraUserSessionStore;

/* loaded from: classes5.dex */
public final class MetaAnalyticsInstance {
    public final F0C<DFX> instanceLazy = AbstractC5321DgF.A03(MetaAnalyticsInstance$instanceLazy$1.INSTANCE);

    private final DFX getInstance() {
        return this.instanceLazy.getValue();
    }

    public final AbraPigeonIdentity getLoggedInIdentity$fbandroid_express_aura_java_com_facebook_aura_analytics_impl_impl() {
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession == null) {
            return null;
        }
        String str = ((CH0) currentUserSession).A01;
        MetaAnalyticsInstance$getLoggedInIdentity$1$1 metaAnalyticsInstance$getLoggedInIdentity$1$1 = new MetaAnalyticsInstance$getLoggedInIdentity$1$1(currentUserSession);
        C7384Etj.A0Y(str, 0);
        return new AbraPigeonIdentity(str, metaAnalyticsInstance$getLoggedInIdentity$1$1);
    }

    public final void triggerUploadNow() {
        if (this.instanceLazy.AOX()) {
            getInstance().A05.AhQ();
        }
    }

    private final void maybeNotifyUserLogin() {
        AbraPigeonIdentity loggedInIdentity$fbandroid_express_aura_java_com_facebook_aura_analytics_impl_impl = getLoggedInIdentity$fbandroid_express_aura_java_com_facebook_aura_analytics_impl_impl();
        if (loggedInIdentity$fbandroid_express_aura_java_com_facebook_aura_analytics_impl_impl != null) {
            MetaAnalyticsSessionManager.instance.notifyOnUserLoggedIn(loggedInIdentity$fbandroid_express_aura_java_com_facebook_aura_analytics_impl_impl);
        }
    }

    public final DFX getAppInstance() {
        maybeNotifyUserLogin();
        return getInstance();
    }

    public final DFX getDeviceInstance() {
        return getInstance();
    }
}
