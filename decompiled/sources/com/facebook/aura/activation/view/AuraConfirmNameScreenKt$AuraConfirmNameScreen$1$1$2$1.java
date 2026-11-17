package com.facebook.aura.activation.view;

import X.C7438Evz;
import com.facebook.aura.activation.model.AuraConfirmNameViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class AuraConfirmNameScreenKt$AuraConfirmNameScreen$1$1$2$1 extends C7438Evz implements Function0<Unit> {
    public AuraConfirmNameScreenKt$AuraConfirmNameScreen$1$1$2$1(Object obj) {
        super(0, obj, AuraConfirmNameViewModel.class, "onContinue", "onContinue()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AuraConfirmNameViewModel) this.receiver).onContinue();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
