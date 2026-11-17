package com.facebook.aura.qpl.startup;

import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.DAe;
import X.FGI;

/* loaded from: classes3.dex */
public abstract class RememberOnStartupRenderedCallbackKt {
    public static final StartupRenderCallback rememberOnStartupRenderedCallback(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new StartupRenderCallback(str);
            bfm.Ai0(objAaT);
        }
        StartupRenderCallback startupRenderCallback = (StartupRenderCallback) objAaT;
        if (startupRenderCallback.state == StartupRenderState.NOT_STARTED) {
            if (DAe.A02()) {
                HatchStartupQpl.Companion.markerPoint(FGI.A0M(str, "_render_start"));
            }
            startupRenderCallback.state = StartupRenderState.STARTED;
        }
        return startupRenderCallback;
    }
}
