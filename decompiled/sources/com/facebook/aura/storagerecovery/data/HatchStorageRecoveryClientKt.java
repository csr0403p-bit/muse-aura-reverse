package com.facebook.aura.storagerecovery.data;

import X.CFK;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError;

/* loaded from: classes3.dex */
public abstract class HatchStorageRecoveryClientKt {
    public static final long DEFAULT_TIMEOUT_SECONDS = 15;
    public static final String NOTARY_HEADER = "X-Hatch-Notary-Authorization";
    public static final int STORAGE_RECOVERY_LIST_LIMIT = 200;
    public static final String TAG = "HatchStorageRecoveryClient";

    public static final HatchStorageRecoveryDeleteOutcome deleteOutcome(String str) {
        HatchStorageRecoveryDeleteOutcome hatchStorageRecoveryDeleteOutcomeFromWire = HatchStorageRecoveryDeleteOutcome.Companion.fromWire(str);
        if (hatchStorageRecoveryDeleteOutcomeFromWire != null) {
            return hatchStorageRecoveryDeleteOutcomeFromWire;
        }
        if (str == null) {
            str = "";
        }
        CFK.A0H(TAG, "Unrecognised storage recovery delete outcome: %s", str);
        return HatchStorageRecoveryDeleteOutcome.COMPLETE;
    }

    public static final Throwable toRecoveryError(Throwable th) {
        if (th instanceof HatchStorageRecoveryError) {
            return th;
        }
        if (!(th instanceof NetworkException)) {
            return HatchStorageRecoveryError.InvalidResponse.INSTANCE;
        }
        NetworkException networkException = (NetworkException) th;
        return new HatchStorageRecoveryError.Api(networkException.httpResponseCode, HatchStorageRecoveryErrorCode.Companion.fromWire(networkException.errorCode));
    }
}
