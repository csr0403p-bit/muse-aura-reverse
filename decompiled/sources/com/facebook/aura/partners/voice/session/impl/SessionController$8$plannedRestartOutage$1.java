package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$8$plannedRestartOutage$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SessionController$8$plannedRestartOutage$1 extends AbstractC07127nr implements G0W<Boolean, HatchGatewayConnectionState, HtJ<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    public SessionController$8$plannedRestartOutage$1(HtJ<? super SessionController$8$plannedRestartOutage$1> htJ) {
        super(3, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r2 = r3.Z$0
            java.lang.Object r1 = r3.L$0
            int r0 = r3.label
            if (r0 != 0) goto L18
            X.Hwg.A00(r4)
            if (r2 == 0) goto L12
            boolean r1 = r1 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
            r0 = 1
            if (r1 == 0) goto L13
        L12:
            r0 = 0
        L13:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L18:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController$8$plannedRestartOutage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
        return invoke(AnonymousClass001.A1X(bool), hatchGatewayConnectionState, htJ);
    }

    public final Object invoke(boolean z, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
        SessionController$8$plannedRestartOutage$1 sessionController$8$plannedRestartOutage$1 = new SessionController$8$plannedRestartOutage$1(htJ);
        sessionController$8$plannedRestartOutage$1.Z$0 = z;
        sessionController$8$plannedRestartOutage$1.L$0 = hatchGatewayConnectionState;
        return sessionController$8$plannedRestartOutage$1.invokeSuspend(Unit.INSTANCE);
    }
}
