package com.meta.maps.fancypins;

import X.AnonymousClass003;

/* loaded from: classes6.dex */
public final class OwnedPartConfiguration implements FancyPinErasedPartConfiguration {
    public final Object owner;
    public final FancyPinPartConfiguration value;

    public final Object getOwner() {
        return this.owner;
    }

    public final FancyPinPartConfiguration getValue() {
        return this.value;
    }

    public OwnedPartConfiguration(Object obj, FancyPinPartConfiguration fancyPinPartConfiguration) {
        AnonymousClass003.A0u(obj, fancyPinPartConfiguration);
        this.owner = obj;
        this.value = fancyPinPartConfiguration;
    }
}
