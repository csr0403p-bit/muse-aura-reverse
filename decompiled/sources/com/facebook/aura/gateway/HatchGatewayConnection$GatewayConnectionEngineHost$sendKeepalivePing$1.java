package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.connection.Presence;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1", f = "HatchGatewayConnection.kt", l = {2415, 2416}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ JsonObject $params;
    public final /* synthetic */ GatewayTransportSession $pingSession;
    public final /* synthetic */ String $pingWsUrl;
    public final /* synthetic */ Presence $presence;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ HatchGatewayConnection.GatewayConnectionEngineHost this$0;
    public final /* synthetic */ HatchGatewayConnection this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1(HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost, GatewayTransportSession gatewayTransportSession, String str, HatchGatewayConnection hatchGatewayConnection, Presence presence, JsonObject jsonObject, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1> htJ) {
        super(2, htJ);
        this.this$0 = gatewayConnectionEngineHost;
        this.$pingSession = gatewayTransportSession;
        this.$pingWsUrl = str;
        this.this$1 = hatchGatewayConnection;
        this.$presence = presence;
        this.$params = jsonObject;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1 hatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1 = new HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1(this.this$0, this.$pingSession, this.$pingWsUrl, this.this$1, this.$presence, this.$params, htJ);
        hatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1.L$0 = obj;
        return hatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r8 = r13.L$0
            X.3UX r8 = (X.C3UX) r8
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r5 = 2
            r4 = 0
            r7 = 1
            if (r0 == 0) goto L94
            if (r0 == r7) goto Lbf
            if (r0 != r5) goto Le6
            boolean r7 = r13.Z$0
            long r11 = r13.J$0
            java.lang.Object r9 = r13.L$1
            X.HoC r9 = (X.HoC) r9
            X.Hwg.A00(r14)
        L1c:
            r9.A5w(r4)
            com.facebook.aura.gateway.GatewayTransportSession r0 = r13.$pingSession
            X.Hsz<kotlin.Unit> r0 = r0.ended
            boolean r0 = r0.AOG()
            if (r0 != 0) goto L48
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r11
            long r9 = X.BV4.A05(r0)
            java.lang.String r2 = "HatchGatewayConnection"
            if (r14 == 0) goto L4b
            java.lang.String r1 = "Keepalive ping acked in %dms"
            java.lang.Long r0 = X.C3cG.A0S(r9)
            X.CFK.A03(r0, r2, r1)
            com.facebook.aura.gateway.GatewayTransportSession r0 = r13.$pingSession
            java.util.concurrent.atomic.AtomicLong r1 = r0.lastAckedPingSentAtNs
            com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$1 r0 = new java.util.function.LongBinaryOperator() { // from class: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1.1
                static {
                    /*
                        com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$1 r0 = new com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$1) com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1.1.INSTANCE com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1.AnonymousClass1.<init>():void");
                }

                @Override // java.util.function.LongBinaryOperator
                public final long applyAsLong(long r1, long r3) {
                    /*
                        r0 = this;
                        long r0 = java.lang.Math.max(r1, r3)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1.AnonymousClass1.applyAsLong(long, long):long");
                }
            }
            r1.accumulateAndGet(r11, r0)
        L48:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L4b:
            java.lang.String r4 = r13.$pingWsUrl
            if (r4 == 0) goto L63
            com.facebook.aura.network.transport.HatchVmInboundTraffic r3 = com.facebook.aura.network.transport.HatchVmInboundTraffic.INSTANCE
            r0 = 15000(0x3a98, double:7.411E-320)
            boolean r0 = r3.receivedWithin(r4, r0)
            if (r0 == 0) goto L63
            java.lang.String r1 = "Keepalive pong not seen in %dms, but the VM is still delivering bytes; keeping connection"
            java.lang.Long r0 = X.C3cG.A0S(r9)
            X.CFK.A03(r0, r2, r1)
            goto L48
        L63:
            com.facebook.aura.gateway.GatewayTransportSession r0 = r13.$pingSession
            java.util.concurrent.atomic.AtomicLong r0 = r0.lastAckedPingSentAtNs
            long r3 = r0.get()
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 > 0) goto L48
            com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost r0 = r13.this$0
            boolean r0 = com.facebook.aura.gateway.HatchGatewayConnection.GatewayConnectionEngineHost.access$isLivePhase(r0)
            if (r0 == 0) goto L48
            java.lang.Long r0 = X.C3cG.A0S(r9)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Keepalive ping timed out after %dms with no pong; treating connection as dead"
            X.CFK.A0H(r2, r0, r1)
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r13.this$1
            com.facebook.aura.gateway.connection.ConnectionEngine r4 = com.facebook.aura.gateway.HatchGatewayConnection.access$getEngine(r0)
            com.facebook.aura.gateway.GatewayTransportSession r0 = r13.$pingSession
            long r5 = r0.epoch
            com.facebook.aura.gateway.connection.Presence r8 = r13.$presence
            r4.noteKeepaliveTimedOut(r5, r7, r8, r9)
            goto L48
        L94:
            X.Hwg.A00(r14)
            long r11 = java.lang.System.nanoTime()
            java.lang.Integer r3 = X.C79.A0K
            com.facebook.aura.gateway.HatchGatewayConnection r2 = r13.this$1
            kotlinx.serialization.json.JsonObject r0 = r13.$params
            com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$pong$1 r1 = new com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$pong$1
            r1.<init>(r2, r0, r4)
            X.6ys r0 = X.C6ys.A00
            X.Hrx r9 = X.GAo.A01(r3, r0, r1, r8)
            com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost r8 = r13.this$0
            com.facebook.aura.gateway.GatewayTransportSession r10 = r13.$pingSession
            r13.L$0 = r4
            r13.L$1 = r9
            r13.J$0 = r11
            r13.label = r7
            java.lang.Object r14 = com.facebook.aura.gateway.HatchGatewayConnection.GatewayConnectionEngineHost.access$awaitPongWhileReceiving(r8, r9, r10, r11, r13)
            if (r14 != r6) goto Lc8
            return r6
        Lbf:
            long r11 = r13.J$0
            java.lang.Object r9 = r13.L$1
            X.27k r9 = (X.C27k) r9
            X.Hwg.A00(r14)
        Lc8:
            boolean r7 = X.AnonymousClass001.A1X(r14)
            boolean r0 = r9.AOG()
            if (r0 == 0) goto Le3
            r13.L$0 = r4
            r13.L$1 = r9
            r13.J$0 = r11
            r13.Z$0 = r7
            r13.label = r5
            java.lang.Object r14 = X.C3cG.A0W(r9, r13)
            if (r14 != r6) goto L1c
            return r6
        Le3:
            r14 = r4
            goto L1c
        Le6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
