package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.C0Hi;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$FormSelectionRow$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ C0Hi $focusManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$FormSelectionRow$1$1$2$1(C0Hi c0Hi, MutableState<Boolean> mutableState) {
        super(0);
        this.$focusManager = c0Hi;
        this.$expanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$focusManager.A6G(false);
        MutableState.A09(true, this.$expanded$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
