package com.meta.maps.fancypins;

import X.AnonymousClass003;
import java.util.Map;

/* loaded from: classes6.dex */
public final class PinLayout {
    public final String id;
    public final Map<String, VariantLayout> variants;

    public PinLayout(String str, Map<String, VariantLayout> map) {
        AnonymousClass003.A0u(str, map);
        this.id = str;
        this.variants = map;
    }
}
