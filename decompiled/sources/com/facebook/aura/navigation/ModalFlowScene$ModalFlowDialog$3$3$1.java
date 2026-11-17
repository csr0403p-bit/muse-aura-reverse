package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.BRL;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ModalFlowScene$ModalFlowDialog$3$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ List<BRL<T>> $flowEntries;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalFlowScene$ModalFlowDialog$3$3$1(AuraNavigator auraNavigator, List<BRL<T>> list) {
        super(0);
        this.$navigator = auraNavigator;
        this.$flowEntries = list;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.popLast(this.$flowEntries.size());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
