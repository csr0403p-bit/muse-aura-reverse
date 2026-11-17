package com.facebook.aura.analytics.impl;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.CH0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class MetaAnalyticsInstance$getLoggedInIdentity$1$1 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ AbstractC3358CGz $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAnalyticsInstance$getLoggedInIdentity$1$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$session = abstractC3358CGz;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return MetaAnalyticsSessionManagerKt.auraAccessTokenClaim(((CH0) this.$session).A01);
    }
}
