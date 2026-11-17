package com.facebook.payments.dcp.xapp.controller;

import X.C7384Etj;
import X.C78U;
import X.C8897FtE;
import X.C8898FtF;
import X.C8899FtG;
import X.C9574GPi;
import X.C9577GPo;
import X.C9699Ge6;
import X.FYR;
import X.GPn;
import X.Hs8;
import X.HtJ;
import X.HuV;
import X.InterfaceC10560Hsz;
import X.InterfaceC9729Gei;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class IapSessionContextController {
    public final C9577GPo A00;
    public final C9574GPi A01;
    public final C9699Ge6 A02;
    public final InterfaceC9729Gei A03;
    public final C78U A04;

    public IapSessionContextController(C9699Ge6 c9699Ge6, C9577GPo c9577GPo, InterfaceC9729Gei interfaceC9729Gei, C9574GPi c9574GPi, C78U c78u) {
        C7384Etj.A0Y(c78u, 0);
        this.A04 = c78u;
        this.A01 = c9574GPi;
        this.A03 = interfaceC9729Gei;
        this.A02 = c9699Ge6;
        this.A00 = c9577GPo;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.Hs8 r6, com.facebook.payments.dcp.xapp.controller.IapSessionContextController r7, X.HtJ r8) {
        /*
            r3 = 5
            boolean r0 = r8 instanceof X.C8913FtV
            if (r0 == 0) goto L54
            r5 = r8
            X.FtV r5 = (X.C8913FtV) r5
            int r0 = r5.$t
            if (r0 != r3) goto L54
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A02
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 != r3) goto L5a
            X.Hwg.A00(r1)
        L25:
            X.HzU r1 = (X.HzU) r1
            X.HoG r3 = r1.A00
            java.util.List<X.HwA> r2 = r1.A01
            X.GeK r1 = r3.AJk()
            X.GeK r0 = X.EnumC9706GeK.A0H
            if (r1 == r0) goto L34
            r2 = 0
        L34:
            X.HxE r4 = X.C3cG.A0r(r3, r2)
            return r4
        L39:
            X.Hwg.A00(r1)
            X.GPi r0 = r7.A01
            X.HuC r2 = r0.A00()
            X.GOz r1 = new X.GOz
            r1.<init>(r6)
            r0 = 0
            r5.A01 = r0
            r5.A00 = r3
            r0 = 0
            java.lang.Object r1 = r2.AYy(r1, r5, r0)
            if (r1 != r4) goto L25
            return r4
        L54:
            X.FtV r5 = new X.FtV
            r5.<init>(r7, r8, r3)
            goto L17
        L5a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.IapSessionContextController.A00(X.Hs8, com.facebook.payments.dcp.xapp.controller.IapSessionContextController, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A01(com.facebook.payments.dcp.xapp.controller.IapSessionContextController r5, X.HtJ r6) {
        /*
            r3 = 6
            boolean r0 = r6 instanceof X.C8911FtT
            if (r0 == 0) goto Ld
            r0 = r6
            X.FtT r0 = (X.C8911FtT) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L4c
            r4 = r6
            X.FtT r4 = (X.C8911FtT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r4.A00 = r2
        L1e:
            java.lang.Object r3 = r4.A04
            int r1 = r4.A00
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L3a
            if (r1 != r0) goto L52
            X.Hwg.A00(r3)
            X.Hsa r3 = (X.Hsa) r3
            if (r3 == 0) goto L39
            boolean r0 = r3 instanceof X.HsD
            if (r0 == 0) goto L39
            X.HsD r3 = (X.HsD) r3
            if (r3 == 0) goto L39
            V r2 = r3.A00
        L39:
            return r2
        L3a:
            X.Hwg.A00(r3)
            X.GPo r0 = r5.A00
            X.HuV<java.lang.String> r0 = r0.A01
            java.lang.Object r1 = r0.A02
            monitor-enter(r1)
            X.HsD<V> r0 = r0.A00     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)
            if (r0 == 0) goto L39
            V r2 = r0.A00
            return r2
        L4c:
            X.FtT r4 = new X.FtT
            r4.<init>(r5, r6, r3)
            goto L1e
        L52:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L57:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.IapSessionContextController.A01(com.facebook.payments.dcp.xapp.controller.IapSessionContextController, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.Hs8 r10, X.HtJ<? super X.Hsa<? extends java.util.List<? extends X.AbstractC10579HwA>>> r11) {
        /*
            r9 = this;
            r3 = 4
            boolean r0 = r11 instanceof X.C8913FtV
            if (r0 == 0) goto L8f
            r6 = r11
            X.FtV r6 = (X.C8913FtV) r6
            int r0 = r6.$t
            if (r0 != r3) goto L8f
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r4 = r6.A02
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r11 = 1
            if (r0 == 0) goto L6d
            if (r0 != r11) goto L9a
            X.Hwg.A00(r4)
        L25:
            X.Hsa r4 = (X.Hsa) r4
            boolean r0 = r4 instanceof X.HsD
            if (r0 == 0) goto L41
            X.Ge6 r10 = r9.A02
            X.HoG r8 = X.C9732Gel.A03
            r0 = r4
            X.HsD r0 = (X.HsD) r0
            V r9 = r0.A00
            X.9jH r7 = X.C9jH.A00
            X.GPp r5 = X.EnumC9578GPp.A04
            X.FYe r6 = new X.FYe
            r6.<init>(r7, r8, r9, r10, r11)
        L3d:
            X.AbstractC9684Gdo.A00(r5, r10, r6)
        L40:
            return r4
        L41:
            boolean r0 = r4 instanceof X.C10541Hqt
            if (r0 == 0) goto L95
            r0 = r4
            X.Hqt r0 = (X.C10541Hqt) r0
            X.HoG r3 = r0.A00
            boolean r0 = r3 instanceof X.C10506Hnq
            if (r0 != 0) goto L40
            X.Ge6 r10 = r9.A02
            r0 = 0
            X.GPp r5 = X.EnumC9578GPp.A02
            java.lang.String r2 = r3.AEf()
            X.C7384Etj.A0Y(r2, r0)
            java.util.LinkedHashMap r1 = X.C3cG.A0j()
            java.lang.String r0 = "error_message"
            r1.put(r0, r2)
            X.AbstractC9579GPq.A01(r3, r1)
            r0 = 18
            X.FZO r6 = X.FZO.A02(r1, r0)
            goto L3d
        L6d:
            X.Hwg.A00(r4)
            X.Ge6 r3 = r9.A02
            X.GPp r2 = X.EnumC9578GPp.A03
            X.9jH r1 = X.C9jH.A00
            r0 = 18
            X.FZO r0 = X.FZO.A02(r1, r0)
            X.AbstractC9684Gdo.A00(r2, r3, r0)
            X.Hsz r1 = A02(r10, r9)
            r0 = 0
            r6.A01 = r0
            r6.A00 = r11
            java.lang.Object r4 = X.C3cG.A0W(r1, r6)
            if (r4 != r5) goto L25
            return r5
        L8f:
            X.FtV r6 = new X.FtV
            r6.<init>(r9, r11, r3)
            goto L17
        L95:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L9a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.IapSessionContextController.A04(X.Hs8, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r6, X.HtJ<? super java.lang.String> r7) {
        /*
            r5 = this;
            r3 = 7
            boolean r0 = r7 instanceof X.C8912FtU
            if (r0 == 0) goto L45
            r4 = r7
            X.FtU r4 = (X.C8912FtU) r4
            int r0 = r4.$t
            if (r0 != r3) goto L45
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A03
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L4b
            X.Hwg.A00(r1)
        L25:
            X.Hsa r1 = (X.Hsa) r1
            boolean r0 = r1 instanceof X.HsD
            r2 = 0
            if (r0 == 0) goto L32
            X.HsD r1 = (X.HsD) r1
            if (r1 == 0) goto L32
            V r2 = r1.A00
        L32:
            return r2
        L33:
            X.Hwg.A00(r1)
            X.Hsz r1 = A03(r5, r6)
            r0 = 0
            X.C8912FtU.A00(r0, r5, r4, r3)
            java.lang.Object r1 = X.C3cG.A0W(r1, r4)
            if (r1 != r2) goto L25
            return r2
        L45:
            X.FtU r4 = new X.FtU
            r4.<init>(r5, r7, r3)
            goto L17
        L4b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.IapSessionContextController.A05(java.lang.String, X.HtJ):java.lang.Object");
    }

    public static final InterfaceC10560Hsz A02(Hs8 hs8, IapSessionContextController iapSessionContextController) {
        return HuV.A00(GPn.A00(hs8, iapSessionContextController.A00), iapSessionContextController.A04, new C8899FtG((HtJ) null, (Object) new C8898FtF(hs8, iapSessionContextController, null, 0), (HtJ<? super C8899FtG>) 6));
    }

    public static final InterfaceC10560Hsz A03(IapSessionContextController iapSessionContextController, String str) {
        return HuV.A00(iapSessionContextController.A00.A01, iapSessionContextController.A04, new C8897FtE(new FYR(str, iapSessionContextController, 0), null));
    }

    public final void A06() {
        Iterator<E> it = Hs8.A00.iterator();
        while (it.hasNext()) {
            HuV huVA00 = GPn.A00((Hs8) it.next(), this.A00);
            synchronized (huVA00.A02) {
                huVA00.A00 = null;
                huVA00.A01 = null;
            }
        }
    }
}
