package com.facebook.aura.devices.link.ordering;

import X.C7438Evz;
import X.G0V;
import X.HtJ;

/* loaded from: classes4.dex */
public final /* synthetic */ class HatchLinkOrderViewModel$submit$1$result$1 extends C7438Evz implements G0V {
    public HatchLinkOrderViewModel$submit$1$result$1(Object obj) {
        super(2, obj, HatchLinkOrderRepository.class, "fetchStatus", "fetchStatus(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.G0V
    public final Object invoke(String str, HtJ<? super HatchLinkOrderResult> htJ) {
        return ((HatchLinkOrderRepository) this.receiver).fetchStatus(str, htJ);
    }
}
