package com.facebook.aura.memory;

import X.AbstractC3358CGz;
import X.AnonymousClass007;
import X.C3cG;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AuraCacheRetainedSizes implements AuraRetainedSizeSource {
    public static final AuraCacheRetainedSizes INSTANCE = new AuraCacheRetainedSizes();

    @Override // com.facebook.aura.memory.AuraRetainedSizeSource
    public Map<String, Long> retainedSizes(AbstractC3358CGz abstractC3358CGz) {
        return AnonymousClass007.A0d("cache_bytes", Long.valueOf(AuraMemoryPressure.INSTANCE.getCachedBytes()), C3cG.A0r("trimmables", Long.valueOf(AuraMemoryPressure.trimmables.size())));
    }
}
