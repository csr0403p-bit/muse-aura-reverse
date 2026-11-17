package X;

import android.database.Cursor;
import android.media.MediaCodec;
import android.media.audiofx.DynamicsProcessing;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.media3.common.ParserException;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import com.facebook.aura.accessv2.AuraSourceAppConfig;
import com.facebook.aura.common.prefs.AuraPrefsStorage;
import com.facebook.aura.common.video.HatchVideoPlayerGroot;
import com.facebook.flexiblesampling.DefaultSamplingPolicyConfig_DONOTUSE;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.google.common.base.Strings;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function0;
import org.webrtc.Logging;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* loaded from: classes5.dex */
public abstract class BV7 {
    public static int A04(int i, float f) {
        return (int) Math.ceil(i * f);
    }

    public static int A05(int i, int i2, int i3) {
        if ((i & i2) != 0) {
            return 0;
        }
        return i3;
    }

    public static long A0S(long j, long j2) {
        return (j + j2) - 1;
    }

    public static DynamicsProcessing.Mbc A0a(DynamicsProcessing.Config config) {
        return config.getChannelByChannelIndex(0).getMbc();
    }

    public static ParserException A0c(String str) {
        return new ParserException(str, null, 1, true);
    }

    public static Object A0t(List list) {
        return list.get(list.size() - 1);
    }

    public static void A1A(IBinder iBinder, Parcel parcel, Parcel parcel2, int i) throws RemoteException {
        iBinder.transact(i, parcel, parcel2, 0);
        parcel2.readException();
    }

    public static void A1B(Class cls, Object obj, Map map) {
        Structure.FFIType.storeTypeInfo(cls, 0, (Structure.FFIType) map.get(obj));
    }

    public static void A1O(Object[] objArr) {
        objArr[0].getClass();
        objArr[1].getClass();
    }

    public static boolean A1Q(int i) {
        return i == 1;
    }

    public static boolean A1R(int i) {
        return i <= 0;
    }

    public static boolean A1S(int i, int i2) {
        return i <= i2;
    }

    public static boolean A1T(int i, int i2) {
        return i == i2;
    }

    public static boolean A1U(long j) {
        return ((int) j) != 0;
    }

    public static double A00(double d) {
        return Math.pow(d, 2.0d);
    }

    public static int A02(int i) {
        return i != 0 ? 1231 : 1237;
    }

    public static int A07(Pair pair) {
        return ((Number) pair.second).intValue();
    }

    public static int A08(Pair pair) {
        return ((Number) pair.first).intValue();
    }

    public static int A0C(Object obj) {
        Number number = (Number) obj;
        number.getClass();
        return number.intValue();
    }

