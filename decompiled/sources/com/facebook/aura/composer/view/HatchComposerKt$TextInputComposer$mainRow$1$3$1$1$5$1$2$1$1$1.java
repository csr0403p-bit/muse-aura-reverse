package com.facebook.aura.composer.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1958Aux;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$5$1$2$1$1$1 extends AbstractC7559F3s implements G0V<AXN, C1958Aux, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isInputLayoutSettled$delegate;
    public final /* synthetic */ boolean $isInputRowStacked;
    public final /* synthetic */ MutableState<Boolean> $isInputStacked$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$5$1$2$1$1$1(boolean z, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(2);
        this.$isInputRowStacked = z;
        this.$isInputStacked$delegate = mutableState;
        this.$isInputLayoutSettled$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(AXN axn, C1958Aux c1958Aux) {
        invoke2(axn, c1958Aux);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AXN axn, C1958Aux c1958Aux) {
        boolean zA1a = AnonymousClass002.A1a(axn, c1958Aux);
        boolean zStacksComposerInput = HatchComposerKt.stacksComposerInput(axn, c1958Aux, MutableState.A0A((MutableState) this.$isInputStacked$delegate));
        if (zStacksComposerInput == this.$isInputRowStacked) {
            MutableState.A09(zA1a, this.$isInputLayoutSettled$delegate);
        }
        MutableState.A09(zStacksComposerInput, this.$isInputStacked$delegate);
    }
}
