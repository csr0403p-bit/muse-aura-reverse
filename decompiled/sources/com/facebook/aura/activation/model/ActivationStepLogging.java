package com.facebook.aura.activation.model;

import X.AIW;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.Ey9;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* loaded from: classes2.dex */
public final class ActivationStepLogging implements SignOutCleanupHandler {
    public static final String COMPONENT = "activation_step";
    public static final String EVENT_NAME = "activation_step";
    public static final String KEY_NEXT_STEP = "next_step";
    public static final String KEY_STEP = "step";
    public static final String STEP_FULLY_ACTIVATED = "fully_activated";
    public static String currentStep;
    public static boolean isAppAway;
    public static long stepStartedAtMs;
    public static final ActivationStepLogging INSTANCE = new ActivationStepLogging();
    public static final Object lock = C3cG.A0T();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Result {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Result[] $VALUES;
        public static final Result COMPLETED;
        public static final Result LEFT_APP;
        public static final Result LOGGED_OUT;
        public static final Result RETURNED;
        public static final Result STARTED;
        public final String wireValue;

        static {
            Result result = new Result(CvmMigrationStatusJson.STAGE_STARTED, 0, "started");
            STARTED = result;
            Result result2 = new Result("COMPLETED", 1, "completed");
            COMPLETED = result2;
            Result result3 = new Result("LEFT_APP", 2, "left_app");
            LEFT_APP = result3;
            Result result4 = new Result("RETURNED", 3, "returned");
            RETURNED = result4;
            Result result5 = new Result("LOGGED_OUT", 4, "logged_out");
            LOGGED_OUT = result5;
            Result[] resultArr = {result, result2, result3, result4, result5};
            $VALUES = resultArr;
            $ENTRIES = C3cG.A0w(resultArr);
        }

        public static Ey9<Result> getEntries() {
            return $ENTRIES;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }

        public final String getWireValue() {
            return this.wireValue;
        }

        public Result(String str, int i, String str2) {
            this.wireValue = str2;
        }
    }

    public final void onStepShown(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (lock) {
            String str2 = currentStep;
            if (!str.equals(str2)) {
                if (str2 != null) {
                    INSTANCE.log(str2, Result.COMPLETED, str);
                }
                currentStep = str;
                stepStartedAtMs = SystemClock.elapsedRealtime();
                isAppAway = false;
                INSTANCE.log(str, Result.STARTED, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finish(Result result, String str) {
        synchronized (lock) {
            String str2 = currentStep;
            if (str2 != null) {
                INSTANCE.log(str2, result, str);
                currentStep = null;
                isAppAway = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void log(String str, Result result, String str2) {
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.ONBOARDING.getValue();
        String value2 = HatchSubsurface.ONBOARDING_POST_AUTH.getValue();
        String value3 = HatchEventType.STATUS_CHECK.getValue();
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("step", str);
        c0924AIaA0u.put(HatchMetadataKey.RESULT.getValue(), result.getWireValue());
        if (result != Result.STARTED) {
            C3cH.A1A(HatchMetadataKey.DURATION_MS.getValue(), c0924AIaA0u, SystemClock.elapsedRealtime() - stepStartedAtMs);
        }
        if (str2 != null) {
            c0924AIaA0u.put(KEY_NEXT_STEP, str2);
        }
        hatchAppEventLogger.logEvent("activation_step", value, value2, value3, "activation_step", AIW.A0K(c0924AIaA0u), null);
    }

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        finish(Result.LOGGED_OUT, null);
    }

    public final void onActivated() {
        finish(Result.COMPLETED, STEP_FULLY_ACTIVATED);
    }

    public final void onAppForegroundChanged(boolean z) {
        synchronized (lock) {
            String str = currentStep;
            if (str != null && z != (!isAppAway)) {
                isAppAway = !z;
                INSTANCE.log(str, z ? Result.RETURNED : Result.LEFT_APP, null);
            }
        }
    }

    public final void onFlowStarted() {
        synchronized (lock) {
            currentStep = null;
            isAppAway = false;
        }
    }
}
