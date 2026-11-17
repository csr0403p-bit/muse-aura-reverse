package com.facebook.payments.dcp.xapp.controller.quote;

import X.C7384Etj;
import X.C78U;
import X.C9571GPd;
import X.C9574GPi;
import X.C9583GPu;
import X.C9699Ge6;
import X.C9716GeU;
import X.HsR;
import X.InterfaceC9568GPa;
import X.InterfaceC9729Gei;
import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController;

/* loaded from: classes6.dex */
public final class IapQuoteController {
    public final C9699Ge6 A00;
    public final C9574GPi A01;
    public final IapMutator A02;
    public final HsR A03;
    public final InterfaceC9568GPa A04;
    public final InterfaceC9729Gei A05;
    public final IapSessionContextController A06;
    public final IapPrefetchDataController A07;
    public final C9583GPu<String, C9571GPd> A08;
    public final C78U A09;
    public final C9716GeU A0A;

    public IapQuoteController(IapMutator iapMutator, HsR hsR, C9699Ge6 c9699Ge6, InterfaceC9568GPa interfaceC9568GPa, InterfaceC9729Gei interfaceC9729Gei, C9574GPi c9574GPi, IapSessionContextController iapSessionContextController, IapPrefetchDataController iapPrefetchDataController, C9583GPu c9583GPu, C78U c78u, C9716GeU c9716GeU) {
        C7384Etj.A0Y(c78u, 0);
        this.A09 = c78u;
        this.A00 = c9699Ge6;
        this.A02 = iapMutator;
        this.A05 = interfaceC9729Gei;
        this.A03 = hsR;
        this.A08 = c9583GPu;
        this.A07 = iapPrefetchDataController;
        this.A06 = iapSessionContextController;
        this.A0A = c9716GeU;
        this.A01 = c9574GPi;
        this.A04 = interfaceC9568GPa;
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/payments/dcp/xapp/controller/quote/IapQuoteController;LX/Ge3;LX/HjI;LX/GeV;LX/HtJ<-LX/Gd4;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A02(X.C9717GeV r9, com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController r10, X.C9698Ge3 r11, X.HjI r12, X.HtJ r13) {
        /*
            r6 = r11
            r4 = 1
            boolean r0 = r13 instanceof X.C8908FtQ
            if (r0 == 0) goto Le
            r0 = r13
            X.FtQ r0 = (X.C8908FtQ) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r4) goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L32
            r3 = r13
            X.FtQ r3 = (X.C8908FtQ) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L32
            int r2 = r2 - r1
            r3.A00 = r2
        L1f:
            java.lang.Object r2 = r3.A05
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            if (r0 == 0) goto L41
            if (r0 != r4) goto L3c
            java.lang.Object r6 = r3.A02
            X.Ge3 r6 = (X.C9698Ge3) r6
            java.lang.Object r10 = r3.A01
            com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController r10 = (com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController) r10
            goto L38
        L32:
            X.FtQ r3 = new X.FtQ
            r3.<init>(r10, r13, r4)
            goto L1f
        L38:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L57
            return r2
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L41:
            X.Hwg.A00(r2)
            r3.A01 = r10     // Catch: java.lang.Throwable -> L57
            r3.A02 = r11     // Catch: java.lang.Throwable -> L57
            r0 = 0
            r3.A03 = r0     // Catch: java.lang.Throwable -> L57
            r3.A04 = r0     // Catch: java.lang.Throwable -> L57
            r3.A00 = r4     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = A01(r9, r10, r11, r12, r3)     // Catch: java.lang.Throwable -> L57
            if (r0 != r1) goto L56
            return r1
        L56:
            return r0
        L57:
            r3 = move-exception
            X.HiU r2 = X.HiU.A00
            X.Gei r1 = r10.A05
            java.lang.String r0 = "CREATE_DCPQUOTE"
            X.Hzd r2 = r2.A04(r1, r0, r3)
            X.Ge6 r12 = r10.A00
            boolean r0 = r3 instanceof com.facebook.payments.dcp.xapp.model.IapInBandQuoteError
            if (r0 == 0) goto La9
            java.lang.String r3 = "in_band"
        L6a:
            X.AbstractC7609F5w.A13(r4, r6, r2)
            r5 = 0
            X.Gey r10 = r12.A0I(r6, r5)
            X.GeE r4 = r12.A0J(r5)
            r7 = r5
            r8 = r5
            r9 = r5
            X.C9700GeE.A00(r4, r5, r6, r7, r8, r9)
            r4.A03(r2)
            if (r3 == 0) goto L88
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.A01
            java.lang.String r0 = "quote_error_source"
            r1.put(r0, r3)
        L88:
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.A01
            X.8ee<?> r1 = r12.A02
            java.lang.String r0 = "client_create_dcpquote_fail"
            X.Eu1 r1 = r1.acquireEvent(r0)
            r0 = 14
            X.EVS r0 = X.AbstractC7607F5u.A0s(r1, r0)
            r13 = 10
            X.FYc r8 = new X.FYc
            r11 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            X.C7NC.A00(r0, r8)
            com.facebook.payments.dcp.xapp.model.IapNativeErrorAsThrowable r0 = new com.facebook.payments.dcp.xapp.model.IapNativeErrorAsThrowable
            r0.<init>(r2)
            throw r0
        La9:
            r3 = 0
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController.A02(X.GeV, com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController, X.Ge3, X.HjI, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/payments/dcp/xapp/controller/quote/IapQuoteController;LX/Ge3;LX/GeV;LX/HtJ<-LX/HjI;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A04(X.C9717GeV r9, com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController r10, X.C9698Ge3 r11, X.HtJ r12) {
        /*
            r5 = r11
            r4 = 12
            boolean r0 = r12 instanceof X.C8911FtT
            if (r0 == 0) goto Lf
            r0 = r12
            X.FtT r0 = (X.C8911FtT) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r4) goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L34
            r3 = r12
            X.FtT r3 = (X.C8911FtT) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r3.A00 = r2
        L20:
            java.lang.Object r2 = r3.A04
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L43
            if (r0 != r4) goto L3e
            java.lang.Object r5 = r3.A02
            X.Ge3 r5 = (X.C9698Ge3) r5
            java.lang.Object r10 = r3.A01
            com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController r10 = (com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController) r10
            goto L3a
        L34:
            X.FtT r3 = new X.FtT
            r3.<init>(r10, r12, r4)
            goto L20
        L3a:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L57
            return r2
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L43:
            X.Hwg.A00(r2)
            r3.A01 = r10     // Catch: java.lang.Throwable -> L57
            r3.A02 = r11     // Catch: java.lang.Throwable -> L57
            r0 = 0
            r3.A03 = r0     // Catch: java.lang.Throwable -> L57
            r3.A00 = r4     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = A03(r9, r10, r11, r3)     // Catch: java.lang.Throwable -> L57
            if (r0 != r1) goto L56
            return r1
        L56:
            return r0
        L57:
            r3 = move-exception
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L5d
            throw r3
        L5d:
            X.HiU r2 = X.HiU.A00
            X.Gei r1 = r10.A05
            java.lang.String r0 = "CREATE_DCPPREQUOTE"
            X.Hzd r2 = r2.A04(r1, r0, r3)
            X.Ge6 r11 = r10.A00
            X.AbstractC7609F5w.A13(r4, r5, r2)
            X.8ee<?> r1 = r11.A02
            java.lang.String r0 = "client_create_dcpprequote_fail"
            X.Eu1 r1 = r1.acquireEvent(r0)
            r0 = 11
            X.EVS r0 = X.AbstractC7607F5u.A0s(r1, r0)
            X.Gez r9 = r11.A0H(r5)
            r4 = 0
            X.GeE r3 = r11.A0J(r4)
            r6 = r4
            r7 = r4
            r8 = r4
            X.C9700GeE.A00(r3, r4, r5, r6, r7, r8)
            r3.A03(r2)
            java.util.Map<java.lang.String, java.lang.String> r8 = r3.A01
            r12 = 4
            X.FYc r7 = new X.FYc
            r10 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            X.C7NC.A00(r0, r7)
            com.facebook.payments.dcp.xapp.model.IapNativeErrorAsThrowable r0 = new com.facebook.payments.dcp.xapp.model.IapNativeErrorAsThrowable
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController.A04(X.GeV, com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController, X.Ge3, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.Hs8 r6, com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController r7, X.HtJ r8) {
        /*
            r3 = 8
            boolean r0 = r8 instanceof X.C8913FtV
            if (r0 == 0) goto L66
            r5 = r8
            X.FtV r5 = (X.C8913FtV) r5
            int r0 = r5.$t
            if (r0 != r3) goto L66
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r4 = r5.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L4d
            if (r0 != r2) goto L81
            java.lang.Object r6 = r5.A01
            X.Hwg.A00(r4)
        L28:
            X.Hsa r4 = (X.Hsa) r4
            X.HsR r1 = r7.A03
            if (r1 == 0) goto L33
            java.lang.String r0 = "purchases_fetch_end"
            r1.AQ8(r0)
        L33:
            boolean r0 = r4 instanceof X.HsD
            if (r0 == 0) goto L42
            X.HsD r4 = (X.HsD) r4
            V r0 = r4.A00
            java.util.List r0 = (java.util.List) r0
        L3d:
            X.HjI r3 = X.AbstractC10479Hku.A00(r0)
            return r3
        L42:
            boolean r0 = r4 instanceof X.C10541Hqt
            if (r0 == 0) goto L7c
            X.Hs8 r0 = X.Hs8.A02
            if (r6 != r0) goto L6c
            X.AGi r0 = X.C0881AGi.A00
            goto L3d
        L4d:
            X.Hwg.A00(r4)
            X.HsR r1 = r7.A03
            if (r1 == 0) goto L59
            java.lang.String r0 = "purchases_fetch_start"
            r1.AQ8(r0)
        L59:
            com.facebook.payments.dcp.xapp.controller.IapSessionContextController r0 = r7.A06
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = r0.A04(r6, r5)
            if (r4 != r3) goto L28
            return r3
        L66:
            X.FtV r5 = new X.FtV
            r5.<init>(r7, r8, r3)
            goto L18
        L6c:
            X.Hqt r4 = (X.C10541Hqt) r4
            X.HoG r1 = r4.A00
            java.lang.String r0 = "CREATE_DCPPREQUOTE"
            X.Hzd r0 = X.HiU.A00(r1, r0)
            com.facebook.payments.dcp.xapp.model.IapNativeErrorAsThrowable r1 = new com.facebook.payments.dcp.xapp.model.IapNativeErrorAsThrowable
            r1.<init>(r0)
            throw r1
        L7c:
            kotlin.NoWhenBranchMatchedException r1 = X.C3cG.A0q()
            throw r1
        L81:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController.A00(X.Hs8, com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C9717GeV r22, com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController r23, X.C9698Ge3 r24, X.HjI r25, X.HtJ r26) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController.A01(X.GeV, com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController, X.Ge3, X.HjI, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.C9717GeV r17, com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController r18, X.C9698Ge3 r19, X.HtJ r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController.A03(X.GeV, com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController, X.Ge3, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067 A[Catch: all -> 0x00e7, TryCatch #0 {, blocks: (B:29:0x005a, B:31:0x0062, B:34:0x0067), top: B:74:0x005a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController r10, X.C9698Ge3 r11, X.HtJ r12) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController.A05(com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController, X.Ge3, X.HtJ):java.lang.Object");
    }
}
