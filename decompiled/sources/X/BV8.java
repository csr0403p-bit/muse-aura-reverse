package X;

import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioFormat;
import android.media.MediaCodecInfo;
import android.opengl.GLException;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.View;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.aura.gateway.ApprovalRequestPreviewJsonKt;
import com.facebook.aura.network.transport.HatchNoisePrivateAuth;
import com.facebook.aura.network.transport.HatchWebSocketConfig;
import com.facebook.common.json.FbJsonField;
import com.facebook.graphql.error.GraphQLError;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.tigon.TigonError;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.MapMakerInternalMap;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import javax.crypto.Cipher;
import org.webrtc.YuvHelper;

/* loaded from: classes5.dex */
public abstract class BV8 {
    public static int A03(int i, int i2, int i3) {
        return Math.min(Math.max(0, i - i2), i3);
    }

    public static long A0L(FDW fdw, float f, float f2, int i) {
        return AbstractC5463Diy.A01(Hus.A00(fdw.A0F(i), 0.0f, f), Hus.A00(fdw.A0F(36), 0.0f, f2));
    }

    public static RectF A0Q(Size size) {
        return new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
    }

    public static AudioFormat A0S(AudioFormat.Builder builder, int i, int i2) {
        return builder.setEncoding(2).setSampleRate(i).setChannelMask(i2).build();
    }

    public static ParserException A0c(String str) {
        return new ParserException(str, null, 1, true);
    }

    public static Object A0p(Object obj, Object[] objArr, int i) {
        if (obj == null || i != 1) {
            return null;
        }
        Object obj2 = objArr[0];
        obj2.getClass();
        if (!obj2.equals(obj)) {
            return null;
        }
        Object obj3 = objArr[1];
        obj3.getClass();
        return obj3;
    }

