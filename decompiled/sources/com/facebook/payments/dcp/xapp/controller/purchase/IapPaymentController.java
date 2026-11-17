package com.facebook.payments.dcp.xapp.controller.purchase;

import X.C9574GPi;
import X.C9699Ge6;
import X.C9716GeU;
import X.C9717GeV;
import X.C9720GeY;
import X.GPM;
import X.HsR;
import X.InterfaceC9729Gei;
import com.facebook.payments.dcp.xapp.model.IapSdkException;

/* loaded from: classes6.dex */
public final class IapPaymentController {
    public final C9699Ge6 A00;
    public final C9574GPi A01;
    public final C9716GeU A02;
    public final HsR A03;
    public final InterfaceC9729Gei A04;
    public final IapPurchaseController A05;

    private final void A02(C9717GeV c9717GeV, Integer num) {
        C9720GeY c9720GeY;
        if (num == null || (c9720GeY = c9717GeV.A00) == null) {
            return;
        }
        this.A02.A03(c9717GeV, new C9720GeY(c9720GeY.A00, c9720GeY.A01, num, c9720GeY.A03, c9720GeY.A04));
    }

    /* JADX WARN: Failed to calculate best type for var: r6v0 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x02fa: MOVE (r16 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:762), block:B:130:0x02de */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x02ea: INVOKE (r14 I:X.Huh) = (r9 I:X.GPY) INTERFACE call: X.GPY.AJH():X.Huh A[MD:():X.Huh (m)] (LINE:746), block:B:130:0x02de */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a3 A[Catch: all -> 0x02dd, CancellationException -> 0x0305, TRY_ENTER, TryCatch #3 {CancellationException -> 0x0305, all -> 0x02dd, blocks: (B:113:0x028c, B:114:0x028f, B:116:0x0295, B:117:0x029a, B:16:0x0052, B:19:0x0062, B:23:0x006b, B:25:0x0084, B:27:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0098, B:86:0x0206, B:87:0x020a, B:89:0x0210, B:33:0x00a8, B:35:0x012a, B:37:0x0132, B:39:0x0136, B:41:0x013c, B:43:0x0148, B:44:0x014a, B:45:0x014f, B:47:0x015a, B:49:0x015e, B:50:0x016a, B:52:0x0170, B:53:0x0175, B:54:0x017d, B:95:0x022c, B:99:0x0231, B:102:0x023a, B:104:0x023e, B:106:0x0242, B:107:0x0245, B:109:0x024d, B:110:0x0257, B:98:0x0230, B:128:0x02dc, B:127:0x02d8, B:122:0x02a3, B:56:0x0180, B:58:0x0184, B:60:0x0188, B:62:0x018e, B:63:0x0191, B:65:0x0195, B:67:0x0199, B:70:0x01aa, B:72:0x01b2, B:73:0x01ba, B:75:0x01be, B:77:0x01c4, B:79:0x01c9, B:81:0x01cf, B:83:0x01d3, B:84:0x01fb, B:123:0x02b9, B:125:0x02bd, B:126:0x02d3, B:85:0x0202), top: B:136:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[Catch: all -> 0x02dd, CancellationException -> 0x0305, TryCatch #3 {CancellationException -> 0x0305, all -> 0x02dd, blocks: (B:113:0x028c, B:114:0x028f, B:116:0x0295, B:117:0x029a, B:16:0x0052, B:19:0x0062, B:23:0x006b, B:25:0x0084, B:27:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0098, B:86:0x0206, B:87:0x020a, B:89:0x0210, B:33:0x00a8, B:35:0x012a, B:37:0x0132, B:39:0x0136, B:41:0x013c, B:43:0x0148, B:44:0x014a, B:45:0x014f, B:47:0x015a, B:49:0x015e, B:50:0x016a, B:52:0x0170, B:53:0x0175, B:54:0x017d, B:95:0x022c, B:99:0x0231, B:102:0x023a, B:104:0x023e, B:106:0x0242, B:107:0x0245, B:109:0x024d, B:110:0x0257, B:98:0x0230, B:128:0x02dc, B:127:0x02d8, B:122:0x02a3, B:56:0x0180, B:58:0x0184, B:60:0x0188, B:62:0x018e, B:63:0x0191, B:65:0x0195, B:67:0x0199, B:70:0x01aa, B:72:0x01b2, B:73:0x01ba, B:75:0x01be, B:77:0x01c4, B:79:0x01c9, B:81:0x01cf, B:83:0x01d3, B:84:0x01fb, B:123:0x02b9, B:125:0x02bd, B:126:0x02d3, B:85:0x0202), top: B:136:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a A[Catch: all -> 0x02dd, CancellationException -> 0x0305, TryCatch #3 {CancellationException -> 0x0305, all -> 0x02dd, blocks: (B:113:0x028c, B:114:0x028f, B:116:0x0295, B:117:0x029a, B:16:0x0052, B:19:0x0062, B:23:0x006b, B:25:0x0084, B:27:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0098, B:86:0x0206, B:87:0x020a, B:89:0x0210, B:33:0x00a8, B:35:0x012a, B:37:0x0132, B:39:0x0136, B:41:0x013c, B:43:0x0148, B:44:0x014a, B:45:0x014f, B:47:0x015a, B:49:0x015e, B:50:0x016a, B:52:0x0170, B:53:0x0175, B:54:0x017d, B:95:0x022c, B:99:0x0231, B:102:0x023a, B:104:0x023e, B:106:0x0242, B:107:0x0245, B:109:0x024d, B:110:0x0257, B:98:0x0230, B:128:0x02dc, B:127:0x02d8, B:122:0x02a3, B:56:0x0180, B:58:0x0184, B:60:0x0188, B:62:0x018e, B:63:0x0191, B:65:0x0195, B:67:0x0199, B:70:0x01aa, B:72:0x01b2, B:73:0x01ba, B:75:0x01be, B:77:0x01c4, B:79:0x01c9, B:81:0x01cf, B:83:0x01d3, B:84:0x01fb, B:123:0x02b9, B:125:0x02bd, B:126:0x02d3, B:85:0x0202), top: B:136:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0170 A[Catch: all -> 0x02dd, CancellationException -> 0x0305, TryCatch #3 {CancellationException -> 0x0305, all -> 0x02dd, blocks: (B:113:0x028c, B:114:0x028f, B:116:0x0295, B:117:0x029a, B:16:0x0052, B:19:0x0062, B:23:0x006b, B:25:0x0084, B:27:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0098, B:86:0x0206, B:87:0x020a, B:89:0x0210, B:33:0x00a8, B:35:0x012a, B:37:0x0132, B:39:0x0136, B:41:0x013c, B:43:0x0148, B:44:0x014a, B:45:0x014f, B:47:0x015a, B:49:0x015e, B:50:0x016a, B:52:0x0170, B:53:0x0175, B:54:0x017d, B:95:0x022c, B:99:0x0231, B:102:0x023a, B:104:0x023e, B:106:0x0242, B:107:0x0245, B:109:0x024d, B:110:0x0257, B:98:0x0230, B:128:0x02dc, B:127:0x02d8, B:122:0x02a3, B:56:0x0180, B:58:0x0184, B:60:0x0188, B:62:0x018e, B:63:0x0191, B:65:0x0195, B:67:0x0199, B:70:0x01aa, B:72:0x01b2, B:73:0x01ba, B:75:0x01be, B:77:0x01c4, B:79:0x01c9, B:81:0x01cf, B:83:0x01d3, B:84:0x01fb, B:123:0x02b9, B:125:0x02bd, B:126:0x02d3, B:85:0x0202), top: B:136:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191 A[Catch: all -> 0x02dd, CancellationException -> 0x0305, TryCatch #3 {CancellationException -> 0x0305, all -> 0x02dd, blocks: (B:113:0x028c, B:114:0x028f, B:116:0x0295, B:117:0x029a, B:16:0x0052, B:19:0x0062, B:23:0x006b, B:25:0x0084, B:27:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0098, B:86:0x0206, B:87:0x020a, B:89:0x0210, B:33:0x00a8, B:35:0x012a, B:37:0x0132, B:39:0x0136, B:41:0x013c, B:43:0x0148, B:44:0x014a, B:45:0x014f, B:47:0x015a, B:49:0x015e, B:50:0x016a, B:52:0x0170, B:53:0x0175, B:54:0x017d, B:95:0x022c, B:99:0x0231, B:102:0x023a, B:104:0x023e, B:106:0x0242, B:107:0x0245, B:109:0x024d, B:110:0x0257, B:98:0x0230, B:128:0x02dc, B:127:0x02d8, B:122:0x02a3, B:56:0x0180, B:58:0x0184, B:60:0x0188, B:62:0x018e, B:63:0x0191, B:65:0x0195, B:67:0x0199, B:70:0x01aa, B:72:0x01b2, B:73:0x01ba, B:75:0x01be, B:77:0x01c4, B:79:0x01c9, B:81:0x01cf, B:83:0x01d3, B:84:0x01fb, B:123:0x02b9, B:125:0x02bd, B:126:0x02d3, B:85:0x0202), top: B:136:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0202 A[Catch: all -> 0x02dd, CancellationException -> 0x0305, TryCatch #3 {CancellationException -> 0x0305, all -> 0x02dd, blocks: (B:113:0x028c, B:114:0x028f, B:116:0x0295, B:117:0x029a, B:16:0x0052, B:19:0x0062, B:23:0x006b, B:25:0x0084, B:27:0x0088, B:28:0x008c, B:30:0x0092, B:32:0x0098, B:86:0x0206, B:87:0x020a, B:89:0x0210, B:33:0x00a8, B:35:0x012a, B:37:0x0132, B:39:0x0136, B:41:0x013c, B:43:0x0148, B:44:0x014a, B:45:0x014f, B:47:0x015a, B:49:0x015e, B:50:0x016a, B:52:0x0170, B:53:0x0175, B:54:0x017d, B:95:0x022c, B:99:0x0231, B:102:0x023a, B:104:0x023e, B:106:0x0242, B:107:0x0245, B:109:0x024d, B:110:0x0257, B:98:0x0230, B:128:0x02dc, B:127:0x02d8, B:122:0x02a3, B:56:0x0180, B:58:0x0184, B:60:0x0188, B:62:0x018e, B:63:0x0191, B:65:0x0195, B:67:0x0199, B:70:0x01aa, B:72:0x01b2, B:73:0x01ba, B:75:0x01be, B:77:0x01c4, B:79:0x01c9, B:81:0x01cf, B:83:0x01d3, B:84:0x01fb, B:123:0x02b9, B:125:0x02bd, B:126:0x02d3, B:85:0x0202), top: B:136:0x0022 }] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.GPY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.app.Activity r32, X.C9717GeV r33, com.facebook.payments.dcp.xapp.controller.purchase.IapPaymentController r34, X.C9713GeR r35, X.HtJ r36) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.purchase.IapPaymentController.A00(android.app.Activity, X.GeV, com.facebook.payments.dcp.xapp.controller.purchase.IapPaymentController, X.GeR, X.HtJ):java.lang.Object");
    }

