package com.facebook.aura.network.transport.cache;

/* loaded from: classes3.dex */
public final class SystemHatchHttpCacheClock implements HatchHttpCacheClock {
    public static final SystemHatchHttpCacheClock INSTANCE = new SystemHatchHttpCacheClock();

    @Override // com.facebook.aura.network.transport.cache.HatchHttpCacheClock
    public long nowMs() {
        return System.currentTimeMillis();
    }
}
