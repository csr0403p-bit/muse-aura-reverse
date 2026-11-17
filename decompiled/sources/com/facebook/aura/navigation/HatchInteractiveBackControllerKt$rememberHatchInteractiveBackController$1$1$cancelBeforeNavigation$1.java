package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1$cancelBeforeNavigation$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ DefaultHatchInteractiveBackController $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1$cancelBeforeNavigation$1(DefaultHatchInteractiveBackController defaultHatchInteractiveBackController) {
        super(0);
        this.$controller = defaultHatchInteractiveBackController;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$controller.cancel();
    }
}
