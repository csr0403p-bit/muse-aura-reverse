package com.facebook.aura.network.transport.cache;

import X.AbstractC5321DgF;
import X.F0C;

/* loaded from: classes3.dex */
public final class DefaultHatchHttpCacheStore {
    public static final DefaultHatchHttpCacheStore INSTANCE = new DefaultHatchHttpCacheStore();
    public static final F0C store$delegate = AbstractC5321DgF.A03(DefaultHatchHttpCacheStore$store$2.INSTANCE);

    public final HatchHttpCacheStore getStore() {
        return (HatchHttpCacheStore) store$delegate.getValue();
    }
}
