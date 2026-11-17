package X;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.header.view.HatchStatusPillMetricsKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.aura.vds.compose.theme.AuraModeOverriderKt;
import com.facebook.aura.vds.compose.theme.AuraShapes;
import com.facebook.aura.vds.compose.theme.AuraShapesKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.002, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass002 {
    public static int A05(int i) {
        return i != 0 ? 4 : 2;
    }

    public static int A0B(Object obj, int i) {
        C7384Etj.A0Y(obj, 0);
        return i & 6;
    }

    public static int A0E(List list) {
        C7384Etj.A0Y(list, 0);
        return list.size() - 1;
    }

    public static long A0F() {
        return Float.floatToRawIntBits(0.0f);
    }

    public static ASj A0J(C28s c28s, int i) {
        return new ASj(c28s, i, 0);
    }

    public static BBI A0M(BFM bfm, int i) {
        bfm.AgE(i);
        BBI bbi = (BBI) bfm;
        BBI.A0R(bbi, false);
        return bbi;
    }

    public static BBb A0Q(BFM bfm, Object obj) {
        BBI.A0R((BBI) obj, false);
        return bfm.AAc();
    }

    public static C1419Aio A0S(long j) {
        return new C1419Aio(j, 5);
    }

    public static InterfaceC1380AiA A0U(BFM bfm) {
        return C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
    }

    public static Object A0i(AT5 at5, AOc aOc, Object obj, HtJ htJ, G0U g0u) {
        return AT5.A00(at5, aOc, obj, at5.A03(), htJ, g0u);
    }

    public static void A0x(BFM bfm, AuraThemeMode auraThemeMode, G0V g0v, int i) {
        AuraModeOverriderKt.AuraModeOverrider(auraThemeMode, null, g0v, bfm, i, 2);
    }

    public static void A0y(BBI bbi) {
        BBI.A0R(bbi, true);
        BBI.A0R(bbi, true);
    }

    public static void A11(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A04(interfaceC0857A6e);
    }

    public static void A12(HatchConversationKt$HatchConversation$17$1 hatchConversationKt$HatchConversation$17$1, int i, int i2, boolean z) {
        hatchConversationKt$HatchConversation$17$1.I$4 = i;
        hatchConversationKt$HatchConversation$17$1.I$5 = 0;
        hatchConversationKt$HatchConversation$17$1.Z$0 = z;
        hatchConversationKt$HatchConversation$17$1.I$6 = i2;
    }

    public static boolean A1L(int i) {
        return i != 0;
    }

    public static boolean A1M(int i) {
        return i == 0;
    }

    public static boolean A1N(int i) {
        return i > 0;
    }

    public static boolean A1O(int i) {
        return i == 4;
    }

    public static boolean A1P(int i, int i2) {
        return i != i2;
    }

    public static boolean A1Q(int i, int i2) {
        return i == i2;
    }

    public static boolean A1S(BFM bfm, int i, boolean z, boolean z2) {
        return z | z2 | bfm.A63(i);
    }

    public static boolean A1T(BFM bfm, long j, boolean z, boolean z2) {
        return z | z2 | bfm.A64(j);
    }

    public static boolean A1V(BFM bfm, Object obj, boolean z, boolean z2) {
        return z | z2 | bfm.A67(obj);
    }

    public static boolean A1W(BFM bfm, Object obj, boolean z, boolean z2) {
        return z | z2 | bfm.A65(obj);
    }

    public static boolean A1X(Object obj) {
        return obj != null;
    }

    public static boolean A1Y(Object obj) {
        return obj == null;
    }

    public static boolean A1Z(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static boolean A1a(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 1);
        return true;
    }

    public static int A00(int i) {
        return i != 0 ? 2048 : 1024;
    }

    public static int A01(int i) {
        return i != 0 ? 1048576 : 524288;
    }

    public static int A02(int i) {
        return i != 0 ? 131072 : 65536;
    }

    public static int A03(int i) {
        return i != 0 ? 67108864 : 33554432;
    }

    public static int A04(int i) {
        return i != 0 ? 16384 : 8192;
    }

    public static int A06(int i) {
        return i != 0 ? 32 : 16;
    }

    public static int A07(int i, int i2) {
        return i2 | (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i & 896);
    }

    public static int A08(int i, int i2) {
        return i2 | (i & 896) | (i & 7168);
    }

    public static int A0A(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static Context A0H(BFM bfm) {
        return (Context) bfm.A6v(AndroidCompositionLocals_androidKt.A01);
    }

    public static BBP A0K(BFM bfm, ATF atf, Function0 function0) {
        BBP bbp = new BBP(atf, function0);
        bfm.Ai0(bbp);
        return bbp;
    }

    public static MutableState A0N(BFM bfm, Object obj, Object[] objArr) {
        return (MutableState) AFz.A03(bfm, (Function0) obj, objArr);
    }

    public static ParcelableSnapshotMutableIntState A0O(BFM bfm, int i) {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = new ParcelableSnapshotMutableIntState(i);
        bfm.Ai0(parcelableSnapshotMutableIntState);
        return parcelableSnapshotMutableIntState;
    }

    public static C0dx A0T(BFM bfm) {
        return (C0dx) bfm.A6v(Am0.A08);
    }

    public static InterfaceC1380AiA A0V(BFM bfm, C3TH c3th) {
        return C06I.A00(AcQ.A06, bfm, c3th, 48);
    }

    public static InterfaceC1380AiA A0W(BFM bfm, C1AC c1ac) {
        return C0A8.A00(AcQ.A01, bfm, c1ac, 48);
    }

    public static AXN A0Y(BFM bfm) {
        return (AXN) bfm.A6v(Am0.A04);
    }

    public static HatchConversationUiState A0Z(HatchConversationViewModel hatchConversationViewModel) {
        return hatchConversationViewModel._uiState.getValue();
    }

    public static HatchStatusPillMetrics A0a(BFM bfm) {
        return (HatchStatusPillMetrics) bfm.A6v(HatchStatusPillMetricsKt.LocalHatchStatusPillMetrics);
    }

    public static AuraNavigator A0b(BFM bfm) {
        return (AuraNavigator) bfm.A6v(AuraNavigatorKt.LocalNavigator);
    }

    public static AuraColors A0c(BFM bfm) {
        return (AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors);
    }

    public static AuraDimensions A0d(BFM bfm) {
        return (AuraDimensions) bfm.A6v(AuraDimensionsKt.LocalAuraDimensions);
    }

    public static AuraShapes A0e(BFM bfm) {
        return (AuraShapes) bfm.A6v(AuraShapesKt.LocalAuraShapes);
    }

    public static AuraTypography A0f(BFM bfm) {
        return (AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography);
    }

    public static AbstractC3358CGz A0g(BFM bfm) {
        return (AbstractC3358CGz) bfm.A6v(LocalUserSessionKt.LocalUserSession);
    }

    public static AbstractC3358CGz A0h(BFM bfm) {
        return (AbstractC3358CGz) bfm.A6v(LocalUserSessionKt.LocalUserSession);
    }

    public static ArrayList A0m(Iterable iterable) {
        return new ArrayList(Hr7.A1D(iterable, 10));
    }

    public static void A19(Object obj) {
        BBI.A0R((BBI) obj, false);
    }

    public static void A1I(Object obj, Object obj2) {
        C9286GCn.A00(null, obj2, (C9286GCn) obj);
    }

    public static void A1J(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new HxE(obj, obj2));
    }

    public static void A1K(HoC hoC) {
        if (hoC != null) {
            hoC.A5w(null);
        }
    }

    public static boolean A1R(int i, boolean z) {
        if ((i & 32) != 0) {
            return false;
        }
        return z;
    }

    public static int A0C(Object obj, Object obj2, int i) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 2);
        return 2;
    }

    public static int A0D(Object obj, Object obj2, int i) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 4);
        return 4;
    }

    public static AT5 A0I(BFM bfm, float f) {
        AT5 at5A00 = AT8.A00(f);
        bfm.Ai0(at5A00);
        return at5A00;
    }

    public static AGN A0L(Function0 function0) {
        return new AGN(AGF.A01(), function0);
    }

    public static ParcelableSnapshotMutableState A0P(Object obj) {
        return new ParcelableSnapshotMutableState(AGF.A01(), obj);
    }

    public static BRg A0R(BRg bRg, BFM bfm, int i) {
        bfm.AgE(i);
        return bRg.then(C10G.A01);
    }

    public static InterfaceC1134Abi A0X(AXY axy, G0U g0u, int i, int i2) {
        return axy.APV(AGH.A0E(), g0u, i, i2);
    }

    public static Object A0j(Object obj) {
        Hwg.A00(obj);
        return ((HsJ) obj).value;
    }

    public static String A0k() {
        return UUID.randomUUID().toString();
    }

    public static String A0l(CharSequence charSequence) {
        return C7BY.A0F(charSequence).toString();
    }

    public static Iterator A0n(Map map) {
        return map.entrySet().iterator();
    }

    public static Map A0o(Boolean bool, String str, boolean z) {
        return HatchInteractionEnumsKt.chatThreadLogMetadata(z, str, bool, AGH.A0E());
    }

    public static HxE A0p(Object obj, int i) {
        return new HxE(obj, Integer.valueOf(i));
    }

    public static HxE A0q(Object obj, boolean z) {
        return new HxE(obj, Boolean.valueOf(z));
    }

    public static HtJ A0r(HtJ htJ, AbstractC8884Fsp abstractC8884Fsp, boolean z) {
        return abstractC8884Fsp.create(Boolean.valueOf(z), htJ);
    }

    public static C78T A0s(Object obj) {
        Hwg.A00(obj);
        return AuraDispatchers.INSTANCE.io();
    }

    public static G0V A0t(BFM bfm, Object obj, Object obj2, G0V g0v) {
        BPg.A02(bfm, obj, g0v);
        G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
        BPg.A02(bfm, obj2, g0v2);
        return g0v2;
    }

    public static G0V A0u(BFM bfm, Object obj, G0U g0u) {
        BPg.A03(bfm, g0u);
        G0V<InterfaceC1516AkQ, BRg, Unit> g0v = C1515AkP.A05;
        BPg.A02(bfm, obj, g0v);
        return g0v;
    }

    public static C9286GCn A0v(boolean z) {
        return new C9286GCn(Boolean.valueOf(z));
    }

    public static void A0w(BFM bfm, int i) {
        BPg.A02(bfm, Integer.valueOf(i), C1515AkP.A03);
    }

    public static void A0z(BBI bbi, boolean z, boolean z2) {
        BBI.A0R(bbi, z);
        BBI.A0R(bbi, z2);
        BBI.A0R(bbi, z);
    }

    public static void A10(BBI bbi, boolean z, boolean z2) {
        BBI.A0R(bbi, z);
        BBI.A0R(bbi, z2);
        BBI.A0R(bbi, z2);
    }

    public static void A13(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 1;
    }

    public static void A14(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 2;
    }

    public static void A15(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 3;
    }

    public static void A16(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 4;
    }

    public static void A17(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 5;
    }

    public static void A18(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 6;
    }

    public static void A1A(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 2);
    }

    public static void A1B(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 3);
    }

    public static void A1C(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 4);
    }

    public static void A1D(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 5);
    }

    public static void A1E(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 6);
    }

    public static void A1F(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 9);
    }

    public static void A1G(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 11);
    }

    public static void A1H(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 14);
    }

    public static boolean A1U(BFM bfm, Enum r2) {
        return bfm.A63(r2.ordinal());
    }

    public static boolean A1b(Object obj, boolean z) {
        return Boolean.valueOf(z).equals(obj);
    }

    public static int A09(long j) {
        return (int) (j & 4294967295L);
    }

    public static long A0G(long j, long j2) {
        return (j & 4294967295L) | j2;
    }
}
