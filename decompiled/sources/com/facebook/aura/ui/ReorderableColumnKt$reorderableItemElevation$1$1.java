package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1BO;
import X.C1D3;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ReorderableColumnKt$reorderableItemElevation$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ C1D3 $dragShape;
    public final /* synthetic */ C1BO<Float> $lift$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Aef(c2av.Ah4(6.0f) * C1BO.A01(this.$lift$delegate));
        c2av.Aeg(this.$dragShape);
        c2av.Ad2(AnonymousClass002.A1N((C1BO.A01(this.$lift$delegate) > 0.0f ? 1 : (C1BO.A01(this.$lift$delegate) == 0.0f ? 0 : -1))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableColumnKt$reorderableItemElevation$1$1(C1D3 c1d3, C1BO<Float> c1bo) {
        super(1);
        this.$dragShape = c1d3;
        this.$lift$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
