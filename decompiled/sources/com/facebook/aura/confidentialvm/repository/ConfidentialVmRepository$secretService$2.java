package com.facebook.aura.confidentialvm.repository;

import X.A7A;
import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ConfidentialVmRepository$secretService$2 extends AbstractC7559F3s implements Function0<A7A> {
    public final /* synthetic */ ConfidentialVmRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRepository$secretService$2(ConfidentialVmRepository confidentialVmRepository) {
        super(0);
        this.this$0 = confidentialVmRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final A7A invoke() {
        return new A7A(this.this$0.getSecretStore());
    }
}
