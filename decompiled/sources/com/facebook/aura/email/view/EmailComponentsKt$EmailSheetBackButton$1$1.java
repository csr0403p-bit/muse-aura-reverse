package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailComponentsKt$EmailSheetBackButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $busy;
    public final /* synthetic */ Function0<Unit> $onBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailComponentsKt$EmailSheetBackButton$1$1(boolean z, Function0<Unit> function0) {
        super(0);
        this.$busy = z;
        this.$onBack = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        if (this.$busy || (function0 = this.$onBack) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
