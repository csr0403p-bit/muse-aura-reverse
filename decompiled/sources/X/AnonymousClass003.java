package X;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* renamed from: X.003, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass003 {
    public static float A00(float f) {
        return ATD.A03(f, 0.0f, 1.0f);
    }

    public static int A0L(Enum r1) {
        C7384Etj.A0Y(r1, 0);
        return r1.ordinal();
    }

    public static BBP A0R(BFM bfm, Function0 function0) {
        BBP bbp = new BBP(null, function0);
        bfm.Ai0(bbp);
        return bbp;
    }

    public static ParcelableSnapshotMutableState A0S() {
        return new ParcelableSnapshotMutableState(AGF.A01(), null);
    }

    public static BRg A0V(BRg bRg, Object obj) {
        return AbstractC1462AjV.A00(bRg, (G0U) obj, 0L, 0L);
    }

    public static String A0e(BFM bfm, int i) {
        String strA01 = AbstractC2271BQs.A01(bfm, i);
        BBI.A0R((BBI) bfm, false);
        return strA01;
    }

    public static String A0f(BFM bfm, BBI bbi, Object obj, int i) {
        String strA02 = AbstractC2271BQs.A02(bfm, new Object[]{obj}, i);
        BBI.A0R(bbi, false);
        return strA02;
    }

    public static NoWhenBranchMatchedException A0k(BFM bfm, BBI bbi, int i) {
        bfm.AgE(i);
        BBI.A0R(bbi, false);
        return new NoWhenBranchMatchedException();
    }

    public static void A0l(BFM bfm, int i) {
        bfm.AgE(i);
        BBI.A0R((BBI) bfm, false);
    }

    public static void A0q(BBI bbi) {
        BBI.A0R(bbi, false);
        BBI.A0R(bbi, true);
    }

    public static void A0r(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A06(interfaceC0857A6e, 0);
    }

    public static void A0t(HatchConversationKt$HatchConversation$17$1 hatchConversationKt$HatchConversation$17$1, int i, int i2, int i3) {
        hatchConversationKt$HatchConversation$17$1.I$7 = i;
        hatchConversationKt$HatchConversation$17$1.I$8 = i2;
        hatchConversationKt$HatchConversation$17$1.I$9 = i3;
        hatchConversationKt$HatchConversation$17$1.I$10 = 0;
        hatchConversationKt$HatchConversation$17$1.I$11 = 0;
    }

    public static void A0u(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 1);
    }

    public static void A0v(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 2);
    }

    public static void A0w(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 3);
    }

    public static void A0x(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 1);
        C7384Etj.A0Y(obj2, 2);
    }

    public static void A0y(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 4);
        C7384Etj.A0Y(obj2, 5);
    }

    public static void A0z(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 5);
        C7384Etj.A0Y(obj2, 6);
    }

    public static void A10(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 6);
        C7384Etj.A0Y(obj2, 7);
    }

    public static void A14(Object obj, boolean z) {
        C9286GCn.A00(null, Boolean.valueOf(z), (C9286GCn) obj);
    }

    public static boolean A16(int i) {
        return i != 2;
    }

    public static boolean A17(int i) {
        return i == 4;
    }

    public static boolean A1A(int i) {
        return (i & 3) != 2;
    }

    public static boolean A1B(int i) {
        return (i & 14) == 4;
    }

    public static boolean A1F(int i, int i2, int i3) {
        return (i & i2) == i3;
    }

    public static boolean A1V(BBI bbi) {
        BBI.A0R(bbi, false);
        BBI.A0R(bbi, true);
        return true;
    }

    public static int[] A1a() {
        return new int[]{0, 1};
    }

    public static InterfaceC7359EnW[] A1b(Class cls, String str, String str2) {
        return new InterfaceC7359EnW[]{new C7354EnR(cls, str, str2, 0)};
    }

    public static float A01(float f, float f2, float f3) {
        return ((1.0f - f) * f2) + (f * f3);
    }

    public static float A02(int i) {
        return i != 0 ? 0.0f : 1.0f;
    }

    public static float A03(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int A05(int i) {
        return i != 0 ? 256 : 128;
    }

    public static int A06(int i, int i2) {
        return i2 | (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i & 896) | (i & 7168);
    }

    public static int A07(int i, int i2) {
        return i2 | (i & 7168) | (i & 57344);
    }

    public static int A08(int i, int i2, int i3) {
        return i2 | (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((i3 << 6) & 896);
    }

    public static int A09(int i, int i2, int i3) {
        return i2 | (i & 896) | ((i3 << 9) & 7168);
    }

    public static int A0E(BFM bfm, Object obj) {
        return !bfm.A65(obj) ? 1024 : 2048;
    }

    public static int A0F(BFM bfm, Object obj) {
        return !bfm.A65(obj) ? 8192 : 16384;
    }

    public static int A0G(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 256 : 128;
    }

    public static int A0H(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 256 : 128;
    }

    public static int A0I(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 2048 : 1024;
    }

    public static int A0J(BBI bbi) {
        long j = bbi.A06;
        return (int) (j ^ (j >>> 32));
    }

    public static int A0K(Enum r0) {
        if (r0 == null) {
            return -1;
        }
        return r0.ordinal();
    }

    public static int A0M(Enum r0) {
        if (r0 == null) {
            return -1;
        }
        return r0.ordinal();
    }

    public static long A0N(long j) {
        return (j << 32) | (j & 4294967295L);
    }

    public static Context A0O(BFM bfm) {
        return (Context) bfm.A6v(AndroidCompositionLocals_androidKt.A01);
    }

    public static AQI A0P(C28s c28s, int i, int i2) {
        return AbstractC1011APs.A04(new ASj(c28s, i, i2), 0.0f);
    }

    public static C1003AOr A0Q(Object obj) {
        return new C1003AOr(obj, 1.0f, 1500.0f);
    }

    public static AKJ A0T(AKH akh, long j) {
        return akh.A04(new B6A(j));
    }

    public static BRg A0U(BRg bRg) {
        return C10G.A0A(bRg, 48.0f, Float.NaN);
    }

    public static InterfaceC1380AiA A0W(BFM bfm) {
        return C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
    }

    public static AEs A0Y(InterfaceC08439ui interfaceC08439ui, BOD bod, A6J a6j, Class cls, String str) {
        return BQN.A00(interfaceC08439ui, bod, a6j, str, new C0861A6i(cls));
    }

    public static A6J A0Z(BRk bRk) {
        return bRk != null ? bRk.getDefaultViewModelCreationExtras() : A6K.A00;
    }

    public static ArtifactsDataSource A0a(BFM bfm, AbstractC3358CGz abstractC3358CGz) {
        ArtifactsDataSource companion = ArtifactsDataSource.Companion.getInstance(abstractC3358CGz);
        bfm.Ai0(companion);
        return companion;
    }

    public static AuraNavigator A0b(BFM bfm) {
        return (AuraNavigator) bfm.A6v(AuraNavigatorKt.LocalNavigator);
    }

    public static Object A0d(BFM bfm, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        C1518AkS c1518AkS = new C1518AkS();
        bfm.Ai0(c1518AkS);
        return c1518AkS;
    }

    public static String A0h(HatchConversationViewModel hatchConversationViewModel) {
        return hatchConversationViewModel.composerTextState.A07().toString();
    }

    public static ArrayList A0i(Iterable iterable) {
        return new ArrayList(Hr7.A1D(iterable, 10));
    }

    public static void A0n(BFM bfm, Object obj) {
        BPg.A03(bfm, C1515AkP.A02);
        BPg.A02(bfm, obj, C1515AkP.A05);
    }

    public static void A0o(BFM bfm, Object obj, Object obj2) {
        BPg.A02(bfm, obj, C1515AkP.A04);
        BPg.A02(bfm, obj2, C1515AkP.A06);
    }

    public static void A11(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 12);
        C7384Etj.A0Y(obj2, 13);
    }

    public static void A12(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 15);
        C7384Etj.A0Y(obj2, 16);
    }

    public static void A13(Object obj, G0V g0v, int i) {
        g0v.invoke(obj, Integer.valueOf(i & 14));
    }

    public static boolean A18(int i) {
        return i == 32;
    }

    public static boolean A19(int i) {
        return i == 256;
    }

    public static boolean A1C(int i) {
        return (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
    }

    public static boolean A1D(int i) {
        return (i & 896) == 256;
    }

    public static boolean A1E(int i) {
        return (i & 7168) == 2048;
    }

    public static float A04(Function0 function0) {
        return ((Number) function0.invoke()).floatValue();
    }

    public static int A0A(int i, BFM bfm, int i2) {
        bfm.Afo();
        return (i & 8) != 0 ? i2 & (-7169) : i2;
    }

    public static int A0B(int i, BFM bfm, int i2) {
        bfm.Afo();
        return (i & 4) != 0 ? i2 & (-897) : i2;
    }

    public static int A0C(int i, BFM bfm, int i2) {
        bfm.Afo();
        return (i & 2) != 0 ? i2 & (-113) : i2;
    }

    public static int A0D(int i, BFM bfm, int i2) {
        bfm.Afo();
        return (i & 16) != 0 ? i2 & (-57345) : i2;
    }

    public static InterfaceC1380AiA A0X(BFM bfm, float f, int i) {
        return C06I.A00(AcQ.A00(f), bfm, C2VU.A02, i);
    }

    public static AuraColors A0c(BFM bfm, int i) {
        bfm.AgE(i);
        return (AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors);
    }

    public static String A0g(BFM bfm, Number number, int i) {
        bfm.AgE(i);
        return AbstractC2271BQs.A01(bfm, number.intValue());
    }

    public static List A0j(LazyListState lazyListState) {
        return ((C1161Act) lazyListState.A04()).A0D;
    }

    public static void A0m(BFM bfm, AKJ akj, Object obj, int i) {
        AKT.A01(bfm, akj, B1V.A00(bfm, obj, i), 56);
    }

    public static void A0p(BFM bfm, Object obj, AKJ[] akjArr, int i) {
        AKT.A02(bfm, B1V.A00(bfm, obj, i), akjArr, 48);
    }

    public static void A0s(HatchMetadataKey hatchMetadataKey, C0924AIa c0924AIa, boolean z) {
        c0924AIa.put(hatchMetadataKey.getValue(), String.valueOf(z));
    }

    public static void A15(G0U g0u, G0V g0v, BFM bfm, int i) {
        BPg.A02(bfm, Integer.valueOf(i), g0v);
        BPg.A03(bfm, g0u);
    }

    public static boolean A1G(BFM bfm, AKN akn) {
        return ((Boolean) bfm.A6v(akn)).booleanValue();
    }

    public static boolean A1H(BFM bfm, Enum r2, boolean z) {
        return z | bfm.A63(r2.ordinal());
    }

    public static boolean A1I(BFM bfm, Object obj, float f) {
        return bfm.A65(obj) | bfm.A62(f);
    }

    public static boolean A1J(BFM bfm, Object obj, Object obj2) {
        return bfm.A65(obj) | bfm.A67(obj2);
    }

    public static boolean A1K(BFM bfm, Object obj, Object obj2) {
        return bfm.A65(obj) | bfm.A65(obj2);
    }

    public static boolean A1L(BFM bfm, Object obj, Object obj2) {
        return bfm.A65(obj2) | bfm.A65(obj);
    }

    public static boolean A1M(BFM bfm, Object obj, Object obj2) {
        return bfm.A67(obj) | bfm.A67(obj2);
    }

    public static boolean A1N(BFM bfm, Object obj, Object obj2) {
        return bfm.A67(obj) | bfm.A65(obj2);
    }

    public static boolean A1O(BFM bfm, Object obj, Object obj2, boolean z) {
        return z | bfm.A67(obj) | bfm.A65(obj2);
    }

    public static boolean A1P(BFM bfm, Object obj, Object obj2, boolean z) {
        return z | bfm.A65(obj) | bfm.A65(obj2);
    }

    public static boolean A1Q(BFM bfm, Object obj, boolean z) {
        return bfm.A66(z) | bfm.A67(obj);
    }

    public static boolean A1R(BFM bfm, Object obj, boolean z) {
        return bfm.A67(obj) | bfm.A66(z);
    }

    public static boolean A1S(BFM bfm, Object obj, boolean z) {
        return bfm.A66(z) | bfm.A65(obj);
    }

    public static boolean A1T(BFM bfm, Object obj, boolean z) {
        return bfm.A65(obj) | bfm.A66(z);
    }

    public static boolean A1U(BFM bfm, boolean z, boolean z2, boolean z3) {
        return z2 | bfm.A66(z) | bfm.A66(z3);
    }

    public static boolean A1W(Object obj, BFM bfm, int i) {
        return bfm.A65(obj) | bfm.A63(i);
    }

    public static boolean A1X(Object obj, G0U g0u) {
        return ((Boolean) g0u.invoke(obj)).booleanValue();
    }

    public static boolean A1Y(Function0 function0) {
        return ((Boolean) function0.invoke()).booleanValue();
    }

    public static boolean A1Z(BLG blg) {
        return ((Boolean) blg.getValue()).booleanValue();
    }
}
