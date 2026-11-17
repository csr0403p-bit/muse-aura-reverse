package com.facebook.aura.bloks.extensions.navigation;

import X.AbstractC7559F3s;
import X.AbstractC7691FAk;
import X.F6D;
import X.Hj6;
import X.HsM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class AuraNavigationExtensions$pushBottomSheetV2$onDismissCallback$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ F6D $environment;
    public final /* synthetic */ HsM $expression;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraNavigationExtensions$pushBottomSheetV2$onDismissCallback$1$1(HsM hsM, F6D f6d) {
        super(0);
        this.$expression = hsM;
        this.$environment = f6d;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HsM hsM = this.$expression;
        AbstractC7691FAk.A00(this.$environment, Hj6.A02, hsM);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
