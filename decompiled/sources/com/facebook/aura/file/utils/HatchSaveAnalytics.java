package com.facebook.aura.file.utils;

import X.AIW;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C0924AIa;
import X.C7384Etj;
import X.C7BY;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchFileTypeKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;

/* loaded from: classes.dex */
public final class HatchSaveAnalytics {
    public static final int $stable = 0;
    public static final HatchSaveAnalytics INSTANCE = new HatchSaveAnalytics();

    public final void logSaved(String str, HatchSaveLogOrigin hatchSaveLogOrigin) {
        C7384Etj.A0Y(str, 0);
        log(str, hatchSaveLogOrigin, AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), "saved"));
    }

    private final void log(String str, HatchSaveLogOrigin hatchSaveLogOrigin, Map<String, String> map) {
        HatchSurface hatchSurface;
        HatchSubsurface hatchSubsurface;
        HatchComponent hatchComponent;
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.putAll(map);
        Map<String, String> mapHatchFileTypeMetadata = HatchFileTypeKt.hatchFileTypeMetadata(C7BY.A0R(str, "", '.'));
        if (mapHatchFileTypeMetadata != null) {
            c0924AIa.putAll(mapHatchFileTypeMetadata);
        }
        if (hatchSaveLogOrigin != null) {
            c0924AIa.put(HatchMetadataKey.MEDIA_TYPE.getValue(), hatchSaveLogOrigin.mediaType);
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIa);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchScreen hatchScreen = null;
        if (hatchSaveLogOrigin != null) {
            hatchSurface = hatchSaveLogOrigin.surface;
            hatchSubsurface = hatchSaveLogOrigin.subsurface;
            hatchScreen = hatchSaveLogOrigin.screen;
            hatchComponent = hatchSaveLogOrigin.component;
            if (hatchComponent == null) {
            }
            hatchInteractionLogger.logStatusCheck(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, c0924AIaA0K);
        }
        hatchSurface = null;
        hatchSubsurface = null;
        hatchComponent = HatchComponent.DOWNLOAD_BUTTON;
        hatchInteractionLogger.logStatusCheck(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, c0924AIaA0K);
    }

    public static /* synthetic */ void logFailed$default(HatchSaveAnalytics hatchSaveAnalytics, String str, String str2, HatchSaveLogOrigin hatchSaveLogOrigin, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchSaveLogOrigin = null;
        }
        hatchSaveAnalytics.logFailed(str, str2, hatchSaveLogOrigin);
    }

    public static /* synthetic */ void logSaved$default(HatchSaveAnalytics hatchSaveAnalytics, String str, HatchSaveLogOrigin hatchSaveLogOrigin, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchSaveLogOrigin = null;
        }
        hatchSaveAnalytics.logSaved(str, hatchSaveLogOrigin);
    }

    public final void logFailed(String str, String str2, HatchSaveLogOrigin hatchSaveLogOrigin) {
        AnonymousClass003.A0u(str, str2);
        log(str, hatchSaveLogOrigin, AnonymousClass007.A0d(HatchMetadataKey.ERROR_TYPE.getValue(), str2, new HxE(HatchMetadataKey.RESULT.getValue(), "failed")));
    }

    public final void logTap(HatchSaveLogOrigin hatchSaveLogOrigin) {
        AnonymousClass006.A0b(hatchSaveLogOrigin).logClick(hatchSaveLogOrigin.surface, hatchSaveLogOrigin.subsurface, hatchSaveLogOrigin.screen, hatchSaveLogOrigin.component, null, AnonymousClass006.A10(HatchMetadataKey.MEDIA_TYPE.getValue(), hatchSaveLogOrigin.mediaType), null);
    }
}