    private final void A01(C9717GeV c9717GeV) {
        C9717GeV c9717GeVA01 = this.A02.A01();
        if ((c9717GeVA01 != null ? c9717GeVA01.A08 : null) != c9717GeV.A08) {
            throw new IapSdkException(GPM.A03, "Purchase attempt was superseded before offer selection.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(android.app.Activity r7, X.C9717GeV r8, X.C9713GeR r9, X.HtJ r10) {
        /*
            r6 = this;
            r3 = 9
            boolean r0 = r10 instanceof X.C8911FtT
            if (r0 == 0) goto L43
            r4 = r10
            X.FtT r4 = (X.C8911FtT) r4
            int r0 = r4.$t
            if (r0 != r3) goto L43
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r3 = r4.A04
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto Lb8
            java.lang.Object r8 = r4.A03
            X.GeV r8 = (X.C9717GeV) r8
            java.lang.Object r9 = r4.A02
            X.GeR r9 = (X.C9713GeR) r9
            X.Hwg.A00(r3)
        L2e:
            X.GfG r3 = (X.InterfaceC9762GfG) r3
            boolean r0 = r3 instanceof X.C9719GeX
            if (r0 == 0) goto L49
            return r3
        L35:
            X.Hwg.A00(r3)
            r0 = 0
            X.C8911FtT.A00(r0, r9, r8, r4, r1)
            java.lang.Object r3 = A00(r7, r8, r6, r9, r4)
            if (r3 != r2) goto L2e
            return r2
        L43:
            X.FtT r4 = new X.FtT
            r4.<init>(r6, r10, r3)
            goto L18
        L49:
            boolean r0 = r3 instanceof X.C9722Gea
            if (r0 == 0) goto Lb3
            X.Gea r3 = (X.C9722Gea) r3
            SuccessT r2 = r3.A00
            X.HoG r2 = (X.InterfaceC10512HoG) r2
            X.GeK r1 = r2.AJk()
            X.GeK r0 = X.EnumC9706GeK.A0H
            if (r1 != r0) goto L82
            X.GeU r3 = r6.A02
            monitor-enter(r3)
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)     // Catch: java.lang.Throwable -> L7f
            X.Gdp r0 = r3.A01     // Catch: java.lang.Throwable -> L7f
            X.Ge2 r0 = r0.A01     // Catch: java.lang.Throwable -> L7f
            X.GeV r2 = r0.A00     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L74
            X.GfK r1 = r2.A08     // Catch: java.lang.Throwable -> L7f
        L6c:
            X.GfK r0 = r8.A08     // Catch: java.lang.Throwable -> L7f
            if (r1 != r0) goto L76
            r0 = 1
            r2.A05 = r0     // Catch: java.lang.Throwable -> L7f
            goto L76
        L74:
            r1 = 0
            goto L6c
        L76:
            monitor-exit(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            X.Gea r1 = new X.Gea
            r1.<init>(r0)
            return r1
        L7f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7f
            throw r0
        L82:
            X.GeK r0 = X.EnumC9706GeK.A0C
            if (r1 == r0) goto L8a
            X.GeK r0 = X.EnumC9706GeK.A09
            if (r1 != r0) goto L91
        L8a:
            com.facebook.payments.dcp.xapp.controller.purchase.IapPurchaseController r0 = r6.A05
            com.facebook.payments.dcp.xapp.controller.IapSessionContextController r0 = r0.A04
            r0.A06()
        L91:
            java.lang.String r0 = "CREATE_DCPPAYMENT"
            X.Hzd r1 = X.HiU.A00(r2, r0)
            X.Ge6 r2 = r6.A00
            X.Ge3 r6 = r9.A02
            X.Geb r0 = r8.A0C
            if (r0 == 0) goto Lb1
            X.Huh r4 = r0.A00()
        La3:
            X.Gd3 r7 = r9.A03
            X.GeY r5 = r8.A00
            r3 = 0
            java.lang.String r9 = "payment launch callback"
            r8 = r3
            X.C9699Ge6.A0C(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            X.GfD r1 = X.C9759GfD.A00
            return r1
        Lb1:
            r4 = 0
            goto La3
        Lb3:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lb8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.purchase.IapPaymentController.A03(android.app.Activity, X.GeV, X.GeR, X.HtJ):java.lang.Object");
    }

    public IapPaymentController(HsR hsR, C9699Ge6 c9699Ge6, InterfaceC9729Gei interfaceC9729Gei, C9574GPi c9574GPi, IapPurchaseController iapPurchaseController, C9716GeU c9716GeU) {
        this.A00 = c9699Ge6;
        this.A03 = hsR;
        this.A04 = interfaceC9729Gei;
        this.A05 = iapPurchaseController;
        this.A02 = c9716GeU;
        this.A01 = c9574GPi;
    }
}
