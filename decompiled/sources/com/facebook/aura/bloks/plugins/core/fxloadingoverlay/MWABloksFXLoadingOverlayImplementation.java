package com.facebook.aura.bloks.plugins.core.fxloadingoverlay;

import X.AnonymousClass003;
import X.C3cG;
import X.F6D;
import X.Hj6;
import com.facebook.aura.bloks.extensions.fx.AuraFXCalExtensions;

/* loaded from: classes6.dex */
public final class MWABloksFXLoadingOverlayImplementation {
    public static final MWABloksFXLoadingOverlayImplementation INSTANCE = new MWABloksFXLoadingOverlayImplementation();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        AnonymousClass003.A0u(hj6, f6d);
        AuraFXCalExtensions.loadingOverlay(f6d, hj6);
        return C3cG.A0T();
    }
}
