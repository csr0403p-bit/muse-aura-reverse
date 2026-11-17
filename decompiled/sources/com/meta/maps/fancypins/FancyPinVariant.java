package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.Hr7;
import java.util.List;

/* loaded from: classes6.dex */
public final class FancyPinVariant {
    public final String id;
    public final List<FancyPinPart> parts;

    public final String getId() {
        return this.id;
    }

    public final List<FancyPinPart> getParts() {
        return this.parts;
    }

    public FancyPinVariant(String str, List<FancyPinPart> list) {
        AnonymousClass003.A0u(str, list);
        this.id = str;
        this.parts = Hr7.A1H(list);
    }
}
