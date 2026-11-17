package com.meta.maps.fancypins;

import X.AnonymousClass003;
import java.util.Map;

/* loaded from: classes6.dex */
public final class PinMeasurement {
    public final String id;
    public final Map<String, VariantMeasurement> variants;

    public PinMeasurement(String str, Map<String, VariantMeasurement> map) {
        AnonymousClass003.A0u(str, map);
        this.id = str;
        this.variants = map;
    }
}
