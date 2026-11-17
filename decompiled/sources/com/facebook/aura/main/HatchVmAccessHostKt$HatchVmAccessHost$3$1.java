package com.facebook.aura.main;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.HatchVmAccessController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchVmAccessHostKt$HatchVmAccessHost$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmAccessHostKt$HatchVmAccessHost$3$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchVmAccessController.Companion.getInstance(this.$userSession).retry();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
