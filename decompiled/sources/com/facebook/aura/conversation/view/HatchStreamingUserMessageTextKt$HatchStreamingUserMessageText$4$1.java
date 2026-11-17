package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1958Aux;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$4$1 extends AbstractC7559F3s implements G0U<C1958Aux, Unit> {
    public final /* synthetic */ MutableState<C1958Aux> $textLayout$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1958Aux c1958Aux) {
        C7384Etj.A0Y(c1958Aux, 0);
        this.$textLayout$delegate.Af8(c1958Aux);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$4$1(MutableState<C1958Aux> mutableState) {
        super(1);
        this.$textLayout$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1958Aux c1958Aux) {
        invoke2(c1958Aux);
        return Unit.INSTANCE;
    }
}
