package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $finishPurchase;
    public final /* synthetic */ MutableState<Boolean> $showPendingDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$1$1(G0U<? super Boolean, Unit> g0u, MutableState<Boolean> mutableState) {
        super(0);
        this.$finishPurchase = g0u;
        this.$showPendingDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$showPendingDialog$delegate);
        AnonymousClass001.A1K(false, this.$finishPurchase);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
