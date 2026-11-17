package com.facebook.aura.network.transport.cache;

import X.HtJ;
import kotlin.Unit;

/* loaded from: classes3.dex */
public interface HatchHttpCacheStore {
    Object read(String str, long j, HtJ<? super HatchHttpCachedResponse> htJ);

    Object write(String str, HatchHttpCachedResponse hatchHttpCachedResponse, HtJ<? super Unit> htJ);
}
