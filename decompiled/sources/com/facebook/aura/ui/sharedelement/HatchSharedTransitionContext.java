package com.facebook.aura.ui.sharedelement;

import X.AP1;
import X.AnonymousClass003;

/* loaded from: classes4.dex */
public final class HatchSharedTransitionContext {
    public final SharedElementClipRegistry clipRegistry;
    public final AP1 scope;

    public final SharedElementClipRegistry getClipRegistry() {
        return this.clipRegistry;
    }

    public final AP1 getScope() {
        return this.scope;
    }

    public HatchSharedTransitionContext(AP1 ap1, SharedElementClipRegistry sharedElementClipRegistry) {
        AnonymousClass003.A0u(ap1, sharedElementClipRegistry);
        this.scope = ap1;
        this.clipRegistry = sharedElementClipRegistry;
    }
}
