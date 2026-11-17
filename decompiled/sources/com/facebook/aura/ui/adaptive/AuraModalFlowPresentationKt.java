package com.facebook.aura.ui.adaptive;

import X.BFM;
import X.C06G;

/* loaded from: classes.dex */
public abstract class AuraModalFlowPresentationKt {
    public static final AuraModalFlowPresentation auraModalFlowPresentation(BFM bfm, int i) {
        return C06G.A0p(bfm) ? AuraModalFlowPresentation.Pages : AuraModalFlowPresentation.Dialog;
    }
}
