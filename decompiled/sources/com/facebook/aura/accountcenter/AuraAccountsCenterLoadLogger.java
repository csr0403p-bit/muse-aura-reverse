package com.facebook.aura.accountcenter;

import X.C60O;
import com.facebook.aura.perf.HatchQplLogger;

/* loaded from: classes3.dex */
public final class AuraAccountsCenterLoadLogger {
    public static final AuraAccountsCenterLoadLogger INSTANCE = new AuraAccountsCenterLoadLogger();
    public static final int LOAD_MARKER = 857804423;

    public final void startSettingsLoad() {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        boolean zIsMarkerOn = C60O.A0g().isMarkerOn(857804423, 0);
        hatchQplLogger.markerStart(857804423, 0, true);
        hatchQplLogger.markerAnnotate(857804423, "hatch_ac_phase_ambiguous", zIsMarkerOn, 0);
    }
}
