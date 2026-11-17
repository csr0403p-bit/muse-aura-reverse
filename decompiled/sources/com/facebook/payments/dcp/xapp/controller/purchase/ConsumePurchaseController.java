package com.facebook.payments.dcp.xapp.controller.purchase;

import X.AbstractC7607F5u;
import X.AbstractC7610F5x;
import X.AbstractC8150FWo;
import X.C7384Etj;
import X.C7NC;
import X.C9574GPi;
import X.C9699Ge6;
import X.C9743Gew;
import X.C9jH;
import X.EnumC9704GeI;
import X.FYF;
import X.HVq;
import X.HVr;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ConsumePurchaseController {
    public final C9699Ge6 A00;
    public final C9574GPi A01;
    public final IapSessionContextController A02;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebook.payments.dcp.xapp.controller.purchase.ConsumePurchaseController r20, X.Ho0 r21, X.InterfaceC9725Ged r22, X.C10482Hla r23, X.HtJ r24) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.purchase.ConsumePurchaseController.A00(com.facebook.payments.dcp.xapp.controller.purchase.ConsumePurchaseController, X.Ho0, X.Ged, X.Hla, X.HtJ):java.lang.Object");
    }

    public static final void A01(C9699Ge6 c9699Ge6, EnumC9704GeI enumC9704GeI, String str, Map<String, String> map) {
        if (map == null) {
            map = C9jH.A00;
        }
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(map);
        String str2 = enumC9704GeI.resultMessage;
        C7384Etj.A0Y(str2, 1);
        linkedHashMapA14.put(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, str2);
        linkedHashMapA14.put("DcpResultCode", enumC9704GeI.name());
        linkedHashMapA14.put("external_transaction_id", str);
        linkedHashMapA14.remove("external_product_id");
        HVq hVqA00 = HVr.A00(AbstractC7610F5x.A10(linkedHashMapA14));
        String str3 = (String) linkedHashMapA14.remove("request_id");
        if (str3 == null) {
            str3 = c9699Ge6.A0B;
        }
        boolean zAreEqual = C7384Etj.areEqual(linkedHashMapA14.remove("is_retry"), "true");
        C7384Etj.A0Y(str3, 0);
        C9743Gew c9743Gew = new C9743Gew();
        AbstractC8150FWo.A02(c9743Gew, "request_id", str3);
        c9743Gew.A00.put("is_retry", Boolean.valueOf(zAreEqual));
        C7NC.A00(AbstractC7607F5u.A0s(c9699Ge6.A02.acquireEvent("client_create_iapexternalconfirm_warning"), 17), new FYF(hVqA00, c9743Gew, c9699Ge6, linkedHashMapA14, str3, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.Hke r10, X.InterfaceC9725Ged r11, X.HtJ<? super java.lang.Boolean> r12) {
        /*
            r9 = this;
            r3 = 9
            boolean r0 = r12 instanceof X.C8912FtU
            r7 = r9
            if (r0 == 0) goto L62
            r4 = r12
            X.FtU r4 = (X.C8912FtU) r4
            int r0 = r4.$t
            if (r0 != r3) goto L62
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r4.A00 = r2
        L19:
            java.lang.Object r3 = r4.A03
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L68
            X.Hwg.A00(r3)
        L27:
            boolean r1 = X.AnonymousClass001.A1X(r3)
            if (r1 == 0) goto L32
            com.facebook.payments.dcp.xapp.controller.IapSessionContextController r0 = r7.A02
            r0.A06()
        L32:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L37:
            X.Hwg.A00(r3)
            r8 = r10
            java.util.List<X.Hla> r0 = r10.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4d
            X.Ge6 r2 = r9.A00
            X.GeI r1 = X.EnumC9704GeI.A05
            r0 = 0
            A01(r2, r1, r0, r0)
            r1 = 0
            goto L32
        L4d:
            r9 = 0
            r10 = 3
            X.FtD r5 = new X.FtD
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A01 = r9
            r4.A02 = r9
            r4.A00 = r1
            java.lang.Object r3 = X.AbstractC10627Hzt.A00(r5, r4)
            if (r3 != r2) goto L27
            return r2
        L62:
            X.FtU r4 = new X.FtU
            r4.<init>(r9, r12, r3)
            goto L19
        L68:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.purchase.ConsumePurchaseController.A02(X.Hke, X.Ged, X.HtJ):java.lang.Object");
    }

    public ConsumePurchaseController(C9699Ge6 c9699Ge6, C9574GPi c9574GPi, IapSessionContextController iapSessionContextController) {
        this.A00 = c9699Ge6;
        this.A01 = c9574GPi;
        this.A02 = iapSessionContextController;
    }
}
