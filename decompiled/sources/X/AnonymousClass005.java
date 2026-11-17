package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1;
import com.facebook.aura.conversation.view.HatchMessageBubbleKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.ui.HatchWindowGeometry;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* renamed from: X.005, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass005 {
    public static int A0H(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static ParcelableSnapshotMutableState A0Q() {
        return new ParcelableSnapshotMutableState(AGF.A01(), false);
    }

    public static BRg A0T(BFM bfm, BRg bRg) {
        return AbstractC1103AYp.A02(AbstractC1103AYp.A00(0, bfm, 0, 1), bRg, true);
    }

    public static BRg A0U(BRg bRg, BFM bfm, int i) {
        return HatchMessageBubbleKt.m636bubbleMaxWidthrAjV9yQ(bRg, 0.0f, bfm, (i >> 6) & 14, 1);
    }

    public static BRg A0W(BRg bRg, Object obj) {
        return AbstractC1462AjV.A00(bRg, (G0U) obj, 0L, 64L);
    }

    public static Float A0a() {
        return Float.valueOf(0.0f);
    }

    public static Float A0b(BBI bbi, float f) {
        BBI.A0R(bbi, false);
        return Float.valueOf(f);
    }

    public static NoWhenBranchMatchedException A0k(BFM bfm, int i) {
        bfm.AgE(i);
        BBI.A0R((BBI) bfm, false);
        return new NoWhenBranchMatchedException();
    }

    public static void A0o(BFM bfm, AVy aVy, String str, Function0 function0) {
        AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVy, str, function0, null, false, 0.0f, null, null, null, false, false, bfm, AVy.$stable, 0, 2040);
    }

    public static void A0t(HatchConversationKt$HatchConversation$17$1 hatchConversationKt$HatchConversation$17$1, int i, int i2, int i3) {
        hatchConversationKt$HatchConversation$17$1.L$0 = null;
        hatchConversationKt$HatchConversation$17$1.L$1 = null;
        hatchConversationKt$HatchConversation$17$1.L$2 = null;
        hatchConversationKt$HatchConversation$17$1.L$3 = null;
        hatchConversationKt$HatchConversation$17$1.L$4 = null;
        hatchConversationKt$HatchConversation$17$1.L$5 = null;
        hatchConversationKt$HatchConversation$17$1.L$6 = null;
        hatchConversationKt$HatchConversation$17$1.L$7 = null;
        hatchConversationKt$HatchConversation$17$1.L$8 = null;
        hatchConversationKt$HatchConversation$17$1.L$9 = null;
        hatchConversationKt$HatchConversation$17$1.L$10 = null;
        hatchConversationKt$HatchConversation$17$1.L$11 = null;
        hatchConversationKt$HatchConversation$17$1.L$12 = null;
        hatchConversationKt$HatchConversation$17$1.L$13 = null;
        hatchConversationKt$HatchConversation$17$1.I$0 = i;
        hatchConversationKt$HatchConversation$17$1.I$1 = i2;
        hatchConversationKt$HatchConversation$17$1.I$2 = i3;
    }

    public static void A0u(HatchSectionScope hatchSectionScope, Object obj, int i) {
        hatchSectionScope.item(B1V.A01(obj, i, true));
    }

    public static void A0x(Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 1);
        C7384Etj.A0Y(obj3, 2);
    }

    public static void A0y(Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 1);
        C7384Etj.A0Y(obj3, 3);
    }

    public static void A0z(Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(obj, 5);
        C7384Etj.A0Y(obj2, 6);
        C7384Etj.A0Y(obj3, 7);
    }

    public static void A10(Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 1);
        C7384Etj.A0Y(obj3, 2);
    }

    public static void A14(Object obj, Object obj2, Object obj3, Object obj4) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 1);
        C7384Etj.A0Y(obj3, 2);
        C7384Etj.A0Y(obj4, 3);
    }

    public static void A17(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 1);
        C7384Etj.A0Y(obj3, 2);
        C7384Etj.A0Y(obj4, 3);
        C7384Etj.A0Y(obj5, 4);
    }

    public static boolean A1N(int i, Object obj) {
        C7384Etj.A0Y(obj, 0);
        return (i & 17) != 16;
    }

    public static boolean A1X(BFM bfm, Object obj, Object obj2, boolean z, boolean z2) {
        return z | z2 | bfm.A65(obj) | bfm.A67(obj2);
    }

    public static boolean A1Y(BFM bfm, Object obj, Object obj2, boolean z, boolean z2) {
        return z | z2 | bfm.A67(obj) | bfm.A67(obj2);
    }

    public static boolean A1Z(Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 1);
        C7384Etj.A0Y(obj3, 2);
        return true;
    }

    public static boolean A1a(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return str.startsWith(str2);
    }

    public static int[] A1b() {
        return new int[]{0};
    }

    public static int A01(int i) {
        return (i & 14) | 805306368;
    }

    public static int A03(int i, int i2) {
        return i2 | (29360128 & i) | (i & 234881024);
    }

    public static int A04(int i, int i2) {
        return i2 | (3670016 & i) | (29360128 & i);
    }

    public static int A05(int i, int i2) {
        return i2 | (3670016 & i) | (i & 29360128);
    }

    public static int A06(int i, int i2) {
        return i2 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i);
    }

    public static int A07(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static int A0C(Iterable iterable) {
        int iA0H = AIW.A0H(Hr7.A1D(iterable, 10));
        if (iA0H < 16) {
            return 16;
        }
        return iA0H;
    }

    public static int A0D(Object obj) {
        return ((Number) obj).intValue() & 3;
    }

    public static long A0K(float f, float f2) {
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static long A0L(float f, float f2) {
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static long A0M(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static long A0N(int i) {
        return (0 << 32) | (i & 4294967295L);
    }

    public static C1003AOr A0O() {
        return new C1003AOr(new BL4(1 | (1 << 32)), 1.0f, 400.0f);
    }

    public static BFM A0P(Object obj, Object obj2) {
        BFM bfm = (BFM) obj;
        ((Number) obj2).intValue();
        return bfm;
    }

    public static BRg A0V(BRg bRg, C1423Ais c1423Ais, AVy aVy, ARL arl) {
        return bRg.then(new AYN(C2VU.A09, c1423Ais, aVy, arl, 1.0f));
    }

    public static ApQ A0X(String str) {
        return new ApQ(str, C0881AGi.A00);
    }

    public static A6J A0Y(Object obj) {
        return obj instanceof BRk ? ((BRk) obj).getDefaultViewModelCreationExtras() : A6K.A00;
    }

    public static C7197Ei9 A0Z(C7197Ei9 c7197Ei9) {
        C7196Ei8 c7196Ei8 = new C7196Ei8(c7197Ei9);
        c7196Ei8.A00(InterfaceC8647Fhz.A01);
        return new C7197Ei9(c7196Ei8);
    }

    public static Object A0e(BFM bfm, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        AT5 at5A00 = AT8.A00(0.0f);
        bfm.Ai0(at5A00);
        return at5A00;
    }

    public static Object A0g(BFM bfm, Object obj, Object obj2, boolean z) {
        if (obj != obj2) {
            return obj;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGF.A01(), Boolean.valueOf(z));
        bfm.Ai0(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static void A0p(BFM bfm, Object obj, Object obj2, Object obj3, int i) {
        BPg.A02(bfm, obj, C1515AkP.A04);
        BPg.A02(bfm, obj2, C1515AkP.A06);
        BPg.A02(bfm, Integer.valueOf(i), C1515AkP.A03);
        BPg.A03(bfm, C1515AkP.A02);
        BPg.A02(bfm, obj3, C1515AkP.A05);
    }

    public static void A0q(BBI bbi, Object obj, G0V g0v, int i) {
        g0v.invoke(obj, Integer.valueOf(i & 14));
        BBI.A0R(bbi, true);
    }

    public static void A0r(AT3 at3, float f, long j) {
        ART.A03(null, at3, f, 118, j, 0L, 0L);
    }

    public static void A0w(Object obj) {
        ((Number) obj).intValue();
    }

    public static void A15(Object obj, Object obj2, Object obj3, Object obj4) {
        C7384Etj.A0Y(obj, 17);
        C7384Etj.A0Y(obj2, 18);
        C7384Etj.A0Y(obj3, 19);
        C7384Etj.A0Y(obj4, 20);
    }

    public static void A18(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C7384Etj.A0Y(obj, 10);
        C7384Etj.A0Y(obj2, 11);
        C7384Etj.A0Y(obj3, 12);
        C7384Etj.A0Y(obj4, 13);
        C7384Etj.A0Y(obj5, 14);
    }

    public static void A19(F2X f2x) {
        ((AuraNavigator) f2x.receiver).back();
    }

    public static boolean A1B(int i) {
        return (3670016 & i) == 1048576;
    }

    public static boolean A1C(int i) {
        return (i & 3670016) == 1048576;
    }

    public static boolean A1F(int i) {
        return (i & 234881024) == 67108864;
    }

    public static boolean A1J(int i) {
        return (29360128 & i) == 8388608;
    }

    public static boolean A1K(int i) {
        return (i & 29360128) == 8388608;
    }

    public static boolean A1O(int i, boolean z) {
        if ((i & 4) != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1P(int i, boolean z) {
        if ((i & 8) != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1Q(int i, boolean z) {
        if ((i & 16) != 0) {
            return false;
        }
        return z;
    }

    public static float A00(BFM bfm, AKN akn, AXN axn) {
        return axn.Agy(((HatchWindowGeometry) bfm.A6v(akn)).getNavigationBarBottomPx());
    }

    public static int A02(int i, float f) {
        return (i + Float.floatToIntBits(f)) * 31;
    }

    public static int A08(BFM bfm, Enum r2) {
        return bfm.A63(r2.ordinal()) ? 4 : 2;
    }

    public static int A09(BFM bfm, Enum r2) {
        return bfm.A63(r2.ordinal()) ? 32 : 16;
    }

    public static int A0A(BFM bfm, Enum r2) {
        return bfm.A63(r2.ordinal()) ? 256 : 128;
    }

    public static int A0B(BFM bfm, Enum r1, int i) {
        bfm.AgE(i);
        return r1.ordinal();
    }

    public static int A0E(Object obj) {
        return obj.hashCode() * 31;
    }

    public static int A0F(Object obj, int i) {
        return (i + obj.hashCode()) * 31;
    }

    public static int A0G(Object obj, int i) {
        return i + obj.hashCode();
    }

    public static int A0I(String str, int i) {
        return (i + str.hashCode()) * 31;
    }

    public static long A0J(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static ParcelableSnapshotMutableState A0R(BFM bfm, boolean z) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGF.A01(), Boolean.valueOf(z));
        bfm.Ai0(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static ParcelableSnapshotMutableState A0S(BFM bfm, boolean z) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGF.A01(), Boolean.valueOf(z));
        bfm.Ai0(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static IllegalArgumentException A0c(int i) {
        return new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
    }

    public static Object A0d(BFM bfm) {
        Object objAaT = bfm.AaT();
        if (objAaT != C78N.A00) {
            return objAaT;
        }
        C1qN c1qN = new C1qN();
        bfm.Ai0(c1qN);
        return c1qN;
    }

    public static Object A0f(BFM bfm, Object obj, Object obj2) {
        Object objAaT = bfm.AaT();
        if (objAaT != obj) {
            return objAaT;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGF.A01(), obj2);
        bfm.Ai0(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static Object A0h(BFM bfm, Object obj, boolean z) {
        Object objAaT = bfm.AaT();
        if (objAaT != obj) {
            return objAaT;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGF.A01(), Boolean.valueOf(z));
        bfm.Ai0(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static String A0i(BFM bfm) {
        return AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120704);
    }

    public static String A0j(Iterator it) {
        return (String) it.next();
    }

    public static void A0l(int i, G0U g0u) {
        g0u.invoke(Integer.valueOf(i));
    }

    public static void A0m(long j, StringBuilder sb) {
        sb.append((Object) B6A.A07(j));
    }

    public static void A0n(BFM bfm, BBI bbi, Function0 function0) {
        bfm.AgI();
        if (bbi.A0M) {
            bfm.A7w(function0);
        } else {
            bfm.AiE();
        }
    }

    public static void A0s(C1731ApS c1731ApS, String str, int i, int i2) {
        c1731ApS.A0E(str.substring(i, i2));
    }

    public static void A0v(Enum r0, int[] iArr, int i) {
        iArr[r0.ordinal()] = i;
    }

    public static void A11(Object obj, Object obj2, Object obj3, int i) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 2);
        C7384Etj.A0Y(obj3, 3);
    }

    public static void A12(Object obj, Object obj2, Object obj3, int i) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 3);
        C7384Etj.A0Y(obj3, 4);
    }

    public static void A13(Object obj, Object obj2, Object obj3, int i) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 7);
        C7384Etj.A0Y(obj3, 8);
    }

    public static void A16(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 3);
        C7384Etj.A0Y(obj3, 4);
        C7384Etj.A0Y(obj4, 5);
    }

    public static boolean A1A(int i) {
        return (74899 & i) != 74898;
    }

    public static boolean A1D(int i) {
        return (4793491 & i) != 4793490;
    }

    public static boolean A1E(int i) {
        return (i & 4793491) != 4793490;
    }

    public static boolean A1G(int i) {
        return (i & 38347923) != 38347922;
    }

    public static boolean A1H(int i) {
        return (i & 599187) != 599186;
    }

    public static boolean A1I(int i) {
        return (i & 306783379) != 306783378;
    }

    public static boolean A1L(int i) {
        return (57344 & i) == 16384;
    }

    public static boolean A1M(int i) {
        return (i & 57344) == 16384;
    }

    public static boolean A1R(BFM bfm, Object obj, Object obj2, Object obj3) {
        return bfm.A65(obj) | bfm.A65(obj2) | bfm.A65(obj3);
    }

    public static boolean A1S(BFM bfm, Object obj, Object obj2, Object obj3) {
        return bfm.A67(obj) | bfm.A67(obj2) | bfm.A67(obj3);
    }

    public static boolean A1T(BFM bfm, Object obj, Object obj2, Object obj3, boolean z) {
        return z | bfm.A65(obj) | bfm.A65(obj2) | bfm.A65(obj3);
    }

    public static boolean A1U(BFM bfm, Object obj, Object obj2, Object obj3, boolean z) {
        return z | bfm.A65(obj) | bfm.A67(obj2) | bfm.A65(obj3);
    }

    public static boolean A1V(BFM bfm, Object obj, Object obj2, Object obj3, boolean z) {
        return z | bfm.A67(obj) | bfm.A67(obj2) | bfm.A67(obj3);
    }

    public static boolean A1W(BFM bfm, Object obj, Object obj2, Object obj3, boolean z) {
        return z | bfm.A67(obj) | bfm.A65(obj2) | bfm.A65(obj3);
    }
}
