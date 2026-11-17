package com.facebook.aura.perf;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C60O;
import X.C7384Etj;
import com.facebook.quicklog.EventBuilder;

/* loaded from: classes3.dex */
public final class HatchHtmlQplLogger {
    public static final HatchHtmlQplLogger INSTANCE = new HatchHtmlQplLogger();

    public final void actionFail(int i, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        if (C60O.A0g().isMarkerOn(734870907, i)) {
            annotateFailure(734870907, i, str, str2);
            hatchQplLogger.markerEnd(734870907, (short) 3, i);
        }
    }

    public final void renderFail(int i, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        if (C60O.A0g().isMarkerOn(734864187, i)) {
            annotateFailure(734864187, i, str, str2);
            hatchQplLogger.markerEnd(734864187, (short) 3, i);
        }
    }

    public final void startAction(int i, String str, String str2, String str3, String str4, String str5, Integer num) {
        AnonymousClass005.A11(str, str2, str3, 1);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734870907, i, false);
        annotateCommon(734870907, i, str, str2);
        hatchQplLogger.markerAnnotate(734870907, "action_type", str3, i);
        annotateUrl(734870907, i, str4, str5, num);
    }

    public final void startRender(int i, String str, String str2, boolean z, String str3, String str4, String str5, Integer num) {
        AnonymousClass002.A1A(str, 1, str2);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734864187, i, true);
        annotateCommon(734864187, i, str, str2);
        hatchQplLogger.markerAnnotate(734864187, "is_agent_generated", z, i);
        if (str3 != null) {
            hatchQplLogger.markerAnnotate(734864187, "entry_source", str3, i);
        }
        annotateUrl(734864187, i, str4, str5, num);
    }

    private final void annotateCommon(int i, int i2, String str, String str2) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(i, "surface", str, i2);
        hatchQplLogger.markerAnnotate(i, "pipeline", str2, i2);
    }

    private final void annotateFailure(int i, int i2, String str, String str2) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(i, "error_code", str, i2);
        if (str2 != null) {
            hatchQplLogger.markerAnnotate(i, "error_type", str2, i2);
        }
    }

    private final void annotateUrl(int i, int i2, String str, String str2, Integer num) {
        if (str != null) {
            HatchQplLogger.INSTANCE.markerAnnotate(i, "url_scheme", str, i2);
        }
        if (str2 != null) {
            HatchQplLogger.INSTANCE.markerAnnotate(i, "url_host", str2, i2);
        }
        if (num != null) {
            HatchQplLogger.INSTANCE.markerAnnotate(i, "url_path_depth", num.intValue(), i2);
        }
    }

    public final void actionSuccess(int i, String str) {
        C7384Etj.A0Y(str, 1);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        if (C60O.A0g().isMarkerOn(734870907, i)) {
            hatchQplLogger.markerAnnotate(734870907, "route", str, i);
            hatchQplLogger.markerEnd(734870907, (short) 2, i);
        }
    }

    public final void logError(String str, String str2, String str3, String str4, Boolean bool, Integer num) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0x(str2, str3);
        EventBuilder eventBuilderAnnotate = HatchQplLogger.INSTANCE.markEvent(734868267, str3).annotate("surface", str).annotate("pipeline", str2).annotate("error_code", str3);
        if (str4 != null) {
            eventBuilderAnnotate.annotate("error_type", str4);
        }
        if (bool != null) {
            eventBuilderAnnotate.annotate("is_main_frame", bool.booleanValue());
        }
        if (num != null) {
            eventBuilderAnnotate.annotate("http_status", num.intValue());
        }
        eventBuilderAnnotate.report();
    }

    public final void renderCancel(int i) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        if (C60O.A0g().isMarkerOn(734864187, i)) {
            hatchQplLogger.markerEnd(734864187, (short) 4, i);
        }
    }

    public final void renderCommitted(int i) {
        HatchQplLogger.INSTANCE.markerPoint(734864187, "page_committed", i);
    }

    public final void renderSuccess(int i) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        if (C60O.A0g().isMarkerOn(734864187, i)) {
            hatchQplLogger.markerEnd(734864187, (short) 2, i);
        }
    }
}
