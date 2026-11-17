package com.facebook.aura.qpl.startup;

import X.C60O;
import X.C7384Etj;
import X.DAe;
import X.FGI;

/* loaded from: classes3.dex */
public final class StartupRenderCallback {
    public static final int $stable = 8;
    public final String componentName;
    public StartupRenderState state;

    public StartupRenderCallback(String str) {
        C7384Etj.A0Y(str, 0);
        this.componentName = str;
        this.state = StartupRenderState.NOT_STARTED;
    }

    public final void annotate(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        HatchStartupQpl.Companion.markerAnnotate(str, z);
    }

    public final void onRenderFailed(String str) {
        C7384Etj.A0Y(str, 0);
        if (this.state == StartupRenderState.STARTED) {
            this.state = StartupRenderState.ENDED;
            if (DAe.A02()) {
                HatchStartupQpl.Companion.markerPoint(FGI.A0M(this.componentName, "_render_end"), C60O.A0s("FAILURE", str));
            }
        }
    }

    public final void setState$fbandroid_express_aura_java_com_facebook_aura_qpl_startup_startup(StartupRenderState startupRenderState) {
        C7384Etj.A0Y(startupRenderState, 0);
        this.state = startupRenderState;
    }

    public final StartupRenderState getState$fbandroid_express_aura_java_com_facebook_aura_qpl_startup_startup() {
        return this.state;
    }

    public final void onRendered() {
        if (this.state == StartupRenderState.STARTED) {
            this.state = StartupRenderState.ENDED;
            if (DAe.A02()) {
                HatchStartupQpl.Companion.markerPoint(FGI.A0M(this.componentName, "_render_end"), C60O.A0s("SUCCESS", null));
            }
        }
    }
}
