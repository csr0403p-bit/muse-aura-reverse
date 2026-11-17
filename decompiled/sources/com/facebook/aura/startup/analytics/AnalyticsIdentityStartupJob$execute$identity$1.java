package com.facebook.aura.startup.analytics;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.impl.MetaAnalyticsSessionManagerKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AnalyticsIdentityStartupJob$execute$identity$1 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ String $userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsIdentityStartupJob$execute$identity$1(String str) {
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
