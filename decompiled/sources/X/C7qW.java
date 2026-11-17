package X;

import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import java.time.Instant;
import java.util.List;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.7qW, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7qW {
    public static final void A05(Number number, String str, C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7384Etj.A0Y(str, 1);
        c2nw.A01(str, C9oY.A06(number));
    }

    public static final void A06(String str, String str2, C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7384Etj.A0Y(str, 1);
        c2nw.A01(str, C9oY.A07(str2));
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/2nw;Ljava/lang/String;LX/G0U<-LX/7pd;Lkotlin/Unit;>;)Lkotlinx/serialization/json/JsonElement; */
    public static final void A07(String str, G0U g0u, C2nw c2nw) {
        C7384Etj.A0Y(g0u, 2);
        C7pd c7pdA01 = C7pd.A01();
        g0u.invoke(c7pdA01);
        c2nw.A01(str, C7pd.A00(c7pdA01));
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/2nw;Ljava/lang/String;LX/G0U<-LX/2nw;Lkotlin/Unit;>;)Lkotlinx/serialization/json/JsonElement; */
    public static final void A08(String str, G0U g0u, C2nw c2nw) {
        C7384Etj.A0Y(g0u, 2);
        C2nw c2nwA1K = C60O.A1K();
        g0u.invoke(c2nwA1K);
        c2nw.A01(str, c2nwA1K.A00());
    }

    public static Integer A00(List list, C2nw c2nw) {
        A06(AuraDeeplinkRouteMapper.STATUS_ROUTE, "success", c2nw);
        return new Integer(list.size());
    }

    public static C2nw A02() {
        C2nw c2nw = new C2nw();
        A06("platform", "android", c2nw);
        return c2nw;
    }

    public static void A03(Boolean bool, Object obj, String str, C2nw c2nw) {
        A04(bool, PairsInviteMailboxKt.OUTCOME_OK, c2nw);
        A06("payload_json", obj.toString(), c2nw);
        if (str != null) {
            A06(HatchWebPageParserKt.DESCRIPTION, str, c2nw);
        }
    }

    public static final void A04(Boolean bool, String str, C2nw c2nw) {
        C9iZ c9iZ = C9oY.A00;
        c2nw.A01(str, bool == null ? JsonNull.A00 : new JsonLiteral(bool, null, false));
    }

    public static void A09(String str, C2nw c2nw, int i) {
        A05(new Integer(i), str, c2nw);
    }

    public static JsonObject A01(String str, String str2, C2nw c2nw) {
        A06(str, str2, c2nw);
        return c2nw.A00();
    }

    public static void A0A(String str, C2nw c2nw, boolean z) {
        A04(Boolean.valueOf(z), str, c2nw);
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/7pd;LX/G0U<-LX/2nw;Lkotlin/Unit;>;)Z */
    public static final void A0B(G0U g0u, C7pd c7pd) {
        C2nw c2nwA1K = C60O.A1K();
        g0u.invoke(c2nwA1K);
        c7pd.A06(c2nwA1K.A00());
    }

    public static void A0C(C2nw c2nw) {
        A06("syncedAt", Instant.now().toString(), c2nw);
    }
}
