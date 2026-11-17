package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.text.Layout;
import android.widget.EdgeEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import com.facebook.aura.components.reactions.AuraReactionAnimation;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEffect;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderFormState;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderTransition;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import com.facebook.aura.status.viewmodel.HatchPillState;
import com.facebook.aura.status.viewmodel.HatchStatusPillUiState;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8j3, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8j3 {
    public static float A00(float f, float f2) {
        return (f - f2) / 2.0f;
    }

    public static float A01(float f, float f2) {
        return Math.abs(f - f2);
    }

    public static float A02(float f, float f2, float f3) {
        return f2 + ((f - f2) * f3);
    }

    public static float A03(float f, float f2, float f3, float f4) {
        return (f * f2) + (f3 * f4);
    }

    public static float A04(float f, float f2, float f3, float f4, float f5) {
        return f3 + (f * f2) + (f4 * f5);
    }

    public static float A05(long j) {
        return Float.intBitsToFloat((int) j);
    }

    public static int A08(float f) {
        return (int) Math.ceil(f);
    }

    public static int A0E(int i, int i2) {
        return ((i - i2) ^ (-1)) >>> 31;
    }

    public static int A0F(int i, int i2, int i3) {
        return Math.min(i3, i - i2);
    }

    public static long A0T(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static long A0X(long[] jArr, int i) {
        int i2 = i - 1;
        jArr[i2] = (jArr[i2] & 72057594037927935L) | (-72057594037927936L);
        jArr[i] = jArr[0];
        return 72057594037927935L;
    }

    public static LocaleList A0a(List list) {
        Locale[] localeArr = (Locale[]) list.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public static ANU A0b() {
        return ANR.A00(AbstractC1011APs.A03(0.0f, 3), AbstractC1011APs.A0E(C1003AOr.A00(null)));
    }

    public static ANU A0c(AOe aOe) {
        return ANR.A00(AbstractC1011APs.A04(aOe, 0.0f), AbstractC1011APs.A0E(aOe));
    }

    public static HatchStatusPillUiState A0r(AvatarMedia avatarMedia, HatchPillState hatchPillState, String str, int i) {
        return new HatchStatusPillUiState(hatchPillState, Integer.valueOf(i), null, null, str, avatarMedia, null);
    }

    public static Object A10(AtomicReference atomicReference) {
        return atomicReference.getAndSet(null);
    }

    public static C9sU A1G(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return HatchJsonKt.HatchJson;
    }

    public static void A1H(InterfaceC1068ATy interfaceC1068ATy, AT3 at3, long j) {
        at3.A9d(null, interfaceC1068ATy, C16a.A00, 1.0f, 3, j);
    }

    public static void A1L(byte[] bArr) {
        Arrays.fill(bArr, 0, bArr.length, (byte) 0);
    }

    public static void A1N(long[] jArr) {
        Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
    }

    public static boolean A1Q(int i) {
        return i >= 0;
    }

    public static boolean A1R(int i) {
        return i < 0;
    }

    public static boolean A1S(int i) {
        return i != 0;
    }

    public static boolean A1T(int i, int i2) {
        return i < i2;
    }

    public static Object[] A1Z(Collection collection, Object[] objArr) {
        C7384Etj.A0Y(objArr, 0);
        return AbstractC0905AHh.A01(collection, objArr);
    }

    public static HxE[] A1b(List list) {
        return (HxE[]) list.toArray(new HxE[0]);
    }

    public static int A09(int i) {
        return ((i >> 3) & 14) | 48;
    }

    public static int A0A(int i) {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static int A0B(int i) {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        if (i != 0) {
            return (i * 2) + 1;
        }
        return 6;
    }

    public static int A0C(int i) {
        if (i <= 0) {
            return 0;
        }
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        return Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
    }

    public static int A0D(int i) {
        int i2 = (i ^ (i >>> 16)) * (-862048943);
        return i2 ^ (i2 >>> 16);
    }

    public static int A0G(long j) {
        return (int) (j >> 32);
    }

    public static int A0I(ApQ apQ) {
        return apQ.A00.length();
    }

    public static long A0M() {
        return 0 << 32;
    }

    public static long A0N() {
        return 1 | (1 << 32);
    }

    public static long A0O(float f) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        return (jFloatToRawIntBits & 4294967295L) | (jFloatToRawIntBits << 32);
    }

    public static long A0Q(float f, float f2) {
        return (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f2));
    }

    public static long A0R(int i, int i2) {
        return (i << 32) | (i2 & 4294967295L);
    }

    public static long A0S(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static long A0U(long j) {
        long j2 = j << 32;
        long j3 = B6A.A01;
        return j2;
    }

    public static long A0W(long[] jArr, int i) {
        return (jArr[i >> 3] >> ((i & 7) << 3)) & 255;
    }

    public static long A0Y(long[] jArr, int i, int i2, long j) {
        long j2 = j | (254 << i);
        jArr[i2] = j2;
        return j2;
    }

    public static AaC A0f(float f, float f2, float f3, float f4) {
        return new AaC(f, f2, f3, f4);
    }

    public static InterfaceC1074AXb A0g(Object obj, Object obj2) {
        InterfaceC1074AXb interfaceC1074AXb = (InterfaceC1074AXb) obj;
        Hwg.A00(obj2);
        return interfaceC1074AXb;
    }

    public static Au3 A0j(long j) {
        return new Au3(j);
    }

    public static C1DG A0k(float f) {
        return new C1DG(f);
    }

    public static C2ae A0l(long j) {
        return new C2ae(j);
    }

    public static AuraReactionAnimation A0n(String str, int i) {
        return new AuraReactionAnimation(str, i);
    }

    public static HatchLinkOrderTransition A0p(HatchLinkOrderFormState hatchLinkOrderFormState, HatchLinkOrderEffect hatchLinkOrderEffect) {
        return new HatchLinkOrderTransition(hatchLinkOrderFormState, hatchLinkOrderEffect);
    }

    public static Float A0t() {
        return Float.valueOf(1.0f);
    }

    public static Float A0u(float f) {
        return new Float(f);
    }

    public static IllegalArgumentException A0x(StringBuilder sb) {
        sb.append('.');
        return new IllegalArgumentException(sb.toString());
    }

    public static Object A11(Object[] objArr, int i, int i2) {
        return objArr[(i << 3) + i2];
    }

    public static String A12(Object obj) {
        return C0861A6i.A01(((C0861A6i) obj).A00);
    }

    public static String A13(Object obj) {
        String str = (String) obj;
        C7384Etj.A0Y(str, 0);
        return str;
    }

    public static String A15(StringBuilder sb) {
        sb.append('}');
        return sb.toString();
    }

    public static UnsupportedOperationException A17() {
        return new UnsupportedOperationException();
    }

    public static UnsupportedOperationException A18(String str) {
        return new UnsupportedOperationException(str);
    }

    public static NoSuchElementException A1D() {
        return new NoSuchElementException();
    }

    public static HtJ A1E(Object obj, Object obj2, AbstractC8884Fsp abstractC8884Fsp) {
        return abstractC8884Fsp.create(obj2, (HtJ) obj);
    }

    public static G0U A1F(Snapshot snapshot) {
        if (snapshot != null) {
            return snapshot.A0D();
        }
        return null;
    }

    public static void A1I(Integer num, G0V g0v, C3UX c3ux) {
        GAo.A02(num, C6ys.A00, g0v, c3ux);
    }

    public static void A1J(Object obj, Object obj2) {
        ((C1qN) obj).A00.AhV(obj2);
    }

    public static void A1K(StringBuilder sb) {
        sb.append(", ");
    }

    public static void A1M(float[] fArr, float f, int i) {
        fArr[i] = fArr[i] * f;
    }

    public static void A1O(long[] jArr, int i) {
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & ((-1) ^ j)) | j;
    }

    public static void A1P(long[] jArr, int i, int i2, long j) {
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public static boolean A1X(Object obj, Object[] objArr, int i) {
        return C7384Etj.areEqual(obj, objArr[i]);
    }

    public static long[] A1Y(int i) {
        if (i == 0) {
            return AbstractC0977AKq.A01;
        }
        int i2 = ((i + 15) & (-8)) >> 3;
        long[] jArr = new long[i2];
        Arrays.fill(jArr, 0, i2, -9187201950435737472L);
        return jArr;
    }

    public static float A06(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    public static float A07(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    public static int A0H(Layout layout) {
        return layout.getText().length();
    }

    public static int A0J(String str, int i) {
        C7384Etj.A0Y(str, i);
        return str.length();
    }

    public static int A0K(AbstractCollection abstractCollection) {
        return abstractCollection.size() - 1;
    }

    public static int A0L(List list, int i) {
        return i + list.size();
    }

    public static long A0P(float f) {
        return Float.floatToRawIntBits(f);
    }

    public static Configuration A0Z(Context context) {
        return context.getResources().getConfiguration();
    }

    public static C0997AOa A0d(MutableState mutableState) {
        return (C0997AOa) mutableState.getValue();
    }

    public static BRg A0e(BRg bRg, BRg bRg2, BRg bRg3) {
        return bRg.then(bRg2).then(bRg3);
    }

    public static C1299Agk A0h(List list, int i) {
        return (C1299Agk) list.get(i);
    }

    public static C1960Auz A0i(List list, int i) {
        return (C1960Auz) list.get(i);
    }

    public static EnumC10573Huf A0m(C1HY c1hy) {
        return ((C5303Dfm) c1hy.getLifecycle()).A01;
    }

    public static HatchLinkOrderFormState A0o(C1BO c1bo) {
        return (HatchLinkOrderFormState) c1bo.getValue();
    }

    public static VoiceSettingsListViewModel.UiState A0q(C1BO c1bo) {
        return (VoiceSettingsListViewModel.UiState) c1bo.getValue();
    }

    public static Float A0s() {
        return Float.valueOf(0.9f);
    }

    public static IllegalArgumentException A0v(String str, String str2, int i, int i2) {
        return new IllegalArgumentException(FGI.A0T(str, str2, i, i2));
    }

    public static IllegalArgumentException A0w(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalArgumentException(sb.toString());
    }

    public static IndexOutOfBoundsException A0y(String str, String str2, int i, int i2) {
        return new IndexOutOfBoundsException(FGI.A0T(str, str2, i, i2));
    }

    public static Object A0z(BFM bfm, Object obj, boolean z) {
        Object objAaT = bfm.AaT();
        if (objAaT != obj) {
            return objAaT;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGE.A00, Boolean.valueOf(z));
        BBI.A0O((BBI) bfm, parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static String A14(Object obj, StringBuilder sb) {
        sb.append(obj);
        return sb.toString();
    }

    public static String A16(StringBuilder sb, char c) {
        sb.append(c);
        return sb.toString();
    }

    public static ArrayList A19(AbstractCollection abstractCollection) {
        return new ArrayList(abstractCollection.size());
    }

    public static ArrayList A1A(C9jH c9jH) {
        return new ArrayList(c9jH.size());
    }

    public static Iterator A1B(C9jH c9jH) {
        return c9jH.entrySet().iterator();
    }

    public static List A1C(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    public static boolean A1U(EdgeEffect edgeEffect) {
        return !edgeEffect.isFinished();
    }

    public static boolean A1V(BFM bfm, Object obj, boolean z) {
        return bfm.A65(obj) | z;
    }

    public static boolean A1W(Object obj, Object obj2, boolean z) {
        if (C7384Etj.areEqual(obj, obj2)) {
            return true;
        }
        return z;
    }

    public static Object[] A1a(Object[] objArr, int i) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i);
        C7384Etj.A0U(objArrCopyOf);
        return objArrCopyOf;
    }

    public static long A0V(long j, long j2) {
        return j2 | (j & 4294967295L);
    }
}
