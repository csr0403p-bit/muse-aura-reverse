package com.facebook.aura.iap;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.iap.HatchSubscriptionPurchase;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class HatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1 extends C7438Evz implements G0U<HatchSubscriptionPurchase.Result, Unit> {
    public HatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1(Object obj) {
        super(1, obj, HatchSubscriptionPurchase.PurchaseResultCompleter.class, "finish", "finish(Lcom/facebook/aura/iap/HatchSubscriptionPurchase$Result;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSubscriptionPurchase.Result result) {
        ((HatchSubscriptionPurchase.PurchaseResultCompleter) AnonymousClass006.A0o(result, this)).finish(result);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSubscriptionPurchase.Result result) {
        invoke2(result);
        return Unit.INSTANCE;
    }
}
