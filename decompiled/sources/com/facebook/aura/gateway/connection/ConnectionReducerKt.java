package com.facebook.aura.gateway.connection;

import X.C7BY;
import com.facebook.aura.gateway.connection.ReconnectGiveUpReason;

/* loaded from: classes6.dex */
public abstract class ConnectionReducerKt {
    public static final String CONNECT_ERROR_MESSAGE_STORAGE_FULL = "storage_full";
    public static final String CONNECT_ERROR_TYPE_STORAGE_RECOVERY = "storage_recovery_required";
    public static final int SERVICE_NOTICE_CODE_RESTART = 1012;
    public static final int SERVICE_NOTICE_CODE_TRY_AGAIN_LATER = 1013;

    public static final boolean isAuthFailure(String str, Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 401 || iIntValue == 403) {
                return true;
            }
        } else if (str != null && C7BY.A0q(str, "401", false)) {
            return true;
        }
        return false;
    }

    public static final ReconnectGiveUpReason decideReconnectGiveUp(int i, int i2) {
        if (i >= i2) {
            return new ReconnectGiveUpReason.MaxAttemptsExceeded(i2);
        }
        return null;
    }

    public static final boolean isPlannedRestartNotice(int i) {
        return i == 1012 || i == 1013;
    }
}
