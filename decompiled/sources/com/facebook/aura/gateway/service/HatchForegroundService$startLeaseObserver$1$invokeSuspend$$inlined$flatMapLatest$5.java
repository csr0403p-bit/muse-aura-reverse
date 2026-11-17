package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.C20Z;
import X.G0W;
import X.HtJ;
import com.facebook.aura.model.AiIdentity;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5", f = "HatchForegroundService.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5 extends AbstractC07127nr implements G0W<C20Z<? super AiIdentity>, AbstractC3358CGz, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;

    public HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5(HtJ htJ) {
        super(3, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.L$0
            X.20Z r4 = (X.C20Z) r4
            java.lang.Object r1 = r5.L$1
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto L3f
            X.Hwg.A00(r6)
        L12:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L15:
            X.Hwg.A00(r6)
            X.CGz r1 = (X.AbstractC3358CGz) r1
            if (r1 == 0) goto L38
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r0 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            com.facebook.aura.gateway.HatchGatewayConnection$Companion r0 = com.facebook.aura.gateway.HatchGatewayConnection.Companion
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r0.getInstance(r1)
            X.1BN r0 = r0.getAiIdentity()
            if (r0 == 0) goto L38
        L2a:
            r1 = 0
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r2
            java.lang.Object r0 = X.C3pU.A01(r5, r0, r4)
            if (r0 != r3) goto L12
            return r3
        L38:
            r1 = 0
            X.20Y r0 = new X.20Y
            r0.<init>(r1)
            goto L2a
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0W
    public final Object invoke(C20Z<? super AiIdentity> c20z, AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5 hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5 = new HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5(htJ);
        hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5.L$0 = c20z;
        hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5.L$1 = abstractC3358CGz;
        return hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5.invokeSuspend(Unit.INSTANCE);
    }
}
