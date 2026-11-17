package com.facebook.aura.ui.adaptive;

import X.BFM;
import X.C06G;

/* loaded from: classes.dex */
public abstract class AuraAvatarPanelShapeKt {
    public static final AuraAvatarPanelShape auraAvatarPanelShape(BFM bfm, int i) {
        return C06G.A0p(bfm) ? AuraAvatarPanelShape.FullWidth : AuraAvatarPanelShape.Square;
    }
}
