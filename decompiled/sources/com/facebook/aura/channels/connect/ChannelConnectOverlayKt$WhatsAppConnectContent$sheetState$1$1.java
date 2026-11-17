package com.facebook.aura.channels.connect;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C1Vj;
import X.G0U;
import com.facebook.aura.settings.WhatsAppConnectPhase;
import com.facebook.aura.settings.WhatsAppSheetState;

/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$WhatsAppConnectContent$sheetState$1$1 extends AbstractC7559F3s implements G0U<C1Vj, Boolean> {
    public final /* synthetic */ C1BO<WhatsAppConnectPhase> $currentConnectPhase$delegate;
    public final /* synthetic */ C1BO<WhatsAppSheetState> $currentSheetContentState$delegate;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
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
            X.1BO<com.facebook.aura.settings.WhatsAppConnectPhase> r0 = r2.$currentConnectPhase$delegate
            java.lang.Object r1 = r0.getValue()
            com.facebook.aura.settings.WhatsAppConnectPhase r0 = com.facebook.aura.settings.WhatsAppConnectPhase.CONNECTING
            if (r1 == r0) goto L22
            X.1BO<com.facebook.aura.settings.WhatsAppConnectPhase> r0 = r2.$currentConnectPhase$delegate
            java.lang.Object r1 = r0.getValue()
            com.facebook.aura.settings.WhatsAppConnectPhase r0 = com.facebook.aura.settings.WhatsAppConnectPhase.POLLING
            if (r1 == r0) goto L22
            X.1BO<com.facebook.aura.settings.WhatsAppSheetState> r0 = r2.$currentSheetContentState$delegate
            java.lang.Object r1 = r0.getValue()
            com.facebook.aura.settings.WhatsAppSheetState r0 = com.facebook.aura.settings.WhatsAppSheetState.SWITCHING
            if (r1 != r0) goto L27
        L22:
            X.1Vj r1 = X.C1Vj.Hidden
            r0 = 0
            if (r3 == r1) goto L28
        L27:
            r0 = 1
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$WhatsAppConnectContent$sheetState$1$1.invoke(X.1Vj):java.lang.Boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelConnectOverlayKt$WhatsAppConnectContent$sheetState$1$1(C1BO<? extends WhatsAppConnectPhase> c1bo, C1BO<? extends WhatsAppSheetState> c1bo2) {
        super(1);
        this.$currentConnectPhase$delegate = c1bo;
        this.$currentSheetContentState$delegate = c1bo2;
    }
}
