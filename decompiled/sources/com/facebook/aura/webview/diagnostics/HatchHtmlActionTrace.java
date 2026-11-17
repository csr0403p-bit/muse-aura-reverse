package com.facebook.aura.webview.diagnostics;

import X.AnonymousClass003;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import android.os.SystemClock;
import com.facebook.aura.perf.HatchHtmlQplLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class HatchHtmlActionTrace {
    public final HatchHtmlActionType actionType;
    public final AtomicBoolean ended;
    public final int instanceKey;
    public final long startedAtMs;
    public final HatchHtmlSurface surface;

    public final void failed(HatchHtmlErrorCode hatchHtmlErrorCode, String str, Throwable th) {
        C7384Etj.A0Y(hatchHtmlErrorCode, 0);
        if (this.ended.compareAndSet(false, true)) {
            HatchHtmlDiagnostics hatchHtmlDiagnostics = HatchHtmlDiagnostics.INSTANCE;
            hatchHtmlDiagnostics.record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(this.surface, "action_fail", hatchHtmlErrorCode, Integer.valueOf(this.instanceKey), Long.valueOf(SystemClock.elapsedRealtime() - this.startedAtMs), hatchHtmlDiagnostics.detailWith$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(str, th), null);
            HatchHtmlQplLogger.INSTANCE.actionFail(this.instanceKey, hatchHtmlErrorCode.getWireName(), th != null ? C60O.A0n(th) : null);
        }
    }

    public final void routed(HatchHtmlRoute hatchHtmlRoute) {
        C7384Etj.A0Y(hatchHtmlRoute, 0);
        if (this.ended.compareAndSet(false, true)) {
            HatchHtmlDiagnostics.INSTANCE.record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(this.surface, FGI.A0M("action_success:", hatchHtmlRoute.getWireName()), null, Integer.valueOf(this.instanceKey), Long.valueOf(SystemClock.elapsedRealtime() - this.startedAtMs), null, null);
            HatchHtmlQplLogger.INSTANCE.actionSuccess(this.instanceKey, hatchHtmlRoute.getWireName());
        }
    }

    public static /* synthetic */ void failed$default(HatchHtmlActionTrace hatchHtmlActionTrace, HatchHtmlErrorCode hatchHtmlErrorCode, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        hatchHtmlActionTrace.failed(hatchHtmlErrorCode, str, th);
    }

    public final HatchHtmlActionType getActionType() {
        return this.actionType;
    }

    public final int getInstanceKey$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics() {
        return this.instanceKey;
    }

    public final HatchHtmlSurface getSurface() {
        return this.surface;
    }

    public HatchHtmlActionTrace(int i, HatchHtmlSurface hatchHtmlSurface, HatchHtmlActionType hatchHtmlActionType) {
        AnonymousClass003.A0x(hatchHtmlSurface, hatchHtmlActionType);
        this.instanceKey = i;
        this.surface = hatchHtmlSurface;
        this.actionType = hatchHtmlActionType;
        this.startedAtMs = SystemClock.elapsedRealtime();
        this.ended = C60O.A1E();
    }
}
