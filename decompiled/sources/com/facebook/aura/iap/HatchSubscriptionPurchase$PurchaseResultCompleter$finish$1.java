package com.facebook.aura.iap;

import X.AbstractC7559F3s;
import com.facebook.aura.iap.HatchSubscriptionPurchase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchSubscriptionPurchase$PurchaseResultCompleter$finish$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchSubscriptionPurchase.Result $result;
    public final /* synthetic */ HatchSubscriptionPurchase.PurchaseResultCompleter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSubscriptionPurchase$PurchaseResultCompleter$finish$1(HatchSubscriptionPurchase.PurchaseResultCompleter purchaseResultCompleter, HatchSubscriptionPurchase.Result result) {
        super(0);
        this.this$0 = purchaseResultCompleter;
        this.$result = result;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchSubscriptionPurchase.PurchaseResultCompleter purchaseResultCompleter = this.this$0;
        if (purchaseResultCompleter.hasDeliveredResult) {
            return;
        }
        purchaseResultCompleter.hasDeliveredResult = true;
        purchaseResultCompleter.onResult.invoke(this.$result);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
