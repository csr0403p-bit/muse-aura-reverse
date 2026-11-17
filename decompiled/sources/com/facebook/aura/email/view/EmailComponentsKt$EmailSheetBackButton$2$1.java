package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailComponentsKt$EmailSheetBackButton$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $busy;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailComponentsKt$EmailSheetBackButton$2$1(boolean z, Function0<Unit> function0, AuraNavigator auraNavigator) {
        super(0);
        this.$busy = z;
        this.$onBack = function0;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$busy) {
            return;
        }
        Function0<Unit> function0 = this.$onBack;
        if (function0 != null) {
            function0.invoke();
        } else {
            this.$navigator.back();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
