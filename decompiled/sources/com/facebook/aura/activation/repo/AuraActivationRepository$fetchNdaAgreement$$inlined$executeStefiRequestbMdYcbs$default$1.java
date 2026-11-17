package com.facebook.aura.activation.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$fetchNdaAgreement$$inlined$executeStefiRequest-bMdYcbs$default$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AuraActivationRepository$fetchNdaAgreement$$inlined$executeStefiRequestbMdYcbs$default$1 extends AbstractC7559F3s implements Function0<C9hr<NdaAgreementResponseJson>> {
    public static final AuraActivationRepository$fetchNdaAgreement$$inlined$executeStefiRequestbMdYcbs$default$1 INSTANCE = new AuraActivationRepository$fetchNdaAgreement$$inlined$executeStefiRequestbMdYcbs$default$1();

    public AuraActivationRepository$fetchNdaAgreement$$inlined$executeStefiRequestbMdYcbs$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<NdaAgreementResponseJson> invoke() {
        return NdaAgreementResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<NdaAgreementResponseJson> invoke() {
        return NdaAgreementResponseJson$$serializer.INSTANCE;
    }
}
