package com.meta.maps.fancypins;

import X.AnonymousClass003;
import java.util.Map;

/* loaded from: classes6.dex */
public final class VariantMeasurement {
    public final String id;
    public final Map<String, PartMeasurement> parts;

    public VariantMeasurement(String str, Map<String, PartMeasurement> map) {
        AnonymousClass003.A0u(str, map);
        this.id = str;
        this.parts = map;
    }
}
