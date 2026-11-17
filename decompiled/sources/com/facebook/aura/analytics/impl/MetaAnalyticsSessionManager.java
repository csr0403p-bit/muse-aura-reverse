package com.facebook.aura.analytics.impl;

import X.AbstractC3358CGz;
import X.AbstractC4937DFs;
import X.C06H;
import X.C4931DFd;
import X.C7384Etj;
import X.CH0;
import com.facebook.aura.auth.store.AuraUserSessionStore;

/* loaded from: classes3.dex */
public final class MetaAnalyticsSessionManager extends AbstractC4937DFs {
    public static final Companion Companion = new Companion();
    public static final MetaAnalyticsSessionManager instance = new MetaAnalyticsSessionManager();
    public AbraPigeonIdentity loggedInIdentity;

    public final class Companion {
        public final MetaAnalyticsSessionManager getInstance() {
            return MetaAnalyticsSessionManager.instance;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.AbstractC4937DFs
    public void notifyOnUserLoggedIn(C4931DFd c4931DFd) {
        C7384Etj.A0Y(c4931DFd, 0);
        super.notifyOnUserLoggedIn(c4931DFd);
        this.loggedInIdentity = (AbraPigeonIdentity) c4931DFd;
    }

    public final AbraPigeonIdentity getLoggedInIdentity() {
        return this.loggedInIdentity;
    }

    @Override // X.AbstractC4937DFs
    public C4931DFd provideBootstrappedPigeonIdentity() {
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession == null) {
            return null;
        }
        String str = ((CH0) currentUserSession).A01;
        MetaAnalyticsSessionManager$provideBootstrappedPigeonIdentity$1$1 metaAnalyticsSessionManager$provideBootstrappedPigeonIdentity$1$1 = new MetaAnalyticsSessionManager$provideBootstrappedPigeonIdentity$1$1(currentUserSession);
        C7384Etj.A0Y(str, 0);
        return new AbraPigeonIdentity(str, metaAnalyticsSessionManager$provideBootstrappedPigeonIdentity$1$1);
    }

    @Override // X.AbstractC4937DFs
    public String provideBootstrappedUserID() {
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession != null) {
            return ((CH0) currentUserSession).A01;
        }
        return null;
    }
}
