package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AssistSessionIdentityKt$AssistSessionIdentity$2$2$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AssistIdentityState $state;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(AnonymousClass006.A00(this.$state.isVisible() ? 1 : 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistSessionIdentityKt$AssistSessionIdentity$2$2$2$1(AssistIdentityState assistIdentityState) {
        super(1);
        this.$state = assistIdentityState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
