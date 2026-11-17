package com.facebook.aura.vds.compose.input;

import X.AbstractC7559F3s;
import X.C2Um;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCodeInputKt$AuraCodeInput$4$1$1 extends AbstractC7559F3s implements G0U<C2Um, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isFocused$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2Um c2Um) {
        C7384Etj.A0Y(c2Um, 0);
        MutableState.A09(c2Um.AOS(), this.$isFocused$delegate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCodeInputKt$AuraCodeInput$4$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$isFocused$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2Um c2Um) {
        invoke2(c2Um);
        return Unit.INSTANCE;
    }
}
