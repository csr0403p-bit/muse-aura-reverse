package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraNavDisplayKt$AuraNavDisplayContent$3$2$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isBackHandlingEnabled;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraNavDisplayKt$AuraNavDisplayContent$3$2$4$1(boolean z, AuraNavigator auraNavigator) {
        super(0);
        this.$isBackHandlingEnabled = z;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isBackHandlingEnabled) {
            this.$navigator.back();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
