package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.aura.analytics.AuraAnalytics;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.localbrowser.LocalBrowserNodeHandler;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class BV4 {
    public static long A03(int i) {
        return i & 4294967295L;
    }

    public static SharedPreferences A07(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    public static Integer A0V() {
        return 0;
    }

    public static Integer A0W() {
        return 1;
    }

    public static Integer A0X() {
        return 2;
    }

    public static Integer A0Y() {
        return 3;
    }

    public static Integer A0Z() {
        return 4;
    }

    public static String A0j(String str, int i) {
        return str.substring(0, i);
    }

    public static Field A0r(Class cls, String str) throws NoSuchFieldException, SecurityException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField;
    }

    public static boolean A1U(String str) {
        return Log.isLoggable(str, 3);
    }

    public static boolean A1V(AtomicBoolean atomicBoolean) {
        return atomicBoolean.compareAndSet(false, true);
    }

    public static Object[] A1W() {
        return new Object[0];
    }

    public static String[] A1a(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A1b(List list) {
        return (String[]) list.toArray(new String[0]);
    }

    public static long A04(long j) {
        return j / 1000;
    }

    public static long A06(Object obj) {
        return ((Long) obj).longValue();
    }

    public static Matrix A08() {
        return new Matrix();
    }

    public static Handler A09(Looper looper) {
        return new Handler(looper);
    }

    public static Pair A0A(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static SparseArray A0B() {
        return new SparseArray();
    }

    public static DFX A0C() {
        return AuraAnalytics.INSTANCE.getInstance();
    }

    public static QuickPerformanceLogger A0D() {
        QuickPerformanceLogger quickPerformanceLogger = QuickPerformanceLoggerProvider.A02;
        return quickPerformanceLogger == null ? QuickPerformanceLoggerProvider.A00 : quickPerformanceLogger;
    }

    public static ByteArrayInputStream A0E(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    public static ByteArrayOutputStream A0F() {
        return new ByteArrayOutputStream();
    }

    public static File A0G(String str) {
        return new File(str);
    }

    public static FileInputStream A0H(File file) {
        return new FileInputStream(file);
    }

    public static FileOutputStream A0I(File file) {
        return new FileOutputStream(file);
    }

    public static IOException A0J() {
        return new IOException(LocalBrowserNodeHandler.CLOSED);
    }

    public static IOException A0K(String str) {
        return new IOException(str);
    }

    public static RandomAccessFile A0L(File file) {
        return new RandomAccessFile(file, "r");
    }

    public static RandomAccessFile A0M(File file) {
        return new RandomAccessFile(file, "rw");
    }

    public static AssertionError A0N(Object obj) {
        return new AssertionError(obj);
    }

    public static IllegalArgumentException A0O() {
        return new IllegalArgumentException("Failed requirement.");
    }

    public static IllegalArgumentException A0P() {
        return new IllegalArgumentException();
    }

    public static IllegalArgumentException A0Q(String str, Throwable th) {
        return new IllegalArgumentException(str, th);
    }

    public static IllegalStateException A0R() {
        return new IllegalStateException(LocalBrowserNodeHandler.CLOSED);
    }

    public static IllegalStateException A0S() {
        return new IllegalStateException("Check failed.");
    }

    public static IllegalStateException A0T() {
        return new IllegalStateException();
    }

    public static IllegalStateException A0U() {
        return new IllegalStateException("Required value was null.");
    }

    public static NullPointerException A0a(String str) {
        return new NullPointerException(str);
    }

    public static RuntimeException A0c(String str) {
        return new RuntimeException(str);
    }

    public static RuntimeException A0d(String str, Throwable th) {
        return new RuntimeException(str, th);
    }

    public static RuntimeException A0e(Throwable th) {
        return new RuntimeException(th);
    }

    public static String A0f() {
        return AuraDeviceId.INSTANCE.get();
    }

    public static String A0g(int i, String str) {
        return str.substring(i + 1);
    }

    public static String A0n(Charset charset, byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, charset);
    }

    public static String A0o(byte[] bArr) {
        return new String(bArr, DCl.A05);
    }

    public static StringBuilder A0p(int i) {
        return new StringBuilder(i);
    }

    public static WeakReference A0q(Object obj) {
        return new WeakReference(obj);
    }

    public static ArrayDeque A0s() {
        return new ArrayDeque();
    }

    public static ArrayList A0t(Collection collection) {
        return new ArrayList(collection);
    }

    public static HashMap A0u() {
        return new HashMap();
    }

    public static HashMap A0v(int i) {
        return new HashMap(i);
    }

    public static HashMap A0w(Map map) {
        return new HashMap(map);
    }

    public static HashSet A0x(Collection collection) {
        return new HashSet(collection);
    }

    public static LinkedList A0y() {
        return new LinkedList();
    }

    public static WeakHashMap A11() {
        return new WeakHashMap();
    }

    public static AtomicBoolean A12(boolean z) {
        return new AtomicBoolean(z);
    }

    public static AtomicInteger A13(int i) {
        return new AtomicInteger(i);
    }

    public static AtomicLong A14(long j) {
        return new AtomicLong(j);
    }

    public static AtomicReference A15() {
        return new AtomicReference();
    }

    public static AtomicReference A16(Object obj) {
        return new AtomicReference(obj);
    }

    public static SecretKeySpec A17(byte[] bArr) {
        return new SecretKeySpec(bArr, ConfidentialVmPinVerifierCrypto.AES);
    }

    public static JSONObject A18() {
        return new JSONObject();
    }

    public static JSONObject A19(String str) {
        return new JSONObject(str);
    }

    public static byte A00(RandomAccessFile randomAccessFile, long j) throws IOException {
        randomAccessFile.seek(j);
        return randomAccessFile.readByte();
    }

    public static int A01(long j, long j2) {
        return (int) Math.min(j, j2);
    }

    public static int A02(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    public static long A05(long j) {
        return j / 1000000;
    }

    public static Number A0b(Object obj, Map map) {
        return (Number) map.get(obj);
    }

    public static String A0h(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    public static String A0i(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A0k(String str, Object obj) {
        return FGI.A0M(str, obj.toString());
    }

    public static String A0l(StringBuilder sb, int i) {
        sb.append(i);
        return sb.toString();
    }

    public static String A0m(StringBuilder sb, long j) {
        sb.append(j);
        return sb.toString();
    }

    public static List A0z(Object obj, Map map) {
        return (List) map.get(obj);
    }

    public static Set A10(Object obj, Map map) {
        return (Set) map.get(obj);
    }

    public static void A1A() {
        Thread.currentThread().interrupt();
    }

    public static void A1B(int i, String str, String str2) {
        CFK.A03(Integer.valueOf(i), str, str2);
    }

    public static void A1C(Handler handler, int i) {
        handler.sendMessage(handler.obtainMessage(i));
    }

    public static void A1D(Handler handler, Object obj, int i) {
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    public static void A1E(EK9 ek9, String str, String str2, String str3) {
        ek9.A02(str3, FGI.A0M(str, str2));
    }

    public static void A1F(Object obj, AbstractMap abstractMap, long j) {
        abstractMap.put(obj, Long.valueOf(j));
    }

    public static void A1G(Object obj, AbstractMap abstractMap, boolean z) {
        abstractMap.put(obj, Boolean.valueOf(z));
    }

    public static void A1H(Object obj, Map map, int i) {
        map.put(obj, Integer.valueOf(i));
    }

    public static void A1I(Object obj, Map map, long j) {
        map.put(obj, Long.valueOf(j));
    }

    public static void A1J(String str, String str2, String str3) {
        Log.w(str3, FGI.A0M(str, str2));
    }

    public static void A1K(String str, String str2, String str3, String str4) {
        Log.w(str4, FGI.A0U(str, str2, str3));
    }

    public static void A1L(String str, String str2, String str3, String str4, String str5) {
        Log.w(str5, FGI.A0d(str, str2, str3, str4));
    }

    public static void A1M(String str, String str2, EPf ePf, AbstractC6670EOh abstractC6670EOh, String[] strArr) {
        abstractC6670EOh.logAccountItemFetchFailure(str, str2, ePf, abstractC6670EOh.constructDebugTestData(strArr));
    }

    public static void A1N(StringBuilder sb, int i) {
        sb.append(Integer.toHexString(i));
    }

    public static void A1O(StringBuilder sb, Object obj) {
        sb.append(obj.toString());
    }

    public static void A1P(ReadWriteLock readWriteLock) {
        readWriteLock.writeLock().unlock();
    }

    public static void A1Q(ReentrantReadWriteLock reentrantReadWriteLock) {
        reentrantReadWriteLock.writeLock().unlock();
    }

    public static void A1R(ReentrantReadWriteLock reentrantReadWriteLock) {
        reentrantReadWriteLock.readLock().unlock();
    }

    public static void A1S(ReentrantReadWriteLock reentrantReadWriteLock) {
        reentrantReadWriteLock.readLock().lock();
    }

    public static void A1T(ReentrantReadWriteLock reentrantReadWriteLock) {
        reentrantReadWriteLock.writeLock().lock();
    }

    public static Object[] A1X(long j) {
        return new Object[]{Long.valueOf(j)};
    }

    public static Object[] A1Y(Object obj, long j) {
        return new Object[]{obj, Long.valueOf(j)};
    }

    public static Object[] A1Z(boolean z) {
        return new Object[]{Boolean.valueOf(z)};
    }
}
