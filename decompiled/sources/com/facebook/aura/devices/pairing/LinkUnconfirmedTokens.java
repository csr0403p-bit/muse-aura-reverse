package com.facebook.aura.devices.pairing;

import X.C06H;
import X.C7384Etj;
import X.C8j3;
import X.HoC;
import X.HtJ;
import X.HzP;
import com.facebook.aura.devices.token.LinkDeviceKeys;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class LinkUnconfirmedTokens {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final long REVOKE_WAIT_MS = 10000;
    public final LinkDeviceKeys deviceKeys;
    public final AtomicReference<String> nodeId;
    public final AtomicReference<HoC> pendingRevoke;

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkUnconfirmedTokens", f = "LinkUnconfirmedTokens.kt", l = {28, 34}, m = "revokeBeforeMint", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkUnconfirmedTokens$revokeBeforeMint$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkUnconfirmedTokens.this.revokeBeforeMint(this);
        }
    }

    public LinkUnconfirmedTokens(LinkDeviceKeys linkDeviceKeys) {
        C7384Etj.A0Y(linkDeviceKeys, 0);
        this.deviceKeys = linkDeviceKeys;
        this.nodeId = new AtomicReference<>(null);
        this.pendingRevoke = new AtomicReference<>(null);
    }

    public final void onMinted(String str) {
        C7384Etj.A0Y(str, 0);
        this.nodeId.set(str);
    }

    public final void onConfirmed() {
        this.nodeId.set(null);
    }

    public final void onNotKept() {
        String str = (String) C8j3.A10(this.nodeId);
        if (str != null) {
            this.pendingRevoke.set(this.deviceKeys.revokeDeviceTokensDetached(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object revokeBeforeMint(X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.devices.pairing.LinkUnconfirmedTokens.AnonymousClass1
            if (r0 == 0) goto L7f
            r7 = r10
            com.facebook.aura.devices.pairing.LinkUnconfirmedTokens$revokeBeforeMint$1 r7 = (com.facebook.aura.devices.pairing.LinkUnconfirmedTokens.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r2 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r8 = 2
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L30
            if (r0 == r5) goto L4f
            if (r0 != r8) goto L85
            java.lang.Object r1 = r7.L$1
            X.Hwg.A00(r2)
        L26:
            java.util.concurrent.atomic.AtomicReference<X.HoC> r0 = r9.pendingRevoke
            X.Bs8.A00(r1, r4, r0)
        L2b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        L30:
            X.Hwg.A00(r2)
            java.util.concurrent.atomic.AtomicReference<X.HoC> r0 = r9.pendingRevoke
            java.lang.Object r3 = r0.get()
            X.HoC r3 = (X.HoC) r3
            if (r3 == 0) goto L5d
            com.facebook.aura.devices.pairing.LinkUnconfirmedTokens$revokeBeforeMint$2$1 r2 = new com.facebook.aura.devices.pairing.LinkUnconfirmedTokens$revokeBeforeMint$2$1
            r2.<init>(r3, r4)
            r7.L$0 = r3
            r7.label = r5
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r2 = X.GAX.A01(r7, r2, r0)
            if (r2 != r6) goto L54
            return r6
        L4f:
            java.lang.Object r3 = r7.L$0
            X.Hwg.A00(r2)
        L54:
            if (r2 != 0) goto L58
            r5 = 0
            goto L2b
        L58:
            java.util.concurrent.atomic.AtomicReference<X.HoC> r0 = r9.pendingRevoke
            X.Bs8.A00(r3, r4, r0)
        L5d:
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = r9.nodeId
            java.lang.Object r1 = r0.getAndSet(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L2b
            com.facebook.aura.devices.token.LinkDeviceKeys r0 = r9.deviceKeys
            X.HoC r1 = r0.revokeDeviceTokensDetached(r1)
            java.util.concurrent.atomic.AtomicReference<X.HoC> r0 = r9.pendingRevoke
            r0.set(r1)
            r7.L$0 = r4
            r7.L$1 = r1
            r7.label = r8
            java.lang.Object r0 = r1.APQ(r7)
            if (r0 != r6) goto L26
            return r6
        L7f:
            com.facebook.aura.devices.pairing.LinkUnconfirmedTokens$revokeBeforeMint$1 r7 = new com.facebook.aura.devices.pairing.LinkUnconfirmedTokens$revokeBeforeMint$1
            r7.<init>(r10)
            goto L12
        L85:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkUnconfirmedTokens.revokeBeforeMint(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
