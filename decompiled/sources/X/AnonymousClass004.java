package X;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* renamed from: X.004, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass004 {
    public static boolean A1O(int i, int i2) {
        return (i & i2) == 536870912;
    }

    public static boolean A1R(BFM bfm, Object obj, int i, int i2) {
        return (i & i2) == 0 ? bfm.A65(obj) : bfm.A67(obj);
    }

    public static boolean A1b(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, 1);
        return false;
    }

    public static int A01(int i, int i2) {
        return i2 | (234881024 & i) | (i & 1879048192);
    }

    public static ComponentActivity A0y(BFM bfm) {
        Object objA6v = bfm.A6v(AKL.A00);
        C7384Etj.A0Z(objA6v, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        return (ComponentActivity) objA6v;
    }

    public static C3TQ A10(C3TQ c3tq, int i) {
        return i != 0 ? new C1DP(0.0f, 0.0f, 0.0f, 0.0f) : c3tq;
    }

    public static AEs A14(InterfaceC08439ui interfaceC08439ui, BOD bod, A6J a6j, Class cls) {
        return BQN.A00(interfaceC08439ui, bod, a6j, null, new C0861A6i(cls));
    }

    public static Object A15(BFM bfm, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        C3UX c3uxA00 = C78e.A00(bfm, C6ys.A00);
        bfm.Ai0(c3uxA00);
        return c3uxA00;
    }

    public static Object A16(BFM bfm, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        C1qN c1qN = new C1qN();
        bfm.Ai0(c1qN);
        return c1qN;
    }

    public static List A17(B6A b6a, long j) {
        return Arrays.asList(b6a, new B6A(j));
    }

    public static Set A18() {
        return Collections.singleton(new Integer(200));
    }

    public static void A1C(BBI bbi, Object obj, G0V g0v, int i, boolean z) {
        g0v.invoke(obj, Integer.valueOf(i & 14));
        BBI.A0R(bbi, z);
    }

    public static boolean A1E(int i) {
        return (i & 3) != 2;
    }

    public static boolean A1F(int i) {
        return (i & 14) == 4;
    }

    public static boolean A1G(int i) {
        return (i & 17) != 16;
    }

    public static boolean A1H(int i) {
        return (i & 19) != 18;
    }

    public static boolean A1I(int i) {
        return (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
    }

    public static boolean A1J(int i) {
        return (i & 147) != 146;
    }

    public static boolean A1K(int i) {
        return (i & 896) == 256;
    }

    public static boolean A1L(int i) {
        return (i & 1171) != 1170;
    }

    public static boolean A1M(int i) {
        return (i & 7168) == 2048;
    }

    public static boolean A1N(int i) {
        return (i & 9363) != 9362;
    }

    public static boolean A1X(Object obj, BFM bfm, int i) {
        return (i & 8) == 0 ? bfm.A65(obj) : bfm.A67(obj);
    }

    public static boolean A1Y(Object obj, BFM bfm, int i) {
        return (i & 64) == 0 ? bfm.A65(obj) : bfm.A67(obj);
    }

    public static boolean A1Z(Object obj, BFM bfm, int i) {
        return (i & 512) == 0 ? bfm.A65(obj) : bfm.A67(obj);
    }

    public static boolean A1a(Object obj, BFM bfm, int i) {
        return (i & 4096) == 0 ? bfm.A65(obj) : bfm.A67(obj);
    }

    public static int A02(int i, int i2) {
        return i2 | (57344 & i) | (458752 & i);
    }

    public static int A03(int i, int i2) {
        return i2 | (57344 & i) | (i & 458752);
    }

    public static int A04(BFM bfm, float f) {
        return bfm.A62(f) ? 4 : 2;
    }

    public static int A05(BFM bfm, float f) {
        return bfm.A62(f) ? 32 : 16;
    }

    public static int A06(BFM bfm, float f) {
        return bfm.A62(f) ? 256 : 128;
    }

    public static int A07(BFM bfm, float f) {
        return bfm.A62(f) ? 2048 : 1024;
    }

    public static int A08(BFM bfm, float f) {
        return bfm.A62(f) ? 16384 : 8192;
    }

    public static int A09(BFM bfm, float f) {
        return bfm.A62(f) ? 131072 : 65536;
    }

    public static int A0A(BFM bfm, float f) {
        return bfm.A62(f) ? 1048576 : 524288;
    }

    public static int A0B(BFM bfm, float f) {
        return bfm.A62(f) ? 8388608 : 4194304;
    }

    public static int A0C(BFM bfm, float f) {
        return bfm.A62(f) ? 536870912 : 268435456;
    }

    public static int A0D(BFM bfm, int i) {
        return bfm.A63(i) ? 4 : 2;
    }

    public static int A0E(BFM bfm, int i) {
        return bfm.A63(i) ? 32 : 16;
    }

    public static int A0F(BFM bfm, int i) {
        return bfm.A63(i) ? 256 : 128;
    }

    public static int A0G(BFM bfm, int i) {
        return bfm.A63(i) ? 16384 : 8192;
    }

    public static int A0H(BFM bfm, int i) {
        return bfm.A63(i) ? 131072 : 65536;
    }

    public static int A0I(BFM bfm, int i) {
        return bfm.A63(i) ? 1048576 : 524288;
    }

    public static int A0J(BFM bfm, int i) {
        return bfm.A63(i) ? 8388608 : 4194304;
    }

    public static int A0K(BFM bfm, int i) {
        return bfm.A63(i) ? 67108864 : 33554432;
    }

    public static int A0L(BFM bfm, int i) {
        return bfm.A63(i) ? 536870912 : 268435456;
    }

    public static int A0M(BFM bfm, long j) {
        return bfm.A64(j) ? 4 : 2;
    }

    public static int A0N(BFM bfm, long j) {
        return bfm.A64(j) ? 32 : 16;
    }

    public static int A0O(BFM bfm, long j) {
        return bfm.A64(j) ? 256 : 128;
    }

    public static int A0P(BFM bfm, long j) {
        return bfm.A64(j) ? 2048 : 1024;
    }

    public static int A0Q(BFM bfm, long j) {
        return bfm.A64(j) ? 16384 : 8192;
    }

    public static int A0R(BFM bfm, long j) {
        return bfm.A64(j) ? 131072 : 65536;
    }

    public static int A0S(BFM bfm, long j) {
        return bfm.A64(j) ? 8388608 : 4194304;
    }

    public static int A0T(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 4 : 2;
    }

    public static int A0U(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 32 : 16;
    }

    public static int A0V(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 256 : 128;
    }

    public static int A0W(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 2048 : 1024;
    }

    public static int A0X(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 16384 : 8192;
    }

    public static int A0Y(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 131072 : 65536;
    }

    public static int A0Z(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 1048576 : 524288;
    }

    public static int A0a(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 8388608 : 4194304;
    }

    public static int A0b(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 67108864 : 33554432;
    }

    public static int A0c(BFM bfm, Object obj) {
        return bfm.A67(obj) ? 536870912 : 268435456;
    }

    public static int A0d(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 4 : 2;
    }

    public static int A0e(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 32 : 16;
    }

    public static int A0f(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 256 : 128;
    }

    public static int A0g(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 2048 : 1024;
    }

    public static int A0h(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 16384 : 8192;
    }

    public static int A0i(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 131072 : 65536;
    }

    public static int A0j(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 1048576 : 524288;
    }

    public static int A0k(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 8388608 : 4194304;
    }

    public static int A0l(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 67108864 : 33554432;
    }

    public static int A0m(BFM bfm, Object obj) {
        return bfm.A65(obj) ? 536870912 : 268435456;
    }

    public static int A0n(BFM bfm, boolean z) {
        return bfm.A66(z) ? 4 : 2;
    }

    public static int A0o(BFM bfm, boolean z) {
        return bfm.A66(z) ? 32 : 16;
    }

    public static int A0p(BFM bfm, boolean z) {
        return bfm.A66(z) ? 256 : 128;
    }

    public static int A0q(BFM bfm, boolean z) {
        return bfm.A66(z) ? 2048 : 1024;
    }

    public static int A0r(BFM bfm, boolean z) {
        return bfm.A66(z) ? 16384 : 8192;
    }

    public static int A0s(BFM bfm, boolean z) {
        return bfm.A66(z) ? 131072 : 65536;
    }

    public static int A0t(BFM bfm, boolean z) {
        return bfm.A66(z) ? 1048576 : 524288;
    }

    public static int A0u(BFM bfm, boolean z) {
        return bfm.A66(z) ? 8388608 : 4194304;
    }

    public static int A0v(BFM bfm, boolean z) {
        return bfm.A66(z) ? 67108864 : 33554432;
    }

    public static int A0w(BFM bfm, boolean z) {
        return bfm.A66(z) ? 536870912 : 268435456;
    }

    public static long A0x(long j, int i, int i2) {
        return Constraints.A05(i, i2, Constraints.A02(j), Constraints.A00(j));
    }

    public static AOI A0z(BFM bfm, boolean z) {
        AOI aoi = new AOI(Boolean.valueOf(z));
        bfm.Ai0(aoi);
        return aoi;
    }

    public static ParcelableSnapshotMutableState A11(BFM bfm, Object obj) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGF.A01(), obj);
        bfm.Ai0(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static ParcelableSnapshotMutableState A12(BFM bfm, Object obj) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGF.A01(), obj);
        bfm.Ai0(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static InterfaceC1380AiA A13(BFM bfm, float f) {
        return C06I.A00(AcQ.A00(f), bfm, C2VU.A02, 6);
    }

    public static G0V A19(BFM bfm, Object obj, G0V g0v, int i) {
        BPg.A02(bfm, obj, g0v);
        Integer numValueOf = Integer.valueOf(i);
        G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
        BPg.A02(bfm, numValueOf, g0v2);
        return g0v2;
    }

    public static void A1A(BFM bfm, int i) {
        bfm.AgE(i);
        BBI.A0R((BBI) bfm, false);
    }

    public static void A1B(BBI bbi, Object obj, Object obj2, G0W g0w, int i) {
        g0w.invoke(obj, obj2, Integer.valueOf(i));
        BBI.A0R(bbi, true);
    }

    public static void A1D(boolean z, Object obj) {
        C9286GCn.A00(null, Boolean.valueOf(z), (C9286GCn) obj);
    }

    public static boolean A1P(BFM bfm, int i) {
        bfm.AgE(i);
        BBI.A0R((BBI) bfm, false);
        return false;
    }

    public static boolean A1Q(BFM bfm, int i, int i2) {
        bfm.AgG(i);
        return i2 != 0;
    }

    public static boolean A1S(BFM bfm, Object obj, Object obj2, boolean z) {
        return z | bfm.A65(obj) | bfm.A67(obj2);
    }

    public static boolean A1T(BFM bfm, Object obj, Object obj2, boolean z) {
        return z | bfm.A67(obj) | bfm.A67(obj2);
    }

    public static boolean A1U(BFM bfm, Object obj, boolean z, boolean z2) {
        return z | bfm.A65(obj) | bfm.A66(z2);
    }

    public static boolean A1V(BFM bfm, Object obj, boolean z, boolean z2) {
        return z2 | bfm.A66(z) | bfm.A67(obj);
    }

    public static boolean A1W(BFM bfm, Object obj, boolean z, boolean z2) {
        return z2 | bfm.A66(z) | bfm.A65(obj);
    }

    public static float A00(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
