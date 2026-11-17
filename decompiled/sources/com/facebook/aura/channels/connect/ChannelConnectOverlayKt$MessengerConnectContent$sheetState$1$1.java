package com.facebook.aura.channels.connect;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C1Vj;
import X.G0U;
import com.facebook.aura.settings.MessengerConnectPhase;

/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$MessengerConnectContent$sheetState$1$1 extends AbstractC7559F3s implements G0U<C1Vj, Boolean> {
    public final /* synthetic */ C1BO<MessengerConnectPhase> $currentConnectPhase$delegate;

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(X.C1Vj r3) {
        /*
            r2 = this;
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            X.1BO<com.facebook.aura.settings.MessengerConnectPhase> r0 = r2.$currentConnectPhase$delegate
            java.lang.Object r1 = r0.getValue()
            com.facebook.aura.settings.MessengerConnectPhase r0 = com.facebook.aura.settings.MessengerConnectPhase.CONNECTING
            if (r1 == r0) goto L18
            X.1BO<com.facebook.aura.settings.MessengerConnectPhase> r0 = r2.$currentConnectPhase$delegate
            java.lang.Object r1 = r0.getValue()
            com.facebook.aura.settings.MessengerConnectPhase r0 = com.facebook.aura.settings.MessengerConnectPhase.POLLING
            if (r1 != r0) goto L1d
        L18:
            X.1Vj r1 = X.C1Vj.Hidden
            r0 = 0
            if (r3 == r1) goto L1e
        L1d:
            r0 = 1
        L1e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$MessengerConnectContent$sheetState$1$1.invoke(X.1Vj):java.lang.Boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelConnectOverlayKt$MessengerConnectContent$sheetState$1$1(C1BO<? extends MessengerConnectPhase> c1bo) {
        super(1);
        this.$currentConnectPhase$delegate = c1bo;
    }
}
