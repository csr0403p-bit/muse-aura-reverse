package com.facebook.aura.qpl.startup;

import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchStartupTracker {
    public static final int $stable = 0;
    public static final String CANCEL_REASON_ANNOTATION = "cancel_reason";
    public static final HatchStartupTracker INSTANCE = new HatchStartupTracker();
    public static volatile G0U<? super String, Unit> cancelHandler;

    public final void annotate(String str, int i) {
        C7384Etj.A0Y(str, 0);
        HatchStartupQpl.Companion.markerAnnotate(str, i);
    }

    public final void endWithCancel(String str) {
        C7384Etj.A0Y(str, 0);
        HatchStartupQpl.Companion.markerAnnotate("cancel_reason", str);
        G0U<? super String, Unit> g0u = cancelHandler;
        if (g0u != null) {
            g0u.invoke(str);
        }
    }

    public final void installCancelHandler(G0U<? super String, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        cancelHandler = g0u;
    }

    public final void point(String str) {
        C7384Etj.A0Y(str, 0);
        HatchStartupQpl.Companion.markerPoint(str);
    }

    public final void annotate(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        HatchStartupQpl.Companion.markerAnnotate(str, z);
    }

    public final void point(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        HatchStartupQpl.Companion.markerPoint(str, str2);
    }

    public final void annotate(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        HatchStartupQpl.Companion.markerAnnotate(str, str2);
    }
}
