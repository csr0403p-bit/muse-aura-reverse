package com.facebook.aura.modellock;

import X.C7384Etj;
import com.facebook.aura.json.NetworkException;

/* loaded from: classes5.dex */
public abstract class ModelLockAppealErrorKt {
    public static final ModelLockAppealError toModelLockAppealError(Throwable th) {
        NetworkException networkException;
        int i;
        C7384Etj.A0Y(th, 0);
        if ((th instanceof NetworkException) && (networkException = (NetworkException) th) != null) {
            String str = networkException.errorCode;
            if ("not_found".equals(str) || (i = networkException.httpResponseCode) == 404) {
                return ModelLockAppealError.UNAVAILABLE;
            }
            if ("appeal_changed".equals(str) || i == 412) {
                return ModelLockAppealError.CHANGED;
            }
            if ("appeal_pending".equals(str) || i == 409) {
                return ModelLockAppealError.PENDING;
            }
            if ("appeal_unavailable".equals(str) || i == 422) {
                return ModelLockAppealError.NOTHING_TO_APPEAL;
            }
            if ("appeal_send_failed".equals(str) || i == 502) {
                return ModelLockAppealError.SEND_FAILED;
            }
        }
        return ModelLockAppealError.FAILED;
    }
}
