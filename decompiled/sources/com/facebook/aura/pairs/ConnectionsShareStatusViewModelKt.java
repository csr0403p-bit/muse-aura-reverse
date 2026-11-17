package com.facebook.aura.pairs;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ConnectionsShareStatusViewModelKt {
    public static final List<Long> SHARE_STATUS_POLL_DELAYS_MS = Arrays.asList(2000L, 4000L, 8000L, 15000L, 30000L, 30000L, 30000L);
    public static final String TAG = "ConnectionsShareStatusViewModel";

    public static final List<Long> getSHARE_STATUS_POLL_DELAYS_MS() {
        return SHARE_STATUS_POLL_DELAYS_MS;
    }
}
