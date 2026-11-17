package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.AbstractC9259GBm;
import com.facebook.aura.mobileconfig.AuraMobileConfig;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController$metaAiRsysSdk$2 extends AbstractC7559F3s implements Function0<MetaAiRsysSdk> {
    public final /* synthetic */ HatchRealTimeSessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRealTimeSessionController$metaAiRsysSdk$2(HatchRealTimeSessionController hatchRealTimeSessionController) {
        super(0);
        this.this$0 = hatchRealTimeSessionController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MetaAiRsysSdk invoke() {
        HatchRealTimeSessionController hatchRealTimeSessionController = this.this$0;
        String str = hatchRealTimeSessionController.userId;
        AbstractC9259GBm abstractC9259GBm = hatchRealTimeSessionController.coroutineDispatcher;
        return new MetaAiRsysSdk(AuraMobileConfig.INSTANCE.user(), hatchRealTimeSessionController.getAccessoryDelegate(), str, abstractC9259GBm);
    }
}
