package com.facebook.aura.confidentialvm.repository;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$newFetch$started$1", f = "ConfidentialVmRepository.kt", l = {1328}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ConfidentialVmVestaRegistrationResolver$newFetch$started$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmVestaRegistration>, Object> {
    public int label;
    public final /* synthetic */ ConfidentialVmVestaRegistrationResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmVestaRegistrationResolver$newFetch$started$1(ConfidentialVmVestaRegistrationResolver confidentialVmVestaRegistrationResolver, HtJ<? super ConfidentialVmVestaRegistrationResolver$newFetch$started$1> htJ) {
        super(2, htJ);
        this.this$0 = confidentialVmVestaRegistrationResolver;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmVestaRegistrationResolver$newFetch$started$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmVestaRegistration> htJ) {
        return new ConfidentialVmVestaRegistrationResolver$newFetch$started$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            G0U<HtJ<? super ConfidentialVmVestaRegistration>, Object> g0u = this.this$0.fetchRegistration;
            this.label = 1;
            obj = g0u.invoke(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        this.this$0.onFetched((ConfidentialVmVestaRegistration) obj);
        return obj;
    }
}
