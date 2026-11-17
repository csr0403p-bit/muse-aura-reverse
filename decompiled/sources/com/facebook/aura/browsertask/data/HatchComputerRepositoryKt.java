package com.facebook.aura.browsertask.data;

import X.C7384Etj;
import com.facebook.aura.json.NetworkException;

/* loaded from: classes2.dex */
public abstract class HatchComputerRepositoryKt {
    public static final String BROWSER_LEASE_EXPIRED = "browser_lease_expired";
    public static final String BROWSER_TASKS_UNAVAILABLE = "browser_tasks_unavailable";
    public static final String COMPUTER_DISABLED = "computer_disabled";
    public static final String EVENT_COMPUTER_UPDATED = "computer.updated";
    public static final String NDJSON_MEDIA_TYPE = "application/x-ndjson";
    public static final long SUBSCRIBE_IDLE_TIMEOUT_MS = 300000;
    public static final long SUBSCRIBE_NO_OVERALL_TIMEOUT_MS = 0;

    public static final String computerErrorCode(Throwable th) {
        NetworkException networkException;
        C7384Etj.A0Y(th, 0);
        if (!(th instanceof NetworkException) || (networkException = (NetworkException) th) == null) {
            return null;
        }
        return networkException.errorCode;
    }
}
