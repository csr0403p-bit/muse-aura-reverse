package com.facebook.aura.activation.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$fetchTosMetadata$$inlined$executeStefiRequest-bMdYcbs$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AuraActivationRepository$fetchTosMetadata$$inlined$executeStefiRequestbMdYcbs$default$1 extends AbstractC7559F3s implements Function0<C9hr<TosStatusResponseJson>> {
    public static final AuraActivationRepository$fetchTosMetadata$$inlined$executeStefiRequestbMdYcbs$default$1 INSTANCE = new AuraActivationRepository$fetchTosMetadata$$inlined$executeStefiRequestbMdYcbs$default$1();

    public AuraActivationRepository$fetchTosMetadata$$inlined$executeStefiRequestbMdYcbs$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<TosStatusResponseJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = TosStatusResponseJson.$childSerializers;
        return TosStatusResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<TosStatusResponseJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = TosStatusResponseJson.$childSerializers;
        return TosStatusResponseJson$$serializer.INSTANCE;
    }
}