    public static StringBuilder A11(int i) {
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, ApprovalRequestPreviewJsonKt.MAX_ATTACHMENT_SIZE_BYTES));
        sb.append('{');
        return sb;
    }

    public static ByteBuffer A18(ByteOrder byteOrder, int i, int i2) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[i * i2]);
        byteBufferWrap.order(byteOrder);
        return byteBufferWrap;
    }

    public static List A1B(List list) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        return AbstractC0885AGm.A11(Arrays.copyOf(strArr, strArr.length));
    }

    public static void A1E(Bundle bundle, IBinder iBinder, Parcel parcel) {
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
        parcel.writeStrongBinder(iBinder);
    }

    public static void A1O(StringBuilder sb, Object obj) {
        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
    }

    public static boolean A1X(float f) {
        return Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0;
    }

    public static boolean A1Y(int i) {
        return (i & 1) == 1;
    }

    public static int A00(int i) {
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static int A01(int i) {
        return ((int) (AbstractC6801EaC.A00((i + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    public static int A02(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 >= i2) {
            return i3;
        }
        int iHighestOneBit = Integer.highestOneBit(i2 - 1);
        int i4 = iHighestOneBit + iHighestOneBit;
        if (i4 < 0) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }

    public static int A04(long j) {
        return (int) ((j >>> 48) & 63);
    }

    public static int A06(E1P e1p) {
        e1p.A0R(8);
        int iA05 = e1p.A05();
        byte[] bArr = E2Q.A00;
        return (iA05 >> 24) & 255;
    }

    public static int A07(E1P e1p) {
        e1p.A0R(8);
        return (e1p.A05() >> 24) & 255;
    }

    public static int A08(E1P e1p, byte[] bArr, int i) {
        int i2 = i + 1;
        e1p.A01 = i2;
        int i3 = (bArr[i] & 255) << 8;
        e1p.A01 = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public static int A0C(List list, int i, int i2) {
        return (i * 31) + list.get(i2).hashCode();
    }

    public static int A0E(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long A0H(int i, long j) {
        if (i > 0) {
            return System.nanoTime() + j;
        }
        return 0L;
    }

    public static long A0J(long j, long j2) {
        return Math.max(0L, Math.min(j, j2));
    }

    public static long A0N(char[] cArr, int i) {
        return (cArr[i + 7] << 48) | cArr[i + 4] | (cArr[i + 5] << 16) | (cArr[i + 6] << 32);
    }

    public static RectF A0P(float f, float f2, long j) {
        return new RectF(f, f2, f + Float.intBitsToFloat((int) (j >> 32)), f2 + AbstractC5463Diy.A00(j));
    }

    public static BadParcelableException A0U(int i) {
        return new BadParcelableException(FGI.A0H("Parcel data not fully consumed, unread size: ", i));
    }

    public static KeyGenParameterSpec.Builder A0X(KeyGenParameterSpec.Builder builder) {
        return builder.setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
    }

    public static HatchWebSocketConfig A0d(HatchNoisePrivateAuth hatchNoisePrivateAuth, String str, Map map) {
        return new HatchWebSocketConfig(str, map, C0881AGi.A00, 30000L, -1, 0L, hatchNoisePrivateAuth);
    }

    public static FbJsonField A0e(String str) {
        return FbJsonField.jsonField(GraphQLError.class.getDeclaredField(str), (Class<?>) null, (Ho3<?>) null);
    }

    public static E8T A0g(E8S e8s, int i) {
        return e8s.A0J[(i >>> e8s.A05) & e8s.A04];
    }

    public static ImmutableSet A0h(ImmutableMap immutableMap) {
        ImmutableSet<Map.Entry<K, V>> immutableSet = immutableMap.entrySet;
        if (immutableSet != 0) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetCreateEntrySet = immutableMap.createEntrySet();
        immutableMap.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    public static MapMakerInternalMap.Segment A0i(MapMakerInternalMap mapMakerInternalMap, int i) {
        return mapMakerInternalMap.A06[(i >>> mapMakerInternalMap.A04) & mapMakerInternalMap.A03];
    }

    public static IOException A0j(Object obj, String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        return new IOException(sb.toString());
    }

    public static IllegalStateException A0l(String str) {
        return new IllegalStateException(FGI.A0M("Missing required properties:", str));
    }

    public static NullPointerException A0n(int i) {
        return new NullPointerException(FGI.A0H("at index ", i));
    }

    public static String A0s(TigonError tigonError) {
        String str = tigonError.A01;
        return str.length() == 0 ? tigonError.A00() : str;
    }

    public static String A0t(Object obj) {
        if (obj instanceof ScheduledFuture) {
            return FGI.A0J("remaining delay=[", ((Delayed) obj).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    public static String A0x(String str, Object obj) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj.getClass());
        return sb.toString();
    }

    public static String A0y(String str, Throwable th, Object[] objArr) {
        Log.e("PlayCore", "Unable to format ".concat(str), th);
        return FGI.A0d(str, " [", TextUtils.join(", ", objArr), "]");
    }

    public static StringBuilder A13(Object obj, String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj.getClass());
        return sb;
    }

    public static StringBuilder A14(String str, Field field) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(field.getName());
        return sb;
    }

    public static StringBuilder A15(C6879Ebb c6879Ebb, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(c6879Ebb.A0D);
        sb.append('[');
        sb.append(i);
        return sb;
    }

    public static KeyStore.Entry A19(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore.getEntry(str, null);
    }

    public static short A1C(short[] sArr, int i, int i2, int i3, int i4) {
        return (short) (((sArr[i] * (i2 - i3)) + (sArr[i4] * i3)) / i2);
    }

    public static void A1D(Path path, RectF rectF) {
        path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
    }

    public static void A1F(AbstractC2531BdI abstractC2531BdI, C2582Bee c2582Bee, Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getCanonicalName());
        sb.append("-");
        sb.append(UUID.randomUUID());
        c2582Bee.ANl(abstractC2531BdI, sb.toString());
    }

    public static void A1G(E6E e6e, int i, int i2, int i3) {
        if (i >= 0) {
            E7Z e7z = e6e.A05;
            StuckPlayerException stuckPlayerException = new StuckPlayerException(i2, i3);
            C6438E5q.A0H(ExoPlaybackException.A01(stuckPlayerException, 1003), ((SurfaceHolderCallbackC6446E5z) e7z).A00);
        }
    }

    public static void A1H(UserFlowLoggerImpl userFlowLoggerImpl, long j) {
        Set<Long> set = userFlowLoggerImpl._ongoingFlows;
        Long lValueOf = Long.valueOf(j);
        set.remove(lValueOf);
        userFlowLoggerImpl.ongoingBgCancellableFlows.remove(lValueOf);
        userFlowLoggerImpl.flowMetadata.remove(lValueOf);
    }

    public static void A1I(C3461COj c3461COj, int i, long j) {
        if (i != 0) {
            c3461COj.A02("<T");
            c3461COj.A02(Long.toString(j));
            c3461COj.A02(">");
        }
    }

    public static void A1L(Object obj, Runnable runnable) {
        Handler handler = ((E6I) obj).A00;
        if (handler.getLooper().getThread().isAlive()) {
            handler.post(runnable);
        }
    }

    public static void A1Q(StringBuilder sb, Throwable th) {
        sb.append("FAILURE, cause=[");
        sb.append(th.getCause());
        sb.append("]");
    }

    public static boolean A1W() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static int A05(Range range, int i) {
        return ((Number) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static int A09(Object obj) {
        return (527 + obj.hashCode()) * 31;
    }

    public static int A0A(Object obj) {
        return (obj.hashCode() ^ 1000003) * 1000003;
    }

    public static int A0B(String str) {
        return (527 + str.hashCode()) * 31;
    }

    public static int A0D(Matcher matcher, int i) {
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return Integer.parseInt(strGroup);
    }

    public static long A0F() {
        return SystemClock.elapsedRealtime() * 1000;
    }

    public static long A0G() {
        return System.nanoTime() / 1000;
    }

    public static long A0I(long j, long j2) {
        return Util.A0F(RoundingMode.DOWN, j, 1000000L, j2);
    }

    public static long A0K(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static long A0M(Matcher matcher, int i) {
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static Point A0O(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static RectF A0R(Size size, float f) {
        return new RectF(0.0f, 0.0f, f, size.getHeight());
    }

    public static GLException A0T(String str, int i, int i2) {
        return new GLException(i2, FGI.A0M(str, Integer.toHexString(i)));
    }

    public static Parcelable A0V(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static RemoteException A0W(Object obj) {
        return new RemoteException(String.valueOf(obj).concat(" : Binder has died."));
    }

    public static Rational A0Y(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static Size A0Z(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size A0a(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static Size A0b(View view) {
        return new Size(view.getWidth(), view.getHeight());
    }

    public static InterfaceC5064DTa A0f(DTM dtm) {
        if (dtm.isEmpty()) {
            return null;
        }
        E e = dtm.A00;
        DTP dtp = (DTP) e;
        DTP<K, V> dtp2 = dtp.next;
        dtp.next = null;
        dtm.A00 = dtp2;
        if (dtp2 == 0) {
            dtm.A01 = null;
            return e;
        }
        dtp2.prev = null;
        return e;
    }

    public static CharSequence A0k(Object obj, Object obj2) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj2 : obj.toString();
    }

    public static IllegalStateException A0m(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalStateException(sb.toString());
    }

    public static Object A0o(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object A0q(String str) {
        return Class.forName(str).getConstructor(null).newInstance(null);
    }

    public static Object A0r(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static String A0u(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    public static String A0v(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public static String A0w(String str) {
        return FGI.A0Y("UID: [", "]  PID: [", "] ", Process.myUid(), Process.myPid()).concat(str);
    }

    public static String A0z(StringBuilder sb, int i) {
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public static String A10(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static StringBuilder A12(Object obj) {
        int iHashCode = obj.hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(iHashCode);
        return sb;
    }

    public static UnsupportedOperationException A16(Object obj) {
        return new UnsupportedOperationException(obj.getClass().getSimpleName());
    }

    public static ByteBuffer A17(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
    }

    public static List A1A(Iterable iterable, ListIterator listIterator) {
        return AbstractC0878AGe.A0a(iterable, listIterator.nextIndex() + 1);
    }

    public static void A1J(ObjectOutputStream objectOutputStream, Iterator it) throws IOException {
        Map.Entry entry = (Map.Entry) it.next();
        objectOutputStream.writeObject(entry.getKey());
        objectOutputStream.writeObject(entry.getValue());
    }

    public static void A1K(Object obj, Object obj2, Object obj3) {
        YuvHelper.checkNotNull(obj, "srcY");
        YuvHelper.checkNotNull(obj2, "srcU");
        YuvHelper.checkNotNull(obj3, "srcV");
    }

    public static void A1M(String str, StringBuilder sb, Collection collection) {
        sb.append(str);
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList);
        sb.append(arrayList);
    }

    public static void A1N(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(", enable: ");
        sb.append(z);
        sb.append(", is now: ");
    }

    public static void A1P(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        Log.d(str3, sb.toString());
    }

    public static void A1R(StringBuilder sb, Map.Entry entry) {
        sb.append(entry.getKey());
        sb.append('=');
        sb.append(entry.getValue());
    }

    public static void A1S(URLConnection uRLConnection, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        uRLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
    }

    public static void A1T(Key key, AlgorithmParameterSpec algorithmParameterSpec, Cipher cipher, byte[] bArr, int i) throws InvalidKeyException, InvalidAlgorithmParameterException {
        cipher.init(i, key, algorithmParameterSpec);
        if (bArr == null || bArr.length == 0) {
            return;
        }
        cipher.updateAAD(bArr);
    }

    public static void A1U(AbstractCollection abstractCollection, AbstractCollection abstractCollection2, Iterator it) {
        Object next = it.next();
        if (abstractCollection.contains(next) && (next instanceof Map.Entry)) {
            abstractCollection2.add(((Map.Entry) next).getKey());
        }
    }

    public static void A1V(AbstractCollection abstractCollection, Collection collection, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        if (collection.contains(entry.getValue())) {
            abstractCollection.add(entry.getKey());
        }
    }

    public static boolean A1Z(Object obj, Collection collection, Iterator it, boolean z) {
        if (!collection.contains(obj)) {
            return z;
        }
        it.remove();
        return true;
    }

    public static Object[] A1a(Object obj, int i) {
        return (Object[]) Array.newInstance(obj.getClass().getComponentType(), i);
    }

    public static Object[] A1b(Object obj, int i, int i2) {
        return new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)};
    }
}
