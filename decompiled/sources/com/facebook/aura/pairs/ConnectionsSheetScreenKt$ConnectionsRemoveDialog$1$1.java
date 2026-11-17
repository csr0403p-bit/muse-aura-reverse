package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsSheetScreenKt$ConnectionsRemoveDialog$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onConfirm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsSheetScreenKt$ConnectionsRemoveDialog$1$1(Function0<Unit> function0, AuraNavigator auraNavigator) {
        super(0);
        this.$onConfirm = function0;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onConfirm.invoke();
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
