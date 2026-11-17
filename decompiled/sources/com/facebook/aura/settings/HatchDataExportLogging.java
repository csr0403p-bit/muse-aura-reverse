package com.facebook.aura.settings;

import X.AGH;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchDataExportLogging {
    public static final int $stable = 0;
    public static final HatchDataExportLogging INSTANCE = new HatchDataExportLogging();

    public final void logDownloadCancelled(HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        C7384Etj.A0Y(hatchAppEventLoggingContext, 0);
        log(hatchAppEventLoggingContext, HatchDataExportLoggingKt.PHASE_DOWNLOAD, AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), "cancelled"));
    }

    public final void logDownloadStarted(HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        C7384Etj.A0Y(hatchAppEventLoggingContext, 0);
        log(hatchAppEventLoggingContext, HatchDataExportLoggingKt.PHASE_DOWNLOAD, AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), "started"));
    }

    public final void logDownloadSucceeded(HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        C7384Etj.A0Y(hatchAppEventLoggingContext, 0);
        log(hatchAppEventLoggingContext, HatchDataExportLoggingKt.PHASE_DOWNLOAD, AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), "success"));
    }

    private final void log(HatchAppEventLoggingContext hatchAppEventLoggingContext, String str, Map<String, String> map) {
        HatchAppEventLogger.INSTANCE.logEvent(HatchDataExportLoggingKt.EVENT_NAME, HatchSurface.SETTINGS.getValue(), HatchSubsurface.DATA_CONTROLS.getValue(), HatchDataExportLoggingKt.EVENT_TYPE, HatchComponent.DOWNLOAD_BUTTON.getValue(), AGH.A02(AnonymousClass007.A0c(HatchMetadataKey.PHASE, str), map), hatchAppEventLoggingContext);
    }

    public final void logDownloadFailed(HatchAppEventLoggingContext hatchAppEventLoggingContext, Map<String, String> map) {
        AnonymousClass003.A0u(hatchAppEventLoggingContext, map);
        log(hatchAppEventLoggingContext, HatchDataExportLoggingKt.PHASE_DOWNLOAD, AGH.A02(AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), "failure"), map));
    }

    public final void logSaveFailed(HatchAppEventLoggingContext hatchAppEventLoggingContext, String str) {
        AnonymousClass003.A0u(hatchAppEventLoggingContext, str);
        log(hatchAppEventLoggingContext, HatchDataExportLoggingKt.PHASE_SAVE, AnonymousClass007.A0d(HatchMetadataKey.FAILURE_REASON.getValue(), str, C3cG.A0r(HatchMetadataKey.RESULT.getValue(), "failure")));
    }
}
