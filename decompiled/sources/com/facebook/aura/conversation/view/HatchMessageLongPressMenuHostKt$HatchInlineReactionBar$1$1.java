package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C15k;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ C1BO<Float> $alpha$delegate;
    public final /* synthetic */ C1BO<Float> $scale$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        C1BO<Float> c1bo = this.$scale$delegate;
        float f = HatchMessageLongPressMenuHostKt.MenuGap;
        c2av.AeX(C1BO.A01(c1bo));
        c2av.AeY(C1BO.A01(this.$scale$delegate));
        c2av.Acj(C1BO.A01(this.$alpha$delegate));
        long jA0J = AnonymousClass005.A0J(0.5f, 1.0f);
        long j = C15k.A01;
        c2av.Af4(jA0J);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageLongPressMenuHostKt$HatchInlineReactionBar$1$1(C1BO<Float> c1bo, C1BO<Float> c1bo2) {
        super(1);
        this.$scale$delegate = c1bo;
        this.$alpha$delegate = c1bo2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
