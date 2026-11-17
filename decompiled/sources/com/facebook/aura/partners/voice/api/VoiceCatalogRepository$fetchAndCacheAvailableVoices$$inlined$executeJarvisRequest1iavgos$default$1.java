package com.facebook.aura.partners.voice.api;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$fetchAndCacheAvailableVoices$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class VoiceCatalogRepository$fetchAndCacheAvailableVoices$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<AvailableVoicesResponseJson>> {
    public static final VoiceCatalogRepository$fetchAndCacheAvailableVoices$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new VoiceCatalogRepository$fetchAndCacheAvailableVoices$$inlined$executeJarvisRequest1iavgos$default$1();

    public VoiceCatalogRepository$fetchAndCacheAvailableVoices$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<AvailableVoicesResponseJson> invoke() {
        int i = AvailableVoicesResponseJson.$stable;
        return AvailableVoicesResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<AvailableVoicesResponseJson> invoke() {
        int i = AvailableVoicesResponseJson.$stable;
        return AvailableVoicesResponseJson$$serializer.INSTANCE;
    }
}
