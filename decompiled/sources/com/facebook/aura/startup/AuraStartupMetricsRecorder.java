package com.facebook.aura.startup;

import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.DBJ;
import android.app.Activity;
import android.content.Context;
import android.os.ConditionVariable;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.network.noise.AuraNoiseVmTransport;
import com.facebook.aura.qpl.AuraQuickPerformanceLogger;
import com.facebook.aura.qpl.AuraStartupDeviceState;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class AuraStartupMetricsRecorder extends DBJ<Unit> {
    public static final String ANNOTATION_NOISE_ENABLED = "noise_enabled";
    public static final String ANNOTATION_STARTUP_TYPE = "app_state";
    public static final Companion Companion = new Companion();
    public static final ConditionVariable isQplReady = new ConditionVariable(false);

    public final class Companion {
        public final void onQplReady() {
            AuraStartupMetricsRecorder.isQplReady.open();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.DBJ
    public void annotateEnd(int i, MarkerEditor markerEditor, boolean z, Activity activity) {
        boolean z2;
        String str;
        int i2;
        C7384Etj.A0Y(markerEditor, 1);
        if (i != 734857510 || (i2 = BackgroundStartupDetector._coldStartMode) == 3 || i2 == 4) {
            z2 = false;
            str = "foreground";
        } else {
            z2 = true;
            str = "background";
        }
        markerEditor.annotate("app_state", str);
        markerEditor.annotate(HatchStartupPoints.ANNOTATION_IS_BACKGROUND_START, z2);
        markerEditor.annotate("surface", surfaceFromSessionState());
        AuraStartupDeviceState.INSTANCE.annotateEnd(markerEditor);
        markerEditor.annotate(ANNOTATION_NOISE_ENABLED, AuraNoiseVmTransport.isEnabled);
    }

    @Override // X.DBJ
    public void annotateStart(MarkerEditor markerEditor, Context context) {
        C7384Etj.A0Y(markerEditor, 0);
        AuraStartupDeviceState.INSTANCE.annotateStart(markerEditor);
    }

    public AuraStartupMetricsRecorder() {
        super(AuraExecutors.INSTANCE.newSingleThreadExecutor("AuraStartupMetricsRecorder"));
    }

    private final String surfaceFromSessionState() {
        AuraSessionManager.SessionState value = AuraSessionManager.state.getValue();
        if (value instanceof AuraSessionManager.SessionState.Active) {
            return "chat";
        }
        if (value instanceof AuraSessionManager.SessionState.Activating) {
            return HatchStartupPoints.SURFACE_ACTIVATION;
        }
        if (value instanceof AuraSessionManager.SessionState.SignedOut) {
            return HatchStartupPoints.SURFACE_LOGIN;
        }
        if (value instanceof AuraSessionManager.SessionState.Initializing) {
            return "unknown";
        }
        throw C3cG.A0q();
    }

    @Override // X.DBJ
    public /* bridge */ /* synthetic */ int startColdStart(long j, Unit unit) {
        HatchStartupQpl.Companion.markerStart(j);
        return 734857510;
    }

    @Override // X.DBJ
    public int startHotStart(long j) {
        AuraQuickPerformanceLogger auraQuickPerformanceLogger = AuraQuickPerformanceLogger.INSTANCE;
        auraQuickPerformanceLogger.getInstance().markerStart(734859171, 0, j, TimeUnit.MILLISECONDS);
        auraQuickPerformanceLogger.getInstance().markerAnnotate(734859171, 0, "app_state", "foreground");
        return 734859171;
    }

    @Override // X.DBJ
    public int startWarmStart(long j) {
        AuraQuickPerformanceLogger auraQuickPerformanceLogger = AuraQuickPerformanceLogger.INSTANCE;
        auraQuickPerformanceLogger.getInstance().markerStart(734861351, 0, j, TimeUnit.MILLISECONDS);
        auraQuickPerformanceLogger.getInstance().markerAnnotate(734861351, 0, "app_state", "foreground");
        return 734861351;
    }

    @Override // X.DBJ
    public void waitForQpl() {
        isQplReady.block();
    }

    private final String markerName(int i) {
        return i != 734859171 ? i != 734861351 ? "COLD_START" : "WARM_START" : "HOT_START";
    }

    @Override // X.DBJ
    public QuickPerformanceLogger getQpl() {
        return C60O.A0g();
    }

    /* renamed from: startColdStart, reason: avoid collision after fix types in other method */
    public int startColdStart2(long j, Unit unit) {
        HatchStartupQpl.Companion.markerStart(j);
        return 734857510;
    }
}
