package com.facebook.aura.confidentialvm.repository;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.CFK;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$getStoredEnrollment$stored$1", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ConfidentialVmRepository$getStoredEnrollment$stored$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmStoredEnrollment>, Object> {
    public int label;
    public final /* synthetic */ ConfidentialVmRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRepository$getStoredEnrollment$stored$1(ConfidentialVmRepository confidentialVmRepository, HtJ<? super ConfidentialVmRepository$getStoredEnrollment$stored$1> htJ) {
        super(2, htJ);
        this.this$0 = confidentialVmRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmRepository$getStoredEnrollment$stored$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmStoredEnrollment> htJ) {
        return new ConfidentialVmRepository$getStoredEnrollment$stored$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        try {
            return this.this$0.getSecretStore().A02.A00("hatch_cvm_account_secret") != null ? ConfidentialVmStoredEnrollment.STORED : ConfidentialVmStoredEnrollment.NOT_STORED;
        } catch (Exception e) {
            CFK.A0K(ConfidentialVmRepository.TAG, e, "getStoredEnrollment: failed to read cached enrollment");
            return ConfidentialVmStoredEnrollment.UNAVAILABLE;
        }
    }
}
