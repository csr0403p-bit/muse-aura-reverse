package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.C2LD;
import X.C2Un;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$1$1$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ MutableState<AaC> $selectableBoundsInWindow$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        MutableState<AaC> mutableState = this.$selectableBoundsInWindow$delegate;
        AaC aaCA00 = C2Un.A00(c2ld.A03());
        float f = HatchMessageLongPressMenuHostKt.MenuGap;
        mutableState.Af8(aaCA00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$1$1$1(MutableState<AaC> mutableState) {
        super(1);
        this.$selectableBoundsInWindow$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
