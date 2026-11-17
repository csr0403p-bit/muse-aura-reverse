package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchLetterWidgetKt$LetterBodyViewImage$1$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ C1BO<Float> $rotation$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        C1BO<Float> c1bo = this.$rotation$delegate;
        float f = HatchLetterWidgetKt.LetterBodyLineHeight;
        c2av.AeW(C1BO.A01(c1bo));
        c2av.Aef(c2av.Ah4(8.25f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLetterWidgetKt$LetterBodyViewImage$1$1$1(C1BO<Float> c1bo) {
        super(1);
        this.$rotation$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
