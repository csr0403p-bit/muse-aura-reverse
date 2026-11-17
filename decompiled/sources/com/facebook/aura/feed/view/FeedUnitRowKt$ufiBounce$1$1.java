package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$ufiBounce$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ C1BO<Float> $scale$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.AeX(C1BO.A01(this.$scale$delegate));
        c2av.AeY(C1BO.A01(this.$scale$delegate));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$ufiBounce$1$1(C1BO<Float> c1bo) {
        super(1);
        this.$scale$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
