package X;

import android.content.Context;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.gateway.ConnectorOrderCheckoutKt;
import com.facebook.aura.iap.HatchIapConfig;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* renamed from: X.Ge6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9699Ge6 {
    public String A00;
    public final Context A01;
    public final C8ee<?> A02;
    public final InterfaceC9568GPa A03;
    public final HuV<String> A04;
    public final InterfaceC9729Gei A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final AtomicReference<HiN> A0A;
    public volatile String A0B;

    /* JADX WARN: Incorrect types in method signature: (LX/8ee<*>;Landroid/content/Context;LX/Gei;LX/HuV<Ljava/lang/String;>;LX/GPa;Ljava/lang/String;Ljava/lang/String;)V */
    public C9699Ge6(Context context, C8ee c8ee, InterfaceC9568GPa interfaceC9568GPa, HuV huV, InterfaceC9729Gei interfaceC9729Gei, String str, String str2) {
        String installerPackageName;
        AnonymousClass002.A1D(context, 1, str);
        context.getPackageName();
        this.A02 = c8ee;
        this.A01 = context;
        this.A05 = interfaceC9729Gei;
        this.A04 = huV;
        this.A03 = interfaceC9568GPa;
        this.A07 = str;
        this.A09 = str2;
        this.A0B = A03();
        this.A0A = BV4.A16(HiN.A05);
        this.A06 = ((HatchIapConfig) interfaceC9729Gei).uplAppName;
        try {
            Context context2 = this.A01;
            installerPackageName = context2.getPackageManager().getInstallerPackageName(context2.getPackageName());
            if (installerPackageName == null) {
                installerPackageName = "";
            }
        } catch (IllegalArgumentException unused) {
            installerPackageName = "unknown";
        }
        this.A08 = installerPackageName;
    }

    public static void A0B(EVS evs, C9699Ge6 c9699Ge6, Map map) {
        evs.A04(AGH.A02(map, c9699Ge6.A0J(null).A01));
    }

    public static final void A0C(Hzd hzd, C9699Ge6 c9699Ge6, C9581GPs c9581GPs, C10574Huh c10574Huh, C9720GeY c9720GeY, C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, C10482Hla c10482Hla, String str) {
        Integer num;
        C7384Etj.A0Y(hzd, 0);
        C9748Gf1 c9748Gf1A02 = A02(c9699Ge6, c10574Huh, c9698Ge3, c9661Gd3, null, c10482Hla, "payment", null, false);
        C9700GeE c9700GeEA0J = c9699Ge6.A0J(str != null ? AnonymousClass006.A10(PhotosSearchHandlerKt.PARAM_SOURCE, str) : null);
        C9700GeE.A00(c9700GeEA0J, c9720GeY, c9698Ge3, c9661Gd3, null, null);
        c9700GeEA0J.A04(c10482Hla != null ? c10482Hla.A00 : null);
        String strA00 = null;
        C9700GeE.A01(c9700GeEA0J, "purchase_update_sub_response_code", c9581GPs != null ? String.valueOf(c9581GPs.A00) : null);
        if (c9581GPs != null && (num = c9581GPs.A01) != null) {
            strA00 = AbstractC9582GPt.A00(num);
        }
        C9700GeE.A01(c9700GeEA0J, "purchase_update_sub_response_category", strA00);
        c9700GeEA0J.A03(hzd);
        c9700GeEA0J.A02(c9699Ge6.A01);
        C7NC.A00(AbstractC7607F5u.A0s(c9699Ge6.A02.acquireEvent("client_create_dcppayment_fail"), 4), new C8185FYc(c9700GeEA0J.A01, c9748Gf1A02, c9698Ge3, c9699Ge6, 1));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gdw;Ljava/util/List<+LX/GPY;>;Ljava/lang/Boolean;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.Ge6, java.lang.Object] */
    public static final void A0D(C9699Ge6 c9699Ge6, C9691Gdw c9691Gdw, List list) {
        boolean z;
        ?? A0h;
        C7384Etj.A0Y(c9691Gdw, 0);
        EVS evsA0s = AbstractC7607F5u.A0s(c9699Ge6.A02.acquireEvent("client_fetch_dcpcatalog_success"), 34);
        EnumC10621Hzf enumC10621Hzf = c9691Gdw.A02;
        if (enumC10621Hzf == EnumC10621Hzf.A03) {
            z = true;
            A0h = C3cG.A0h();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((GPY) it.next()).AJ9().A03;
                if (str != null) {
                    A0h.add(str);
                }
            }
        } else {
            z = false;
            A0h = c9691Gdw.A05;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c9691Gdw.A01;
        String str2 = c9691Gdw.A03;
        if (str2.length() == 0) {
            str2 = null;
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayListA0m.add(((GPY) it2.next()).AFV());
        }
        C9752Gf5 c9752Gf5A0E = c9699Ge6.A0E(Hhz.A01(arrayListA0m), str2, A0h, jCurrentTimeMillis);
        if (z) {
            A0A(c9752Gf5A0E, (String) AbstractC0878AGe.A0K(c9691Gdw.A05));
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayListA0m2.add(((GPY) it3.next()).AJ9().A06);
        }
        Set setA0g = AbstractC0878AGe.A0g(arrayListA0m2);
        List<String> list2 = c9691Gdw.A05;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it4 = list2.iterator();
        while (it4.hasNext()) {
            C60R.A1P(arrayListA0h, it4, setA0g);
        }
        C9700GeE c9700GeEA0J = c9699Ge6.A0J(null);
        Map<String, String> map = c9700GeEA0J.A01;
        map.put("is_cached", String.valueOf(false));
        c9700GeEA0J.A02(c9699Ge6.A01);
        if (!arrayListA0h.isEmpty()) {
            map.put("missing_skus", AbstractC0878AGe.A0L(",", "", "", AbstractC0878AGe.A0W(arrayListA0h), null));
            map.put("missing_skus_count", String.valueOf(arrayListA0h.size()));
            map.put("catalog_type", enumC10621Hzf.toString());
        }
        map.put("purchase_history_sent", String.valueOf(c9691Gdw.A00));
        C7NC.A00(evsA0s, new C8185FYc(map, c9752Gf5A0E, c9691Gdw, c9699Ge6, 20));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/lang/String;>;JLjava/lang/String;LX/Huo;)LX/Gf5; */
    public final C9752Gf5 A0E(Huo huo, String str, List list, long j) {
        C7384Etj.A0Y(list, 0);
        String strA0e = C3cH.A0e(",", list);
        C9752Gf5 c9752Gf5 = new C9752Gf5();
        AbstractC8150FWo.A02(c9752Gf5, "dcp_flow", "catalog");
        AbstractC7610F5x.A16(c9752Gf5).put("is_retry", false);
        AbstractC8150FWo.A02(c9752Gf5, "dcp_sub_flow", "pricing");
        A07(c9752Gf5, this);
        AbstractC8150FWo.A02(c9752Gf5, "external_product_id", strA0e);
        AbstractC8150FWo.A02(c9752Gf5, "latency_ms", Long.valueOf(j));
        A06(c9752Gf5, this);
        if (str != null) {
            AbstractC8150FWo.A02(c9752Gf5, "dcp_product_type", str);
        }
        if (huo != null) {
            c9752Gf5.A03(huo, "dcp_platform_mode");
        }
        return c9752Gf5;
    }

    public final C9750Gf3 A0F(Long l, String str, String str2, String str3) {
        long jCurrentTimeMillis;
        C7384Etj.A0Y(str, 0);
        C9750Gf3 c9750Gf3 = new C9750Gf3();
        AbstractC7608F5v.A1F(c9750Gf3);
        c9750Gf3.A00.put("dcp_platform", 71);
        AbstractC8150FWo.A02(c9750Gf3, ErrorReportingConstants.APP_NAME_KEY, this.A06);
        if (l != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        } else {
            jCurrentTimeMillis = 0;
        }
        AbstractC8150FWo.A02(c9750Gf3, "latency_ms", Long.valueOf(jCurrentTimeMillis));
        AbstractC8150FWo.A02(c9750Gf3, "dcp_external_api_name", str);
        A06(c9750Gf3, this);
        if (str2 != null) {
            AbstractC8150FWo.A02(c9750Gf3, "external_product_id", str2);
        }
        if (str3 != null) {
            AbstractC8150FWo.A02(c9750Gf3, "dcp_product_type", str3);
        }
        return c9750Gf3;
    }

    public final C9747Gf0 A0G(C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3) {
        String str = c9661Gd3.A07;
        C9747Gf0 c9747Gf0 = new C9747Gf0();
        AbstractC7608F5v.A1F(c9747Gf0);
        Map<String, Object> map = c9747Gf0.A00;
        map.put("is_retry", false);
        A07(c9747Gf0, this);
        AbstractC8150FWo.A02(c9747Gf0, "dcp_sub_flow", "payment");
        BV4.A1H("dcp_platform", map, 71);
        A06(c9747Gf0, this);
        String str2 = c9661Gd3.A05;
        if (str2 != null) {
            AbstractC8150FWo.A02(c9747Gf0, "external_product_id", str2);
        }
        A0A(c9747Gf0, c9698Ge3.A08);
        A09(c9747Gf0, str);
        AbstractC8150FWo.A02(c9747Gf0, "dcp_product_type", c9698Ge3.A09);
        return c9747Gf0;
    }

    public final C9746Gez A0H(C9698Ge3 c9698Ge3) {
        C9746Gez c9746Gez = new C9746Gez();
        AbstractC7608F5v.A1F(c9746Gez);
        Map<String, Object> map = c9746Gez.A00;
        map.put("is_retry", false);
        A07(c9746Gez, this);
        AbstractC8150FWo.A02(c9746Gez, "dcp_sub_flow", "quote");
        BV4.A1H("dcp_platform", map, 71);
        A06(c9746Gez, this);
        A0A(c9746Gez, c9698Ge3.A08);
        AbstractC8150FWo.A02(c9746Gez, "dcp_product_type", c9698Ge3.A09);
        return c9746Gez;
    }

    public final C9745Gey A0I(C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3) {
        String str;
        Long lA0s;
        String str2;
        C9745Gey c9745Gey = new C9745Gey();
        AbstractC7608F5v.A1F(c9745Gey);
        Map<String, Object> map = c9745Gey.A00;
        map.put("is_retry", false);
        A07(c9745Gey, this);
        AbstractC8150FWo.A02(c9745Gey, "dcp_sub_flow", "quote");
        BV4.A1H("dcp_platform", map, 71);
        A06(c9745Gey, this);
        if (c9661Gd3 != null && (str2 = c9661Gd3.A05) != null) {
            AbstractC8150FWo.A02(c9745Gey, "external_product_id", str2);
        }
        Hoz hoz = c9698Ge3.A00;
        if (hoz != null && (str = hoz.A00) != null && (lA0s = C9tI.A0s(str)) != null) {
            AbstractC8150FWo.A02(c9745Gey, "payee_id", Long.valueOf(lA0s.longValue()));
        }
        A0A(c9745Gey, c9698Ge3.A08);
        if (c9661Gd3 != null) {
            A09(c9745Gey, c9661Gd3.A07);
        }
        AbstractC8150FWo.A02(c9745Gey, "dcp_product_type", c9698Ge3.A09);
        return c9745Gey;
    }

    public final void A0L(Hzd hzd, C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, EnumC9704GeI enumC9704GeI) {
        C7384Etj.A0Y(hzd, 1);
        C9749Gf2 c9749Gf2A01 = A01(this, c9698Ge3, c9661Gd3, null, null);
        Map mapA10 = AnonymousClass006.A10("result_code", enumC9704GeI.name());
        if (mapA10 == null) {
            mapA10 = C9jH.A00;
        }
        C9700GeE c9700GeEA0J = A0J(c9698Ge3 != null ? C9jH.A00 : null);
        c9700GeEA0J.A05(c9698Ge3, c9661Gd3);
        c9700GeEA0J.A03(hzd);
        c9700GeEA0J.A02(this.A01);
        C9700GeE.A01(c9700GeEA0J, "client_requested_sku", c9698Ge3 != null ? c9698Ge3.A07 : null);
        C7NC.A00(AbstractC7607F5u.A0s(this.A02.acquireEvent("client_execute_dcpiap_fail"), 25), new C8185FYc(AGH.A02(c9700GeEA0J.A01, mapA10), c9749Gf2A01, c9698Ge3, this, 14));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Ge3;LX/Hzd;LX/Gd3;Ljava/util/List<+LX/HwA;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V */
    public final void A0M(Hzd hzd, C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, List list, Map map) {
        AnonymousClass003.A0v(c9698Ge3, c9661Gd3);
        EVS evsA0s = AbstractC7607F5u.A0s(this.A02.acquireEvent("client_create_dcpprepayment_fail"), 8);
        C9747Gf0 c9747Gf0A0G = A0G(c9698Ge3, c9661Gd3);
        C9700GeE c9700GeEA0J = A0J(map);
        C9700GeE.A00(c9700GeEA0J, null, c9698Ge3, c9661Gd3, null, list);
        c9700GeEA0J.A03(hzd);
        C7NC.A00(evsA0s, new C8185FYc(c9700GeEA0J.A01, c9747Gf0A0G, c9698Ge3, this, 7));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gdw;LX/Hzd;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V */
    public final void A0N(Hzd hzd, C9691Gdw c9691Gdw, Map map) {
        AnonymousClass005.A0x(c9691Gdw, hzd, map);
        EVS evsA0s = AbstractC7607F5u.A0s(this.A02.acquireEvent("client_fetch_dcpcatalog_fail"), 32);
        List<String> list = c9691Gdw.A05;
        long jCurrentTimeMillis = System.currentTimeMillis() - c9691Gdw.A01;
        String str = c9691Gdw.A03;
        if (str.length() == 0) {
            str = null;
        }
        C9752Gf5 c9752Gf5A0E = A0E(Hhz.A00(this, c9691Gdw), str, list, jCurrentTimeMillis);
        C9700GeE c9700GeEA0J = A0J(null);
        c9700GeEA0J.A02(this.A01);
        c9700GeEA0J.A03(hzd);
        Map<String, String> map2 = c9700GeEA0J.A01;
        map2.put("catalog_type", c9691Gdw.A02.toString());
        map2.put("purchase_history_sent", String.valueOf(c9691Gdw.A00));
        map2.putAll(map);
        C7NC.A00(evsA0s, new C8185FYc(map2, c9752Gf5A0E, c9691Gdw, this, 18));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/Hzd;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V */
    public final void A0O(Hzd hzd, Long l, String str, String str2, String str3, Map map) {
        C7384Etj.A0Y(str2, 3);
        C7NC.A00(AbstractC7607F5u.A0s(this.A02.acquireEvent("client_execute_dcpiapapi_fail"), 29), new C9705GeJ(hzd, this, l, str2, str, str3, map));
    }

    public final void A0P(C10574Huh c10574Huh, C9720GeY c9720GeY, C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, C10482Hla c10482Hla) {
        C9748Gf1 c9748Gf1A02 = A02(this, c10574Huh, c9698Ge3, c9661Gd3, null, c10482Hla, "payment", null, false);
        C9700GeE c9700GeEA0J = A0J(null);
        C9700GeE.A00(c9700GeEA0J, c9720GeY, c9698Ge3, c9661Gd3, null, null);
        Map<String, String> map = c9700GeEA0J.A01;
        String str = c10482Hla != null ? "PURCHASE IS NOT NULL" : null;
        EnumC9706GeK enumC9706GeK = EnumC9706GeK.A0M;
        C7NC.A00(AbstractC7607F5u.A0s(this.A02.acquireEvent("user_create_dcppayment_cancel"), 63), new FYY(c9698Ge3, c9748Gf1A02, this, AbstractC9579GPq.A00(enumC9706GeK, HlI.A00(enumC9706GeK), str), map, 1));
    }

    public final void A0Q(C9698Ge3 c9698Ge3, long j, boolean z) {
        C7384Etj.A0Y(c9698Ge3, 0);
        C9695Ge0 c9695Ge0 = new C9695Ge0();
        AbstractC7608F5v.A1F(c9695Ge0);
        AbstractC8150FWo.A02(c9695Ge0, ErrorReportingConstants.APP_NAME_KEY, this.A06);
        Map mapA16 = AbstractC7610F5x.A16(c9695Ge0);
        AbstractC8150FWo.A02(c9695Ge0, "latency_ms", BV7.A0o());
        mapA16.put("was_purchase_in_flight", Boolean.valueOf(z));
        AbstractC8150FWo.A02(c9695Ge0, "purchase_state_age_ms", Long.valueOf(j));
        AbstractC8150FWo.A02(c9695Ge0, "dcp_product_type", c9698Ge3.A09);
        C7NC.A00(AbstractC7607F5u.A0s(this.A02.acquireEvent("client_clear_dcppurchasestate_atomic"), 2), new C8192FYj(this, (G0U<? super Throwable, Unit>) c9695Ge0, c9698Ge3, 7));
    }

    public final void A0R(C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, EnumC9704GeI enumC9704GeI) {
        C9749Gf2 c9749Gf2A01 = A01(this, c9698Ge3, c9661Gd3, null, null);
        EVS evsA0s = AbstractC7607F5u.A0s(this.A02.acquireEvent("client_execute_dcpiap_cancel"), 24);
        Map mapA10 = AnonymousClass006.A10("result_code", enumC9704GeI.name());
        if (mapA10 == null) {
            mapA10 = C9jH.A00;
        }
        C7NC.A00(evsA0s, new C8185FYc(A04(this, c9698Ge3, c9661Gd3, c9698Ge3 != null ? C9jH.A00 : null, mapA10), c9749Gf2A01, c9698Ge3, this, 13));
    }

    public final void A0S(C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, EnumC9704GeI enumC9704GeI) {
        C9749Gf2 c9749Gf2A01 = A01(this, c9698Ge3, c9661Gd3, null, null);
        EVS evsA0s = AbstractC7607F5u.A0s(this.A02.acquireEvent("client_execute_dcpiap_pending"), 27);
        Map mapA10 = AnonymousClass006.A10("result_code", enumC9704GeI.name());
        if (mapA10 == null) {
            mapA10 = C9jH.A00;
        }
        C7NC.A00(evsA0s, new C8185FYc(A04(this, c9698Ge3, c9661Gd3, c9698Ge3 != null ? C9jH.A00 : null, mapA10), c9749Gf2A01, c9698Ge3, this, 16));
    }

    public final void A0T(C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, EnumC9704GeI enumC9704GeI) {
        C9749Gf2 c9749Gf2A01 = A01(this, c9698Ge3, c9661Gd3, null, null);
        EVS evsA0s = AbstractC7607F5u.A0s(this.A02.acquireEvent("client_execute_dcpiap_success"), 28);
        Map mapA10 = AnonymousClass006.A10("result_code", enumC9704GeI.name());
        if (mapA10 == null) {
            mapA10 = C9jH.A00;
        }
        C7NC.A00(evsA0s, new C8185FYc(A04(this, c9698Ge3, c9661Gd3, C9jH.A00, mapA10), c9749Gf2A01, c9698Ge3, this, 17));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Ge3;LX/Gd3;Ljava/util/List<+LX/HwA;>;Ljava/lang/Boolean;Ljava/lang/Boolean;)V */
    public final void A0U(C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, Boolean bool, Boolean bool2, List list) {
        AnonymousClass003.A0u(c9698Ge3, c9661Gd3);
        EVS evsA0s = AbstractC7607F5u.A0s(this.A02.acquireEvent("client_create_dcpprepayment_success"), 10);
        C9747Gf0 c9747Gf0A0G = A0G(c9698Ge3, c9661Gd3);
        C9700GeE c9700GeEA0J = A0J(null);
        C9700GeE.A00(c9700GeEA0J, null, c9698Ge3, c9661Gd3, bool, list);
        if (bool2 != null) {
            c9700GeEA0J.A01.put("is_cached", String.valueOf(bool2.booleanValue()));
        }
        C7NC.A00(evsA0s, new C8185FYc(c9700GeEA0J.A01, c9747Gf0A0G, c9698Ge3, this, 9));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V */
    public final void A0X(Long l, String str, String str2, String str3, Map map) {
        C7384Etj.A0Y(str2, 2);
        C7NC.A00(AbstractC7607F5u.A0s(this.A02.acquireEvent("client_execute_dcpiapapi_success"), 31), new C9709GeN(this, l, str2, str, str3, map));
    }

    public final void A0Y(String str, String str2, String str3, Map<String, String> map) {
        C7384Etj.A0Y(str2, 1);
        C7NC.A00(AbstractC7607F5u.A0s(this.A02.acquireEvent("client_execute_dcpiapapi_init"), 30), new C9711GeP(this, str2, str, str3, map));
    }

    public static final C9751Gf4 A00(C9699Ge6 c9699Ge6, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Long lA0s;
        Long lA0s2;
        C9751Gf4 c9751Gf4 = new C9751Gf4();
        AbstractC7608F5v.A1F(c9751Gf4);
        AbstractC8150FWo.A02(c9751Gf4, "dcp_sub_flow", ConnectorOrderCheckoutKt.FULFILLMENT_KEY);
        A07(c9751Gf4, c9699Ge6);
        Map mapA16 = AbstractC7610F5x.A16(c9751Gf4);
        A06(c9751Gf4, c9699Ge6);
        if (str != null) {
            AbstractC8150FWo.A02(c9751Gf4, "external_transaction_id", str);
        }
        if (bool != null) {
            mapA16.put("is_retry", bool);
        }
        if (str2 != null) {
            AbstractC8150FWo.A02(c9751Gf4, "external_product_id", str2);
        }
        if (str4 != null && (lA0s2 = C9tI.A0s(str4)) != null) {
            AbstractC8150FWo.A02(c9751Gf4, "payee_id", lA0s2);
        }
        A0A(c9751Gf4, str5);
        A09(c9751Gf4, str6);
        if (str3 != null && (lA0s = C9tI.A0s(str3)) != null) {
            AbstractC8150FWo.A02(c9751Gf4, "internal_transaction_id", lA0s);
        }
        if (str7 != null) {
            AbstractC8150FWo.A02(c9751Gf4, "dcp_product_type", str7);
        }
        return c9751Gf4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9749Gf2 A01(X.C9699Ge6 r5, X.C9698Ge3 r6, X.C9661Gd3 r7, java.lang.Long r8, java.lang.String r9) {
        /*
            X.Gf2 r2 = new X.Gf2
            r2.<init>()
            X.AbstractC7608F5v.A1F(r2)
            java.lang.String r1 = "quote"
            java.lang.String r0 = "dcp_sub_flow"
            X.AbstractC8150FWo.A02(r2, r0, r1)
            A07(r2, r5)
            if (r8 == 0) goto L7a
            long r3 = r8.longValue()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
        L1d:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "latency_ms"
            X.AbstractC8150FWo.A02(r2, r0, r1)
            r0 = 71
            java.lang.String r3 = "dcp_platform"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.A00
            r0.put(r3, r1)
            A06(r2, r5)
            if (r7 == 0) goto L41
            java.lang.String r1 = r7.A05
            if (r1 == 0) goto L41
            java.lang.String r0 = "external_product_id"
            X.AbstractC8150FWo.A02(r2, r0, r1)
        L41:
            if (r6 == 0) goto L48
            java.lang.String r0 = r6.A08
            A0A(r2, r0)
        L48:
            if (r7 == 0) goto L4f
            java.lang.String r0 = r7.A07
            A09(r2, r0)
        L4f:
            if (r6 == 0) goto L77
            X.Hoz r0 = r6.A00
            if (r0 == 0) goto L6c
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L6c
            java.lang.Long r0 = X.C9tI.A0s(r0)
            if (r0 == 0) goto L6c
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "payee_id"
            X.AbstractC8150FWo.A02(r2, r0, r1)
        L6c:
            java.lang.String r0 = r6.A09
            if (r0 == 0) goto L77
            r9 = r0
        L71:
            java.lang.String r0 = "dcp_product_type"
            X.AbstractC8150FWo.A02(r2, r0, r9)
        L76:
            return r2
        L77:
            if (r9 == 0) goto L76
            goto L71
        L7a:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9699Ge6.A01(X.Ge6, X.Ge3, X.Gd3, java.lang.Long, java.lang.String):X.Gf2");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9748Gf1 A02(X.C9699Ge6 r13, X.C10574Huh r14, X.C9698Ge3 r15, X.C9661Gd3 r16, X.Ho0 r17, X.C10482Hla r18, java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
            r3 = r17
            r0 = r18
            if (r17 == 0) goto L8
            X.Hla r0 = r3.A01
        L8:
            r6 = 0
            if (r0 == 0) goto Ld5
            X.HwA r2 = r0.A00
            X.Huh r1 = r0.A01
            if (r1 != 0) goto L12
        L11:
            r1 = r14
        L12:
            r4 = r16
            if (r2 == 0) goto Ld2
            java.lang.String r12 = r2.A03()
            java.lang.String r10 = r2.A05()
            if (r10 != 0) goto L24
        L20:
            if (r16 == 0) goto Lcf
            java.lang.String r10 = r4.A05
        L24:
            if (r15 == 0) goto Lc9
            X.Hoz r0 = r15.A00
            if (r0 == 0) goto Lc9
            java.lang.String r9 = r0.A00
        L2c:
            java.lang.String r8 = r15.A08
        L2e:
            if (r2 == 0) goto L3a
            X.Hpr r0 = r2.A01()
            if (r0 == 0) goto L3a
            java.lang.String r7 = r0.A01
            if (r7 != 0) goto L3e
        L3a:
            if (r16 == 0) goto Lc6
            java.lang.String r7 = r4.A07
        L3e:
            if (r1 == 0) goto Lc3
            int r0 = r1.A00
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r4 = r1.A01
        L48:
            if (r17 == 0) goto L4e
            X.Hs0 r0 = r3.A00
            java.lang.String r6 = r0.A00
        L4e:
            if (r15 == 0) goto L54
            java.lang.String r3 = r15.A09
            if (r3 != 0) goto L56
        L54:
            r3 = r20
        L56:
            X.Gf1 r2 = new X.Gf1
            r2.<init>()
            X.AbstractC7608F5v.A1F(r2)
            java.lang.String r0 = "dcp_sub_flow"
            r1 = r19
            X.AbstractC8150FWo.A02(r2, r0, r1)
            A07(r2, r13)
            java.util.Map r11 = X.AbstractC7610F5x.A16(r2)
            java.lang.String r1 = "iap_checkout"
            java.lang.String r0 = "target_name"
            X.AbstractC8150FWo.A02(r2, r0, r1)
            A06(r2, r13)
            if (r12 == 0) goto L7d
            java.lang.String r0 = "external_transaction_id"
            X.AbstractC8150FWo.A02(r2, r0, r12)
        L7d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            java.lang.String r0 = "is_retry"
            r11.put(r0, r1)
            if (r10 == 0) goto L8d
            java.lang.String r0 = "external_product_id"
            X.AbstractC8150FWo.A02(r2, r0, r10)
        L8d:
            if (r9 == 0) goto L9a
            java.lang.Long r1 = X.C9tI.A0s(r9)
            if (r1 == 0) goto L9a
            java.lang.String r0 = "payee_id"
            X.AbstractC8150FWo.A02(r2, r0, r1)
        L9a:
            A0A(r2, r8)
            A09(r2, r7)
            if (r6 == 0) goto Lad
            java.lang.Long r1 = X.C9tI.A0s(r6)
            if (r1 == 0) goto Lad
            java.lang.String r0 = "internal_transaction_id"
            X.AbstractC8150FWo.A02(r2, r0, r1)
        Lad:
            if (r5 == 0) goto Lb4
            java.lang.String r0 = "currency_amount"
            X.AbstractC8150FWo.A02(r2, r0, r5)
        Lb4:
            if (r4 == 0) goto Lbb
            java.lang.String r0 = "currency_code"
            X.AbstractC8150FWo.A02(r2, r0, r4)
        Lbb:
            if (r3 == 0) goto Lc2
            java.lang.String r0 = "dcp_product_type"
            X.AbstractC8150FWo.A02(r2, r0, r3)
        Lc2:
            return r2
        Lc3:
            r5 = r6
            r4 = r6
            goto L48
        Lc6:
            r7 = r6
            goto L3e
        Lc9:
            r9 = r6
            if (r15 != 0) goto L2c
            r8 = r6
            goto L2e
        Lcf:
            r10 = r6
            goto L24
        Ld2:
            r12 = r6
            goto L20
        Ld5:
            r2 = r6
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9699Ge6.A02(X.Ge6, X.Huh, X.Ge3, X.Gd3, X.Ho0, X.Hla, java.lang.String, java.lang.String, boolean):X.Gf1");
    }

    public static final LinkedHashMap A05(C9699Ge6 c9699Ge6, InterfaceC9725Ged interfaceC9725Ged, C10482Hla c10482Hla) {
        String str;
        C9698Ge3 c9698Ge3AJG;
        AbstractC10579HwA abstractC10579HwA = c10482Hla.A00;
        Integer numAFu = interfaceC9725Ged.AFu();
        boolean zA00 = HpG.A00(numAFu);
        String strAMI = interfaceC9725Ged.AMI();
        if (strAMI == null && ((c9698Ge3AJG = interfaceC9725Ged.AJG()) == null || (strAMI = c9698Ge3AJG.A04) == null)) {
            strAMI = c9699Ge6.A0B;
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        if (abstractC10579HwA != null) {
            String str2 = abstractC10579HwA.A01().A01;
            linkedHashMapA0j.put("external_transaction_id", abstractC10579HwA.A03());
            linkedHashMapA0j.put("external_product_id", abstractC10579HwA.A05());
            long jA00 = abstractC10579HwA.A00();
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(jA00);
            linkedHashMapA0j.put("external_purchase_time", sbA0w.toString());
            boolean z = abstractC10579HwA instanceof Huq;
            linkedHashMapA0j.put("external_purchase_signature", z ? ((Huq) abstractC10579HwA).A08 : ((Hz9) abstractC10579HwA).A08);
            linkedHashMapA0j.put("developer_payload", z ? ((Huq) abstractC10579HwA).A04 : ((Hz9) abstractC10579HwA).A04);
            linkedHashMapA0j.put("external_purchase_token", abstractC10579HwA.A04());
            linkedHashMapA0j.put("is_retry", String.valueOf(zA00));
            linkedHashMapA0j.put("request_id", strAMI);
            if (str2 != null && !C7BY.A0j(str2)) {
                linkedHashMapA0j.put("quote_id", str2);
            }
        }
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(linkedHashMapA0j);
        linkedHashMapA14.put("product_type", interfaceC9725Ged.AJA());
        switch (numAFu.intValue()) {
            case 1:
                str = "asynchronous";
                break;
            case 2:
                str = "asynchronousBatched";
                break;
            default:
                str = "userPurchase";
                break;
        }
        linkedHashMapA14.put("fulfillment_type", str);
        C10574Huh c10574Huh = c10482Hla.A01;
        if (c10574Huh != null) {
            linkedHashMapA14.put(abstractC10579HwA.A05(), c10574Huh.toString());
        }
        linkedHashMapA14.putAll(C9jH.A00);
        return linkedHashMapA14;
    }

    public static void A06(AbstractC8150FWo abstractC8150FWo, C9699Ge6 c9699Ge6) {
        HsD<String> hsD;
        String str;
        HuV<String> huV = c9699Ge6.A04;
        synchronized (huV.A02) {
            hsD = huV.A00;
        }
        if (hsD == null || (str = hsD.A00) == null) {
            return;
        }
        abstractC8150FWo.A05("iap_store_country", str);
    }

    public static void A07(AbstractC8150FWo abstractC8150FWo, C9699Ge6 c9699Ge6) {
        abstractC8150FWo.A05(ErrorReportingConstants.APP_NAME_KEY, c9699Ge6.A06);
        abstractC8150FWo.A05("app_bundle_id", "com.facebook.aura");
    }

    public static void A08(AbstractC8150FWo abstractC8150FWo, C9699Ge6 c9699Ge6, String str) {
        abstractC8150FWo.A05("dcp_flow", str);
        abstractC8150FWo.A05(ErrorReportingConstants.APP_NAME_KEY, c9699Ge6.A06);
        abstractC8150FWo.A00.put("dcp_platform", 71);
        abstractC8150FWo.A04("latency_ms", 0L);
    }

    public static void A09(AbstractC8150FWo abstractC8150FWo, String str) {
        Long lA0s;
        if (str == null || (lA0s = C9tI.A0s(str)) == null) {
            return;
        }
        abstractC8150FWo.A04("quote_id", lA0s);
    }

    public static void A0A(AbstractC8150FWo abstractC8150FWo, String str) {
        Long lA0s;
        if (str == null || (lA0s = C9tI.A0s(str)) == null) {
            return;
        }
        abstractC8150FWo.A04("product_id", lA0s);
    }

    public final C9700GeE A0J(Map<String, String> map) {
        C9700GeE c9700GeE = new C9700GeE(this.A03, map != null ? AbstractC7607F5u.A14(map) : C3cG.A0j());
        String str = this.A07;
        Map<String, String> map2 = c9700GeE.A01;
        map2.put("iap_user_session_id", str);
        String str2 = this.A08;
        map2.putAll(AnonymousClass007.A0d("server_attributed_gate", CRP.A02.loggingValue, C3cG.A0r("enable_odyssey_pipeline", String.valueOf(false))));
        map2.put("installer", str2);
        map2.put("google_billing_client_version", this.A00);
        map2.put("iap_client_sdk", "ANDROID");
        map2.put("iap_client_version", "2");
        return c9700GeE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        throw X.C3cG.A0q();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(X.Ho8 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<X.HiN> r3 = r4.A0A
            java.lang.Object r0 = r3.get()
            X.HiN r0 = (X.HiN) r0
            if (r0 == 0) goto L59
            int r2 = r0.ordinal()
            r1 = 0
            r0 = 1
            if (r2 == r1) goto L4e
            if (r2 == r0) goto L1b
            r0 = 2
            if (r2 == r0) goto L1a
            r0 = 3
            if (r2 != r0) goto L59
        L1a:
            return
        L1b:
            X.HiN r1 = X.HiN.A04
            X.HiN r0 = X.HiN.A02
            boolean r0 = X.Bs8.A00(r1, r0, r3)
            if (r0 == 0) goto L0
            X.Hoa r3 = new X.Hoa
            r3.<init>()
            java.lang.String r0 = "purchase"
            A08(r3, r4, r0)
            r0 = 4
            java.lang.String r0 = X.BV3.A00(r0)
            r3.A03(r5, r0)
            X.8ee<?> r1 = r4.A02
            java.lang.String r0 = "client_close_dcpsession_atomic"
            X.Eu1 r1 = r1.acquireEvent(r0)
            r0 = 3
            X.EVS r2 = X.AbstractC7607F5u.A0s(r1, r0)
            r1 = 7
            X.FZG r0 = new X.FZG
            r0.<init>(r1, r3, r4)
            X.C7NC.A00(r2, r0)
            return
        L4e:
            X.HiN r1 = X.HiN.A05
            X.HiN r0 = X.HiN.A03
            boolean r0 = X.Bs8.A00(r1, r0, r3)
            if (r0 == 0) goto L0
            return
        L59:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9699Ge6.A0K(X.Ho8):void");
    }

    public final void A0V(InterfaceC9725Ged interfaceC9725Ged, List<C10482Hla> list) {
        AnonymousClass003.A0u(interfaceC9725Ged, list);
        for (C10482Hla c10482Hla : list) {
            Integer numAFu = interfaceC9725Ged.AFu();
            AnonymousClass002.A1B(c10482Hla, 2, numAFu);
            C9748Gf1 c9748Gf1A02 = A02(this, null, interfaceC9725Ged.AJG(), interfaceC9725Ged.AJL(), null, c10482Hla, ConnectorOrderCheckoutKt.FULFILLMENT_KEY, interfaceC9725Ged.AJA(), false);
            C9700GeE c9700GeEA0J = A0J(null);
            C9700GeE.A00(c9700GeEA0J, null, interfaceC9725Ged.AJG(), interfaceC9725Ged.AJL(), null, null);
            c9700GeEA0J.A04(c10482Hla.A00);
            c9700GeEA0J.A06(Boolean.valueOf(HpG.A00(numAFu)));
            c9700GeEA0J.A07(numAFu);
            C7NC.A00(AbstractC7607F5u.A0s(this.A02.acquireEvent("client_verify_dcppayment_init"), 50), new C8185FYc(interfaceC9725Ged, c9700GeEA0J.A01, c9748Gf1A02, this, 25));
        }
    }

    public final void A0W(InterfaceC9725Ged interfaceC9725Ged, List<Ho0> list) {
        AnonymousClass003.A0u(interfaceC9725Ged, list);
        for (Ho0 ho0 : list) {
            Integer numAFu = interfaceC9725Ged.AFu();
            AnonymousClass002.A1B(ho0, 2, numAFu);
            C9698Ge3 c9698Ge3AJG = interfaceC9725Ged.AJG();
            boolean zA00 = HpG.A00(numAFu);
            C9748Gf1 c9748Gf1A02 = A02(this, null, c9698Ge3AJG, interfaceC9725Ged.AJL(), ho0, null, ConnectorOrderCheckoutKt.FULFILLMENT_KEY, interfaceC9725Ged.AJA(), zA00);
            C9700GeE c9700GeEA0J = A0J(null);
            C9700GeE.A00(c9700GeEA0J, null, interfaceC9725Ged.AJG(), interfaceC9725Ged.AJL(), null, null);
            c9700GeEA0J.A04(ho0.A01.A00);
            c9700GeEA0J.A06(Boolean.valueOf(HpG.A00(numAFu)));
            c9700GeEA0J.A07(numAFu);
            C7NC.A00(AbstractC7607F5u.A0s(this.A02.acquireEvent("client_verify_dcppayment_success"), 51), new C8185FYc(interfaceC9725Ged, c9700GeEA0J.A01, c9748Gf1A02, this, 26));
        }
    }

    public static final String A03() {
        String strLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", String.valueOf(System.currentTimeMillis()), BV5.A0j());
        C7384Etj.A0U(strLocaleSafe);
        return strLocaleSafe;
    }

    public static LinkedHashMap A04(C9699Ge6 c9699Ge6, C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, Map map, Map map2) {
        C9700GeE c9700GeEA0J = c9699Ge6.A0J(map);
        c9700GeEA0J.A05(c9698Ge3, c9661Gd3);
        c9700GeEA0J.A02(c9699Ge6.A01);
        C9700GeE.A01(c9700GeEA0J, "client_requested_sku", c9698Ge3 != null ? c9698Ge3.A07 : null);
        return AGH.A02(c9700GeEA0J.A01, map2);
    }
}
