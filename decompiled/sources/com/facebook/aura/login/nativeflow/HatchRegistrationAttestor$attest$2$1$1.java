package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$attest$2$1$1", f = "HatchRegistrationAttestor.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchRegistrationAttestor$attest$2$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchAttestationRequest $request;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRegistrationAttestor$attest$2$1$1(HatchAttestationRequest hatchAttestationRequest, HtJ<? super HatchRegistrationAttestor$attest$2$1$1> htJ) {
        super(2, htJ);
        this.$request = hatchAttestationRequest;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchRegistrationAttestor$attest$2$1$1(this.$request, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchRegistrationAttestor$attest$2$1$1(this.$request, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchRegistrationAttestor hatchRegistrationAttestor = HatchRegistrationAttestor.INSTANCE;
            HatchAttestationRequest hatchAttestationRequest = this.$request;
            this.label = 1;
            if (hatchRegistrationAttestor.finishRequest(hatchAttestationRequest, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
