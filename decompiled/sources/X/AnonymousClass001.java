package X;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.001, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass001 {
    public static float A01(long j, long j2) {
        return Float.intBitsToFloat((int) (j & j2));
    }

    public static BBb A0L(BFM bfm, BBI bbi) {
        BBI.A0R(bbi, false);
        return bfm.AAc();
    }

    public static B1U A0M(Object obj, int i) {
        return B1V.A01(obj, i, true);
    }

    public static BRg A0P(BBI bbi, BRg bRg) {
        BBI.A0R(bbi, true);
        return bRg;
    }

    public static InterfaceC1380AiA A0a() {
        return C3Ue.A01(C2VU.A09, false);
    }

    public static Boolean A0h() {
        return false;
    }

    public static Boolean A0i() {
        return true;
    }

    public static Float A0l() {
        return new Float(0.0f);
    }

    public static String A0s(BFM bfm, BBI bbi, int i) {
        String strA01 = AbstractC2271BQs.A01(bfm, i);
        BBI.A0R(bbi, false);
        return strA01;
    }

    public static void A1D(Object obj) {
        BBI.A0R((BBI) obj, false);
    }

    public static boolean A1L(int i) {
        return (i & 14) == 4;
    }

    public static boolean A1M(int i) {
        return (i & 14) == 4;
    }

    public static boolean A1W(Object obj) {
        BBI.A0R((BBI) obj, false);
        return false;
    }

    public static float A00(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static float A02(Object obj) {
        return ((Number) obj).floatValue();
    }

    public static int A03() {
        return (AVy.$stable << 3) | 384;
    }

    public static int A04() {
        return (AVy.$stable << 3) | 3456;
    }

    public static int A05(int i, int i2) {
        return i2 | (i & 3670016);
    }

    public static int A06(int i, int i2) {
        return i2 | (i & 1879048192);
    }

    public static int A07(int i, int i2) {
        return i2 | (458752 & i);
    }

    public static int A08(int i, int i2) {
        return i2 | (i & 458752);
    }

    public static int A09(int i, int i2) {
        return i2 | (i & 234881024);
    }

    public static int A0C(int i, int i2) {
        return i2 | (i & 29360128);
    }

    public static int A0D(BBI bbi) {
        long j = bbi.A06;
        return (int) (j ^ (j >>> 32));
    }

    public static int A0F(Object obj) {
        return ((Number) obj).intValue();
    }

    public static View A0J(BFM bfm) {
        return (View) bfm.A6v(AndroidCompositionLocals_androidKt.A05);
    }

    public static ASj A0K(int i, int i2) {
        return new ASj(C2HU.A01, i, i2);
    }

    public static BRg A0N(C90l c90l, BRg bRg, boolean z) {
        return c90l.AiP(bRg, 1.0f, z);
    }

    public static BRg A0O(C90m c90m, BRg bRg, boolean z) {
        return c90m.AiP(bRg, 1.0f, z);
    }

    public static BRg A0R(BRg bRg) {
        return bRg.then(C10G.A02);
    }

    public static BRg A0S(BRg bRg) {
        return C10G.A07(bRg, 24.0f);
    }

    public static BRg A0T(BRg bRg) {
        return bRg.then(C10G.A01);
    }

    public static BRg A0U(BRg bRg, float f) {
        return C10G.A0A(bRg, f, Float.NaN);
    }

    public static BRg A0V(BRg bRg, float f) {
        return C10G.A09(bRg, Float.NaN, f);
    }

    public static BRg A0W(BRg bRg, Object obj) {
        return AbstractC1396AiR.A00(bRg, (G0U) obj);
    }

    public static BRg A0X(BRg bRg, Object obj) {
        return ARD.A00(bRg, (G0U) obj);
    }

    public static BRg A0Y(BRg bRg, Object obj, boolean z) {
        return ARD.A01(bRg, (G0U) obj, z);
    }

    public static C0Hi A0Z(BFM bfm) {
        return (C0Hi) bfm.A6v(Am0.A05);
    }

    public static InterfaceC1380AiA A0b(InterfaceC04981Yd interfaceC04981Yd, BFM bfm, C1AC c1ac) {
        return C0A8.A00(interfaceC04981Yd, bfm, c1ac, 54);
    }

    public static InterfaceC1380AiA A0c(boolean z) {
        return C3Ue.A01(C2VU.A0E, z);
    }

    public static EnumC1820Arj A0d(BFM bfm) {
        return (EnumC1820Arj) bfm.A6v(Am0.A0A);
    }

    public static Float A0m() {
        return new Float(1.0f);
    }

    public static IllegalStateException A0n() {
        return new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static IllegalStateException A0o() {
        return new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }

    public static String A0u(String str) {
        return str.toLowerCase(Locale.ROOT);
    }

    public static Unit A0x(Object obj) {
        ((Number) obj).longValue();
        return Unit.INSTANCE;
    }

    public static C78T A0y() {
        return AuraDispatchers.INSTANCE.io();
    }

    public static C10550Hrx A10(G0V g0v, C3UX c3ux) {
        return GAo.A01(C79.A00, C6ys.A00, g0v, c3ux);
    }

    public static C10533Hqc A11(G0V g0v, C3UX c3ux) {
        return GAo.A02(C79.A00, C6ys.A00, g0v, c3ux);
    }

    public static A64 A13() {
        return new A64(C07779iq.A01);
    }

    public static void A14(BFM bfm, AKJ akj, G0V g0v, int i) {
        AKT.A01(bfm, akj, g0v, (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8);
    }

    public static void A15(BFM bfm, Object obj) {
        bfm.AZp((Function0) obj);
    }

    public static void A16(BFM bfm, Object obj) {
        BPg.A02(bfm, obj, C1515AkP.A05);
    }

    public static void A17(BFM bfm, Object obj, Object obj2) {
        C78e.A05(bfm, obj2, (G0U) obj);
    }

    public static void A18(BFM bfm, Object obj, Object obj2) {
        C78e.A06(bfm, obj2, (G0V) obj);
    }

    public static void A19(BFM bfm, Object obj, Object obj2, Object obj3) {
        C78e.A03(bfm, obj2, obj3, (G0U) obj);
    }

    public static void A1A(BFM bfm, Object obj, Object obj2, Object obj3) {
        C78e.A04(bfm, obj2, obj3, (G0V) obj);
    }

    public static void A1E(Object obj, Object obj2, Object obj3) {
        C9286GCn.A00(obj2, obj3, (C9286GCn) obj);
    }

    public static void A1I(C78T c78t, G0V g0v, C3UX c3ux) {
        GAo.A02(C79.A00, c78t, g0v, c3ux);
    }

    public static void A1J(G0V g0v, C3UX c3ux) {
        GAo.A02(C79.A00, C6ys.A00, g0v, c3ux);
    }

    public static boolean A1N(int i) {
        return (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
    }

    public static boolean A1O(int i) {
        return (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
    }

    public static boolean A1P(int i, boolean z) {
        if ((i & 1) != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1Q(int i, boolean z) {
        if ((i & 2) != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1V(Object obj) {
        BBI.A0R((BBI) obj, false);
        return false;
    }

    public static boolean A1X(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static boolean A1b(boolean z, BFM bfm, int i) {
        return bfm.AfS(i & 1, z);
    }

    public static int A0A(int i, int i2) {
        return i2 | (57344 & i);
    }

    public static int A0B(int i, int i2) {
        return i2 | (i & 57344);
    }

    public static int A0E(Enum r0, int i) {
        C7384Etj.A0Y(r0, i);
        return r0.ordinal();
    }

    public static int A0G(String str) {
        return str.hashCode() * 31;
    }

    public static int A0H(String str, int i) {
        return i + str.hashCode();
    }

    public static Context A0I(Context context) {
        Context applicationContext = context.getApplicationContext();
        C7384Etj.A0U(applicationContext);
        return applicationContext;
    }

    public static BRg A0Q(BBI bbi, BRg bRg, boolean z, boolean z2) {
        BBI.A0R(bbi, z);
        BBI.A0R(bbi, z2);
        return bRg;
    }

    public static BLL A0e(AEs aEs, Integer num, C78T c78t, G0V g0v, C3UX c3ux) {
        GAo.A02(num, c78t, g0v, c3ux);
        return AEu.A00(aEs);
    }

    public static AuraColors A0f(BFM bfm, AKN akn) {
        return (AuraColors) bfm.A6v(akn);
    }

    public static AuraTypography A0g(BFM bfm, AKN akn) {
        return (AuraTypography) bfm.A6v(akn);
    }

    public static Boolean A0j(BFM bfm, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        bfm.Ai0(boolValueOf);
        return boolValueOf;
    }

    public static Boolean A0k(Object obj, boolean z) {
        Hwg.A00(obj);
        return Boolean.valueOf(z);
    }

    public static Object A0p(BFM bfm, int i) {
        bfm.AgE(i);
        return bfm.AaT();
    }

    public static Object A0q(Object obj) {
        Hwg.A00(obj);
        return ((HsJ) obj).value;
    }

    public static String A0r(BFM bfm) {
        return AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206f0);
    }

    public static String A0t(BFM bfm, Object obj, int i) {
        return AbstractC2271BQs.A02(bfm, new Object[]{obj}, i);
    }

    public static String A0v(String str, StringBuilder sb) {
        sb.append(str);
        return sb.toString();
    }

    public static Iterator A0w(BFM bfm, List list, int i) {
        bfm.AgE(i);
        return list.iterator();
    }

    public static AHD A0z(BFM bfm, Iterable iterable) {
        AHD ahdA07 = AGI.A07(iterable);
        bfm.Ai0(ahdA07);
        return ahdA07;
    }

    public static C9hr A12(F0C f0c) {
        return (C9hr) f0c.getValue();
    }

    public static void A1B(B1U b1u, Object obj, int i) {
        b1u.invoke(obj, Integer.valueOf(i));
    }

    public static void A1C(HatchMetadataKey hatchMetadataKey, Object obj, C0924AIa c0924AIa) {
        c0924AIa.put(hatchMetadataKey.getValue(), obj);
    }

    public static void A1F(Object obj, Object obj2, Object obj3, G2j g2j, int i) {
        g2j.invoke(obj, obj2, obj3, Integer.valueOf(i));
    }

    public static void A1G(Object obj, Object obj2, G0W g0w, int i) {
        g0w.invoke(obj, obj2, Integer.valueOf(i));
    }

    public static void A1H(Object obj, G0V g0v, int i) {
        g0v.invoke(obj, Integer.valueOf(i));
    }

    public static void A1K(boolean z, G0U g0u) {
        g0u.invoke(Boolean.valueOf(z));
    }

    public static boolean A1R(BFM bfm, Object obj, boolean z) {
        return z | bfm.A65(obj);
    }

    public static boolean A1S(BFM bfm, Object obj, boolean z) {
        return bfm.A67(obj) | z;
    }

    public static boolean A1T(BFM bfm, Object obj, boolean z) {
        return z | bfm.A67(obj);
    }

    public static boolean A1U(BFM bfm, boolean z, boolean z2) {
        return z2 | bfm.A66(z);
    }

    public static boolean A1Y(Object obj, BFM bfm, int i) {
        bfm.AgE(i);
        return bfm.A65(obj);
    }

    public static boolean A1Z(Object obj, BFM bfm, int i) {
        bfm.AgE(i);
        return bfm.A67(obj);
    }

    public static boolean A1a(boolean z, BFM bfm, int i) {
        return z | bfm.A63(i);
    }
}
