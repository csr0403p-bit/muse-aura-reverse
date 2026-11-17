package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPasswordsScreenKt$OnePasswordLoginsList$1$1$2$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ CredentialCandidate $candidate;
    public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPasswordsScreenKt$OnePasswordLoginsList$1$1$2$1$1$1$1(CredentialCandidate credentialCandidate, G0U<? super CredentialCandidate, Unit> g0u) {
        super(0);
        this.$candidate = credentialCandidate;
        this.$onCredentialClick = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SecureStorageLogging.INSTANCE.credentialRowTapped(this.$candidate.id);
        this.$onCredentialClick.invoke(this.$candidate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
