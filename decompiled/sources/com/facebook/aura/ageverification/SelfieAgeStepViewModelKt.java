package com.facebook.aura.ageverification;

import X.C7384Etj;
import com.facebook.aura.ageverification.SelfieAgeStepState;

/* loaded from: classes3.dex */
public abstract class SelfieAgeStepViewModelKt {
    public static final String ATTEMPT_USABILITY_ERROR = "USABILITY_ERROR";
    public static final int HTTP_TOO_MANY_REQUESTS = 429;
    public static final int HTTP_UNAUTHORIZED = 401;
    public static final long MIN_REVIEW_MS = 2000;
    public static final String MISSING_UPLOADS = "missing_uploads";
    public static final long NOT_STARTED = -1;
    public static final long POLL_INTERVAL_MS = 2000;
    public static final long POLL_WINDOW_MS = 120000;
    public static final String UPLOAD_KIND_NOT_ALLOWED = "upload_kind_not_allowed";
    public static final String UPLOAD_MEDIUM_NOT_ALLOWED = "upload_medium_not_allowed";

    public static final boolean getShowsBack(SelfieAgeStepState selfieAgeStepState) {
        C7384Etj.A0Y(selfieAgeStepState, 0);
        if (selfieAgeStepState.equals(SelfieAgeStepState.Submitting.INSTANCE) || selfieAgeStepState.equals(SelfieAgeStepState.Confirming.INSTANCE) || selfieAgeStepState.equals(SelfieAgeStepState.Confirmed.INSTANCE)) {
            return false;
        }
        if (selfieAgeStepState instanceof SelfieAgeStepState.Resolved) {
            SelfieAgeStepState.Resolved resolved = (SelfieAgeStepState.Resolved) selfieAgeStepState;
            if (resolved.afterConfirmed || resolved.afterFinalFailure) {
                return false;
            }
        }
        return true;
    }

    public static final boolean getShowsHelp(SelfieAgeStepState selfieAgeStepState) {
        C7384Etj.A0Y(selfieAgeStepState, 0);
        return !selfieAgeStepState.equals(SelfieAgeStepState.Resolving.INSTANCE);
    }
}
