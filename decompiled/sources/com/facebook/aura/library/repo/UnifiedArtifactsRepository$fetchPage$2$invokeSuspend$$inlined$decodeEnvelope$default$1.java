package com.facebook.aura.library.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class UnifiedArtifactsRepository$fetchPage$2$invokeSuspend$$inlined$decodeEnvelope$default$1 extends AbstractC7559F3s implements Function0<C9hr<UnifiedArtifactsResponseJson>> {
    public static final UnifiedArtifactsRepository$fetchPage$2$invokeSuspend$$inlined$decodeEnvelope$default$1 INSTANCE = new UnifiedArtifactsRepository$fetchPage$2$invokeSuspend$$inlined$decodeEnvelope$default$1();

    public UnifiedArtifactsRepository$fetchPage$2$invokeSuspend$$inlined$decodeEnvelope$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<UnifiedArtifactsResponseJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = UnifiedArtifactsResponseJson.$childSerializers;
        return UnifiedArtifactsResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<UnifiedArtifactsResponseJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = UnifiedArtifactsResponseJson.$childSerializers;
        return UnifiedArtifactsResponseJson$$serializer.INSTANCE;
    }
}
