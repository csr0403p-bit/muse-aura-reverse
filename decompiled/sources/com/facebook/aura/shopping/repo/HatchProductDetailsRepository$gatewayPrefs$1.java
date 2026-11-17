package com.facebook.aura.shopping.repo;

import X.AbstractC7559F3s;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchProductDetailsRepository$gatewayPrefs$1 extends AbstractC7559F3s implements Function0<HatchGatewayPrefsStore> {
    public final /* synthetic */ HatchProductDetailsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsRepository$gatewayPrefs$1(HatchProductDetailsRepository hatchProductDetailsRepository) {
        super(0);
        this.this$0 = hatchProductDetailsRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchGatewayPrefsStore invoke() {
        return HatchGatewayPrefsStore.Companion.getInstance(this.this$0.userSession);
    }
}
