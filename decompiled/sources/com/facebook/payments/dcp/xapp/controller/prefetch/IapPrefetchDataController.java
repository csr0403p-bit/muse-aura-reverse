package com.facebook.payments.dcp.xapp.controller.prefetch;

import X.C7384Etj;
import X.C78U;
import X.C9571GPd;
import X.C9574GPi;
import X.C9583GPu;
import X.C9699Ge6;
import X.InterfaceC9568GPa;
import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader;

/* loaded from: classes6.dex */
public final class IapPrefetchDataController {
    public final C9574GPi A00;
    public final IapSessionContextController A01;
    public final C9583GPu<String, C9571GPd> A02;
    public final IapMutator A03;
    public final C9699Ge6 A04;
    public final DcpProductDetailsLoader A05;
    public final C78U A06;

    public IapPrefetchDataController(IapMutator iapMutator, C9699Ge6 c9699Ge6, InterfaceC9568GPa interfaceC9568GPa, C9574GPi c9574GPi, IapSessionContextController iapSessionContextController, C9583GPu c9583GPu, C78U c78u) {
        C7384Etj.A0Y(c78u, 0);
        this.A06 = c78u;
        this.A02 = c9583GPu;
        this.A01 = iapSessionContextController;
        this.A03 = iapMutator;
        this.A00 = c9574GPi;
        this.A04 = c9699Ge6;
        this.A05 = new DcpProductDetailsLoader(interfaceC9568GPa, c9574GPi);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r6 != r5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.Hs8 r11, com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController r12, X.C9698Ge3 r13, java.lang.String r14, X.HtJ r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController.A00(X.Hs8, com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController, X.Ge3, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.Hs8 r10, com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.List r15, X.HtJ r16) {
        /*
            r4 = 1
            r3 = r16
            boolean r0 = r3 instanceof X.C8916FtY
            if (r0 == 0) goto L7c
            r9 = r3
            X.FtY r9 = (X.C8916FtY) r9
            int r0 = r9.$t
            if (r0 != r4) goto L7c
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r9.A00 = r2
        L19:
            java.lang.Object r2 = r9.A09
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r9.A00
            if (r0 == 0) goto L3f
            if (r0 != r4) goto L84
            X.Hwg.A00(r2)
        L26:
            X.Hkf r2 = (X.Hkf) r2
            X.HoG r0 = r2.A00
            X.GeK r1 = r0.AJk()
            X.GeK r0 = X.EnumC9706GeK.A0H
            if (r1 != r0) goto L82
            java.util.List<X.GOU> r1 = r2.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L82
            java.lang.Object r3 = X.AbstractC0878AGe.A0F(r1)
            return r3
        L3f:
            X.Hwg.A00(r2)
            int r1 = r10.ordinal()
            if (r1 == r4) goto L75
            r0 = 0
            if (r1 != r0) goto L89
            X.AGi r2 = X.C0881AGi.A00
            java.util.List r0 = java.util.Collections.singletonList(r12)
        L51:
            r1 = 0
            X.Hkg r6 = new X.Hkg
            r6.<init>(r13, r2, r0, r1)
            com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader r5 = r11.A05
            r9.A01 = r1
            r9.A02 = r1
            r9.A03 = r1
            r9.A04 = r1
            r9.A05 = r1
            r9.A06 = r1
            r9.A07 = r1
            r9.A08 = r1
            r9.A00 = r4
            r10 = 0
            r7 = r14
            r8 = r15
            java.lang.Object r2 = r5.A03(r6, r7, r8, r9, r10)
            if (r2 != r3) goto L26
            return r3
        L75:
            java.util.List r2 = java.util.Collections.singletonList(r12)
            X.AGi r0 = X.C0881AGi.A00
            goto L51
        L7c:
            X.FtY r9 = new X.FtY
            r9.<init>(r11, r3, r4)
            goto L19
        L82:
            r3 = 0
            return r3
        L84:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L89:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController.A01(X.Hs8, com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.Hs8 r5, com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController r6, X.HtJ r7) {
        /*
            r3 = 7
            boolean r0 = r7 instanceof X.C8913FtV
            if (r0 == 0) goto L4a
            r4 = r7
            X.FtV r4 = (X.C8913FtV) r4
            int r0 = r4.$t
            if (r0 != r3) goto L4a
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 != r2) goto L50
            X.Hwg.A00(r1)
        L25:
            boolean r0 = r1 instanceof X.HsD
            r3 = 0
            if (r0 == 0) goto L38
            X.HsD r1 = (X.HsD) r1
            if (r1 == 0) goto L38
            V r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L38
            X.HjI r3 = X.AbstractC10479Hku.A00(r0)
        L38:
            return r3
        L39:
            X.Hwg.A00(r1)
            com.facebook.payments.dcp.xapp.controller.IapSessionContextController r1 = r6.A01
            r0 = 0
            r4.A01 = r0
            r4.A00 = r2
            java.lang.Object r1 = r1.A04(r5, r4)
            if (r1 != r3) goto L25
            return r3
        L4a:
            X.FtV r4 = new X.FtV
            r4.<init>(r6, r7, r3)
            goto L17
        L50:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController.A02(X.Hs8, com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController r12, X.HjI r13, java.lang.String r14, java.lang.String r15, X.HtJ r16) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController.A03(com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController, X.HjI, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
