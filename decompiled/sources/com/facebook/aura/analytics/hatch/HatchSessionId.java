package com.facebook.aura.analytics.hatch;

import X.BV5;
import X.CI8;
import com.facebook.aura.analytics.impl.MetaAnalyticsSessionIdGenerator;

/* loaded from: classes5.dex */
public final class HatchSessionId {
    public static final int $stable = 0;
    public static final HatchSessionId INSTANCE = new HatchSessionId();
    public static final String fallback = BV5.A0j();

    public final String get() {
        String strProvideSessionId;
        MetaAnalyticsSessionIdGenerator existingInstance = MetaAnalyticsSessionIdGenerator.Companion.getExistingInstance();
        return (!(existingInstance instanceof CI8) || existingInstance == null || (strProvideSessionId = existingInstance.provideSessionId()) == null) ? fallback : strProvideSessionId;
    }
}
