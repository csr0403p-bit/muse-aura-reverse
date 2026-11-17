package com.facebook.aura.login.nativeflow;

import X.C7384Etj;
import com.facebook.aura.network.hatchauth.HatchAuthError;
import com.facebook.aura.network.hatchauth.HatchAuthException;

/* loaded from: classes2.dex */
public abstract class NativeLoginOneTapKt {
    public static final String TAG = "NativeLoginOneTap";

    public static final String errorType(Throwable th) {
        HatchAuthException hatchAuthException;
        HatchAuthError hatchAuthError;
        String string;
        C7384Etj.A0Y(th, 0);
        return (!(th instanceof HatchAuthException) || (hatchAuthException = (HatchAuthException) th) == null || (hatchAuthError = hatchAuthException.error) == null || (string = hatchAuthError.toString()) == null) ? th.getClass().getName() : string;
    }

    public static final boolean spentTheNonce(Throwable th) {
        HatchAuthException hatchAuthException;
        HatchAuthError hatchAuthError;
        return (!(th instanceof HatchAuthException) || (hatchAuthException = (HatchAuthException) th) == null || (hatchAuthError = hatchAuthException.error) == null || hatchAuthError.equals(HatchAuthError.Network.INSTANCE) || hatchAuthError.equals(HatchAuthError.SessionExpired.INSTANCE) || hatchAuthError.equals(HatchAuthError.RateLimited.INSTANCE)) ? false : true;
    }
}
