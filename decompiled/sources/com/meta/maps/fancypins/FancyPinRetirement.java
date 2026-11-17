package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FancyPinRetirement {
    public final G0U<FancyPinRetirement, Unit> completion;
    public final String pinId;
    public final int slotIndex;

    public final void complete() {
        this.completion.invoke(this);
    }

    public final String getPinId() {
        return this.pinId;
    }

    public final int getSlotIndex() {
        return this.slotIndex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FancyPinRetirement(String str, int i, G0U<? super FancyPinRetirement, Unit> g0u) {
        AnonymousClass003.A0v(str, g0u);
        this.pinId = str;
        this.slotIndex = i;
        this.completion = g0u;
    }
}
