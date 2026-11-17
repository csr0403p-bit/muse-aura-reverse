package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$readAfterLostDecide$1$1", f = "HatchAgentPermissionsRepository.kt", l = {454}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$readAfterLostDecide$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ HatchAgentPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentPermissionsRepository$readAfterLostDecide$1$1(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, HtJ<? super HatchAgentPermissionsRepository$readAfterLostDecide$1$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchAgentPermissionsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAgentPermissionsRepository$readAfterLostDecide$1$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAgentPermissionsRepository hatchAgentPermissionsRepository = this.this$0;
            this.label = 1;
            if (hatchAgentPermissionsRepository.retryReadUntilLostDecidesConfirmed(this) == enumC10460Hji) {
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

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchAgentPermissionsRepository$readAfterLostDecide$1$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
