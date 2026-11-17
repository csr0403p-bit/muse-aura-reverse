package com.facebook.aura.shopping.repo;

import X.AbstractC7559F3s;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchProductDetailsRepository$catalogFlight$1 extends AbstractC7559F3s implements Function0<SingleFlight> {
    public final /* synthetic */ HatchProductDetailsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsRepository$catalogFlight$1(HatchProductDetailsRepository hatchProductDetailsRepository) {
        super(0);
        this.this$0 = hatchProductDetailsRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SingleFlight invoke() {
        return SingleFlightKt.SingleFlight(this.this$0.userSession, OnDuplicateCall.Join.INSTANCE, false);
    }
}
