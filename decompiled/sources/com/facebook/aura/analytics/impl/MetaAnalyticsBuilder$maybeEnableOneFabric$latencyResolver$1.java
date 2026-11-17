package com.facebook.aura.analytics.impl;

import X.AbstractC5321DgF;
import X.C4082ClZ;
import X.C5322DgG;
import X.F0C;

/* loaded from: classes5.dex */
public final class MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1 {
    public final /* synthetic */ C4082ClZ $microBatchUploadLatencyParamsProvider;

    public MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1(C4082ClZ c4082ClZ) {
        this.$microBatchUploadLatencyParamsProvider = c4082ClZ;
    }

    public long resolveLatency(long j) {
        if (resolveLatency$lambda$0(new C5322DgG(null, new MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1$resolveLatency$isFfdbEnabled$2(AbstractC5321DgF.A03(MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1$resolveLatency$ffdbProvider$1.INSTANCE))))) {
            return 0L;
        }
        return this.$microBatchUploadLatencyParamsProvider.A00(j).A01;
    }

    public static final boolean resolveLatency$lambda$0(F0C<Boolean> f0c) {
        return f0c.getValue().booleanValue();
    }
}
