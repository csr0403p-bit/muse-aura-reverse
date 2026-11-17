package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.gateway.HatchAiIdentityHandler$fetchIdentityHttp$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class HatchAiIdentityHandler$fetchIdentityHttp$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<IdentityPayloadJson>> {
    public static final HatchAiIdentityHandler$fetchIdentityHttp$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new HatchAiIdentityHandler$fetchIdentityHttp$$inlined$executeJarvisRequest1iavgos$default$1();

    public HatchAiIdentityHandler$fetchIdentityHttp$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<IdentityPayloadJson> invoke() {
        return IdentityPayloadJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<IdentityPayloadJson> invoke() {
        return IdentityPayloadJson$$serializer.INSTANCE;
    }
}
