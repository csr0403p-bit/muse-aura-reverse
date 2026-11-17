package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository$saveForRestart$2$saved$1", f = "HatchVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchVmRepository$saveForRestart$2$saved$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ HatchGatewayPrefsStore $prefsStore;
    public final /* synthetic */ GatewayVmCredential $vm;
    public final /* synthetic */ String $vmId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRepository$saveForRestart$2$saved$1(String str, GatewayVmCredential gatewayVmCredential, HatchGatewayPrefsStore hatchGatewayPrefsStore, HtJ<? super HatchVmRepository$saveForRestart$2$saved$1> htJ) {
        super(2, htJ);
        this.$vmId = str;
        this.$vm = gatewayVmCredential;
        this.$prefsStore = hatchGatewayPrefsStore;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVmRepository$saveForRestart$2$saved$1(this.$vmId, this.$vm, this.$prefsStore, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            if (r0 != 0) goto L34
            X.Hwg.A00(r4)
            java.lang.String r1 = r3.$vmId
            com.facebook.aura.gateway.GatewayVmCredential r0 = r3.$vm
            java.lang.String r0 = r0.authToken
            boolean r0 = com.facebook.aura.gateway.VmAuthTokenKt.commitVmAuthToken(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.String r2 = r3.$vmId
            com.facebook.aura.gateway.GatewayVmCredential r0 = r3.$vm
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.notaryTokens
            java.lang.Long r0 = r0.notaryTokenExpirationTs
            boolean r0 = com.facebook.aura.gateway.VmNotaryTokenKt.commitVmNotaryTokens(r2, r1, r0)
            if (r0 == 0) goto L2e
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r1 = r3.$prefsStore
            com.facebook.aura.gateway.GatewayVmCredential r0 = r3.$vm
            java.lang.String r0 = r0.wsUrl
            boolean r1 = r1.commitGatewayUrl(r0)
            r0 = 1
            if (r1 != 0) goto L2f
        L2e:
            r0 = 0
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L34:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository$saveForRestart$2$saved$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((HatchVmRepository$saveForRestart$2$saved$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
