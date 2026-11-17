package com.facebook.aura.conversation.view;

import X.AWx;
import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C2LD;
import X.C2Un;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$3$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ MutableState<AaC> $hostBoundsInWindow$delegate;
    public final /* synthetic */ MutableState<AWx> $hostWindowOffset$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        MutableState<AWx> mutableState = this.$hostWindowOffset$delegate;
        long jA01 = c2ld.A01();
        HatchMessageLongPressMenuHostKt.HatchMessageLongPressMenuHost$lambda$37(mutableState, AnonymousClass005.A0K((int) (jA01 >> 32), AnonymousClass002.A09(jA01)));
        this.$hostBoundsInWindow$delegate.Af8(C2Un.A00(c2ld.A03()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$3$1(MutableState<AWx> mutableState, MutableState<AaC> mutableState2) {
        super(1);
        this.$hostWindowOffset$delegate = mutableState;
        this.$hostBoundsInWindow$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
