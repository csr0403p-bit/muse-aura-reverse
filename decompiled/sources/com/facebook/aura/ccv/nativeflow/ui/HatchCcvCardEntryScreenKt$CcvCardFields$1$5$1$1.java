package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C0Ou;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$CcvCardFields$1$5$1$1 extends AbstractC7559F3s implements G0U<C0Ou, Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ Function0<Unit> $onSubmit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$CcvCardFields$1$5$1$1(C0Hi c0Hi, Function0<Unit> function0) {
        super(1);
        this.$focusManager = c0Hi;
        this.$onSubmit = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0Ou c0Ou) {
        this.$focusManager.A6G(false);
        this.$onSubmit.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0Ou c0Ou) {
        invoke2(c0Ou);
        return Unit.INSTANCE;
    }
}
