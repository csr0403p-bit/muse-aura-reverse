package X;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.conversation.view.HatchMessageSelectionMoreOptionsMenuKt;
import com.facebook.aura.conversation.view.HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$1$1;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchShareSheetUiState;
import com.facebook.aura.sharesheet.HatchShareSheetViewModel;
import com.facebook.aura.skills.repo.ConnectorCatalogCache;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraDrawables;
import com.facebook.aura.vds.compose.theme.AuraDrawablesKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.006, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass006 {
    public static float A00(int i) {
        return i != 0 ? 1.0f : 0.0f;
    }

    public static int A04(int i, int i2, int i3) {
        return i | i2 | ((i3 << 15) & 3670016);
    }

    public static int A0E(Object obj, int i) {
        C7384Etj.A0Y(obj, 0);
        return i & 14;
    }

    public static BRg A0M(BFM bfm) {
        return AbstractC1103AYp.A02(AbstractC1103AYp.A00(0, bfm, 0, 1), C10G.A01, true);
    }

    public static B6A A0P(BBI bbi, long j) {
        BBI.A0R(bbi, false);
        return new B6A(j);
    }

    public static HatchInteractionLogger A0b(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return HatchInteractionLogger.INSTANCE;
    }

    public static AuraLabelButtonStyle A0g(BFM bfm) {
        return AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
    }

    public static AuraLabelButtonStyle A0h(BFM bfm) {
        return AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
    }

    public static Object A0o(Object obj, AbstractC7349EnM abstractC7349EnM) {
        C7384Etj.A0Y(obj, 0);
        return abstractC7349EnM.receiver;
    }

    public static HtJ A13(HoC hoC) {
        if (hoC == null) {
            return null;
        }
        hoC.A5w(null);
        return null;
    }

    public static void A14(Context context, int i) {
        Toast.makeText(context, i, 0).show();
    }

    public static void A16(BFM bfm, Object obj, Object obj2, int i) {
        C7bA.A05(bfm, null, obj2, (G0U) obj, i, 2);
    }

    public static void A17(BFM bfm, String str, long j) {
        AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16378);
    }

    public static void A18(AYU ayu, AZE aze, int i) {
        ayu.A0A(aze, 0.0f, 0, i - aze.A00);
    }

    public static void A19(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A03(interfaceC0857A6e);
    }

    public static void A1C(ContentItem contentItem, AuraNavigator auraNavigator) {
        ContentViewerDataHolderKt.navigateToContentViewer(auraNavigator, AGI.A0E(contentItem), 0, false, false, null, false);
    }

    public static void A1E(HatchSectionScope hatchSectionScope, Object obj, int i) {
        hatchSectionScope.item(B1V.A01(obj, i, true));
    }

    public static void A1N(Object obj) {
        BBI bbi = (BBI) obj;
        BBI.A0R(bbi, false);
        BBI.A0R(bbi, false);
    }

    public static void A1Q(Object obj, G0V g0v) {
        g0v.invoke(obj, 6);
    }

    public static boolean A1V(int i) {
        return (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
    }

    public static boolean A1W(int i) {
        return (i & 896) == 256;
    }

    public static boolean A1X(int i) {
        return (i & 7168) == 2048;
    }

    public static boolean A1Y(int i, int i2) {
        return (i & i2) == 1048576;
    }

    public static boolean A1Z(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static boolean A1b(String str, String str2) {
        return str2.regionMatches(true, 0, str, 0, str.length());
    }

    public static int A02(int i) {
        return (i & 3670016) | 196608;
    }

    public static int A03(int i) {
        return (i & 3670016) | 12583302;
    }

    public static int A05(long j, int i) {
        return i + ((int) (j ^ (j >>> 32)));
    }

    public static int A06(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A07(BFM bfm, Object obj) {
        return !bfm.A67(obj) ? 1024 : 2048;
    }

    public static int A08(BFM bfm, Object obj) {
        return !bfm.A67(obj) ? 8192 : 16384;
    }

    public static int A09(AZE aze) {
        if (aze != null) {
            return aze.A00;
        }
        return 0;
    }

    public static int A0A(AZE aze) {
        if (aze != null) {
            return aze.A00;
        }
        return 0;
    }

    public static int A0B(AZE aze) {
        if (aze != null) {
            return aze.A01;
        }
        return 0;
    }

    public static int A0C(AZE aze) {
        if (aze != null) {
            return aze.A01;
        }
        return 0;
    }

    public static int A0D(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int A0G(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static long A0I(BFM bfm) {
        return ((B6A) bfm.A6v(C1AZ.A00)).A00;
    }

    public static C04921Xv A0J(BFM bfm) {
        return (C04921Xv) bfm.A6v(AbstractC04931Xw.A00);
    }

    public static MutableState A0K(BFM bfm, Object obj, Object[] objArr) {
        return (MutableState) AFz.A03(bfm, (Function0) obj, objArr);
    }

    public static BRg A0L(C90m c90m, BRg bRg) {
        return c90m.AiP(bRg, 1.0f, true);
    }

    public static BRg A0N(BRg bRg) {
        return C10G.A0A(bRg, 58.0f, Float.NaN);
    }

    public static BRg A0O(BRg bRg) {
        return C10G.A09(bRg, Float.NaN, 48.0f);
    }

    public static InterfaceC1380AiA A0Q(InterfaceC04981Yd interfaceC04981Yd, BFM bfm) {
        return C0A8.A00(interfaceC04981Yd, bfm, C2VU.A05, 6);
    }

    public static InterfaceC1380AiA A0R(BFM bfm) {
        return C06I.A00(AcQ.A02, bfm, C2VU.A00, 54);
    }

    public static C1731ApS A0W() {
        return new C1731ApS(16);
    }

    public static C1731ApS A0X(String str) {
        C1731ApS c1731ApS = new C1731ApS(16);
        c1731ApS.A0E(str);
        return c1731ApS;
    }

    public static C1251Afj A0a() {
        return new C1251Afj(0L);
    }

    public static ConfidentialVmSwitchUiState A0c(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel) {
        return confidentialVmSwitchViewModel._uiState.getValue();
    }

    public static EmailState A0d(EmailViewModel emailViewModel) {
        return emailViewModel._state.getValue();
    }

    public static HatchShareSheetUiState A0e(HatchShareSheetViewModel hatchShareSheetViewModel) {
        return hatchShareSheetViewModel._uiState.getValue();
    }

    public static ConnectorCatalogCache.State A0f(ConnectorCatalogCache connectorCatalogCache) {
        return connectorCatalogCache.state.getValue();
    }

    public static Object A0m(Object obj) {
        return obj == EnumC10460Hji.A02 ? obj : new HsJ(obj);
    }

    public static String A0r(int i, String str) {
        if ((i & 1) != 0) {
            return null;
        }
        return str;
    }

    public static String A0s(int i, String str) {
        if ((i & 2) != 0) {
            return null;
        }
        return str;
    }

    public static String A0t(int i, String str) {
        if ((i & 4) != 0) {
            return null;
        }
        return str;
    }

    public static String A0u(int i, String str) {
        if ((i & 8) != 0) {
            return null;
        }
        return str;
    }

    public static String A0v(BFM bfm, int i) {
        return AbstractC2271BQs.A02(bfm, new Object[]{HatchAppName.value}, i);
    }

    public static String A0z(StringBuilder sb) {
        sb.append(')');
        return sb.toString();
    }

    public static Map A10(Object obj, Object obj2) {
        return AIW.A0J(new HxE(obj, obj2));
    }

    public static Map A11(Object obj, Object obj2, Map map) {
        return AGH.A0C(map, new HxE(obj, obj2));
    }

    public static void A1A(HatchComponent hatchComponent, HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$1$1 hatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$1$1) {
        HatchMessageSelectionMoreOptionsMenuKt.logSelectionMenuClick(hatchComponent, HatchSubsurface.RESPONSE_TOOLBAR, hatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$1$1.$threadLogMetadata, AGH.A0E());
    }

    public static void A1D(AuraNavigator auraNavigator) {
        ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
        auraNavigator.popToTabRoot(conversationTabScreenKey);
        auraNavigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
    }

    public static void A1M(Object obj) {
        BBI bbi = (BBI) obj;
        BBI.A0R(bbi, false);
        BBI.A0R(bbi, false);
    }

    public static void A1T(G0U g0u, long j) {
        g0u.invoke(new AWx(j));
    }

    public static float A01(C1Z3 c1z3) {
        return AbstractC1414Aij.A04(c1z3).A0E.ALr();
    }

    public static int A0F(Object obj, Object obj2, G0V g0v) {
        return ((Number) g0v.invoke(obj, obj2)).intValue();
    }

    public static long A0H(C04921Xv c04921Xv, Integer num) {
        long jA00 = AbstractC04931Xw.A00(c04921Xv, num);
        return HxS.A04(HDi.A0O[(int) (jA00 & 63)], B6A.A03(jA00), B6A.A02(jA00), B6A.A01(jA00), 0.38f);
    }

    public static InterfaceC1380AiA A0S(BFM bfm, float f, int i) {
        return C0A8.A00(AcQ.A00(f), bfm, C2VU.A05, i);
    }

    public static InterfaceC1380AiA A0T(BFM bfm, C3TH c3th, float f) {
        return C06I.A00(AcQ.A00(f), bfm, c3th, 54);
    }

    public static InterfaceC1380AiA A0U(BFM bfm, C3TH c3th, float f, int i) {
        return C06I.A00(AcQ.A00(f), bfm, c3th, i);
    }

    public static InterfaceC1380AiA A0V(BFM bfm, C1AC c1ac, float f) {
        return C0A8.A00(AcQ.A00(f), bfm, c1ac, 54);
    }

    public static ApQ A0Y(BFM bfm, int i) {
        return new ApQ(AbstractC2271BQs.A01(bfm, i), C0881AGi.A00);
    }

    public static ApQ A0Z(BFM bfm, List list, int i) {
        return new ApQ(AbstractC2271BQs.A01(bfm, i), (List<? extends C1733ApU<? extends C1OS>>) list);
    }

    public static AuraColors A0i(BFM bfm, AKN akn, int i) {
        bfm.AgE(i);
        return (AuraColors) bfm.A6v(akn);
    }

    public static AuraDrawables A0j(BFM bfm, int i) {
        bfm.AgE(i);
        return (AuraDrawables) bfm.A6v(AuraDrawablesKt.LocalAuraDrawables);
    }

    public static AuraTypography A0k(BFM bfm, int i) {
        bfm.AgE(i);
        return (AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography);
    }

    public static Object A0l(BRr bRr, HtJ htJ, G0V g0v) {
        Object objA01 = ForEachGestureKt.A01(bRr, htJ, g0v);
        return objA01 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA01;
    }

    public static Object A0n(Object obj, List list, G0V g0v, int i) {
        return g0v.invoke(obj, list.get(i));
    }

    public static Object A0p(List list, G0U g0u, int i) {
        return g0u.invoke(list.get(i));
    }

    public static String A0q(char c) {
        return String.valueOf(c).toUpperCase(Locale.ROOT);
    }

    public static String A0w(BFM bfm, Object obj, Object obj2, int i) {
        return AbstractC2271BQs.A02(bfm, new Object[]{obj, obj2}, i);
    }

    public static String A0x(Enum r1) {
        return r1.name().toLowerCase(Locale.ROOT);
    }

    public static String A0y(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static HxE A12(HatchMetadataKey hatchMetadataKey, Object obj) {
        return new HxE(hatchMetadataKey.getValue(), obj);
    }

    public static void A15(BFM bfm, AKJ akj, Object obj, int i) {
        AKT.A01(bfm, akj, B1V.A00(bfm, obj, i), 48);
    }

    public static void A1B(HatchMetadataKey hatchMetadataKey, C0924AIa c0924AIa, int i) {
        c0924AIa.put(hatchMetadataKey.getValue(), String.valueOf(i));
    }

    public static void A1F(CharSequence charSequence, Object obj, AbstractCollection abstractCollection) {
        if (C7BY.A0j(charSequence)) {
            return;
        }
        abstractCollection.add(obj);
    }

    public static void A1G(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 7;
    }

    public static void A1H(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 8;
    }

    public static void A1I(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 9;
    }

    public static void A1J(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 10;
    }

    public static void A1K(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 11;
    }

    public static void A1L(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 12;
    }

    public static void A1O(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        if (C7384Etj.areEqual(obj, obj2)) {
            return;
        }
        abstractCollection.add(obj3);
    }

    public static void A1P(Object obj, Object obj2, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (abstractCollection.add(obj)) {
            abstractCollection2.add(obj2);
        }
    }

    public static void A1R(AbstractMap abstractMap, Map.Entry entry) {
        abstractMap.put(entry.getKey(), entry.getValue());
    }

    public static void A1S(Iterator it) {
        ((C1299Agk) it.next()).A02();
    }

    public static void A1U(G0V g0v, BFM bfm, int i) {
        Integer numValueOf = Integer.valueOf(i);
        bfm.Ai0(numValueOf);
        bfm.A4P(numValueOf, g0v);
    }

    public static boolean A1a(Object obj, BLG blg) {
        return ((Set) blg.getValue()).contains(obj);
    }
}
