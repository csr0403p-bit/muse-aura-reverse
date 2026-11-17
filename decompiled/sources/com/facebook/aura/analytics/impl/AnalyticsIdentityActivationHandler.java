package com.facebook.aura.analytics.impl;

import X.AbstractC7559F3s;
import X.C7384Etj;
import com.facebook.aura.auth.SessionActivationHandler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AnalyticsIdentityActivationHandler implements SessionActivationHandler {
    public static final AnalyticsIdentityActivationHandler INSTANCE = new AnalyticsIdentityActivationHandler();

    /* renamed from: com.facebook.aura.analytics.impl.AnalyticsIdentityActivationHandler$onActivating$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$userId = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return MetaAnalyticsSessionManagerKt.auraAccessTokenClaim(this.$userId);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return MetaAnalyticsSessionManagerKt.auraAccessTokenClaim(this.$userId);
        }
    }

    @Override // com.facebook.aura.auth.SessionActivationHandler
    public void onActivating(String str) {
        C7384Etj.A0Y(str, 0);
        MetaAnalyticsSessionManager.instance.notifyOnUserLoggedIn(new AbraPigeonIdentity(str, new AnonymousClass1(str)));
    }
}
