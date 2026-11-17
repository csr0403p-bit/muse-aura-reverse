package com.facebook.aura.components.reactions;

import X.AnonymousClass003;
import X.BRg;

/* loaded from: classes.dex */
public final class AuraReactionEffects {
    public static final int $stable = 0;
    public final BRg glyph;
    public final BRg overlay;

    public final BRg getGlyph() {
        return this.glyph;
    }

    public final BRg getOverlay() {
        return this.overlay;
    }

    public AuraReactionEffects(BRg bRg, BRg bRg2) {
        AnonymousClass003.A0u(bRg, bRg2);
        this.overlay = bRg;
        this.glyph = bRg2;
    }
}
