package X;

import android.graphics.Bitmap;
import android.hardware.camera2.CaptureResult;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.media3.common.ParserException;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import com.crossapp.tigonhttp.noise.TigonNoiseGatewayCarrier;
import com.facebook.aura.assist.recognition.ForwardingRecognitionService;
import com.facebook.common.dextricks.Mlog;
import com.google.common.collect.ImmutableMap;
import com.google.firebase.encoders.EncodingException;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.text.NumberFormat;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class BV6 {
    public static float A01(FDW fdw, float f, int i) {
        return Hus.A00(fdw.A0F(i), 0.0f, f);
    }

    public static long A0G(double d, double d2) {
        return Math.round(d * d2);
    }

    public static long A0H(int i) {
        return i * 1000;
    }

    public static long A0J(long j, long j2) {
        return Math.abs(j - j2);
    }

    public static ParserException A0V(String str, Throwable th) {
        return new ParserException(str, th, 1, true);
    }

    public static Object A0m(AbstractList abstractList) {
        return abstractList.get(0);
    }

    public static void A0x(int i, byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) (i | i2);
    }

    public static void A13(C5625Dm8 c5625Dm8, String str) {
        C5625Dm8.A0A(c5625Dm8, str, new Object[0]);
    }

    public static void A14(C5625Dm8 c5625Dm8, String str, Throwable th) {
        C5625Dm8.A09(c5625Dm8, str, th, new Object[0]);
    }

    public static void A1F(String str) {
        Mlog.w(str, new Object[0]);
    }

    public static void A1G(String str) {
        Mlog.v(str, new Object[0]);
    }

    public static void A1T(int[] iArr) {
        iArr[0] = 1;
    }

    public static double A00(Object obj) {
        return ((Number) obj).doubleValue();
    }

    public static int A03(long j) {
        return (int) (j >>> 32);
    }

    public static int A07(Object obj) {
        return ((Integer) obj).intValue();
    }

    public static int A0B(String str) {
        return str.lastIndexOf(46);
    }

    public static int A0D(byte[] bArr, int i) {
        return (bArr[i] & 255) << 8;
    }

    public static int A0F(String[] strArr, int i) {
        return Integer.parseInt(strArr[i]);
    }

    public static long A0I(long j) {
        return j / 2;
    }

    public static long A0K(byte[] bArr, int i) {
        return bArr[i] & 255;
    }

    public static long A0L(String[] strArr, int i) {
        return (long) Double.parseDouble(strArr[i]);
    }

    public static Bundle A0N() {
        return new Bundle();
    }

    public static Size A0P(int i, int i2) {
        return new Size(i, i2);
    }

    public static GetCredentialUnknownException A0T(CharSequence charSequence) {
        return new GetCredentialUnknownException("android.credentials.GetCredentialException.TYPE_UNKNOWN", charSequence);
    }

    public static C6154Dwx A0U(C6162Dx5 c6162Dx5) {
        return new C6154Dwx(c6162Dx5);
    }

    public static AudioProcessor$UnhandledAudioFormatException A0W(EAL eal) {
        return new AudioProcessor$UnhandledAudioFormatException(eal, "Unhandled input format:");
    }

    public static E1P A0X() {
        return new E1P();
    }

    public static E1P A0Y(int i) {
        E1P e1p = new E1P();
        e1p.A02 = new byte[i];
        e1p.A00 = i;
        return e1p;
    }

    public static E1P A0Z(byte[] bArr) {
        E1P e1p = new E1P();
        e1p.A02 = bArr;
        e1p.A00 = bArr.length;
        return e1p;
    }

    public static EncodingException A0e() {
        return new EncodingException("Field has no @Protobuf config");
    }

    public static AssertionError A0f() {
        return new AssertionError();
    }

    public static IndexOutOfBoundsException A0g(String str) {
        return new IndexOutOfBoundsException(str);
    }

    public static NullPointerException A0h() {
        return new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static NumberFormatException A0k(String str) {
        return new NumberFormatException(str);
    }

    public static Object A0n(Object[] objArr, int i) {
        Object obj = objArr[i];
        obj.getClass();
        return obj;
    }

    public static String A0q(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static String A0r(String[] strArr, int i) {
        return strArr[i].trim();
    }

    public static UnsupportedOperationException A0s(Pointer.Opaque opaque) {
        return new UnsupportedOperationException(opaque.MSG);
    }

    public static GeneralSecurityException A0u(String str) {
        return new GeneralSecurityException(str);
    }

    public static C6897Ebt A0w(String str, String str2) {
        C6788EZx c6788EZx = C6897Ebt.A06;
        C7384Etj.A0Y(str2, 1);
        return new C6897Ebt(C6788EZx.A02(str), C6788EZx.A02(str2));
    }

    public static void A12(TigonNoiseGatewayCarrier.RetainedListener retainedListener) {
        TigonNoiseGatewayCarrier tigonNoiseGatewayCarrier = retainedListener.this$0;
        int i = TigonNoiseGatewayCarrier.PRIVATE_AUTH_DISABLED;
        tigonNoiseGatewayCarrier.retainedListeners.remove(retainedListener);
    }

    public static void A16(Pointer pointer, AbstractMap abstractMap) {
        abstractMap.put(pointer, Structure.newInstance(Structure.FFIType.class, pointer));
    }

    public static void A1A(Object obj, int i) {
        ((E6I) obj).A00.removeMessages(i);
    }

    public static void A1B(Object obj, int i) {
        ((E6I) obj).A00.sendEmptyMessage(i);
    }

    public static void A1C(Object obj, Runnable runnable) {
        ((E6I) obj).A00.post(runnable);
    }

    public static void A1N(String str, JSONObject jSONObject, byte[] bArr) throws JSONException {
        jSONObject.put(str, Base64.encodeToString(bArr, 11));
    }

    public static void A1P(Throwable th) {
        CFK.A0A(ForwardingRecognitionService.TAG, "Recognition caller is gone", th);
    }

    public static boolean A1U(int i, boolean z) {
        if ((i & 4) != 0) {
            return true;
        }
        return z;
    }

    public static boolean A1W(C6154Dwx c6154Dwx, String str) {
        return str.equals(c6154Dwx.A0b);
    }

    public static boolean A1X(Class cls) {
        return Structure.class.isAssignableFrom(cls);
    }

    public static boolean A1Z(String str) {
        return str.equalsIgnoreCase(Build.MODEL);
    }

    public static boolean A1a(String str) {
        return str.equalsIgnoreCase(Build.BRAND);
    }

    public static int A02(int i) {
        return Integer.valueOf(i).intValue();
    }

    public static int A04(E1P e1p, int i) {
        e1p.A0R(i);
        return e1p.A0C();
    }

    public static int A05(E1P e1p, int i) {
        e1p.A0R(i);
        return e1p.A05();
    }

    public static int A06(E1P e1p, int i) {
        e1p.A0S(i);
        return e1p.A0A();
    }

    public static int A08(Object obj, int i) {
        return (i ^ obj.hashCode()) * 1000003;
    }

    public static int A09(Object obj, int i) {
        return i ^ obj.hashCode();
    }

    public static int A0A(Object obj, Object obj2, Object obj3, Object obj4) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3, obj4});
    }

    public static int A0C(ByteBuffer byteBuffer, int i) {
        return byteBuffer.get(i) & 255;
    }

    public static int A0E(Object[] objArr, int i) {
        return (i + Arrays.hashCode(objArr)) * 31;
    }

    public static Bitmap A0M(EfF efF) {
        return (Bitmap) efF.A04();
    }

    public static Pair A0O(Iterator it) {
        return (Pair) it.next();
    }

    public static Size A0Q(Object obj, Object obj2, AbstractMap abstractMap, int i, int i2) {
        abstractMap.put(obj, obj2);
        return new Size(i, i2);
    }

    public static Size A0R(Iterator it) {
        return (Size) it.next();
    }

    public static BfD A0S(Iterator it) {
        return (BfD) it.next();
    }

    public static InterfaceC5756Dor A0a(Iterator it) {
        return (InterfaceC5756Dor) it.next();
    }

    public static Dl9 A0b(Iterator it) {
        return (Dl9) it.next();
    }

    public static Dl9 A0c(List list, int i) {
        return (Dl9) list.get(i);
    }

    public static AbstractC5553DkW A0d(Iterator it) {
        return (AbstractC5553DkW) it.next();
    }

    public static Number A0i(CaptureResult.Key key, CaptureResult captureResult) {
        return (Number) captureResult.get(key);
    }

    public static Number A0j(Object obj, AbstractMap abstractMap) {
        return (Number) abstractMap.get(obj);
    }

    public static Object A0l(Object obj, Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return obj2;
    }

    public static String A0o(C6154Dwx c6154Dwx) {
        return Dl5.A00(c6154Dwx).A0A;
    }

    public static String A0p(Matcher matcher, int i) {
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return strGroup;
    }

    public static ByteBuffer A0t(ByteBuffer byteBuffer, int i) {
        byteBuffer.position(i);
        return byteBuffer.slice();
    }

    public static List A0v(Object obj, AbstractMap abstractMap) {
        return (List) abstractMap.get(obj);
    }

    public static void A0y(Binder binder, Parcel parcel) {
        parcel.enforceInterface(binder.getInterfaceDescriptor());
    }

    public static void A0z(Handler handler, C5625Dm8 c5625Dm8, Object obj, int i) {
        C5625Dm8.A0B(handler.obtainMessage(i, obj), c5625Dm8);
    }

    public static void A10(Handler handler, Object obj, int i) {
        handler.obtainMessage(i, obj).sendToTarget();
    }

    public static void A11(AbstractC2531BdI abstractC2531BdI, C2582Bee c2582Bee, int i) {
        c2582Bee.ANl(abstractC2531BdI, Integer.valueOf(i));
    }

    public static void A15(ImmutableMap.Builder builder, Object obj, int i) {
        builder.put(Integer.valueOf(i), obj);
    }

    public static void A17(OutputStream outputStream, ByteBuffer byteBuffer) throws IOException {
        outputStream.write(byteBuffer.array());
    }

    public static void A18(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
    }

    public static void A19(Object obj) {
        C08.A00(obj.toString());
    }

    public static void A1D(Object obj, AbstractMap abstractMap, float f) {
        abstractMap.put(obj, Float.valueOf(f));
    }

    public static void A1E(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(Integer.valueOf(i), obj);
    }

    public static void A1H(String str, int i, String str2) {
        CNC.A04(str2, FGI.A0H(str, i));
    }

    public static void A1I(String str, String str2, String str3) {
        CNC.A04(str3, FGI.A0M(str, str2));
    }

    public static void A1J(String str, String str2, Throwable th, Object[] objArr) {
        CFK.A08(str2, String.format(str, objArr), th);
    }

    public static void A1K(String str, String str2, Object[] objArr) {
        Log.d(str2, String.format(str, objArr));
    }

    public static void A1L(String str, String str2, Object[] objArr) {
        Log.w(str2, String.format(str, objArr));
    }

    public static void A1M(String str, StringBuilder sb, int i) {
        sb.append(str.charAt(i));
    }

    public static void A1O(StringBuilder sb, NumberFormat numberFormat, double d) {
        sb.append(numberFormat.format(d));
    }

    public static void A1Q(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        byteBuffer2.put(byteBuffer.get(i));
    }

    public static void A1R(AbstractCollection abstractCollection, long j) {
        abstractCollection.add(Long.valueOf(j));
    }

    public static void A1S(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(it.next());
    }

    public static boolean A1V(Range range, int i) {
        return range.contains((Range) Integer.valueOf(i));
    }

    public static boolean A1Y(Class cls, Object obj) {
        return cls.isAssignableFrom(obj.getClass());
    }

    public static boolean A1b(List list) {
        return !list.isEmpty();
    }
}
