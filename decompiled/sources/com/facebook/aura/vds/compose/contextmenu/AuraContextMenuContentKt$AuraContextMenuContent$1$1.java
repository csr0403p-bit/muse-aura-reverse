package com.facebook.aura.vds.compose.contextmenu;

import X.AbstractC7559F3s;
import X.C15k;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraContextMenuContentKt$AuraContextMenuContent$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ C1BO<Float> $alpha$delegate;
    public final /* synthetic */ C1BO<Float> $scale$delegate;
    public final /* synthetic */ MutableState<C15k> $transformOriginState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.AeX(C1BO.A01(this.$scale$delegate));
        c2av.AeY(C1BO.A01(this.$scale$delegate));
        c2av.Acj(C1BO.A01(this.$alpha$delegate));
        c2av.Af4(this.$transformOriginState.getValue().A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraContextMenuContentKt$AuraContextMenuContent$1$1(MutableState<C15k> mutableState, C1BO<Float> c1bo, C1BO<Float> c1bo2) {
        super(1);
        this.$transformOriginState = mutableState;
        this.$scale$delegate = c1bo;
        this.$alpha$delegate = c1bo2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
