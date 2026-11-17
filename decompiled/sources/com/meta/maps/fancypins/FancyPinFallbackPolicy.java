package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.Hr7;
import java.util.List;

/* loaded from: classes6.dex */
public final class FancyPinFallbackPolicy {
    public final List<String> fallbacks;
    public final String targetVariantId;

    public final List<String> getFallbacks() {
        return this.fallbacks;
    }

    public final String getTargetVariantId() {
        return this.targetVariantId;
    }

    public FancyPinFallbackPolicy(String str, List<String> list) {
        AnonymousClass003.A0u(str, list);
        this.targetVariantId = str;
        this.fallbacks = Hr7.A1H(list);
    }
}
