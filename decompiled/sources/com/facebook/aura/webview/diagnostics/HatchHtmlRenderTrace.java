package com.facebook.aura.webview.diagnostics;

import X.C3cI;
import X.C60O;
import X.C7384Etj;
import android.os.SystemClock;
import com.facebook.aura.perf.HatchHtmlQplLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class HatchHtmlRenderTrace {
    public final AtomicBoolean ended;
    public final int instanceKey;
    public final long startedAtMs;
    public final HatchHtmlSurface surface;

    public HatchHtmlRenderTrace(int i, HatchHtmlSurface hatchHtmlSurface) {
        C7384Etj.A0Y(hatchHtmlSurface, 1);
        this.instanceKey = i;
        this.surface = hatchHtmlSurface;
        this.startedAtMs = SystemClock.elapsedRealtime();
        this.ended = C60O.A1E();
    }

    public final void failed(HatchHtmlErrorCode hatchHtmlErrorCode, String str, Throwable th) {
        C7384Etj.A0Y(hatchHtmlErrorCode, 0);
        boolean zCompareAndSet = this.ended.compareAndSet(false, true);
        String strA0n = th != null ? C60O.A0n(th) : null;
        HatchHtmlDiagnostics hatchHtmlDiagnostics = HatchHtmlDiagnostics.INSTANCE;
        Long lValueOf = null;
        HatchHtmlSurface hatchHtmlSurface = this.surface;
        String str2 = zCompareAndSet ? "render_fail" : "post_render_error";
        Integer numValueOf = Integer.valueOf(this.instanceKey);
        if (zCompareAndSet) {
            lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.startedAtMs);
        }
        hatchHtmlDiagnostics.record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(hatchHtmlSurface, str2, hatchHtmlErrorCode, numValueOf, lValueOf, hatchHtmlDiagnostics.detailWith$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(str, th), null);
        HatchHtmlQplLogger hatchHtmlQplLogger = HatchHtmlQplLogger.INSTANCE;
        HatchHtmlSurface hatchHtmlSurface2 = this.surface;
        hatchHtmlQplLogger.logError(hatchHtmlSurface2.getWireName(), hatchHtmlSurface2.getPipeline().getWireName(), hatchHtmlErrorCode.getWireName(), strA0n, true, null);
        if (zCompareAndSet) {
            hatchHtmlQplLogger.renderFail(this.instanceKey, hatchHtmlErrorCode.getWireName(), strA0n);
        }
    }

    public final void resourceError(HatchHtmlErrorCode hatchHtmlErrorCode, String str, Throwable th, Integer num) {
        C7384Etj.A0Y(hatchHtmlErrorCode, 0);
        HatchHtmlDiagnostics hatchHtmlDiagnostics = HatchHtmlDiagnostics.INSTANCE;
        hatchHtmlDiagnostics.record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(this.surface, "resource_error", hatchHtmlErrorCode, Integer.valueOf(this.instanceKey), null, hatchHtmlDiagnostics.detailWith$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(str, th), null);
        HatchHtmlQplLogger hatchHtmlQplLogger = HatchHtmlQplLogger.INSTANCE;
        HatchHtmlSurface hatchHtmlSurface = this.surface;
        hatchHtmlQplLogger.logError(hatchHtmlSurface.getWireName(), hatchHtmlSurface.getPipeline().getWireName(), hatchHtmlErrorCode.getWireName(), th != null ? C60O.A0n(th) : null, false, num);
    }

    public static /* synthetic */ void failed$default(HatchHtmlRenderTrace hatchHtmlRenderTrace, HatchHtmlErrorCode hatchHtmlErrorCode, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        hatchHtmlRenderTrace.failed(hatchHtmlErrorCode, str, th);
    }

    public static /* synthetic */ void resourceError$default(HatchHtmlRenderTrace hatchHtmlRenderTrace, HatchHtmlErrorCode hatchHtmlErrorCode, String str, Throwable th, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        hatchHtmlRenderTrace.resourceError(hatchHtmlErrorCode, str, th, num);
    }

    public final void cancelled() {
        if (C3cI.A1W(this.ended)) {
            HatchHtmlDiagnostics.INSTANCE.record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(this.surface, "render_cancel", null, Integer.valueOf(this.instanceKey), Long.valueOf(SystemClock.elapsedRealtime() - this.startedAtMs), null, null);
            HatchHtmlQplLogger.INSTANCE.renderCancel(this.instanceKey);
        }
    }

    public final void committed() {
        if (this.ended.get()) {
            return;
        }
        HatchHtmlDiagnostics.INSTANCE.record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(this.surface, "page_committed", null, Integer.valueOf(this.instanceKey), null, null, null);
        HatchHtmlQplLogger.INSTANCE.renderCommitted(this.instanceKey);
    }

    public final void finished() {
        if (C3cI.A1W(this.ended)) {
            HatchHtmlDiagnostics.INSTANCE.record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(this.surface, "render_success", null, Integer.valueOf(this.instanceKey), Long.valueOf(SystemClock.elapsedRealtime() - this.startedAtMs), null, null);
            HatchHtmlQplLogger.INSTANCE.renderSuccess(this.instanceKey);
        }
    }

    public final int getInstanceKey$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics() {
        return this.instanceKey;
    }

    public final HatchHtmlSurface getSurface() {
        return this.surface;
    }

    private final long elapsedMs() {
        return SystemClock.elapsedRealtime() - this.startedAtMs;
    }
}
