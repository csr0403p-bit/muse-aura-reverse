package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.G0U;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$confirmSetup$confirmationResult$1", f = "LinkEncryptedSetupCoordinator.kt", l = {907, 725, 721}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkEncryptedSetupCoordinator$confirmSetup$confirmationResult$1 extends AbstractC07127nr implements G0U<HtJ<? super LinkPairingConfirmationResult>, Object> {
    public final /* synthetic */ int $generation;
    public final /* synthetic */ LinkEncryptedSetup $setup;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ LinkEncryptedSetupCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkEncryptedSetupCoordinator$confirmSetup$confirmationResult$1(LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, int i, LinkEncryptedSetup linkEncryptedSetup, HtJ<? super LinkEncryptedSetupCoordinator$confirmSetup$confirmationResult$1> htJ) {
        super(1, htJ);
        this.this$0 = linkEncryptedSetupCoordinator;
        this.$generation = i;
        this.$setup = linkEncryptedSetup;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LinkEncryptedSetupCoordinator$confirmSetup$confirmationResult$1(this.this$0, this.$generation, this.$setup, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:28:0x0093, B:29:0x0096, B:31:0x009a, B:32:0x009c), top: B:49:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            X.Hji r8 = X.EnumC10460Hji.A02
            int r1 = r10.label
            r9 = 3
            r7 = 2
            r0 = 1
            r6 = 0
            if (r1 == 0) goto L3c
            if (r1 == r0) goto L2a
            if (r1 == r7) goto L1b
            if (r1 != r9) goto L16
            java.lang.Object r3 = r10.L$0
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            goto Lad
        L16:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L1b:
            int r2 = r10.I$0
            java.lang.Object r4 = r10.L$3
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator r4 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator) r4
            java.lang.Object r5 = r10.L$2
            com.facebook.aura.devices.pairing.LinkEncryptedSetup r5 = (com.facebook.aura.devices.pairing.LinkEncryptedSetup) r5
            java.lang.Object r3 = r10.L$0
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            goto L93
        L2a:
            int r2 = r10.I$0
            java.lang.Object r5 = r10.L$2
            com.facebook.aura.devices.pairing.LinkEncryptedSetup r5 = (com.facebook.aura.devices.pairing.LinkEncryptedSetup) r5
            java.lang.Object r4 = r10.L$1
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator r4 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator) r4
            java.lang.Object r3 = r10.L$0
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            X.Hwg.A00(r11)
            goto L58
        L3c:
            X.Hwg.A00(r11)
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator r4 = r10.this$0
            X.BLa r3 = r4.confirmationMutex
            int r2 = r10.$generation
            com.facebook.aura.devices.pairing.LinkEncryptedSetup r5 = r10.$setup
            r10.L$0 = r3
            r10.L$1 = r4
            r10.L$2 = r5
            r10.I$0 = r2
            r10.label = r0
            java.lang.Object r0 = r3.APs(r6, r10)
            if (r0 != r8) goto L58
            return r8
        L58:
            com.facebook.aura.devices.pairing.LinkConfirmedSetup r1 = r4.confirmedSetup     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.access$isSetupCurrent(r4, r2, r5)     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L63
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Superseded r8 = com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.Superseded.INSTANCE     // Catch: java.lang.Throwable -> Lb9
            goto Lb3
        L63:
            if (r1 == 0) goto L71
            com.facebook.aura.devices.pairing.LinkEncryptedSetup r0 = r1.setup     // Catch: java.lang.Throwable -> Lb9
            if (r0 != r5) goto L71
            com.facebook.aura.devices.pairing.LinkPairingConfirmation r0 = r1.confirmation     // Catch: java.lang.Throwable -> Lb9
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Confirmed r8 = new com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Confirmed     // Catch: java.lang.Throwable -> Lb9
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lb9
            goto Lb3
        L71:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport r1 = r4.transport     // Catch: java.lang.Throwable -> Lb9
            com.facebook.aura.devices.pairing.LinkEncryptedPairingSession r0 = r5.session     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = r1.startPairingConfirmation(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L7e
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Superseded r8 = com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.Superseded.INSTANCE     // Catch: java.lang.Throwable -> Lb9
            goto Lb3
        L7e:
            com.facebook.aura.devices.pairing.LinkEncryptedPairingSession r0 = r5.session     // Catch: java.lang.Throwable -> Lb9
            r10.L$0 = r3     // Catch: java.lang.Throwable -> Lb9
            r10.L$1 = r6     // Catch: java.lang.Throwable -> Lb9
            r10.L$2 = r5     // Catch: java.lang.Throwable -> Lb9
            r10.L$3 = r4     // Catch: java.lang.Throwable -> Lb9
            r10.I$0 = r2     // Catch: java.lang.Throwable -> Lb9
            r10.label = r7     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r11 = com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.access$awaitPairingConfirmation(r4, r0, r10)     // Catch: java.lang.Throwable -> Lb9
            if (r11 != r8) goto L96
            return r8
        L93:
            X.Hwg.A00(r11)     // Catch: java.lang.Throwable -> Lbb
        L96:
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult r11 = (com.facebook.aura.devices.pairing.LinkPairingConfirmationResult) r11     // Catch: java.lang.Throwable -> Lbb
            if (r11 != 0) goto L9c
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$TimedOut r11 = com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.TimedOut.INSTANCE     // Catch: java.lang.Throwable -> Lbb
        L9c:
            r10.L$0 = r3     // Catch: java.lang.Throwable -> Lbb
            r10.L$1 = r6     // Catch: java.lang.Throwable -> Lbb
            r10.L$2 = r6     // Catch: java.lang.Throwable -> Lbb
            r10.L$3 = r6     // Catch: java.lang.Throwable -> Lbb
            r10.label = r9     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r11 = com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.access$acceptPairingConfirmation(r4, r2, r5, r11, r10)     // Catch: java.lang.Throwable -> Lbb
            if (r11 != r8) goto Lb0
            return r8
        Lad:
            X.Hwg.A00(r11)     // Catch: java.lang.Throwable -> Lb7
        Lb0:
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult r11 = (com.facebook.aura.devices.pairing.LinkPairingConfirmationResult) r11     // Catch: java.lang.Throwable -> Lb7
            r8 = r11
        Lb3:
            r3.Ahe(r6)
            return r8
        Lb7:
            r0 = move-exception
            goto Lbc
        Lb9:
            r0 = move-exception
            goto Lbc
        Lbb:
            r0 = move-exception
        Lbc:
            r3.Ahe(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$confirmSetup$confirmationResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super LinkPairingConfirmationResult> htJ) {
        return ((LinkEncryptedSetupCoordinator$confirmSetup$confirmationResult$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
