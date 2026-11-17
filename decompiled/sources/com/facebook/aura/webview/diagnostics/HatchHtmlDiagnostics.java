package com.facebook.aura.webview.diagnostics;

import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7BY;
import X.F60;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.perf.HatchHtmlQplLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class HatchHtmlDiagnostics {
    public static final String LOCALHOST = "localhost";
    public static final String LOCALHOST_SUFFIX = ".localhost";
    public static final HatchHtmlDiagnostics INSTANCE = new HatchHtmlDiagnostics();
    public static final AtomicInteger renderInstanceKeys = new AtomicInteger();
    public static final AtomicInteger actionInstanceKeys = new AtomicInteger();

    public final class RedactedUrl {
        public final String host;
        public final Integer pathDepth;
        public final String scheme;

        public final String getHost() {
            return this.host;
        }

        public final Integer getPathDepth() {
            return this.pathDepth;
        }

        public final String getScheme() {
            return this.scheme;
        }

        public RedactedUrl(String str, String str2, Integer num) {
            this.scheme = str;
            this.host = str2;
            this.pathDepth = num;
        }
    }

    private final RedactedUrl redact(String str) {
        Object objA0s;
        List listA0h;
        Integer numValueOf = null;
        if (str == null || C7BY.A0j(str)) {
            return new RedactedUrl(null, null, null);
        }
        try {
            objA0s = Uri.parse(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        Uri uri = (Uri) objA0s;
        if (uri == null) {
            return new RedactedUrl(null, null, null);
        }
        String host = uri.getHost();
        int i = 0;
        if (host == null) {
            host = null;
        } else if (host.endsWith(LOCALHOST_SUFFIX)) {
            host = LOCALHOST;
        }
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if (path != null && (listA0h = C7BY.A0h(path, new char[1], '/')) != null) {
            if (!(listA0h instanceof Collection) || !listA0h.isEmpty()) {
                Iterator it = listA0h.iterator();
                while (it.hasNext()) {
                    if (AnonymousClass005.A0j(it).length() > 0 && (i = i + 1) < 0) {
                        AbstractC0885AGm.A13();
                        throw F60.createAndThrow();
                    }
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        return new RedactedUrl(scheme, host, numValueOf);
    }

    public final void logError(HatchHtmlSurface hatchHtmlSurface, HatchHtmlErrorCode hatchHtmlErrorCode, String str, Throwable th, Boolean bool, Integer num) {
        AnonymousClass003.A0u(hatchHtmlSurface, hatchHtmlErrorCode);
        record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(hatchHtmlSurface, "error", hatchHtmlErrorCode, null, null, detailWith$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(str, th), null);
        HatchHtmlQplLogger.INSTANCE.logError(hatchHtmlSurface.getWireName(), hatchHtmlSurface.getPipeline().getWireName(), hatchHtmlErrorCode.getWireName(), th != null ? C60O.A0n(th) : null, bool, num);
    }

    public final void reportRenderFailure(HatchHtmlSurface hatchHtmlSurface, HatchHtmlRenderTrace hatchHtmlRenderTrace, HatchHtmlErrorCode hatchHtmlErrorCode, String str, Throwable th) {
        AnonymousClass003.A0v(hatchHtmlSurface, hatchHtmlErrorCode);
        if (hatchHtmlRenderTrace != null) {
            hatchHtmlRenderTrace.failed(hatchHtmlErrorCode, str, th);
        } else {
            logError(hatchHtmlSurface, hatchHtmlErrorCode, str, th, AnonymousClass001.A0i(), null);
        }
    }

    public final HatchHtmlActionTrace startAction(HatchHtmlSurface hatchHtmlSurface, HatchHtmlActionType hatchHtmlActionType, String str) {
        AnonymousClass003.A0u(hatchHtmlSurface, hatchHtmlActionType);
        HatchHtmlActionTrace hatchHtmlActionTrace = new HatchHtmlActionTrace(actionInstanceKeys.incrementAndGet(), hatchHtmlSurface, hatchHtmlActionType);
        record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(hatchHtmlSurface, FGI.A0M("action_start:", hatchHtmlActionType.getWireName()), null, Integer.valueOf(hatchHtmlActionTrace.instanceKey), null, str, null);
        RedactedUrl redactedUrlRedact = redact(str);
        HatchHtmlQplLogger.INSTANCE.startAction(hatchHtmlActionTrace.instanceKey, hatchHtmlSurface.getWireName(), hatchHtmlSurface.getPipeline().getWireName(), hatchHtmlActionType.getWireName(), redactedUrlRedact.scheme, redactedUrlRedact.host, redactedUrlRedact.pathDepth);
        return hatchHtmlActionTrace;
    }

    public final HatchHtmlRenderTrace startRender(HatchHtmlSurface hatchHtmlSurface, HatchHtmlEntrySource hatchHtmlEntrySource, String str) {
        C7384Etj.A0Y(hatchHtmlSurface, 0);
        HatchHtmlRenderTrace hatchHtmlRenderTrace = new HatchHtmlRenderTrace(renderInstanceKeys.incrementAndGet(), hatchHtmlSurface);
        record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(hatchHtmlSurface, "render_start", null, Integer.valueOf(hatchHtmlRenderTrace.instanceKey), null, str, hatchHtmlEntrySource);
        RedactedUrl redactedUrlRedact = redact(str);
        HatchHtmlQplLogger.INSTANCE.startRender(hatchHtmlRenderTrace.instanceKey, hatchHtmlSurface.getWireName(), hatchHtmlSurface.getPipeline().getWireName(), hatchHtmlSurface.isAgentGenerated(), hatchHtmlEntrySource != null ? hatchHtmlEntrySource.getWireName() : null, redactedUrlRedact.scheme, redactedUrlRedact.host, redactedUrlRedact.pathDepth);
        return hatchHtmlRenderTrace;
    }

    public static /* synthetic */ void logError$default(HatchHtmlDiagnostics hatchHtmlDiagnostics, HatchHtmlSurface hatchHtmlSurface, HatchHtmlErrorCode hatchHtmlErrorCode, String str, Throwable th, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        hatchHtmlDiagnostics.logError(hatchHtmlSurface, hatchHtmlErrorCode, str, th, bool, num);
    }

    public static /* synthetic */ void record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics$default(HatchHtmlDiagnostics hatchHtmlDiagnostics, HatchHtmlSurface hatchHtmlSurface, String str, HatchHtmlErrorCode hatchHtmlErrorCode, Integer num, Long l, String str2, HatchHtmlEntrySource hatchHtmlEntrySource, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchHtmlErrorCode = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            hatchHtmlEntrySource = null;
        }
        hatchHtmlDiagnostics.record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(hatchHtmlSurface, str, hatchHtmlErrorCode, num, l, str2, hatchHtmlEntrySource);
    }

    public static /* synthetic */ void reportRenderFailure$default(HatchHtmlDiagnostics hatchHtmlDiagnostics, HatchHtmlSurface hatchHtmlSurface, HatchHtmlRenderTrace hatchHtmlRenderTrace, HatchHtmlErrorCode hatchHtmlErrorCode, String str, Throwable th, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            th = null;
        }
        hatchHtmlDiagnostics.reportRenderFailure(hatchHtmlSurface, hatchHtmlRenderTrace, hatchHtmlErrorCode, str, th);
    }

    public static /* synthetic */ HatchHtmlRenderTrace startRender$default(HatchHtmlDiagnostics hatchHtmlDiagnostics, HatchHtmlSurface hatchHtmlSurface, HatchHtmlEntrySource hatchHtmlEntrySource, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchHtmlEntrySource = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return hatchHtmlDiagnostics.startRender(hatchHtmlSurface, hatchHtmlEntrySource, str);
    }

    public final String detailWith$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(String str, Throwable th) {
        StringBuilder sbA0g;
        if (th == null) {
            return str;
        }
        String strA0n = C60O.A0n(th);
        String message = th.getMessage();
        if (str == null) {
            sbA0g = C60O.A0w();
        } else {
            sbA0g = C3cG.A0g(str);
            sbA0g.append(" | ");
        }
        sbA0g.append(strA0n);
        return C60P.A1M(": ", message, sbA0g);
    }

    public final void record$fbandroid_express_aura_java_com_facebook_aura_webview_diagnostics_diagnostics(HatchHtmlSurface hatchHtmlSurface, String str, HatchHtmlErrorCode hatchHtmlErrorCode, Integer num, Long l, String str2, HatchHtmlEntrySource hatchHtmlEntrySource) {
        AnonymousClass003.A0u(hatchHtmlSurface, str);
        HatchHtmlDiagnosticsRecorder hatchHtmlDiagnosticsRecorder = HatchHtmlDiagnosticsRecorder.INSTANCE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (num != null) {
            str = AnonymousClass006.A0y(num, "#", C3cG.A0g(str));
        }
        hatchHtmlDiagnosticsRecorder.record(new HatchHtmlDiagnosticsEntry(jCurrentTimeMillis, hatchHtmlSurface, str, hatchHtmlErrorCode, l, str2, hatchHtmlEntrySource));
    }
}
