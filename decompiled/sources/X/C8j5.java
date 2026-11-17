package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.components.reactions.AuraReactionMotionKt;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$disableOperatorSsh$1;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$enableOperatorSsh$1;
import com.facebook.aura.devices.pairing.HatchDevicePairingMachineState;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewState;
import com.facebook.aura.gateway.HatchColdCvmLeaseKt;
import com.facebook.aura.linktext.HatchClauseRun;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer;
import com.facebook.aura.sharesheet.TextElement;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;
import com.facebook.aura.status.viewmodel.BuyCreditsError;
import com.facebook.aura.subscription.repo.DisclaimerRun;
import com.facebook.aura.vds.font.api.AuraAppTypeface;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.8j5, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8j5 {
    public static int A08(List list, float f, int i, int i2, int i3) {
        return Math.round(i * f) + i2 + ((list.size() - 1) * i3);
    }

    public static C0910AHm A0K(C0910AHm c0910AHm) {
        return c0910AHm == null ? new C0910AHm(0, new AbstractC1439Aj8[16]) : c0910AHm;
    }

    public static AaC A0M(float[] fArr, int i, int i2) {
        int i3 = (i - i2) * 4;
        return new AaC(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]);
    }

    public static HatchDevicePairingMachineState A0P(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingViewState hatchDevicePairingViewState) {
        return hatchDevicePairingMachineState.copy(hatchDevicePairingViewState, hatchDevicePairingMachineState.pendingLinkAction, hatchDevicePairingMachineState.linkOtaRepairState, hatchDevicePairingMachineState.setUpAgainAddress, hatchDevicePairingMachineState.autoSelectsSetUpAgain);
    }

    public static AuraBuyCreditsViewModel.UiState A0R(AuraBuyCreditsViewModel.UiState uiState, BuyCreditsError buyCreditsError, AHD ahd, boolean z) {
        return uiState.copy(z, ahd, buyCreditsError, uiState.isPurchasing, uiState.checkoutNotice, uiState.disclaimer, uiState.nameCollection, uiState.ctaLabel);
    }

    public static void A0h(ConfidentialVmRepository$disableOperatorSsh$1 confidentialVmRepository$disableOperatorSsh$1) {
        confidentialVmRepository$disableOperatorSsh$1.L$7 = null;
        confidentialVmRepository$disableOperatorSsh$1.L$8 = null;
        confidentialVmRepository$disableOperatorSsh$1.L$9 = null;
        confidentialVmRepository$disableOperatorSsh$1.L$10 = null;
        confidentialVmRepository$disableOperatorSsh$1.L$11 = null;
        confidentialVmRepository$disableOperatorSsh$1.L$12 = null;
        confidentialVmRepository$disableOperatorSsh$1.L$13 = null;
        confidentialVmRepository$disableOperatorSsh$1.L$14 = null;
        confidentialVmRepository$disableOperatorSsh$1.L$15 = null;
    }

    public static void A0i(ConfidentialVmRepository$enableOperatorSsh$1 confidentialVmRepository$enableOperatorSsh$1) {
        confidentialVmRepository$enableOperatorSsh$1.L$7 = null;
        confidentialVmRepository$enableOperatorSsh$1.L$8 = null;
        confidentialVmRepository$enableOperatorSsh$1.L$9 = null;
        confidentialVmRepository$enableOperatorSsh$1.L$10 = null;
        confidentialVmRepository$enableOperatorSsh$1.L$11 = null;
        confidentialVmRepository$enableOperatorSsh$1.L$12 = null;
        confidentialVmRepository$enableOperatorSsh$1.L$13 = null;
        confidentialVmRepository$enableOperatorSsh$1.L$14 = null;
        confidentialVmRepository$enableOperatorSsh$1.L$15 = null;
    }

    public static void A0k(VoicePreviewPlayer.C133572 c133572, Object obj, Object obj2, int i) {
        c133572.L$2 = null;
        c133572.L$3 = null;
        c133572.L$4 = null;
        c133572.L$5 = obj;
        c133572.L$6 = obj2;
        c133572.L$7 = null;
        c133572.label = i;
    }

    public static void A0r(AtomicReference atomicReference) {
        HoC hoC = (HoC) atomicReference.getAndSet(null);
        if (hoC != null) {
            hoC.A5w(null);
        }
    }

    public static float A01(float f, float f2) {
        return (f / 2.0f) * (1.0f + ((0.4f - 1.0f) * f2));
    }

    public static float A02(int i, float f) {
        return i < 0 ? 4.0f * f * f * f : 1.0f - (((float) Math.pow((f * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
    }

    public static int A05(int i, long[] jArr) {
        return (int) ((jArr[i] >> 31) & 2147483647L);
    }

    public static int A06(long j) {
        int i = (int) (j ^ (j >>> 32));
        int i2 = (i ^ (i >>> 16)) * (-862048943);
        return i2 ^ (i2 >>> 16);
    }

    public static int A07(long j, int i) {
        return i != 0 ? C2ae.A00(j) : (int) (j >> 32);
    }

    public static long A09(float f, float f2) {
        return (4294967295L & Float.floatToRawIntBits(f2)) | (Float.floatToRawIntBits(f) << 32);
    }

    public static long A0A(long j) {
        return (((-1) ^ j) << 7) & j;
    }

    public static long A0B(long j) {
        return (((-1) ^ j) + (j >>> 7)) & (-72340172838076674L);
    }

    public static long A0C(long j) {
        return j & (((-1) ^ j) << 7) & (-9187201950435737472L);
    }

    public static long A0D(long j, long j2) {
        return ((j / 4) * 3) + (j2 / 4);
    }

    public static long A0E(long j, Object obj, Object obj2) {
        return obj == obj2 ? j >> 32 : j & 4294967295L;
    }

    public static long A0F(long j, Object obj, Object obj2) {
        return obj == obj2 ? j & 4294967295L : j >> 32;
    }

    public static long A0H(long[] jArr, int i) {
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        return ((jArr[i2 + 1] << (64 - i3)) & ((-i3) >> 63)) | (jArr[i2] >>> i3);
    }

    public static long A0I(long[] jArr, int i, int i2, long j) {
        return ((jArr[i + 1] << (64 - i2)) & ((-i2) >> 63)) | j;
    }

    public static Typeface A0J(Context context) {
        Typeface typefaceA00 = CMG.A00(context, AuraAppTypeface.INSTANCE.getOptimisticAi());
        return typefaceA00 == null ? Typeface.DEFAULT : typefaceA00;
    }

    public static AMi A0L(SnapshotStateList snapshotStateList) {
        return (AMi) BDh.A08((AMi) snapshotStateList.A00);
    }

    public static C1822Arm A0N() {
        long jA03 = C19U.A03(17);
        long jA032 = C19U.A03(22);
        long j = B6A.A01;
        C1822Arm c1822Arm = C1822Arm.A03;
        return new C1822Arm(null, null, C1736ApY.A04, 0, 0, 4278190599L << 32, jA03, C1809ArT.A01, B6A.A07, jA032);
    }

    public static TextElement A0Q(CharSequence charSequence) {
        Typeface typeface = Typeface.DEFAULT;
        C7384Etj.A0V(typeface);
        return new TextElement(charSequence, 46.0f, typeface, Integer.MAX_VALUE);
    }

    public static String A0V(Object obj, StringBuilder sb) {
        sb.append(")@");
        sb.append(obj.hashCode());
        return sb.toString();
    }

    public static Cipher A0e(byte[] bArr, byte[] bArr2, int i) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i, new SecretKeySpec(bArr, ConfidentialVmPinVerifierCrypto.AES), new GCMParameterSpec(128, bArr2));
        return cipher;
    }

    public static void A0j(HatchColdCvmLeaseKt.C120591 c120591, Object obj, Object obj2, Object obj3, boolean z) {
        c120591.L$1 = obj;
        c120591.L$2 = obj2;
        c120591.L$3 = obj3;
        c120591.L$4 = null;
        c120591.Z$0 = z;
    }

    public static void A0l(Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(obj, 24);
        C7384Etj.A0Y(obj2, 25);
        C7384Etj.A0Y(obj3, 26);
    }

    public static Object[] A0t(Object obj, int i, int i2) {
        Object[] objArr = new Object[i - 1];
        System.arraycopy(obj, 0, objArr, 0, i2);
        int i3 = i2 + 1;
        System.arraycopy(obj, i3, objArr, i2, i - i3);
        return objArr;
    }

    public static double A00() {
        return System.currentTimeMillis() / 1000.0d;
    }

    public static int A04(float f, int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return Math.round(Math.max(i - i2, 0) / f);
    }

    public static long A0G(List list, int i) {
        return ((B6A) list.get(i % list.size())).A00;
    }

    public static A7O A0S(Iterator it) {
        A7O a7o = (A7O) it.next();
        C7384Etj.A0Y(a7o, 0);
        return a7o;
    }

    public static Integer A0T(Iterator it) {
        return Integer.valueOf(((List) it.next()).size());
    }

    public static Object A0U(BFM bfm, BBI bbi, Object obj, boolean z) {
        Object objAaT = bfm.AaT();
        if (objAaT != obj) {
            return objAaT;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGE.A00, Boolean.valueOf(z));
        BBI.A0O(bbi, parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static String A0W(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public static String A0X(StringBuilder sb, int i) {
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public static Calendar A0Y(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i / 60);
        calendar.set(12, i % 60);
        return calendar;
    }

    public static List A0Z(Float f, float f2) {
        return Arrays.asList(f, Float.valueOf(f2), f);
    }

    public static List A0a(Float f, Float f2, float f3) {
        return Arrays.asList(f, f2, Float.valueOf(f3));
    }

    public static List A0b(Float f, Float f2, float f3) {
        return Arrays.asList(f, f2, Float.valueOf(f3), f);
    }

    public static List A0c(Float f, Float f2, Float f3, float f4) {
        return Arrays.asList(f, f2, f3, Float.valueOf(f4), f);
    }

    public static List A0d(Float f, Float f2, Float f3, float f4) {
        return Arrays.asList(f, f2, Float.valueOf(f4), f3);
    }

    public static void A0f(Canvas canvas, Paint paint, RectF rectF, float f) {
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.save();
        Path path = new Path();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
    }

    public static void A0g(C2av c2av, List list, float f) {
        float fKeyframe = AuraReactionMotionKt.keyframe(list, AuraReactionMotionKt.easeOut(f));
        c2av.AeX(fKeyframe);
        c2av.AeY(fKeyframe);
    }

    public static void A0m(Object obj, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append(", sessionId=");
        sb.append(str2);
        sb.append(", hostMessageId=");
        sb.append(str3);
    }

    public static void A0n(String str, AbstractCollection abstractCollection, int i) {
        if (i < str.length()) {
            abstractCollection.add(new AuraInline.Text(str.substring(i)));
        }
    }

    public static void A0o(StringBuilder sb, Object obj) {
        sb.append(new C0861A6i(obj.getClass()));
    }

    public static void A0p(AbstractCollection abstractCollection, Iterator it) {
        DisclaimerRun disclaimerRun = (DisclaimerRun) it.next();
        abstractCollection.add(new HatchClauseRun(disclaimerRun.text, disclaimerRun.token));
    }

    public static void A0q(AbstractCollection abstractCollection, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        abstractCollection.add(new HxE(entry.getKey(), entry.getValue()));
    }

    public static boolean A0s(InterfaceC0900AHc interfaceC0900AHc, Snapshot snapshot, BDs bDs, AN8 an8, int i) {
        return AMg.A02(interfaceC0900AHc, (AMi) BDh.A02(snapshot, bDs, an8), i, true);
    }

    public static float A03(long j) {
        return Float.intBitsToFloat((int) (4294967295L & j));
    }

    public static C1822Arm A0O(C1736ApY c1736ApY, long j, long j2) {
        long j3 = B6A.A01;
        C1822Arm c1822Arm = C1822Arm.A03;
        return new C1822Arm(null, null, c1736ApY, 0, 0, 4279308562L << 32, j, C1809ArT.A01, B6A.A07, j2);
    }
}
