package com.facebook.aura.analytics.impl;

import com.facebook.aura.common.identifiers.fdid.AuraFamilyDeviceId;

/* loaded from: classes5.dex */
public final class MetaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1 {
    public static final MetaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1 INSTANCE = new MetaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1();

    public final String get() {
        String str = AuraFamilyDeviceId.INSTANCE.get();
        return str == null ? "" : str;
    }
}
