package com.facebook.payments.dcp.iap.internal.bloksbridge;

import X.AGH;
import X.AIW;
import X.AbstractC10492Hlw;
import X.AbstractC5245DeA;
import X.AbstractC9707GeL;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C10606Hye;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C8894FtB;
import X.C9jH;
import X.EnumC9706GeK;
import X.F6D;
import X.FBB;
import X.HiC;
import X.Hj6;
import X.HjL;
import X.Hm8;
import X.Hon;
import X.HsR;
import X.HxE;
import X.HyV;
import X.Hyb;
import X.Hyh;
import X.Hzd;
import X.InterfaceC10512HoG;
import android.app.Activity;
import android.content.Context;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.iap.HatchIapBloksManagerProvider;
import com.facebook.aura.iap.HatchIapUserSession;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class IapBloksBridge {
    public static final IapBloksBridge A00 = new IapBloksBridge();

    public static final void A04(Hj6 hj6, F6D f6d) {
        Context context;
        HsR hsR;
        WeakReference<FBB> weakReference;
        C7384Etj.A0Y(hj6, 0);
        FBB fbb = f6d.A02;
        if ((fbb == null && ((weakReference = f6d.A08) == null || (fbb = weakReference.get()) == null)) || (context = fbb.A00) == null) {
            throw C60O.A0i("Unable to find androidContext from arguments");
        }
        Activity activityA00 = HiC.A00(context);
        if (activityA00 == null) {
            throw C60O.A0i("Unable to find activity from context");
        }
        Hon iapUserSession = ((HatchIapBloksManagerProvider) AbstractC5245DeA.A01(49154)).getIapUserSession(f6d);
        if (iapUserSession == null) {
            throw C3cG.A0Q("No current user session available");
        }
        HyV hyV = new HyV(hj6);
        if ("BUY".equals(hyV.A03)) {
            hsR = ((HatchIapUserSession) iapUserSession).qplLogger;
            if (hsR != null) {
                HjL hjL = (HjL) hsR;
                UserFlowLogger userFlowLogger = hjL.A04;
                long jGenerateFlowId = userFlowLogger.generateFlowId(28522275, 0);
                hjL.A01 = jGenerateFlowId;
                userFlowLogger.flowStartIfNotOngoing(jGenerateFlowId, hjL.A03);
                hsR.AQ8("fetch_price_and_buy_action_start");
                hsR.AQ8("base_controller_init_start");
            }
        } else {
            hsR = null;
        }
        ((HatchIapUserSession) iapUserSession).billingScope.A02(new C8894FtB(activityA00, hyV, iapUserSession, hsR, f6d, null, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.app.Activity r17, com.facebook.payments.dcp.iap.internal.bloksbridge.IapBloksBridge r18, X.HyV r19, X.InterfaceC10609Hyj r20, X.F6D r21, X.HtJ r22) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.iap.internal.bloksbridge.IapBloksBridge.A00(android.app.Activity, com.facebook.payments.dcp.iap.internal.bloksbridge.IapBloksBridge, X.HyV, X.Hyj, X.F6D, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(android.app.Activity r17, com.facebook.payments.dcp.iap.internal.bloksbridge.IapBloksBridge r18, X.HyV r19, X.InterfaceC10609Hyj r20, X.F6D r21, X.HtJ r22) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.iap.internal.bloksbridge.IapBloksBridge.A01(android.app.Activity, com.facebook.payments.dcp.iap.internal.bloksbridge.IapBloksBridge, X.HyV, X.Hyj, X.F6D, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>; */
    public static final Map A03(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, Map map2) {
        return AGH.A0D(C3cG.A0r(AuraDeeplinkRouteMapper.STATUS_ROUTE, str), C3cG.A0r("fetch_status_error_code", str2), C3cG.A0r("fetch_status_error_description", str3), C3cG.A0r("purchase_product_status", str4), C3cG.A0r("purchase_status_error_code", str5), C3cG.A0r("purchase_product_status_error_code", str5), C3cG.A0r("purchase_product_status_error_description", str6), C3cG.A0r("internal_transaction_id", str7), C3cG.A0r("external_transaction_id", str8), C3cG.A0r("price_info", map), C3cG.A0r("product_price", map2), C3cG.A0r("iap_native_error_payload", str9));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/HoG;Ljava/util/Map<Ljava/lang/String;LX/Hye;>;Ljava/util/Set<Ljava/lang/String;>;LX/Hzd;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>; */
    public static final Map A02(Hzd hzd, InterfaceC10512HoG interfaceC10512HoG, Map map, Set set) {
        String str;
        String str2;
        String str3;
        String strA00;
        String str4;
        Map mapA06;
        String str5;
        String str6;
        String str7;
        String str8;
        Map map2;
        String str9;
        EnumC9706GeK enumC9706GeKAJk = interfaceC10512HoG.AJk();
        if (enumC9706GeKAJk == EnumC9706GeK.A0H) {
            LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                linkedHashMapA0I.put(entryA0l.getKey(), ((C10606Hye) entryA0l.getValue()).A04);
            }
            ArrayList arrayListA11 = C60O.A11(map.size());
            Iterator itA0n2 = AnonymousClass002.A0n(map);
            while (itA0n2.hasNext()) {
                Map.Entry entryA0l2 = C3cH.A0l(itA0n2);
                Object key = entryA0l2.getKey();
                C10606Hye c10606Hye = (C10606Hye) entryA0l2.getValue();
                HxE hxEA0r = C3cG.A0r("productID", key);
                HxE hxEA0r2 = C3cG.A0r("externalProductID", c10606Hye.A03);
                HxE hxEA0r3 = C3cG.A0r("formattedPrice", c10606Hye.A04);
                String plainString = new BigDecimal(String.valueOf(c10606Hye.A00 / 1000000.0d)).toPlainString();
                C7384Etj.A0U(plainString);
                HxE hxEA0r4 = C3cG.A0r("amount", plainString);
                HxE hxEA0r5 = C3cG.A0r("currencyCode", c10606Hye.A05);
                Hm8 hm8 = c10606Hye.A01;
                HxE hxEA0r6 = C3cG.A0r("purchaseFunnelId", hm8.A00);
                HxE hxEA0r7 = C3cG.A0r("quoteUuid", hm8.A01);
                List<Hyb> list = c10606Hye.A07;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                for (Hyb hyb : list) {
                    HxE hxEA0r8 = C3cG.A0r("formattedPrice", hyb.A05);
                    HxE hxEA0r9 = C3cG.A0r("periodCount", Integer.valueOf(hyb.A00));
                    int iIntValue = hyb.A03.intValue();
                    if (iIntValue == 0) {
                        str9 = "Day";
                    } else if (iIntValue == 1) {
                        str9 = "Week";
                    } else if (iIntValue == 2) {
                        str9 = "Month";
                    } else if (iIntValue == 3) {
                        str9 = "Year";
                    } else {
                        if (iIntValue != 4) {
                            throw C3cG.A0q();
                        }
                        str9 = "";
                    }
                    HxE hxEA0r10 = C3cG.A0r("billingPeriod", str9);
                    HxE hxEA0r11 = C3cG.A0r("billingPeriodValue", Integer.valueOf(hyb.A01));
                    String plainString2 = new BigDecimal(String.valueOf(hyb.A02 / 1000000.0d)).toPlainString();
                    C7384Etj.A0U(plainString2);
                    HxE hxEA0r12 = C3cG.A0r("price", plainString2);
                    String str10 = hyb.A04;
                    if (str10.length() == 0) {
                        str10 = null;
                    }
                    arrayListA0i.add(AGH.A0D(hxEA0r8, hxEA0r9, hxEA0r10, hxEA0r11, hxEA0r12, C3cG.A0r("offerID", str10)));
                }
                if (!set.contains(key)) {
                    arrayListA0i = null;
                }
                LinkedHashMap linkedHashMapA05 = AGH.A05(hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, hxEA0r5, hxEA0r6, hxEA0r7, C3cG.A0r("offers", arrayListA0i));
                String str11 = c10606Hye.A02;
                if (str11 != null) {
                    linkedHashMapA05.put("countryCode", str11);
                }
                AnonymousClass002.A1J(key, linkedHashMapA05, arrayListA11);
            }
            mapA06 = AGH.A06(arrayListA11);
            str4 = "FETCHED";
            str = "";
            str3 = "";
            str2 = "";
            str5 = "";
            str6 = "";
            str7 = "";
            str8 = "";
            strA00 = "";
            map2 = linkedHashMapA0I;
        } else {
            Hyh hyh = AbstractC9707GeL.A00.get(enumC9706GeKAJk);
            str = hyh != null ? hyh.A00 : null;
            str2 = "";
            if (str == null) {
                str = "";
            }
            str3 = hyh != null ? hyh.A01 : "";
            strA00 = hzd != null ? AbstractC10492Hlw.A00(hzd) : "";
            str4 = "ERROR_IN_FETCH";
            mapA06 = C9jH.A00;
            str5 = "";
            str6 = "";
            str7 = "";
            str8 = "";
            map2 = mapA06;
        }
        return A03(str4, str, str3, str2, str5, str6, str7, str8, strA00, mapA06, map2);
    }
}
