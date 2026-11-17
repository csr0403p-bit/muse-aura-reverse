package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.network.http.HatchHttpApi$executeStefiRequestInternal$1;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import com.facebook.aura.qpl.AuraQuickPerformanceLogger;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.60P, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C60P {
    public static QuickPerformanceLogger A1G(Object obj) {
        C7384Etj.A0Y(obj, 1);
        return AuraQuickPerformanceLogger.INSTANCE.getInstance();
    }

    public static String A1N(String str, StringBuilder sb) {
        sb.append((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT));
        return str.substring(1);
    }

    public static Map A1S(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return BottomSheetSceneStrategy.Companion.bottomSheet(true, true, false);
    }

    public static void A1W(HatchHttpApi$executeStefiRequestInternal$1 hatchHttpApi$executeStefiRequestInternal$1, Object obj, Object obj2, boolean z, boolean z2) {
        hatchHttpApi$executeStefiRequestInternal$1.L$2 = null;
        hatchHttpApi$executeStefiRequestInternal$1.L$3 = obj;
        hatchHttpApi$executeStefiRequestInternal$1.L$4 = null;
        hatchHttpApi$executeStefiRequestInternal$1.L$5 = null;
        hatchHttpApi$executeStefiRequestInternal$1.L$6 = null;
        hatchHttpApi$executeStefiRequestInternal$1.L$7 = null;
        hatchHttpApi$executeStefiRequestInternal$1.L$8 = obj2;
        hatchHttpApi$executeStefiRequestInternal$1.Z$0 = z;
        hatchHttpApi$executeStefiRequestInternal$1.Z$1 = z2;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 1);
        return true;
    }

    public static int[] A1a() {
        return new int[]{0, 1, 2, 3};
    }

    public static long A01(Number number) {
        if (number != null) {
            return number.longValue();
        }
        return 0L;
    }

    public static Context A02(Object obj, Object obj2) {
        Context context = (Context) obj;
        Hwg.A00(obj2);
        return context;
    }

    public static Intent A03(String str) {
        return new Intent(str);
    }

    public static B6A A04(long j) {
        return new B6A(j);
    }

    public static HatchMessage A05(HatchMessage hatchMessage, Long l) {
        return HatchMessage.copy$default(hatchMessage, null, null, null, 0L, null, null, null, l, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -129, 3, null);
    }

    public static ResumePolicy.Periodic A06() {
        return new ResumePolicy.Periodic(15L);
    }

    public static HatchHtmlErrorCode A07(String str, String str2, int i) {
        return new HatchHtmlErrorCode(str, i, str2);
    }

    public static Long A1H(JsonObject jsonObject, String str) {
        return new Long(JsonObjectExtensionsKt.optLong(jsonObject, str, 0L));
    }

    public static Long A1I(JsonObject jsonObject, String str) {
        return Long.valueOf(JsonObjectExtensionsKt.optLong(jsonObject, str, 0L));
    }

    public static String A1K(AbstractC3358CGz abstractC3358CGz) {
        return HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getGatewayUrl();
    }

    public static String A1L(String str, String str2, String str3) {
        return FGI.A0d(str, str2, ": ", str3);
    }

    public static String A1Q(JsonObject jsonObject, String str, String str2) {
        String strOptString = JsonObjectExtensionsKt.optString(jsonObject, str, "");
        return strOptString.length() > 0 ? strOptString : str2;
    }

    public static C9iK A1T(String str, C9cd c9cd, int i) {
        C9iK c9iK = new C9iK(str, c9cd, i);
        c9iK.A08("type", false);
        return c9iK;
    }

    public static void A1U(EKD ekd) {
        F1w f1w = new F1w();
        f1w.A01(C79.A01);
        ekd.A00.A0B = f1w.A00();
    }

    public static void A1V(EK5 ek5, Object obj, String str) {
        new EKG(C7yC.A04, ek5, str, Collections.singletonList(obj)).A00();
    }

    public static boolean A1Z(JsonObject jsonObject) {
        return jsonObject.containsKey(PairsInviteMailboxKt.OUTCOME_OK);
    }

    public static C9hr[] A1b() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
    }

    public static int A00(Context context) {
        return context.getResources().getConfiguration().uiMode & 48;
    }

    public static Object A1J(AuraViewerDataProvider.Companion companion, AbstractC3358CGz abstractC3358CGz) {
        return companion.getInstance(abstractC3358CGz).userData.getValue();
    }

    public static String A1M(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A1O(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A1P(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        return sb.toString();
    }

    public static Iterator A1R(AbstractMap abstractMap) {
        Collection collectionValues = abstractMap.values();
        C7384Etj.A0U(collectionValues);
        return collectionValues.iterator();
    }

    public static void A1X(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        CFK.A05(str2, sb.toString());
    }

    public static C7491Exw A08() {
        return new C7491Exw(36593971771804320L);
    }

    public static C7491Exw A09() {
        return new C7491Exw(36593971772656289L);
    }

    public static C7491Exw A0A() {
        return new C7491Exw(36593971772721826L);
    }

    public static C7491Exw A0B() {
        return new C7491Exw(36593971772787363L);
    }

    public static C7491Exw A0C() {
        return new C7491Exw(36593971772852900L);
    }

    public static C7491Exw A0D() {
        return new C7491Exw(36312496788930751L);
    }

    public static C7491Exw A0E() {
        return new C7491Exw(36312496790438081L);
    }

    public static C7491Exw A0F() {
        return new C7491Exw(36312496790569154L);
    }

    public static C7491Exw A0G() {
        return new C7491Exw(36312496790962372L);
    }

    public static C7491Exw A0H() {
        return new C7491Exw(36312496791093445L);
    }

    public static C7491Exw A0I() {
        return new C7491Exw(36312496792142022L);
    }

    public static C7491Exw A0J() {
        return new C7491Exw(36312496792273095L);
    }

    public static C7491Exw A0K() {
        return new C7491Exw(36312496792338632L);
    }

    public static C7491Exw A0L() {
        return new C7491Exw(36312496792535241L);
    }

    public static C7491Exw A0M() {
        return new C7491Exw(36312496794108106L);
    }

    public static C7491Exw A0N() {
        return new C7491Exw(36312496794173643L);
    }

    public static C7491Exw A0O() {
        return new C7491Exw(36312496794435788L);
    }

    public static C7491Exw A0P() {
        return new C7491Exw(36312496795156685L);
    }

    public static C7491Exw A0Q() {
        return new C7491Exw(36312496795353294L);
    }

    public static C7491Exw A0R() {
        return new C7491Exw(36312496795549903L);
    }

    public static C7491Exw A0S() {
        return new C7491Exw(36312496795615440L);
    }

    public static C7491Exw A0T() {
        return new C7491Exw(36312496795812049L);
    }

    public static C7491Exw A0U() {
        return new C7491Exw(36312496796336338L);
    }

    public static C7491Exw A0V() {
        return new C7491Exw(36312496796598483L);
    }

    public static C7491Exw A0W() {
        return new C7491Exw(36312496796729556L);
    }

    public static C7491Exw A0X() {
        return new C7491Exw(36312496796795093L);
    }

    public static C7491Exw A0Y() {
        return new C7491Exw(36312496796860630L);
    }

    public static C7491Exw A0Z() {
        return new C7491Exw(36312496796991703L);
    }

    public static C7491Exw A0a() {
        return new C7491Exw(36312496797057240L);
    }

    public static C7491Exw A0b() {
        return new C7491Exw(36312496797253849L);
    }

    public static C7491Exw A0c() {
        return new C7491Exw(36312496797450458L);
    }

    public static C7491Exw A0d() {
        return new C7491Exw(36312496797581531L);
    }

    public static C7491Exw A0e() {
        return new C7491Exw(36312496797712604L);
    }

    public static C7491Exw A0f() {
        return new C7491Exw(36312496797778141L);
    }

    public static C7491Exw A0g() {
        return new C7491Exw(36312496797843678L);
    }

    public static C7491Exw A0h() {
        return new C7491Exw(36312496798105823L);
    }

    public static C7491Exw A0i() {
        return new C7491Exw(36312496798236896L);
    }

    public static C7491Exw A0j() {
        return new C7491Exw(36312496798761185L);
    }

    public static C7491Exw A0k() {
        return new C7491Exw(36312496799285475L);
    }

    public static C7491Exw A0l() {
        return new C7491Exw(36312496799744228L);
    }

    public static C7491Exw A0m() {
        return new C7491Exw(36312496799809765L);
    }

    public static C7491Exw A0n() {
        return new C7491Exw(36312496799940838L);
    }

    public static C7491Exw A0o() {
        return new C7491Exw(36312496800137447L);
    }

    public static C7491Exw A0p() {
        return new C7491Exw(36312496800268520L);
    }

    public static C7491Exw A0q() {
        return new C7491Exw(36312496800661737L);
    }

    public static C7491Exw A0r() {
        return new C7491Exw(36312496800727274L);
    }

    public static C7491Exw A0s() {
        return new C7491Exw(36312496800792811L);
    }

    public static C7491Exw A0t() {
        return new C7491Exw(36312496800858348L);
    }

    public static C7491Exw A0u() {
        return new C7491Exw(36312496800923885L);
    }

    public static C7491Exw A0v() {
        return new C7491Exw(36312496800989422L);
    }

    public static C7491Exw A0w() {
        return new C7491Exw(36312496801054959L);
    }

    public static C7491Exw A0x() {
        return new C7491Exw(36312496801120496L);
    }

    public static C7491Exw A0y() {
        return new C7491Exw(36312496801186033L);
    }

    public static C7491Exw A0z() {
        return new C7491Exw(36312496801251570L);
    }

    public static C7491Exw A10() {
        return new C7491Exw(36312496801317107L);
    }

    public static C7491Exw A11() {
        return new C7491Exw(36312496801513717L);
    }

    public static C7491Exw A12() {
        return new C7491Exw(36312496801775862L);
    }

    public static C7491Exw A13() {
        return new C7491Exw(36312496802103543L);
    }

    public static C7491Exw A14() {
        return new C7491Exw(36312496802234616L);
    }

    public static C7491Exw A15() {
        return new C7491Exw(36312496802365689L);
    }

    public static C7491Exw A16() {
        return new C7491Exw(36312496802496762L);
    }

    public static C7491Exw A17() {
        return new C7491Exw(36312496802562299L);
    }

    public static C7491Exw A18() {
        return new C7491Exw(36312496802627836L);
    }

    public static C7491Exw A19() {
        return new C7491Exw(36312496803545341L);
    }

    public static C7491Exw A1A() {
        return new C7491Exw(36312496804331774L);
    }

    public static C7491Exw A1B() {
        return new C7491Exw(36312496804462847L);
    }

    public static C7491Exw A1C() {
        return new C7491Exw(36312496804659456L);
    }

    public static C7491Exw A1D() {
        return new C7491Exw(36312496804856065L);
    }

    public static C7491Exw A1E() {
        return new C7491Exw(36312496804921602L);
    }

    public static C7491Exw A1F() {
        return new C7491Exw(36312496806756611L);
    }
}
