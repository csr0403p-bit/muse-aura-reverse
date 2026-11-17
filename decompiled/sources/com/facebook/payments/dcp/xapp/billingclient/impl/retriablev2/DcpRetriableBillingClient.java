package com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2;

import X.C7384Etj;
import X.C78U;
import X.C79c;
import X.C79d;
import X.C9699Ge6;
import X.FGI;
import X.HuC;
import X.Hy6;
import X.HyF;
import X.InterfaceC9726Gee;
import X.InterfaceC9730Gej;

/* loaded from: classes3.dex */
public final class DcpRetriableBillingClient implements HuC {
    public final C9699Ge6 A00;
    public final CoroutineConnectionManager A01;
    public final HuC A02;
    public final C78U A03;
    public final RetriableApiExecutor A04;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(boolean r12, java.lang.String r13, X.HtJ<? super X.InterfaceC10512HoG> r14) throws java.lang.Throwable {
        /*
            r11 = this;
            r10 = 0
            boolean r0 = r14 instanceof X.C8iR
            if (r0 == 0) goto L52
            r8 = r14
            X.8iR r8 = (X.C8iR) r8
            int r0 = r8.$t
            if (r0 != r10) goto L52
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r8.A00 = r2
        L17:
            java.lang.Object r2 = r8.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r8.A00
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 != r0) goto L58
            X.Hwg.A00(r2)
        L25:
            X.FH5 r2 = (X.FH5) r2
            X.HoG r0 = r2.A00
            return r0
        L2a:
            X.Hwg.A00(r2)
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor r5 = r11.A04
            X.Gej r6 = A00(r12)
            r2 = 0
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient$connect$result$1 r9 = new com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient$connect$result$1
            r7 = r13
            r9.<init>(r11, r13, r2)
            r8.A02 = r12
            r8.A00 = r0
            r0 = 82
            java.lang.String r1 = X.BV3.A00(r0)
            X.Ge6 r0 = r5.A00
            X.Geq r4 = new X.Geq
            r4.<init>(r0, r1, r13, r2)
            java.lang.Object r2 = com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor.A00(r4, r5, r6, r7, r8, r9, r10)
            if (r2 != r3) goto L25
            return r3
        L52:
            X.8iR r8 = new X.8iR
            r8.<init>(r11, r14, r10)
            goto L17
        L58:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient.A01(boolean, java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.HuC
    public final void ACo(HyF hyF, String str) {
        C7384Etj.A0Y(str, 0);
        this.A03.A02(new DcpRetriableBillingClient$getBillingConfigAsync$1(this, hyF, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    @Override // X.HuC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object APU(android.app.Activity r16, X.C79e r17, X.HtJ<? super X.InterfaceC10512HoG> r18) throws java.lang.Throwable {
        /*
            r15 = this;
            r4 = 3
            r3 = r18
            boolean r0 = r3 instanceof X.C8iS
            r13 = r15
            if (r0 == 0) goto L60
            r8 = r3
            X.8iS r8 = (X.C8iS) r8
            int r0 = r8.$t
            if (r0 != r4) goto L60
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r8.A00 = r2
        L1a:
            java.lang.Object r1 = r8.A03
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r10 = 1
            if (r0 == 0) goto L2d
            if (r0 != r10) goto L66
            X.Hwg.A00(r1)
        L28:
            X.FH5 r1 = (X.FH5) r1
            X.HoG r0 = r1.A00
            return r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor r5 = r15.A04
            X.79d r6 = new X.79d
            r6.<init>(r4)
            r14 = r17
            java.lang.String r2 = r14.AFU()
            r15 = 0
            X.8ig r9 = new X.8ig
            r12 = r16
            r11 = r9
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r8.A01 = r15
            r8.A02 = r15
            r8.A00 = r10
            java.lang.String r1 = "launchBillingFlow"
            java.lang.String r7 = ""
            X.Ge6 r0 = r5.A00
            X.Geq r4 = new X.Geq
            r4.<init>(r0, r1, r7, r2)
            java.lang.Object r1 = com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor.A00(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r3) goto L28
            return r3
        L60:
            X.8iS r8 = new X.8iS
            r8.<init>(r15, r3, r4)
            goto L1a
        L66:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient.APU(android.app.Activity, X.79e, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Hkg;ZLX/HtJ<-LX/Hkf;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // X.HuC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AYx(X.Hkg r14, X.HtJ r15, boolean r16) throws java.lang.Throwable {
        /*
            r13 = this;
            r10 = 1
            r3 = r15
            boolean r0 = r15 instanceof X.C8iR
            r12 = r13
            if (r0 == 0) goto L74
            r8 = r3
            X.8iR r8 = (X.C8iR) r8
            int r0 = r8.$t
            if (r0 != r10) goto L74
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r8.A00 = r2
        L19:
            java.lang.Object r1 = r8.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            if (r0 == 0) goto L38
            if (r0 != r10) goto L7a
            X.Hwg.A00(r1)
        L26:
            X.FH5 r1 = (X.FH5) r1
            X.HoG r3 = r1.A00
            T r0 = r1.A01
            X.Hkf r0 = (X.Hkf) r0
            java.util.List<X.GOU> r2 = r0.A01
            java.util.List<X.G4X> r1 = r0.A02
            X.Hkf r0 = new X.Hkf
            r0.<init>(r3, r2, r1)
            return r0
        L38:
            X.Hwg.A00(r1)
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor r5 = r13.A04
            r1 = r16
            X.Gej r6 = A00(r1)
            r13 = r14
            java.util.List<java.lang.String> r0 = r14.A03
            java.lang.Object r2 = X.AbstractC0878AGe.A0G(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L56
            java.util.List<java.lang.String> r0 = r14.A02
            java.lang.Object r2 = X.AbstractC0878AGe.A0G(r0)
            java.lang.String r2 = (java.lang.String) r2
        L56:
            r14 = 0
            r15 = 0
            X.Hw5 r9 = new X.Hw5
            r11 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r8.A02 = r1
            r8.A00 = r10
            java.lang.String r1 = "queryProductDetailsAsync"
            java.lang.String r7 = ""
            X.Ge6 r0 = r5.A00
            X.Geq r4 = new X.Geq
            r4.<init>(r0, r1, r7, r2)
            java.lang.Object r1 = com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor.A00(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r3) goto L26
            return r3
        L74:
            X.8iR r8 = new X.8iR
            r8.<init>(r13, r15, r10)
            goto L19
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient.AYx(X.Hkg, X.HtJ, boolean):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GOz;ZLX/HtJ<-LX/HzU;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // X.HuC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AYy(X.GOz r14, X.HtJ r15, boolean r16) throws java.lang.Throwable {
        /*
            r13 = this;
            r3 = 2
            r4 = r15
            boolean r0 = r15 instanceof X.C8iR
            r11 = r13
            if (r0 == 0) goto L5f
            r7 = r4
            X.8iR r7 = (X.C8iR) r7
            int r0 = r7.$t
            if (r0 != r3) goto L5f
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r7.A00 = r2
        L19:
            java.lang.Object r1 = r7.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r7.A00
            r9 = 1
            if (r0 == 0) goto L35
            if (r0 != r9) goto L65
            X.Hwg.A00(r1)
        L27:
            X.FH5 r1 = (X.FH5) r1
            X.HoG r2 = r1.A00
            T r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            X.HzU r0 = new X.HzU
            r0.<init>(r2, r1)
            return r0
        L35:
            X.Hwg.A00(r1)
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor r4 = r13.A04
            r15 = r16
            X.Gej r5 = A00(r15)
            r13 = 0
            X.Hw5 r8 = new X.Hw5
            r12 = r14
            r10 = r8
            r14 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r7.A02 = r15
            r7.A00 = r9
            java.lang.String r1 = "queryPurchasesAsync"
            java.lang.String r6 = ""
            X.Ge6 r0 = r4.A00
            X.Geq r3 = new X.Geq
            r3.<init>(r0, r1, r6, r13)
            java.lang.Object r1 = com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor.A00(r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r2) goto L27
            return r2
        L5f:
            X.8iR r7 = new X.8iR
            r7.<init>(r13, r15, r3)
            goto L19
        L65:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient.AYy(X.GOz, X.HtJ, boolean):java.lang.Object");
    }

    public static final InterfaceC9730Gej A00(boolean z) {
        return z ? new C79c(1000L, 4L, 16000L) : new C79d(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // X.HuC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A2s(X.Hz2 r12, X.HtJ<? super X.InterfaceC10512HoG> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            r3 = 9
            boolean r0 = r13 instanceof X.C8iP
            if (r0 == 0) goto L59
            r8 = r13
            X.8iP r8 = (X.C8iP) r8
            int r0 = r8.$t
            if (r0 != r3) goto L59
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r8.A00 = r2
        L18:
            java.lang.Object r1 = r8.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r10 = 1
            if (r0 == 0) goto L2b
            if (r0 != r10) goto L5f
            X.Hwg.A00(r1)
        L26:
            X.FH5 r1 = (X.FH5) r1
            X.HoG r0 = r1.A00
            return r0
        L2b:
            X.Hwg.A00(r1)
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor r5 = r11.A04
            java.lang.Integer r0 = r12.A00
            boolean r0 = X.HpG.A00(r0)
            X.Gej r6 = A00(r0)
            java.lang.String r7 = r12.A02
            java.lang.String r2 = r12.A01
            r1 = 0
            r0 = 3
            X.8ic r9 = new X.8ic
            r9.<init>(r11, r12, r1, r0)
            r8.A01 = r1
            r8.A00 = r10
            java.lang.String r1 = "acknowledgePurchase"
            X.Ge6 r0 = r5.A00
            X.Geq r4 = new X.Geq
            r4.<init>(r0, r1, r7, r2)
            java.lang.Object r1 = com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor.A00(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r3) goto L26
            return r3
        L59:
            X.8iP r8 = new X.8iP
            r8.<init>(r11, r13, r3)
            goto L18
        L5f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient.A2s(X.Hz2, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // X.HuC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A6z(X.Hz2 r12, X.HtJ<? super X.InterfaceC10512HoG> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            r3 = 10
            boolean r0 = r13 instanceof X.C8iP
            if (r0 == 0) goto L59
            r8 = r13
            X.8iP r8 = (X.C8iP) r8
            int r0 = r8.$t
            if (r0 != r3) goto L59
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r8.A00 = r2
        L18:
            java.lang.Object r1 = r8.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r10 = 1
            if (r0 == 0) goto L2b
            if (r0 != r10) goto L5f
            X.Hwg.A00(r1)
        L26:
            X.FH5 r1 = (X.FH5) r1
            X.HoG r0 = r1.A00
            return r0
        L2b:
            X.Hwg.A00(r1)
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor r5 = r11.A04
            java.lang.Integer r0 = r12.A00
            boolean r0 = X.HpG.A00(r0)
            X.Gej r6 = A00(r0)
            java.lang.String r7 = r12.A02
            java.lang.String r2 = r12.A01
            r1 = 0
            r0 = 4
            X.8ic r9 = new X.8ic
            r9.<init>(r11, r12, r1, r0)
            r8.A01 = r1
            r8.A00 = r10
            java.lang.String r1 = "consumeAsync"
            X.Ge6 r0 = r5.A00
            X.Geq r4 = new X.Geq
            r4.<init>(r0, r1, r7, r2)
            java.lang.Object r1 = com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor.A00(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r3) goto L26
            return r3
        L59:
            X.8iP r8 = new X.8iP
            r8.<init>(r11, r13, r3)
            goto L18
        L5f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient.A6z(X.Hz2, X.HtJ):java.lang.Object");
    }

    @Override // X.HuC
    public final InterfaceC9726Gee A7h() {
        return this.A02.A7h();
    }

    @Override // X.HuC
    public final void AAa() {
        this.A02.AAa();
    }

    @Override // X.HuC
    public final String ACn() {
        return FGI.A0M(this.A02.ACn(), "-retriable");
    }

    @Override // X.HuC
    public final Integer AIk() {
        return this.A02.AIk();
    }

    @Override // X.HuC
    public final Hy6 AIm() {
        return this.A02.AIm();
    }

    @Override // X.HuC
    public final boolean isReady() {
        return this.A02.isReady();
    }

    public DcpRetriableBillingClient(C9699Ge6 c9699Ge6, HuC huC, C78U c78u, boolean z) {
        this.A02 = huC;
        this.A00 = c9699Ge6;
        this.A03 = c78u;
        CoroutineConnectionManager coroutineConnectionManager = new CoroutineConnectionManager(c9699Ge6, huC, z ? c78u : null);
        this.A01 = coroutineConnectionManager;
        this.A04 = new RetriableApiExecutor(c9699Ge6, coroutineConnectionManager);
    }
}
