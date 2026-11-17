package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.BaseBundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.room.util.DBUtil__DBUtil_androidKt;
import com.facebook.aura.analytics.impl.config.MetaAnalyticsMC;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1;
import com.facebook.aura.gateway.HatchGatewayConnectionKt;
import com.facebook.aura.network.tigon.AuraTigonServiceProvider;
import com.facebook.tigon.TigonRequestToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.regex.Matcher;

/* loaded from: classes5.dex */
public abstract class BV5 {
    public static int A01(int i) {
        return i != 0 ? 1 : 2;
    }

    public static Object A0a(EIN ein, G0U g0u) {
        return DBUtil__DBUtil_androidKt.A01(ein, g0u, true, false);
    }

    public static Object A0b(Class cls) {
        return cls.getDeclaredConstructor(null).newInstance(null);
    }

    public static Object A0c(Object obj, Class cls, String str) throws NoSuchFieldException, SecurityException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static Object A0d(String str, Class cls) {
        return cls.getMethod(str, null).invoke(null, null);
    }

    public static CountDownLatch A16() {
        return new CountDownLatch(1);
    }

    public static AtomicInteger A17() {
        return new AtomicInteger(0);
    }

    public static AtomicInteger A18() {
        return new AtomicInteger(1);
    }

    public static AtomicReference A1A() {
        return new AtomicReference(null);
    }

    public static void A1D(EIN ein, G0U g0u) {
        DBUtil__DBUtil_androidKt.A01(ein, g0u, false, true);
    }

    public static void A1E(EIN ein, G0U g0u) {
        ((Number) DBUtil__DBUtil_androidKt.A01(ein, g0u, false, true)).intValue();
    }

