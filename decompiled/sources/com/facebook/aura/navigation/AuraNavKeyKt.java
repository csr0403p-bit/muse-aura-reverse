package com.facebook.aura.navigation;

import X.C7384Etj;

/* loaded from: classes.dex */
public abstract class AuraNavKeyKt {
    public static final boolean isBlockingOverlay(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return (auraNavKey instanceof AuraOverlayNavKey) && (auraNavKey instanceof AuraFullScreenNavKey);
    }
}
