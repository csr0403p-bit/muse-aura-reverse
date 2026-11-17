package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.BLU;
import X.C2LD;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchLetterWidgetKt$HatchLetterWidget$3$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ AaC[] $latestLetterBounds;
    public final /* synthetic */ AaC $scrollViewportBounds;
    public final /* synthetic */ MutableState<Boolean> $viewportLifted$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        BLU bluA03 = c2ld.A03();
        AaC aaCA0f = C8j3.A0f(bluA03.A01, bluA03.A03, bluA03.A02, bluA03.A00);
        this.$latestLetterBounds[0] = aaCA0f;
        HatchLetterWidgetKt.HatchLetterWidget$updateViewportLift(this.$scrollViewportBounds, this.$viewportLifted$delegate, aaCA0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLetterWidgetKt$HatchLetterWidget$3$1(AaC[] aaCArr, AaC aaC, MutableState<Boolean> mutableState) {
        super(1);
        this.$latestLetterBounds = aaCArr;
        this.$scrollViewportBounds = aaC;
        this.$viewportLifted$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
