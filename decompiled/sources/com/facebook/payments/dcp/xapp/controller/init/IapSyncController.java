package com.facebook.payments.dcp.xapp.controller.init;

import X.AbstractC10492Hlw;
import X.AbstractC10579HwA;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AbstractC8150FWo;
import X.BV3;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C78U;
import X.C79;
import X.C7BY;
import X.C7NC;
import X.C8185FYc;
import X.C8897FtE;
import X.C9250GBd;
import X.C9574GPi;
import X.C9677Gdh;
import X.C9699Ge6;
import X.C9742Gev;
import X.C9748Gf1;
import X.C9tI;
import X.CFK;
import X.EVS;
import X.EnumC9704GeI;
import X.EnumC9706GeK;
import X.FYF;
import X.HVq;
import X.HVr;
import X.Hke;
import X.Hzd;
import X.I0P;
import X.InterfaceC9568GPa;
import X.InterfaceC9725Ged;
import X.InterfaceC9729Gei;
import android.content.pm.PackageManager;
import com.facebook.aura.gateway.ConnectorOrderCheckoutKt;
import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import com.facebook.payments.dcp.xapp.controller.purchase.ConsumePurchaseController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class IapSyncController {
    public final C9699Ge6 A00;
    public final InterfaceC9729Gei A01;
    public final C9574GPi A02;
    public final ConsumePurchaseController A03;
    public final IapMutator A04;
    public final InterfaceC9568GPa A05;
    public final IapSessionContextController A06;
    public final C78U A07;

    public IapSyncController(IapMutator iapMutator, C9699Ge6 c9699Ge6, InterfaceC9568GPa interfaceC9568GPa, InterfaceC9729Gei interfaceC9729Gei, C9574GPi c9574GPi, IapSessionContextController iapSessionContextController, ConsumePurchaseController consumePurchaseController, C78U c78u) {
        C7384Etj.A0Y(c78u, 7);
        this.A01 = interfaceC9729Gei;
        this.A00 = c9699Ge6;
        this.A04 = iapMutator;
        this.A06 = iapSessionContextController;
        this.A03 = consumePurchaseController;
        this.A02 = c9574GPi;
        this.A05 = interfaceC9568GPa;
        this.A07 = c78u;
    }

    public static final C9677Gdh A00(Hzd hzd, IapSyncController iapSyncController, EnumC9704GeI enumC9704GeI, String str, List list, Map map) {
        EVS evsA0s;
        FYF fyf;
        C7384Etj.A0Y(str, 4);
        try {
            C9699Ge6 c9699Ge6 = iapSyncController.A00;
            if (list == null) {
                list = C0881AGi.A00;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strA03 = ((AbstractC10579HwA) it.next()).A03();
                if (strA03 != null && !C7BY.A0j(strA03)) {
                    arrayListA0h.add(strA03);
                }
            }
            LinkedHashMap linkedHashMapA14 = map != null ? AbstractC7607F5u.A14(map) : C3cG.A0j();
            try {
                String str2 = c9699Ge6.A01.getPackageManager().getPackageInfo(BV3.A00(2), 0).versionName;
                if (str2 != null) {
                    linkedHashMapA14.put("google_play_store_app_version", str2);
                }
            } catch (PackageManager.NameNotFoundException | SecurityException unused) {
            }
            HVq hVqA00 = HVr.A00(AbstractC7610F5x.A10(linkedHashMapA14));
            C9742Gev c9742Gev = new C9742Gev();
            AbstractC8150FWo.A02(c9742Gev, "request_id", str);
            c9742Gev.A00.put("external_transaction_ids", arrayListA0h);
            if (enumC9704GeI.isError) {
                if (hzd != null) {
                    linkedHashMapA14.put("iap_native_error_payload", AbstractC10492Hlw.A00(hzd));
                }
                evsA0s = AbstractC7607F5u.A0s(c9699Ge6.A02.acquireEvent("client_create_iapsynchronize_fail"), 18);
                fyf = new FYF(hVqA00, c9742Gev, c9699Ge6, linkedHashMapA14, str, 0);
            } else {
                evsA0s = AbstractC7607F5u.A0s(c9699Ge6.A02.acquireEvent("client_create_iapsynchronize_success"), 20);
                fyf = new FYF(hVqA00, c9742Gev, c9699Ge6, linkedHashMapA14, str, 1);
            }
            C7NC.A00(evsA0s, fyf);
        } catch (Throwable th) {
            CFK.A08("IapSyncController", "Failed logging the sync terminal", th);
        }
        return new C9677Gdh(new I0P(enumC9704GeI.isError ? EnumC9706GeK.A04 : EnumC9706GeK.A0H), enumC9704GeI);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.Hs8 r6, com.facebook.payments.dcp.xapp.controller.init.IapSyncController r7, X.HtJ r8) {
        /*
            r3 = 6
            boolean r0 = r8 instanceof X.C8913FtV
            if (r0 == 0) goto L52
            r5 = r8
            X.FtV r5 = (X.C8913FtV) r5
            int r0 = r5.$t
            if (r0 != r3) goto L52
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r4 = r5.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L41
            if (r0 != r2) goto L5d
            X.Hwg.A00(r4)
        L25:
            X.Hsa r4 = (X.Hsa) r4
            boolean r0 = r4 instanceof X.HsD
            if (r0 == 0) goto L36
            X.HoG r1 = X.C9732Gel.A03
            X.HsD r4 = (X.HsD) r4
            V r0 = r4.A00
        L31:
            X.HxE r3 = X.C3cG.A0r(r1, r0)
            return r3
        L36:
            boolean r0 = r4 instanceof X.C10541Hqt
            if (r0 == 0) goto L58
            X.Hqt r4 = (X.C10541Hqt) r4
            X.HoG r1 = r4.A00
            X.AGi r0 = X.C0881AGi.A00
            goto L31
        L41:
            X.Hwg.A00(r4)
            com.facebook.payments.dcp.xapp.controller.IapSessionContextController r1 = r7.A06
            r0 = 0
            r5.A01 = r0
            r5.A00 = r2
            java.lang.Object r4 = r1.A04(r6, r5)
            if (r4 != r3) goto L25
            return r3
        L52:
            X.FtV r5 = new X.FtV
            r5.<init>(r7, r8, r3)
            goto L17
        L58:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L5d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.init.IapSyncController.A01(X.Hs8, com.facebook.payments.dcp.xapp.controller.init.IapSyncController, X.HtJ):java.lang.Object");
    }

    private final void A05(Hke hke, InterfaceC9725Ged interfaceC9725Ged) {
        if (C78U.A00(this.A07, C79.A0K, new C8897FtE(interfaceC9725Ged, this, hke, null, 5)) == null) {
            new C9250GBd(null).A5w(null);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gdd;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/HtJ<-LX/Gdh;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(X.C9674Gdd r10, X.HtJ r11, kotlin.jvm.functions.Function0 r12) {
        /*
            r9 = this;
            r3 = 7
            boolean r0 = r11 instanceof X.C8911FtT
            r7 = r9
            if (r0 == 0) goto L28
            r5 = r11
            X.FtT r5 = (X.C8911FtT) r5
            int r0 = r5.$t
            if (r0 != r3) goto L28
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r2 = r5.A04
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L33
            if (r0 != r4) goto L2e
            java.lang.Object r9 = r5.A03
            java.lang.String r9 = (java.lang.String) r9
            goto L61
        L28:
            X.FtT r5 = new X.FtT
            r5.<init>(r9, r11, r3)
            goto L18
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r2)
            java.lang.String r9 = r10.A01
            if (r9 != 0) goto L42
            X.Ge6 r0 = r7.A00
            java.lang.String r9 = X.C9699Ge6.A03()
            r0.A0B = r9
        L42:
            X.Ge6 r3 = r7.A00
            X.GPp r2 = X.EnumC9578GPp.A03
            X.9jH r1 = X.C9jH.A00
            r0 = 18
            X.FZO r0 = X.FZO.A02(r1, r0)
            X.AbstractC9684Gdo.A00(r2, r3, r0)
            r0 = 0
            r5.A01 = r0     // Catch: java.lang.Throwable -> L67
            r5.A02 = r0     // Catch: java.lang.Throwable -> L67
            r5.A03 = r9     // Catch: java.lang.Throwable -> L67
            r5.A00 = r4     // Catch: java.lang.Throwable -> L67
            java.lang.Object r2 = A03(r7, r10, r9, r5, r12)     // Catch: java.lang.Throwable -> L67
            if (r2 != r6) goto L64
            return r6
        L61:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L67
        L64:
            X.GeZ r2 = (X.C9721GeZ) r2     // Catch: java.lang.Throwable -> L67
            goto L7d
        L67:
            r4 = move-exception
            X.C3cG.A1H(r5)
            X.GeI r3 = X.EnumC9704GeI.A08
            X.HiU r2 = X.HiU.A00
            java.lang.String r1 = "CREATE_IAPSYNCHRONIZE"
            X.Gei r0 = r7.A01
            X.Hzd r1 = r2.A04(r0, r1, r4)
            r0 = 0
            X.GeZ r2 = new X.GeZ
            r2.<init>(r1, r3, r0, r0)
        L7d:
            X.GeI r8 = r2.A01
            X.Hzd r6 = r2.A00
            java.util.List<X.HwA> r10 = r2.A02
            java.util.Map<java.lang.String, java.lang.String> r11 = r2.A03
            X.Gdh r0 = A00(r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.init.IapSyncController.A06(X.Gdd, X.HtJ, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/HwA;>;LX/Gdd;Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/HtJ<-LX/GeZ;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.facebook.payments.dcp.xapp.controller.init.IapSyncController r19, X.C9674Gdd r20, java.lang.String r21, java.util.List r22, X.HtJ r23, kotlin.jvm.functions.Function0 r24) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.init.IapSyncController.A02(com.facebook.payments.dcp.xapp.controller.init.IapSyncController, X.Gdd, java.lang.String, java.util.List, X.HtJ, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.facebook.payments.dcp.xapp.controller.init.IapSyncController r19, X.C9674Gdd r20, java.lang.String r21, X.HtJ r22, kotlin.jvm.functions.Function0 r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.init.IapSyncController.A03(com.facebook.payments.dcp.xapp.controller.init.IapSyncController, X.Gdd, java.lang.String, X.HtJ, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public static final void A04(Hzd hzd, C9699Ge6 c9699Ge6, InterfaceC9725Ged interfaceC9725Ged, Map map) {
        Long lA0s;
        Long lA0s2;
        Long lA0s3;
        Long lA0s4;
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(map);
        linkedHashMapA14.put("fulfillment_type", "asynchronousBatched");
        String strA0x = AbstractC7608F5v.A0x("external_product_id", linkedHashMapA14);
        String strA10 = AbstractC7610F5x.A10(linkedHashMapA14);
        String strA0x2 = AbstractC7608F5v.A0x("payee_id", linkedHashMapA14);
        String strA0x3 = AbstractC7608F5v.A0x("product_id", linkedHashMapA14);
        String strA0x4 = AbstractC7608F5v.A0x("quote_id", linkedHashMapA14);
        boolean zAreEqual = C7384Etj.areEqual(linkedHashMapA14.remove("is_retry"), "true");
        if (strA10.length() == 0) {
            strA10 = null;
        }
        String strA0x5 = AbstractC7608F5v.A0x("external_transaction_id", linkedHashMapA14);
        String strA0x6 = AbstractC7608F5v.A0x("dcp_order_id", linkedHashMapA14);
        C9748Gf1 c9748Gf1 = new C9748Gf1();
        AbstractC7608F5v.A1F(c9748Gf1);
        AbstractC8150FWo.A02(c9748Gf1, "dcp_sub_flow", ConnectorOrderCheckoutKt.FULFILLMENT_KEY);
        C9699Ge6.A07(c9748Gf1, c9699Ge6);
        Map mapA16 = AbstractC7610F5x.A16(c9748Gf1);
        AbstractC8150FWo.A02(c9748Gf1, "target_name", "iap_checkout");
        C9699Ge6.A06(c9748Gf1, c9699Ge6);
        if (strA0x5 != null) {
            AbstractC8150FWo.A02(c9748Gf1, "external_transaction_id", strA0x5);
        }
        mapA16.put("is_retry", Boolean.valueOf(zAreEqual));
        if (strA0x != null) {
            AbstractC8150FWo.A02(c9748Gf1, "external_product_id", strA0x);
        }
        if (strA0x2 != null && (lA0s4 = C9tI.A0s(strA0x2)) != null) {
            AbstractC8150FWo.A02(c9748Gf1, "payee_id", lA0s4);
        }
        if (strA0x3 != null && (lA0s3 = C9tI.A0s(strA0x3)) != null) {
            AbstractC8150FWo.A02(c9748Gf1, "product_id", lA0s3);
        }
        if (strA0x4 != null && (lA0s2 = C9tI.A0s(strA0x4)) != null) {
            AbstractC8150FWo.A02(c9748Gf1, "quote_id", lA0s2);
        }
        if (strA0x6 != null && (lA0s = C9tI.A0s(strA0x6)) != null) {
            AbstractC8150FWo.A02(c9748Gf1, "internal_transaction_id", lA0s);
        }
        if (strA10 != null) {
            AbstractC8150FWo.A02(c9748Gf1, "dcp_product_type", strA10);
        }
        linkedHashMapA14.put("iap_native_error_payload", AbstractC10492Hlw.A00(hzd));
        C7NC.A00(AbstractC7607F5u.A0s(c9699Ge6.A02.acquireEvent("client_verify_dcppayment_fail"), 49), new C8185FYc(interfaceC9725Ged, linkedHashMapA14, c9748Gf1, c9699Ge6, 24));
    }
}
