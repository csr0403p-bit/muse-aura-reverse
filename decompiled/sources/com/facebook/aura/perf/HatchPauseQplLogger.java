package com.facebook.aura.perf;

import X.BQG;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class HatchPauseQplLogger {
    public static final String ERROR_TYPE_PAUSE_RESULT_FAILED = "lock_result_failed";
    public static final String ERROR_TYPE_STATUS_RESULT_FAILED = "status_result_failed";
    public static final String ERROR_TYPE_UNPAUSE_RESULT_FAILED = "unlock_result_failed";
    public static final HatchPauseQplLogger INSTANCE = new HatchPauseQplLogger();
    public static final String REASON_CANCELLATION = "cancellation";
    public static final String REASON_EXCEPTION = "exception";
    public static final String REASON_RESULT_FAILED = "result_failed";

    public final void endPauseException(Throwable th, int i) {
        C7384Etj.A0Y(th, 0);
        String strFailureReasonFor = failureReasonFor(th);
        String strA0Y = C3cI.A0Y(th);
        String message = th.getMessage();
        if (message == null) {
            message = strA0Y;
        }
        annotateFailure(734864948, strFailureReasonFor, strA0Y, message, i);
        HatchQplLogger.INSTANCE.markerEnd(734864948, (short) 3, i);
    }

    public final void endPauseFailure(String str, int i) {
        C7384Etj.A0Y(str, 0);
        annotateFailure(734864948, REASON_RESULT_FAILED, ERROR_TYPE_PAUSE_RESULT_FAILED, str, i);
        HatchQplLogger.INSTANCE.markerEnd(734864948, (short) 3, i);
    }

    public final void endStatusCheckException(Throwable th, int i) {
        C7384Etj.A0Y(th, 0);
        String strFailureReasonFor = failureReasonFor(th);
        String strA0Y = C3cI.A0Y(th);
        String message = th.getMessage();
        if (message == null) {
            message = strA0Y;
        }
        annotateFailure(734865106, strFailureReasonFor, strA0Y, message, i);
        HatchQplLogger.INSTANCE.markerEnd(734865106, (short) 3, i);
    }

    public final void endStatusCheckFailure(String str, int i) {
        C7384Etj.A0Y(str, 0);
        annotateFailure(734865106, REASON_RESULT_FAILED, ERROR_TYPE_STATUS_RESULT_FAILED, str, i);
        HatchQplLogger.INSTANCE.markerEnd(734865106, (short) 3, i);
    }

    public final void endUnpauseException(Throwable th, int i) {
        C7384Etj.A0Y(th, 0);
        String strFailureReasonFor = failureReasonFor(th);
        String strA0Y = C3cI.A0Y(th);
        String message = th.getMessage();
        if (message == null) {
            message = strA0Y;
        }
        annotateFailure(734861390, strFailureReasonFor, strA0Y, message, i);
        HatchQplLogger.INSTANCE.markerEnd(734861390, (short) 3, i);
    }

    public final void endUnpauseFailure(String str, int i) {
        C7384Etj.A0Y(str, 0);
        annotateFailure(734861390, REASON_RESULT_FAILED, ERROR_TYPE_UNPAUSE_RESULT_FAILED, str, i);
        HatchQplLogger.INSTANCE.markerEnd(734861390, (short) 3, i);
    }

    private final void annotateFailure(int i, String str, String str2, String str3, int i2) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(i, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str, i2);
        hatchQplLogger.markerAnnotate(i, "error_type", str2, i2);
        hatchQplLogger.markerAnnotate(i, HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, BQG.A17(str3, 200), i2);
    }

    private final String failureReasonFor(Throwable th) {
        return th instanceof CancellationException ? REASON_CANCELLATION : "exception";
    }

    public final void endPauseSuccess(int i) {
        HatchQplLogger.INSTANCE.markerEnd(734864948, (short) 2, i);
    }

    public final void endStatusCheckSuccess(boolean z, int i) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734865106, "is_locked", z, i);
        hatchQplLogger.markerEnd(734865106, (short) 2, i);
    }

    public final void endUnpauseSuccess(int i) {
        HatchQplLogger.INSTANCE.markerEnd(734861390, (short) 2, i);
    }

    public final void startPause(int i) {
        HatchQplLogger.INSTANCE.markerStart(734864948, i, true);
    }

    public final void startStatusCheck(int i) {
        HatchQplLogger.INSTANCE.markerStart(734865106, i, true);
    }

    public final void startUnpause(int i) {
        HatchQplLogger.INSTANCE.markerStart(734861390, i, true);
    }
}
