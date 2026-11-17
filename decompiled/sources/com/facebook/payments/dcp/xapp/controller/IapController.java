package com.facebook.payments.dcp.xapp.controller;

import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.AbstractC8150FWo;
import X.AbstractC9266GBt;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.Bs8;
import X.C10516Hob;
import X.C10543Hqv;
import X.C10583Hwo;
import X.C10606Hye;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C78U;
import X.C78W;
import X.C7BY;
import X.C7NC;
import X.C8185FYc;
import X.C8192FYj;
import X.C8891Ft8;
import X.C8893FtA;
import X.C8897FtE;
import X.C8eO;
import X.C9574GPi;
import X.C9678Gdi;
import X.C9685Gdp;
import X.C9691Gdw;
import X.C9692Gdx;
import X.C9693Gdy;
import X.C9695Ge0;
import X.C9696Ge1;
import X.C9697Ge2;
import X.C9698Ge3;
import X.C9699Ge6;
import X.C9700GeE;
import X.C9703GeH;
import X.C9716GeU;
import X.C9717GeV;
import X.C9749Gf2;
import X.C9752Gf5;
import X.C9jH;
import X.EVS;
import X.EnumC10621Hzf;
import X.EnumC9706GeK;
import X.FZG;
import X.FZO;
import X.G0U;
import X.Hhz;
import X.HiN;
import X.HiT;
import X.HjL;
import X.Hn7;
import X.Hoa;
import X.Hoz;
import X.HpW;
import X.Hpe;
import X.Hs8;
import X.HsR;
import X.Hvy;
import X.Hwq;
import X.Hx2;
import X.Hx5;
import X.Hyq;
import X.HzJ;
import X.InterfaceC10512HoG;
import X.InterfaceC10552Hsd;
import X.InterfaceC10609Hyj;
import X.InterfaceC9729Gei;
import android.app.Activity;
import android.os.SystemClock;
import com.facebook.aura.iap.HatchIapCacheProvider;
import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController;
import com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController$cacheProductDetails$1;
import com.facebook.payments.dcp.xapp.controller.productinfo.ProductInfoController;
import com.facebook.payments.dcp.xapp.controller.purchase.ConsumePurchaseController;
import com.facebook.payments.dcp.xapp.controller.purchase.IapPurchaseController;
import com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class IapController implements InterfaceC10609Hyj {
    public final HsR A00;
    public final C9699Ge6 A01;
    public final InterfaceC9729Gei A02;
    public final C9574GPi A03;
    public final HpW A04;
    public final C9678Gdi A05;
    public final ProductInfoController A06;
    public final C78U A07;
    public final HatchIapCacheProvider A08;
    public final C9685Gdp A09;
    public final IapSessionContextController A0A;
    public final IapPrefetchDataController A0B;
    public final ConsumePurchaseController A0C;
    public final IapPurchaseController A0D;
    public final C9703GeH A0E;
    public final C9716GeU A0F;

    public IapController(HatchIapCacheProvider hatchIapCacheProvider, IapMutator iapMutator, HsR hsR, C9699Ge6 c9699Ge6, C9685Gdp c9685Gdp, InterfaceC9729Gei interfaceC9729Gei, C9574GPi c9574GPi, IapSessionContextController iapSessionContextController, C9678Gdi c9678Gdi, IapPrefetchDataController iapPrefetchDataController, ProductInfoController productInfoController, IapQuoteController iapQuoteController, C78U c78u, C9716GeU c9716GeU) {
        C7384Etj.A0Y(c78u, 0);
        C7384Etj.A0Y(c9685Gdp, 10);
        this.A07 = c78u;
        this.A01 = c9699Ge6;
        this.A02 = interfaceC9729Gei;
        this.A00 = hsR;
        this.A06 = productInfoController;
        this.A0B = iapPrefetchDataController;
        this.A03 = c9574GPi;
        this.A0F = c9716GeU;
        this.A09 = c9685Gdp;
        this.A08 = hatchIapCacheProvider;
        this.A0A = iapSessionContextController;
        this.A05 = c9678Gdi;
        this.A04 = new HpW(c78u);
        ConsumePurchaseController consumePurchaseController = new ConsumePurchaseController(c9699Ge6, c9574GPi, iapSessionContextController);
        this.A0C = consumePurchaseController;
        IapPurchaseController iapPurchaseController = new IapPurchaseController(hatchIapCacheProvider, iapMutator, hsR, c9699Ge6, c9685Gdp, interfaceC9729Gei, c9574GPi, iapSessionContextController, consumePurchaseController, iapQuoteController, c78u, c9716GeU);
        this.A0D = iapPurchaseController;
        C9703GeH c9703GeH = new C9703GeH(c9699Ge6, c9685Gdp.A00, c9685Gdp.A02, iapPurchaseController, c78u, c9716GeU);
        this.A0E = c9703GeH;
        Hwq hwq = c9703GeH.A01;
        C7384Etj.A0Y(hwq, 0);
        c9574GPi.A07 = hwq;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/Hnw;LX/HtJ<-LX/HyP;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebook.payments.dcp.xapp.controller.IapController r9, X.Hnw r10, X.HtJ r11) {
        /*
            r3 = 5
            boolean r0 = r11 instanceof X.C8911FtT
            if (r0 == 0) goto L84
            r6 = r11
            X.FtT r6 = (X.C8911FtT) r6
            int r0 = r6.$t
            if (r0 != r3) goto L84
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r1 = r6.A04
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r7 = 1
            if (r0 == 0) goto L2d
            if (r0 != r7) goto L8a
            X.Hwg.A00(r1)
        L25:
            java.lang.String r1 = (java.lang.String) r1
            X.Hs4 r5 = new X.Hs4
            r5.<init>(r1)
            return r5
        L2d:
            X.Hwg.A00(r1)
            X.GPi r0 = r9.A03
            X.HuC r8 = r0.A00()
            X.Gei r0 = r9.A02
            r4 = 0
            X.Hij r3 = X.EnumC10450Hij.A02
            r1 = r3
            java.util.ArrayList r2 = X.C3cG.A0h()
            boolean r0 = r0.isBlocklistedCountry(r4)
            if (r0 == 0) goto L4d
            X.Hij r3 = X.EnumC10450Hij.A03
            X.Hqr r0 = X.Hqr.A03
            r2.add(r0)
        L4d:
            if (r8 == 0) goto L68
            boolean r0 = r8.isReady()
            if (r0 != 0) goto L68
            X.Hqr r0 = X.Hqr.A02
            r2.add(r0)
        L5a:
            X.GeI r1 = X.EnumC9704GeI.A06
            java.lang.String r0 = "LOAD_DCPIAP"
            X.Hzd r0 = X.HiU.A02(r0, r2)
            X.Gds r5 = new X.Gds
            r5.<init>(r1, r0)
            return r5
        L68:
            if (r3 != r1) goto L5a
            com.facebook.payments.dcp.xapp.controller.IapSessionContextController r2 = r9.A0A
            java.lang.String r1 = r10.A00
            r0 = 0
            X.C7384Etj.A0Y(r1, r0)
            com.facebook.payments.dcp.xapp.controller.IapSessionContextController.A03(r2, r1)
            r6.A01 = r4
            r6.A02 = r4
            r6.A03 = r4
            r6.A00 = r7
            java.lang.Object r1 = r2.A05(r1, r6)
            if (r1 != r5) goto L25
            return r5
        L84:
            X.FtT r6 = new X.FtT
            r6.<init>(r9, r11, r3)
            goto L17
        L8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.IapController.A00(com.facebook.payments.dcp.xapp.controller.IapController, X.Hnw, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC10609Hyj
    public final void preFetchData(Hs8 hs8, String str, C9698Ge3 c9698Ge3) {
        String str2;
        AnonymousClass003.A0u(hs8, str);
        if (c9698Ge3 != null && (str2 = c9698Ge3.A09) != null) {
            IapSessionContextController.A03(this.A0A, str2);
        }
        IapPrefetchDataController iapPrefetchDataController = this.A0B;
        if (c9698Ge3 != null) {
            iapPrefetchDataController.A02.A01(str, new C8891Ft8(hs8, iapPrefetchDataController, c9698Ge3, str, null), C78W.A05(new C8eO(null), AbstractC9266GBt.A00));
        } else {
            IapSessionContextController.A02(hs8, iapPrefetchDataController.A01);
        }
    }

    public static final void A01(Hn7 hn7, IapController iapController) {
        if (iapController.A02.enableSessionLifecycleOpen()) {
            C9699Ge6 c9699Ge6 = iapController.A01;
            if (Bs8.A00(HiN.A05, HiN.A04, c9699Ge6.A0A)) {
                Hoa hoa = new Hoa();
                C9699Ge6.A08(hoa, c9699Ge6, "purchase");
                hoa.A03(hn7, "session_trigger");
                C7NC.A00(AbstractC7607F5u.A0s(c9699Ge6.A02.acquireEvent("client_open_dcpsession_atomic"), 44), new FZG(8, hoa, c9699Ge6));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.Ho8 r10) {
        /*
            r9 = this;
            X.Ge6 r3 = r9.A01
            X.GeU r0 = r9.A0F
            X.GeV r0 = r0.A01()
            if (r0 == 0) goto L58
            X.Ge3 r5 = r0.A01
            if (r5 == 0) goto L59
            java.lang.String r0 = "purchase"
        L10:
            X.Gdz r4 = new X.Gdz
            r4.<init>()
            X.C9699Ge6.A08(r4, r3, r0)
            r0 = 4
            java.lang.String r0 = X.BV3.A00(r0)
            r4.A03(r10, r0)
            if (r5 == 0) goto L2b
            java.lang.String r1 = r5.A09
            if (r1 == 0) goto L2b
            java.lang.String r0 = "dcp_product_type"
            X.AbstractC8150FWo.A02(r4, r0, r1)
        L2b:
            X.8ee<?> r1 = r3.A02
            java.lang.String r0 = "client_clear_dcpconnection_atomic"
            X.Eu1 r1 = r1.acquireEvent(r0)
            r0 = 1
            X.EVS r2 = X.AbstractC7607F5u.A0s(r1, r0)
            r1 = 6
            X.FYj r0 = new X.FYj
            r0.<init>(r3, r4, r5, r1)
            X.C7NC.A00(r2, r0)
            X.Ho8 r0 = X.Ho8.LOGOUT
            if (r10 == r0) goto L49
            X.Ho8 r0 = X.Ho8.ACCOUNT_SWITCH
            if (r10 != r0) goto L54
        L49:
            X.Gei r0 = r9.A02
            boolean r0 = r0.enableSessionLifecycleClose()
            if (r0 == 0) goto L54
            r3.A0K(r10)
        L54:
            com.facebook.payments.dcp.xapp.controller.purchase.IapPurchaseController r7 = r9.A0D
            monitor-enter(r7)
            goto L5c
        L58:
            r5 = 0
        L59:
            java.lang.String r0 = "catalog"
            goto L10
        L5c:
            X.GeU r8 = r7.A0A     // Catch: java.lang.Throwable -> L9a
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L9a
            X.Gdp r0 = r8.A01     // Catch: java.lang.Throwable -> L97
            X.Ge2 r2 = r0.A01     // Catch: java.lang.Throwable -> L97
            X.GeV r1 = r2.A00     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L6c
            boolean r0 = r1.A05     // Catch: java.lang.Throwable -> L97
            r6 = 1
            if (r0 != 0) goto L6d
        L6c:
            r6 = 0
        L6d:
            r0 = 0
            r2.A00 = r0     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L89
            X.Ge6 r5 = r8.A00     // Catch: java.lang.Throwable -> L81
            X.Ge3 r4 = r1.A01     // Catch: java.lang.Throwable -> L81
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L81
            long r0 = r1.A06     // Catch: java.lang.Throwable -> L81
            long r2 = r2 - r0
            r5.A0Q(r4, r2, r6)     // Catch: java.lang.Throwable -> L81
            goto L89
        L81:
            r2 = move-exception
            java.lang.String r1 = "IapPurchaseAttemptRegistry"
            java.lang.String r0 = "Failed purchase state clear logging"
            X.CFK.A08(r1, r0, r2)     // Catch: java.lang.Throwable -> L97
        L89:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r7)
            X.GPi r7 = r9.A03
            monitor-enter(r7)
            X.HuC r0 = r7.A06     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r7)
            if (r0 == 0) goto L96
            r0.AAa()
        L96:
            return
        L97:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L97
            throw r0     // Catch: java.lang.Throwable -> L9a
        L9a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.IapController.A03(X.Ho8):void");
    }

    @Override // X.InterfaceC10609Hyj
    public final void fetchProductDetails(List<String> list, List<String> list2, EnumC10621Hzf enumC10621Hzf, boolean z, Map<String, String> map, String str, Hvy hvy) {
        String strA03;
        String str2 = str;
        C7384Etj.A0Y(enumC10621Hzf, 2);
        AnonymousClass003.A0z(str2, hvy);
        A01(Hn7.INTERACTIVE, this);
        Hyq hyq = new Hyq(this.A04, hvy);
        HsR hsR = this.A00;
        if (hsR != null) {
            HjL hjL = (HjL) hsR;
            UserFlowLogger userFlowLogger = hjL.A04;
            long jGenerateFlowId = userFlowLogger.generateFlowId(28511505, 0);
            hjL.A00 = jGenerateFlowId;
            userFlowLogger.flowStartIfNotOngoing(jGenerateFlowId, hjL.A02);
            userFlowLogger.flowAnnotate(hjL.A00, "product", str2);
        }
        C9699Ge6 c9699Ge6 = this.A01;
        if (map == null || (strA03 = C60O.A0p("session_id", map)) == null || C7BY.A0j(strA03)) {
            strA03 = C9699Ge6.A03();
        }
        c9699Ge6.A0B = strA03;
        C9691Gdw c9691Gdw = new C9691Gdw(enumC10621Hzf, str2, strA03, list, list2, map, z);
        IapSessionContextController iapSessionContextController = this.A0A;
        if (str2.length() == 0) {
            str2 = "ALL_PRODUCTS";
        }
        IapSessionContextController.A03(iapSessionContextController, str2);
        ProductInfoController productInfoController = this.A06;
        HiT hiT = new HiT(this, hyq, c9691Gdw);
        C9699Ge6 c9699Ge62 = productInfoController.A01;
        EVS evsA0s = AbstractC7607F5u.A0s(c9699Ge62.A02.acquireEvent("client_fetch_dcpcatalog_init"), 33);
        List<String> list3 = c9691Gdw.A05;
        String str3 = c9691Gdw.A03;
        if (str3.length() == 0) {
            str3 = null;
        }
        C9752Gf5 c9752Gf5A0E = c9699Ge62.A0E(Hhz.A00(c9699Ge62, c9691Gdw), str3, list3, 0L);
        C9700GeE c9700GeEA0J = c9699Ge62.A0J(null);
        c9700GeEA0J.A02(c9699Ge62.A01);
        Map<String, String> map2 = c9700GeEA0J.A01;
        map2.put("catalog_type", c9691Gdw.A02.toString());
        C7NC.A00(evsA0s, new C8185FYc(map2, c9752Gf5A0E, c9691Gdw, c9699Ge62, 19));
        productInfoController.A07.A02(new C8897FtE(hiT, productInfoController, c9691Gdw, null, 7)).AO5(new C8192FYj(productInfoController, (G0U<? super Throwable, Unit>) hiT, c9691Gdw, 10));
    }

    @Override // X.InterfaceC10609Hyj
    public final void launchPurchaseFlow(Activity activity, C9698Ge3 c9698Ge3, Hx5 hx5, Hx2 hx2, InterfaceC10552Hsd interfaceC10552Hsd) {
        Object c9692Gdx;
        AnonymousClass005.A0x(activity, c9698Ge3, hx5);
        C9699Ge6 c9699Ge6 = this.A01;
        String strA03 = c9698Ge3.A04;
        if (strA03 == null) {
            strA03 = C9699Ge6.A03();
        }
        c9699Ge6.A0B = strA03;
        c9698Ge3.A04 = strA03;
        A01(Hn7.INTERACTIVE, this);
        IapSessionContextController iapSessionContextController = this.A0A;
        String str = c9698Ge3.A09;
        C7384Etj.A0Y(str, 0);
        IapSessionContextController.A03(iapSessionContextController, str);
        HpW hpW = this.A04;
        Hpe hpe = interfaceC10552Hsd == null ? null : new Hpe(new C10583Hwo(hpW, interfaceC10552Hsd));
        IapPurchaseController iapPurchaseController = this.A0D;
        HzJ hzJ = new HzJ(hpW, hx5);
        C10516Hob c10516Hob = hx2 == null ? null : new C10516Hob(hpW, hx2);
        C9699Ge6 c9699Ge62 = iapPurchaseController.A01;
        c9699Ge62.A00 = iapPurchaseController.A03.A00().ACn();
        String strA032 = c9698Ge3.A04;
        if (strA032 == null) {
            strA032 = C9699Ge6.A03();
        }
        c9699Ge62.A0B = strA032;
        c9698Ge3.A04 = strA032;
        if (c9698Ge3.A00 == null) {
            c9698Ge3.A00 = new Hoz(null);
        }
        C9749Gf2 c9749Gf2A01 = C9699Ge6.A01(c9699Ge62, c9698Ge3, null, null, null);
        EVS evsA0s = AbstractC7607F5u.A0s(c9699Ge62.A02.acquireEvent("client_execute_dcpiap_init"), 26);
        C9700GeE c9700GeEA0J = c9699Ge62.A0J(C9jH.A00);
        c9700GeEA0J.A05(c9698Ge3, null);
        c9700GeEA0J.A02(c9699Ge62.A01);
        String str2 = c9699Ge62.A09;
        Map<String, String> map = c9700GeEA0J.A01;
        map.put("payment_tenant_override", str2);
        String str3 = c9698Ge3.A07;
        C9700GeE.A01(c9700GeEA0J, "client_requested_sku", str3);
        C7NC.A00(evsA0s, new C8185FYc(map, c9749Gf2A01, c9698Ge3, c9699Ge62, 15));
        HsR hsR = iapPurchaseController.A00;
        if (hsR != null) {
            HjL hjL = (HjL) hsR;
            UserFlowLogger userFlowLogger = hjL.A04;
            long jGenerateFlowId = userFlowLogger.generateFlowId(28522275, 0);
            hjL.A01 = jGenerateFlowId;
            userFlowLogger.flowStartIfNotOngoing(jGenerateFlowId, hjL.A03);
            String str4 = c9698Ge3.A08;
            C7384Etj.A0Y(str3, 0);
            userFlowLogger.flowAnnotate(hjL.A01, "external_product_id", str3);
            userFlowLogger.flowAnnotate(hjL.A01, "internal_product_id", str4);
            userFlowLogger.flowAnnotate(hjL.A01, "product", str);
            hsR.AQ8("payment_native_init");
        }
        C9716GeU c9716GeU = iapPurchaseController.A0A;
        synchronized (c9716GeU) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C9697Ge2 c9697Ge2 = c9716GeU.A01.A01;
            C9717GeV c9717GeV = c9697Ge2.A00;
            if (c9717GeV == null || jElapsedRealtime - c9717GeV.A07 >= 10000) {
                C9717GeV c9717GeV2 = c9697Ge2.A00;
                C9699Ge6 c9699Ge63 = c9716GeU.A00;
                Long lValueOf = c9717GeV2 != null ? Long.valueOf(SystemClock.elapsedRealtime() - c9717GeV2.A06) : null;
                C9695Ge0 c9695Ge0 = new C9695Ge0();
                C9699Ge6.A08(c9695Ge0, c9699Ge63, "purchase");
                if (lValueOf != null) {
                    AbstractC8150FWo.A02(c9695Ge0, "previous_state_age_ms", Long.valueOf(lValueOf.longValue()));
                }
                AbstractC8150FWo.A02(c9695Ge0, "dcp_product_type", str);
                C7NC.A00(AbstractC7607F5u.A0s(c9699Ge63.A02.acquireEvent("client_save_dcppurchasestate_atomic"), 45), new C8192FYj(c9699Ge63, (G0U<? super Throwable, Unit>) c9695Ge0, c9698Ge3, 8));
                C9717GeV c9717GeV3 = new C9717GeV(c9698Ge3, c10516Hob, hpe, hzJ, SystemClock.elapsedRealtime(), jElapsedRealtime);
                c9697Ge2.A00 = c9717GeV3;
                c9692Gdx = new C9692Gdx(c9717GeV3);
            } else {
                c9692Gdx = new C9693Gdy(new C9717GeV(c9698Ge3, c10516Hob, hpe, hzJ, SystemClock.elapsedRealtime(), jElapsedRealtime));
            }
        }
        if (c9692Gdx instanceof C9693Gdy) {
            iapPurchaseController.A02(((C9693Gdy) c9692Gdx).A00, C9696Ge1.A00);
            return;
        }
        if (!(c9692Gdx instanceof C9692Gdx)) {
            throw C3cG.A0q();
        }
        C9717GeV c9717GeV4 = ((C9692Gdx) c9692Gdx).A00;
        C9716GeU.A00(c9717GeV4, "LOAD_DCPIAP");
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        c10543HqvA0z.element = "CREATE_DCPPREQUOTE";
        C78U c78u = iapPurchaseController.A09;
        C8192FYj c8192FYj = new C8192FYj(iapPurchaseController, (G0U<? super Throwable, Unit>) c9717GeV4, c10543HqvA0z, 11);
        c78u.A04(c8192FYj, new C8893FtA(activity, c9717GeV4, iapPurchaseController, c9698Ge3, null, c10543HqvA0z), FZO.A02(c8192FYj, 23));
    }

    public static final void A02(InterfaceC10512HoG interfaceC10512HoG, IapController iapController, C9691Gdw c9691Gdw, Map map) {
        Object obj;
        C10606Hye c10606Hye;
        String str;
        if (interfaceC10512HoG.AJk() == EnumC9706GeK.A0H) {
            List<String> list = c9691Gdw.A06;
            if (list != null) {
                Object objA0G = AbstractC0878AGe.A0G(list);
                obj = objA0G;
                if (objA0G == null) {
                }
                c10606Hye = (C10606Hye) map.get(objA0G);
                if (c10606Hye != null || (str = c10606Hye.A03) == null) {
                }
                Hs8 hs8 = obj != null ? Hs8.A02 : Hs8.A03;
                IapPrefetchDataController iapPrefetchDataController = iapController.A0B;
                IapSessionContextController.A02(hs8, iapPrefetchDataController.A01);
                iapPrefetchDataController.A02.A01(objA0G, new IapPrefetchDataController$cacheProductDetails$1(str, null), C78W.A05(new C8eO(null), AbstractC9266GBt.A00));
                return;
            }
            obj = null;
            List<String> list2 = c9691Gdw.A07;
            if (list2 == null || (objA0G = AbstractC0878AGe.A0G(list2)) == null) {
                return;
            }
            c10606Hye = (C10606Hye) map.get(objA0G);
            if (c10606Hye != null) {
            }
        }
    }
}