    public static void A1J(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static boolean A1O(int i, int i2) {
        return i == i2;
    }

    public static boolean A1P(int i, int i2) {
        return i >= i2;
    }

    public static boolean A1U(Object obj, Object obj2) {
        System.arraycopy(obj, 0, obj2, 0, 27);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int A05(Object obj, C31u c31u, InterfaceC7359EnW[] interfaceC7359EnWArr, int i) {
        return ((Number) c31u.getValue(obj, interfaceC7359EnWArr[i])).intValue();
    }

    public static long A06(int i) {
        return i != 0 ? 1L : 0L;
    }

    public static long A07(long j) {
        return Math.max(0L, j);
    }

    public static long A08(C4oT c4oT, String str) {
        return c4oT.getLong(str, 0L);
    }

    public static HandlerThread A0C(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        handlerThread.start();
        return handlerThread;
    }

    public static Looper A0D(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    public static EfF A0G(EfF efF) {
        if (efF != null) {
            return efF.A03();
        }
        return null;
    }

    public static C4oT A0H() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.DEVICE_IDENTIFIERS);
    }

    public static BufferedReader A0I(File file) {
        return new BufferedReader(new FileReader(file));
    }

    public static BufferedReader A0J(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    public static Class A0N(Object obj) {
        if (obj != null) {
            return obj.getClass();
        }
        return null;
    }

    public static IllegalArgumentException A0O(Object obj, String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        return new IllegalArgumentException(sb.toString());
    }

    public static String A0k() {
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession != null) {
            return ((CH0) currentUserSession).A01;
        }
        return null;
    }

    public static String A0l(int i, String str, String str2) {
        return i != 0 ? str.concat(str2) : new String(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String A0m(Object obj, C31u c31u, InterfaceC7359EnW[] interfaceC7359EnWArr, int i) {
        return (String) c31u.getValue(obj, interfaceC7359EnWArr[i]);
    }

    public static String A0o(StringBuilder sb) {
        sb.append(']');
        return sb.toString();
    }

    public static StringBuilder A0q(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        return sb;
    }

    public static ArrayList A0u(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    public static Iterator A0z(Collection collection) {
        return new ArrayList(collection).iterator();
    }

    public static List A13(Collection collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static Map A14() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static Map A15(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static AtomicLong A19() {
        return new AtomicLong(0L);
    }

    public static void A1C(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
    }

    public static void A1F(HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1 hatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1) {
        String str = hatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1.$forcedRefreshReason;
        if (str != null) {
            hatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1.this$0.logger.annotate("forced_refresh_reason", str);
        }
    }

    public static void A1G(HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost, HatchGatewayConnection hatchGatewayConnection) {
        hatchGatewayConnection.logger.annotate(HatchGatewayConnectionKt.ANNOTATION_CONNECT_PHASE, gatewayConnectionEngineHost.connectStage.getConnectPhase());
    }

    public static void A1K(ByteBuffer byteBuffer) {
        AuraTigonServiceProvider.INSTANCE.getTigonXplatService().releaseBodyBuffer(byteBuffer);
    }

    public static void A1M(Object[] objArr) {
        objArr[34] = "\\\"";
        objArr[92] = "\\\\";
        objArr[9] = "\\t";
        objArr[8] = "\\b";
        objArr[10] = "\\n";
        objArr[13] = "\\r";
        objArr[12] = "\\f";
    }

    public static boolean A1N() {
        return Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    }

    public static boolean A1R(File file, String str) {
        return new File(file, str).exists();
    }

    public static boolean A1S(Class cls, Object obj) {
        return obj.equals(new C0861A6i(cls));
    }

    public static boolean A1V(String str) {
        return new File(str).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A1W(C31u c31u, InterfaceC7359EnW[] interfaceC7359EnWArr, int i) {
        return ((Boolean) c31u.getValue(null, interfaceC7359EnWArr[i])).booleanValue();
    }

    public static String[] A1b(AbstractCollection abstractCollection, int i) {
        return (String[]) abstractCollection.toArray(new String[i]);
    }

    public static int A00() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static int A02(int i, int i2, int i3) {
        return Math.max(i3, Math.min(i, i2));
    }

    public static int A03(Number number, String str) {
        return str.hashCode() + number.intValue();
    }

    public static int A04(Object obj) {
        return String.valueOf(obj).length();
    }

    public static long A09(Matcher matcher, int i) {
        return Long.parseLong(matcher.group(i));
    }

    public static PackageInfo A0A(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
    }

    public static Handler A0B(HandlerThread handlerThread) {
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public static Pair A0E(Object obj, int i) {
        return new Pair(obj, Integer.valueOf(i));
    }

    public static MetaAnalyticsMC A0F() {
        return (MetaAnalyticsMC) C5246DeB.A01(C5249DeE.A00(), 65563);
    }

    public static File A0K(String str, String str2) {
        return new File(FGI.A0M(str, str2));
    }

    public static File A0L(String str, String str2, File file) {
        return new File(file, FGI.A0M(str, str2));
    }

    public static IOException A0M(String str, String str2) {
        return new IOException(FGI.A0M(str, str2));
    }

    public static IllegalArgumentException A0P(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalArgumentException A0Q(String str, int i) {
        return new IllegalArgumentException(FGI.A0H(str, i));
    }

    public static IllegalArgumentException A0R(String str, long j) {
        return new IllegalArgumentException(FGI.A0B(j, str));
    }

    public static IllegalArgumentException A0S(String str, String str2, int i) {
        return new IllegalArgumentException(FGI.A0I(str, i, str2));
    }

    public static IllegalArgumentException A0T(String str, Object[] objArr) {
        return new IllegalArgumentException(String.format(str, objArr));
    }

    public static IllegalStateException A0U(String str, String str2) {
        return new IllegalStateException(FGI.A0M(str, str2));
    }

    public static IllegalStateException A0V(String str, String str2, String str3) {
        return new IllegalStateException(FGI.A0U(str, str2, str3));
    }

    public static IllegalStateException A0W(String str, Object[] objArr) {
        return new IllegalStateException(String.format(str, objArr));
    }

    public static Integer A0X(Object obj) {
        return Integer.valueOf(obj.hashCode());
    }

    public static NullPointerException A0Y(Object obj) {
        return new NullPointerException(String.valueOf(obj));
    }

    public static Object A0Z(int i) {
        return C5246DeB.A01(C5249DeE.A00(), i);
    }

    public static Object A0e(List list) {
        return list.get(list.size() - 1);
    }

    public static Object A0f(Map map, int i) {
        return map.get(Integer.valueOf(i));
    }

    public static RuntimeException A0g(String str, int i) {
        return new RuntimeException(FGI.A0H(str, i));
    }

    public static RuntimeException A0h(String str, String str2) {
        return new RuntimeException(FGI.A0M(str, str2));
    }

    public static RuntimeException A0i(String str, String str2, String str3) {
        return new RuntimeException(FGI.A0U(str, str2, str3));
    }

    public static String A0j() {
        return AbstractC7535F0i.A00().toString();
    }

    public static String A0n(String str, Throwable th) {
        return FGI.A0M(str, th.getMessage());
    }

    public static String A0p(StringBuilder sb) {
        sb.setLength(sb.length() - 3);
        return sb.toString();
    }

    public static StringBuilder A0r(Object obj, int i) {
        return new StringBuilder(i + String.valueOf(obj).length());
    }

    public static Thread A0s() {
        return Looper.getMainLooper().getThread();
    }

    public static ByteBuffer A0t(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static HashSet A0v(Object[] objArr) {
        return new HashSet(Arrays.asList(objArr));
    }

    public static Iterator A0w(BaseBundle baseBundle) {
        return baseBundle.keySet().iterator();
    }

    public static Iterator A0x(AbstractMap abstractMap) {
        return abstractMap.values().iterator();
    }

    public static Iterator A0y(AbstractMap abstractMap) {
        return abstractMap.keySet().iterator();
    }

    public static Iterator A10(Map map) {
        return map.values().iterator();
    }

    public static Iterator A11(Map map) {
        return map.keySet().iterator();
    }

    public static List A12(String str, String str2, String str3) {
        return Arrays.asList(str, str2, str3);
    }

    public static Logger A1B(Class cls) {
        return Logger.getLogger(cls.getName());
    }

    public static void A1H(File file) {
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void A1I(Object obj, AbstractMap abstractMap, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 == null || !(obj2 instanceof String)) {
            return;
        }
        abstractMap.put(obj, obj2);
    }

    public static void A1L(AtomicReference atomicReference) {
        TigonRequestToken tigonRequestToken = (TigonRequestToken) atomicReference.get();
        if (tigonRequestToken != null) {
            tigonRequestToken.cancel();
        }
    }

    public static boolean A1Q(Intent intent, String str) {
        return str.equals(intent.getAction());
    }

    public static boolean A1T(Object obj, Object obj2) {
        return obj.getClass().equals(obj2.getClass());
    }

    public static byte[] A1X(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static Object[] A1Y(int i) {
        return new Object[]{Integer.valueOf(i)};
    }

    public static Object[] A1Z(int i, int i2) {
        return new Object[]{Integer.valueOf(i), Integer.valueOf(i2)};
    }

    public static Object[] A1a(Object obj, int i) {
        return new Object[]{obj, Integer.valueOf(i)};
    }
}
