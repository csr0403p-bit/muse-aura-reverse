package com.facebook.aura.network.transport.cache;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class DefaultHatchHttpCacheStore$store$2 extends AbstractC7559F3s implements Function0<BoundedInMemoryHatchHttpCacheStore> {
    public static final DefaultHatchHttpCacheStore$store$2 INSTANCE = new DefaultHatchHttpCacheStore$store$2();

    public DefaultHatchHttpCacheStore$store$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BoundedInMemoryHatchHttpCacheStore invoke() {
        return new BoundedInMemoryHatchHttpCacheStore(4194304L);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ BoundedInMemoryHatchHttpCacheStore invoke() {
        return new BoundedInMemoryHatchHttpCacheStore(4194304L);
    }
}
