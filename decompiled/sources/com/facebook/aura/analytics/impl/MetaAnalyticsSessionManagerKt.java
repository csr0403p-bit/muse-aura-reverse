package com.facebook.aura.analytics.impl;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.CH0;
import X.FGI;
import com.facebook.aura.auth.store.AuraUserSessionStore;

/* loaded from: classes3.dex */
public abstract class MetaAnalyticsSessionManagerKt {
    public static final String auraAccessTokenClaim(String str) {
        String str2;
        C7384Etj.A0Y(str, 0);
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession == null) {
            return null;
        }
        CH0 ch0 = (CH0) currentUserSession;
        if (!str.equals(ch0.A01) || (str2 = CH0.A01(ch0).A04) == null || str2.length() == 0) {
            return null;
        }
        return FGI.A0M("at.", str2);
    }
}
