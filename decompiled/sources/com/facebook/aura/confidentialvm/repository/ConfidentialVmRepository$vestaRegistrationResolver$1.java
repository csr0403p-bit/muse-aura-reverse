package com.facebook.aura.confidentialvm.repository;

import X.C7438Evz;
import X.G0U;
import X.HtJ;

/* loaded from: classes4.dex */
public final /* synthetic */ class ConfidentialVmRepository$vestaRegistrationResolver$1 extends C7438Evz implements G0U {
    public ConfidentialVmRepository$vestaRegistrationResolver$1(Object obj) {
        super(1, obj, ConfidentialVmRepository.class, "fetchVestaRegistration", "fetchVestaRegistration(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super ConfidentialVmVestaRegistration> htJ) {
        return ((ConfidentialVmRepository) this.receiver).fetchVestaRegistration(htJ);
    }
}