    public static int A0I(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static int A0P(Object[] objArr, int i) {
        return ((Integer) objArr[i]).intValue();
    }

    public static long A0T(Pair pair) {
        return ((Number) pair.second).longValue();
    }

    public static long A0U(C5627DmA c5627DmA) {
        return (int) c5627DmA.A07.A0D();
    }

    public static long A0V(Pointer pointer) {
        if (pointer == null) {
            return 0L;
        }
        return pointer.peer;
    }

    public static long A0Z(Object[] objArr, int i) {
        return ((Long) objArr[i]).longValue();
    }

    public static C5998Dth A0d(C5998Dth c5998Dth, Timeline timeline, int i) {
        return timeline.A0E(c5998Dth, i, 0L);
    }

    public static C5382DhZ A0e(C5414DiA c5414DiA, int i) {
        return c5414DiA.A02.get(i);
    }

    public static C4oT A0f(DefaultSamplingPolicyConfig_DONOTUSE defaultSamplingPolicyConfig_DONOTUSE) {
        return defaultSamplingPolicyConfig_DONOTUSE.getSharedPrefs(AuraPrefsStorage.INSTANCE.getFactory());
    }

    public static Dq8 A0g(C5625Dm8 c5625Dm8) {
        return c5625Dm8.A0S.get();
    }

    public static Dq8 A0h(C5625Dm8 c5625Dm8) {
        return c5625Dm8.A0S.get();
    }

    public static C5623Dm6 A0i(C5625Dm8 c5625Dm8) {
        return c5625Dm8.A0U.get();
    }

    public static Long A0o() {
        return 0L;
    }

    public static Object A0q(Object obj, Object obj2) {
        if (obj == C5165Dav.A00) {
            return null;
        }
        return obj2;
    }

    public static Object A0u(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static String A10(StringBuilder sb) {
        sb.append(")");
        return sb.toString();
    }

    public static StringBuilder A12(int i, int i2) {
        return new StringBuilder(i2 + (i * 16));
    }

    public static List A14(CharSequence charSequence, String str) {
        return new C06827l3(str).A05(charSequence);
    }

    public static C6669EOg A15() {
        Object objAMN = EOC.A00.AMN();
        C7384Etj.A0U(objAMN);
        return ((AuraSourceAppConfig) objAMN).getLogger();
    }

    public static C6669EOg A16() {
        Object objAMN = EOB.A00.AMN();
        C7384Etj.A0U(objAMN);
        return ((AuraSourceAppConfig) objAMN).getLogger();
    }

    public static void A19(MediaCodec.BufferInfo bufferInfo, Buffer buffer) {
        buffer.limit(bufferInfo.offset + bufferInfo.size);
    }

    public static void A1K(Throwable th, HtJ htJ) {
        htJ.resumeWith(new C10571Hud(th));
    }

    public static void A1N(boolean z) {
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void A1P(Object[] objArr, int i, int i2) {
        if (i > i2) {
            objArr[i2] = null;
        }
    }

    public static boolean A1W(UserFlowLoggerImpl userFlowLoggerImpl, long j) {
        return userFlowLoggerImpl._ongoingFlows.contains(Long.valueOf(j));
    }

    public static float A01(float f, float f2, float f3) {
        return Math.max(f3, Math.min(f, f2));
    }

    public static int A03(int i) {
        return String.valueOf(i).length();
    }

    public static int A06(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static int A09(Range range) {
        return ((Number) range.getUpper()).intValue();
    }

    public static int A0A(Range range) {
        return ((Number) range.getLower()).intValue();
    }

    public static int A0B(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static int A0D(Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{obj, obj2});
    }

    public static int A0E(Object obj, Object obj2, Object obj3) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3});
    }

    public static int A0F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3, obj4, obj5});
    }

    public static int A0G(Object obj, String str, int i, int i2) {
        return !str.equals(obj) ? i : i2;
    }

    public static int A0H(Object obj, Map map) {
        return ((Number) map.get(obj)).intValue();
    }

    public static int A0J(String str, int i, int i2) {
        return Integer.parseInt(str.substring(i, i2));
    }

    public static int A0K(String str, StringBuilder sb, Object[] objArr, int i) {
        sb.append(str);
        int i2 = i + 1;
        sb.append(objArr[i]);
        return i2;
    }

    public static int A0L(ByteBuffer byteBuffer, int i, int i2) {
        return i2 | ((byteBuffer.get(i) & 255) << 16);
    }

    public static int A0M(ListIterator listIterator) {
        return ((String) listIterator.previous()).length();
    }

    public static int A0N(Map.Entry entry) {
        return ((Number) entry.getKey()).intValue();
    }

    public static int A0O(Matcher matcher, int i) {
        return Integer.parseInt(matcher.group(i));
    }

    public static long A0Q() {
        return Thread.currentThread().getId();
    }

    public static long A0R() {
        return Util.A0A(SystemClock.elapsedRealtime());
    }

    public static long A0W(Object obj) {
        return Structure.FFIType.get(obj).getPointer().peer;
    }

    public static long A0X(RoundingMode roundingMode, long j, long j2) {
        return Util.A0F(roundingMode, j, 1000000L, j2);
    }

    public static long A0Y(Iterator it) {
        return ((Number) it.next()).longValue();
    }

    public static Pair A0b(Object obj, int i) {
        return new Pair(Integer.valueOf(i), obj);
    }

    public static IOException A0j(String str, Object[] objArr) {
        return new IOException(String.format(str, objArr));
    }

    public static IllegalArgumentException A0k(String str, Object[] objArr) {
        return new IllegalArgumentException(Strings.lenientFormat(str, objArr));
    }

    public static IllegalStateException A0l(String str, int i) {
        return new IllegalStateException(FGI.A0H(str, i));
    }

    public static IllegalStateException A0m(String str, Object[] objArr) {
        return new IllegalStateException(Strings.lenientFormat(str, objArr));
    }

    public static Integer A0n(Object obj) {
        return Integer.valueOf(System.identityHashCode(obj));
    }

    public static Long A0p(Number number) {
        return Long.valueOf(number.intValue());
    }

    public static Object A0r(AbstractMap abstractMap, int i) {
        return abstractMap.get(Integer.valueOf(i));
    }

    public static Object A0s(Iterator it) {
        return ((Map.Entry) it.next()).getValue();
    }

    public static String A0v(AbstractC4467Cwj abstractC4467Cwj, DA8 da8) {
        byte[] bArrA04 = da8.A04();
        return abstractC4467Cwj.A00(bArrA04, bArrA04.length);
    }

    public static String A0w(Object obj) {
        return String.valueOf(String.valueOf(obj));
    }

    public static String A0x(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static String A0y(String str) {
        return FGI.A0M(str, WebRtcAudioUtils.getThreadInfo());
    }

    public static String A0z(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String A11(StringBuilder sb) {
        sb.append("}");
        return sb.toString();
    }

    public static Thread A13(Handler handler) {
        return handler.getLooper().getThread();
    }

    public static void A17(int i, String str) {
        CFK.A05(HatchVideoPlayerGroot.TAG, FGI.A08(i, str));
    }

    public static void A18(Cursor cursor, String str, AbstractC6670EOh abstractC6670EOh) {
        cursor.close();
        abstractC6670EOh.logCursorSerializationQplEnd(Integer.parseInt(str));
    }

    public static void A1C(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.getClass());
    }

    public static void A1D(Object obj, AbstractCollection abstractCollection) {
        if (abstractCollection.contains(obj)) {
            return;
        }
        abstractCollection.add(obj);
    }

    public static void A1E(Object obj, List list) {
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static void A1F(String str, String str2, StringBuilder sb) {
        sb.append(str);
        Logging.d(str2, sb.toString());
    }

    public static void A1G(String str, String str2, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void A1H(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        sb.append(str);
    }

    public static void A1I(StringBuilder sb, String str) {
        sb.append(str);
        sb.append('=');
    }

    public static void A1J(StringBuilder sb, String str) {
        sb.append(str);
        sb.append('{');
    }

    public static void A1L(Buffer buffer, int i) {
        buffer.position(buffer.position() + i);
    }

    public static void A1M(Iterator it) {
        ((Function0) it.next()).invoke();
    }

    public static boolean A1V(Looper looper) {
        return looper.getThread().isAlive();
    }

    public static boolean A1X(Object obj, Object obj2, boolean z) {
        if (obj.equals(obj2)) {
            return true;
        }
        return z;
    }

    public static boolean A1Y(Object obj, List list, int i) {
        return obj.equals(list.get(i));
    }

    public static boolean A1Z(String str, String str2) {
        return str2.equals(AbstractC6161Dx4.A05(str));
    }

    public static byte[] A1a(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static Object[] A1b(Throwable th) {
        return new Object[]{th.getMessage()};
    }
}
