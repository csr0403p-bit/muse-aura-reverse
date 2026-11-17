package com.facebook.aura.maps;

import X.AnonymousClass003;
import X.InterfaceC1559AlZ;

/* loaded from: classes4.dex */
public final class HatchRetainedMapLease implements InterfaceC1559AlZ {
    public boolean isReleased;
    public final HatchRetainedMapPresentation presentation;
    public final HatchRetainedMapRegistry registry;

    private final void release() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        this.registry.release(this.presentation);
    }

    public final HatchRetainedMapPresentation getPresentation() {
        return this.presentation;
    }

    @Override // X.InterfaceC1559AlZ
    public void onRemembered() {
    }

    public HatchRetainedMapLease(HatchRetainedMapRegistry hatchRetainedMapRegistry, HatchRetainedMapPresentation hatchRetainedMapPresentation) {
        AnonymousClass003.A0u(hatchRetainedMapRegistry, hatchRetainedMapPresentation);
        this.registry = hatchRetainedMapRegistry;
        this.presentation = hatchRetainedMapPresentation;
    }

    @Override // X.InterfaceC1559AlZ
    public void onAbandoned() {
        release();
    }

    @Override // X.InterfaceC1559AlZ
    public void onForgotten() {
        release();
    }
}
