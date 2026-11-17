package com.facebook.aura.toast;

import X.AbstractC7559F3s;
import X.C3cG;
import X.InterfaceC10560Hsz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGlobalToastKt$showAndAwaitDismiss$auraToast$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ InterfaceC10560Hsz<Unit> $dismissed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGlobalToastKt$showAndAwaitDismiss$auraToast$1(InterfaceC10560Hsz<Unit> interfaceC10560Hsz) {
        super(0);
        this.$dismissed = interfaceC10560Hsz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C3cG.A1F(this.$dismissed, Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
