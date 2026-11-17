package com.facebook.aura.iap;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchSubscriptionPurchase$launchPurchase$1$resultCompleter$1 extends AbstractC7559F3s implements G0U<Function0<? extends Unit>, Unit> {
    public final /* synthetic */ Executor $mainExecutor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.$mainExecutor.execute(new Runnable() { // from class: com.facebook.aura.iap.HatchSubscriptionPurchase$launchPurchase$1$resultCompleter$1.1
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSubscriptionPurchase$launchPurchase$1$resultCompleter$1(Executor executor) {
        super(1);
        this.$mainExecutor = executor;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
        invoke2((Function0<Unit>) function0);
        return Unit.INSTANCE;
    }
}
