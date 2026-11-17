package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.F1E;
import X.G0U;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$snapshot$1", f = "LinkEncryptedSetupCoordinator.kt", l = {907, 581}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$snapshot$1 extends AbstractC07127nr implements G0U<HtJ<? super LinkEncryptedSetupSnapshot>, Object> {
    public final /* synthetic */ F1E $generation;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ LinkEncryptedSetupCoordinator this$0;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:16:0x005e, B:17:0x0061, B:19:0x0065), top: B:28:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r6 = r9
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r8.label
            r4 = 2
            r0 = 1
            r7 = 0
            if (r1 == 0) goto L2c
            if (r1 == r0) goto L1c
            if (r1 != r4) goto L17
            java.lang.Object r3 = r8.L$1
            X.F1E r3 = (X.F1E) r3
            java.lang.Object r1 = r8.L$0
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            goto L5e
        L17:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L1c:
            java.lang.Object r3 = r8.L$2
            X.F1E r3 = (X.F1E) r3
            java.lang.Object r2 = r8.L$1
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator r2 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator) r2
            java.lang.Object r1 = r8.L$0
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            X.Hwg.A00(r9)
            goto L44
        L2c:
            X.Hwg.A00(r9)
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator r2 = r8.this$0
            X.BLa r1 = r2.handshakeMutex
            X.F1E r3 = r8.$generation
            r8.L$0 = r1
            r8.L$1 = r2
            r8.L$2 = r3
            r8.label = r0
            java.lang.Object r0 = r1.APs(r7, r8)
            if (r0 != r5) goto L44
            return r5
        L44:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.access$resetIfTransportDroppedSession(r2)     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicInteger r0 = r2.setupGeneration     // Catch: java.lang.Throwable -> L76
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L76
            r3.element = r0     // Catch: java.lang.Throwable -> L76
            r8.L$0 = r1     // Catch: java.lang.Throwable -> L76
            r8.L$1 = r3     // Catch: java.lang.Throwable -> L76
            r8.L$2 = r7     // Catch: java.lang.Throwable -> L76
            r8.label = r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.access$ensureEncryptedSetup(r2, r0, r8)     // Catch: java.lang.Throwable -> L76
            if (r6 != r5) goto L61
            return r5
        L5e:
            X.Hwg.A00(r9)     // Catch: java.lang.Throwable -> L74
        L61:
            com.facebook.aura.devices.pairing.LinkEncryptedSetup r6 = (com.facebook.aura.devices.pairing.LinkEncryptedSetup) r6     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L6f
            int r5 = r3.element     // Catch: java.lang.Throwable -> L74
            r8 = 4
            com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r4 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot     // Catch: java.lang.Throwable -> L74
            r9 = r7
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L74
            goto L70
        L6f:
            r4 = r7
        L70:
            r1.Ahe(r7)
            return r4
        L74:
            r0 = move-exception
            goto L77
        L76:
            r0 = move-exception
        L77:
            r1.Ahe(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$snapshot$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$snapshot$1(LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, F1E f1e, HtJ<? super LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$snapshot$1> htJ) {
        super(1, htJ);
        this.this$0 = linkEncryptedSetupCoordinator;
        this.$generation = f1e;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$snapshot$1(this.this$0, this.$generation, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super LinkEncryptedSetupSnapshot> htJ) {
        return ((LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$snapshot$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
