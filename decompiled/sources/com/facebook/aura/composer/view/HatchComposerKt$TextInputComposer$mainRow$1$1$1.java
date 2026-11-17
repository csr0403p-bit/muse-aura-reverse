package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isInputStacked$delegate;
    public final /* synthetic */ C1BO<Boolean> $isTextEmpty$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$mainRow$1$1$1(C1BO<Boolean> c1bo, MutableState<Boolean> mutableState) {
        super(0);
        this.$isTextEmpty$delegate = c1bo;
        this.$isInputStacked$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C1BO.A0F(this.$isTextEmpty$delegate)) {
            MutableState.A09(false, this.$isInputStacked$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
