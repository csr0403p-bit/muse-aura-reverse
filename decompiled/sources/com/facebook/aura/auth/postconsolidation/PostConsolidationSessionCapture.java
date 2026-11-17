package com.facebook.aura.auth.postconsolidation;

import X.AbstractC3358CGz;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class PostConsolidationSessionCapture {
    public static final int $stable = 8;
    public final String accessToken;
    public final AbstractC3358CGz session;

    public PostConsolidationSessionCapture(AbstractC3358CGz abstractC3358CGz, String str) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.session = abstractC3358CGz;
        this.accessToken = str;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final AbstractC3358CGz getSession() {
        return this.session;
    }
}
