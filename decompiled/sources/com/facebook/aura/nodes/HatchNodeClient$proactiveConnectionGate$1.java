package com.facebook.aura.nodes;

import X.C1BN;
import com.facebook.aura.nodes.datasource.ProactiveConnectionGate;
import com.facebook.aura.nodes.transport.HatchNodeTransport;
import com.facebook.aura.nodes.transport.NodeConnectionState;

/* loaded from: classes2.dex */
public final class HatchNodeClient$proactiveConnectionGate$1 implements ProactiveConnectionGate {
    public final /* synthetic */ HatchNodeClient this$0;

    public HatchNodeClient$proactiveConnectionGate$1(HatchNodeClient hatchNodeClient) {
        this.this$0 = hatchNodeClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    @Override // com.facebook.aura.nodes.datasource.ProactiveConnectionGate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitConnected(long r8, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1$awaitConnected$1
            if (r0 == 0) goto L5d
            r6 = r10
            com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1$awaitConnected$1 r6 = (com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1$awaitConnected$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L63
            X.Hwg.A00(r1)
        L21:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L29
            boolean r4 = r1.booleanValue()
        L29:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.nodes.HatchNodeClient r0 = r7.this$0
            com.facebook.aura.nodes.transport.HatchNodeTransport r0 = r0.transport
            if (r0 == 0) goto L29
            X.1BN r2 = r0.getConnectionState()
            if (r2 == 0) goto L29
            java.lang.Object r0 = r2.getValue()
            boolean r0 = r0 instanceof com.facebook.aura.nodes.transport.NodeConnectionState.Connected
            if (r0 == 0) goto L4a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L4a:
            r1 = 0
            com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1$awaitConnected$2 r0 = new com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1$awaitConnected$2
            r0.<init>(r2, r1)
            r6.L$0 = r1
            r6.J$0 = r8
            r6.label = r3
            java.lang.Object r1 = X.GAX.A01(r6, r0, r8)
            if (r1 != r5) goto L21
            return r5
        L5d:
            com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1$awaitConnected$1 r6 = new com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1$awaitConnected$1
            r6.<init>(r7, r10)
            goto L12
        L63:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1.awaitConnected(long, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.datasource.ProactiveConnectionGate
    public boolean isConnected() {
        C1BN<NodeConnectionState> connectionState;
        HatchNodeTransport hatchNodeTransport = this.this$0.transport;
        return ((hatchNodeTransport == null || (connectionState = hatchNodeTransport.getConnectionState()) == null) ? null : connectionState.getValue()) instanceof NodeConnectionState.Connected;
    }
}
