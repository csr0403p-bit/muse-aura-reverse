package com.facebook.aura.iap;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchIapUserSession$useIacOverIap$2 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchIapUserSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIapUserSession$useIacOverIap$2(HatchIapUserSession hatchIapUserSession) {
        super(0);
        this.this$0 = hatchIapUserSession;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.getConfiguredUseIacOverIap());
    }
}
