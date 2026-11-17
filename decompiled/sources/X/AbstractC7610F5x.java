package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.glance.appwidget.protobuf.CodedOutputStream;
import com.facebook.aura.file.docx.OoxmlArchiveGuard;
import com.facebook.aura.localbrowser.LocalBrowserDialogs;
import com.facebook.aura.localbrowser.LocalBrowserWindows;
import com.facebook.aura.localbrowser.core.BrowserArgs;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.dsp.core.ColorData;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.vesta.VestaClientException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.hatch.browser.core.BrowserCore;
import com.hatch.browser.core.CommandReport;
import com.hatch.browser.core.PageClosure;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.TaskPageGroup;
import com.hatch.browser.core.UniffiCleaner;
import com.hatch.browser.core.UniffiForeignFutureCompleteRustBuffer;
import com.hatch.browser.core.UniffiForeignFutureResultRustBuffer;
import com.hatch.browser.core.UniffiLib;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.FfiConverterBoolean;
import com.hatch.browser.protocol.FfiConverterString;
import com.hatch.browser.protocol.FfiConverterTypeOperationId;
import com.hatch.browser.protocol.OperationId;
import com.hatch.browser.protocol.RustBuffer;
import com.meta.maps.fancypins.FancyPinBlueprint;
import com.meta.maps.fancypins.FancyPinSourceState;
import com.meta.maps.fancypins.FancyPinSourceStateStoreKt;
import com.meta.vesta.registrationclient.VestaRegisterException;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.ZipEntry;

/* renamed from: X.F5x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7610F5x {
    public static float A04(Hi8 hi8) {
        C7384Etj.A0Y(hi8, 0);
        return FQN.A00.Aft(hi8);
    }

    public static float A05(Integer num) {
        C7384Etj.A0Y(num, 0);
        return FQN.A00.Afi(num);
    }

    public static int A0D(int i, int i2) {
        return (i + i2) * 31 * 31 * 31 * 31 * 31;
    }

    public static int A0L(FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, int i) {
        FDW fdwA0C = fdw.A0C(i);
        if (fdwA0C != null) {
            return HlW.A00(fdwA0C, interfaceC10557Hsn, 0);
        }
        return 0;
    }

    public static int A0N(Integer num) {
        C7384Etj.A0Y(num, 0);
        return FQN.A00.A7P(num);
    }

    public static int A0O(Object obj, Iterator it, int i) {
        byte[] bArr = (byte[]) it.next();
        int length = bArr.length;
        System.arraycopy(bArr, 0, obj, i, length);
        return i + length;
    }

    public static long A0S(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static long A0T(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static long A0a(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return bArr.length + 4;
    }

    public static FMX A0c(Integer num) {
        C7384Etj.A0Y(num, 0);
        return FQN.A00.A4K(num);
    }

    public static FP8 A0d(Integer num) {
        C7384Etj.A0Y(num, 0);
        return FQN.A00.A5K(num);
    }

    public static ColorData A0e(FP5 fp5) {
        C7384Etj.A0Y(fp5, 0);
        return FQN.A00.A6Y(fp5);
    }

    public static FPJ A0f(Integer num) {
        C7384Etj.A0Y(num, 0);
        return FQN.A00.Ahb(num);
    }

    public static RustBuffer.ByValue A0j(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        C7384Etj.A0Y(uniffiRustCallStatus, 1);
        return UniffiLib.INSTANCE.ffi_hatch_browser_core_uniffi_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static OperationId A0k(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return FfiConverterTypeOperationId.INSTANCE.read(byteBuffer);
    }

    public static Object A0q(BrowserArgs browserArgs, Object obj) {
        C7384Etj.A0Y(obj, 0);
        return browserArgs.values.get(obj);
    }

    public static Object A0u(String str) {
        return Class.forName(str).getDeclaredConstructor(null).newInstance(null);
    }

    public static Object A0v(Field[] fieldArr, int i) throws SecurityException {
        Field field = fieldArr[i];
        field.setAccessible(true);
        return field.get(null);
    }

    public static String A0z(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return FfiConverterString.INSTANCE.read(byteBuffer);
    }

    public static void A17(Paint paint) {
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
    }

    public static boolean A1W(FancyPinSourceState fancyPinSourceState, String str) {
        C7384Etj.A0Y(str, 0);
        FancyPinSourceStateStoreKt.validateSourcePinId(str);
        return fancyPinSourceState.pinsById.containsKey(str);
    }

    public static Object[] A1b(AbstractList abstractList) {
        return new Object[]{abstractList.get(0), abstractList.get(1)};
    }

    public static double A01(int i) {
        return i < 0 ? -1.0d : 1.0d;
    }

    public static double A02(Hj6 hj6, int i) {
        Object obj = hj6.A01[i];
        obj.getClass();
        return ((Number) obj).doubleValue();
    }

    public static int A07(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    public static int A08(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
    }

    public static int A09(int i) {
        boolean z = CodedOutputStream.A02;
        return (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
    }

    public static int A0A(int i) {
        boolean z = GGF.A05;
        return (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
    }

    public static int A0C(int i) {
        boolean z = GFE.A05;
        return (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
    }

    public static int A0M(Hj6 hj6, int i) {
        Object obj = hj6.A01[i];
        obj.getClass();
        return ((Number) obj).intValue();
    }

    public static int A0R(Object[] objArr, Object[] objArr2, int i, int i2) {
        int i3 = i2 + 1;
        objArr2[((i / 3) * 2) + 1] = objArr[i2];
        return i3;
    }

    public static long A0U(Hj6 hj6, int i) {
        Object obj = hj6.A01[i];
        obj.getClass();
        return ((Number) obj).longValue();
    }

    public static long A0V(Object obj) {
        return obj != null ? 2L : 1L;
    }

    public static long A0W(Object obj) {
        return obj != null ? 5L : 1L;
    }

    public static long A0X(Object obj) {
        return obj != null ? 9L : 1L;
    }

    public static long A0Y(Object obj) {
        return obj != null ? 17L : 1L;
    }

    public static Intent A0b(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setPackage(context.getApplicationContext().getPackageName());
        return intent;
    }

    public static C10086GpA A0h(C10086GpA c10086GpA) {
        if (c10086GpA == null) {
            return null;
        }
        return new C10086GpA(c10086GpA.A03);
    }

    public static JsonSerializer A0i(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, Set set) {
        return (jsonSerializer == null || set.isEmpty()) ? jsonSerializer2 : jsonSerializer instanceof BeanSerializer ? new BeanSerializer((BeanSerializerBase) jsonSerializer, set, null) : jsonSerializer;
    }

    public static C3330CEv A0l(String str) {
        return new C3330CEv(new JsonReader(new StringReader(str)));
    }

    public static VestaRegisterException A0n(HD3 hd3, String str) {
        return new VestaRegisterException(null, hd3, new Throwable(str));
    }

    public static Object A0r(FfiConverter ffiConverter, Object obj) {
        RustBuffer.ByValue byValue = (RustBuffer.ByValue) obj;
        C7384Etj.A0Y(byValue, 1);
        return ffiConverter.liftFromRustBuffer(byValue);
    }

    public static String A10(AbstractMap abstractMap) {
        String str = (String) abstractMap.remove("product_type");
        return str == null ? "" : str;
    }

    public static String A11(GtL gtL, char[] cArr, int i, int i2) {
        gtL.A02 = i;
        return i > i2 ? GtL.A01(cArr, gtL.A09, i2, i - i2) : "";
    }

    public static StringBuilder A12(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass());
        return sb;
    }

    public static StringBuilder A13(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        return sb;
    }

    public static HashSet A15(Collection collection) {
        return collection == null ? new HashSet() : new HashSet(collection);
    }

    public static Map A16(AbstractC8150FWo abstractC8150FWo) {
        Map<String, Object> map = abstractC8150FWo.A00;
        map.put("dcp_platform", 71);
        return map;
    }

    public static void A1A(LocalBrowserWindows localBrowserWindows) {
        LocalBrowserDialogs localBrowserDialogsInvoke = localBrowserWindows.dialogs.invoke();
        if (localBrowserDialogsInvoke != null) {
            localBrowserDialogsInvoke.cancelPending();
        }
    }

    public static void A1B(VestaClientException vestaClientException, HD4 hd4) {
        EnumC10335Gup enumC10335Gup = vestaClientException.error;
        String strName = enumC10335Gup.name();
        int iOrdinal = enumC10335Gup.ordinal();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = hd4.A01;
        int i = hd4.A00;
        lightweightQuickPerformanceLogger.markerAnnotate(536546360, i, "vesta_client_error_code", iOrdinal);
        lightweightQuickPerformanceLogger.markerPoint(536546360, i, "vesta_client_error");
        lightweightQuickPerformanceLogger.markerAnnotate(536546360, i, "failure_type", "vesta_client_error");
        lightweightQuickPerformanceLogger.markerAnnotate(536546360, i, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, strName);
    }

    public static void A1C(BrowserCore browserCore, int i) {
        UniffiCleaner.Cleanable cleanable;
        if (i != 0 || (cleanable = browserCore.cleanable) == null) {
            return;
        }
        cleanable.clean();
    }

    public static void A1D(CommandReport commandReport, int i) {
        UniffiCleaner.Cleanable cleanable;
        if (i != 0 || (cleanable = commandReport.cleanable) == null) {
            return;
        }
        cleanable.clean();
    }

    public static void A1E(PageClosure pageClosure, int i) {
        UniffiCleaner.Cleanable cleanable;
        if (i != 0 || (cleanable = pageClosure.cleanable) == null) {
            return;
        }
        cleanable.clean();
    }

    public static void A1F(RustBuffer.ByValue byValue, UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j) {
        UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(byValue, new UniffiRustCallStatus.ByValue());
        uniffiByValue.write();
        uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
    }

    public static void A1G(TaskPageGroup taskPageGroup, int i) {
        UniffiCleaner.Cleanable cleanable;
        if (i != 0 || (cleanable = taskPageGroup.cleanable) == null) {
            return;
        }
        cleanable.clean();
    }

    public static void A1I(Object obj) {
        UniffiLib.INSTANCE.ffi_hatch_browser_core_uniffi_rust_future_free_rust_buffer(((Number) obj).longValue());
    }

    public static void A1J(Object obj, int i, int i2) {
        if (i2 < i - 1) {
            System.arraycopy(obj, i2 + 1, obj, i2, (i - i2) - 1);
        }
    }

    public static void A1K(Object obj, Object obj2, StringBuilder sb) {
        sb.append(", startDate=");
        sb.append(obj);
        sb.append(", endDate=");
        sb.append(obj2);
    }

    public static void A1L(Object obj, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        Log.d(str2, sb.toString());
    }

    public static void A1M(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        Log.v("FragmentManager", sb.toString());
    }

    public static void A1N(String str, String str2, StringBuilder sb) {
        sb.append(", timezone=");
        sb.append(str);
        sb.append(", providerId=");
        sb.append(str2);
    }

    public static boolean A1U(BrowserCore browserCore, long j) {
        return browserCore.callCounter.compareAndSet(j, 1 + j);
    }

    public static boolean A1Y(AtomicLong atomicLong, long j) {
        return atomicLong.compareAndSet(j, 1 + j);
    }

    public static byte[] A1a(C10026Go0 c10026Go0) {
        byte[] bArr = c10026Go0._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrA02 = C10026Go0.A01.A02(c10026Go0._value);
        c10026Go0._quotedUTF8Ref = bArrA02;
        return bArrA02;
    }

    public static char A00(String str, StringBuilder sb, int i) {
        char cCharAt = str.charAt(i);
        if (Character.isUpperCase(cCharAt)) {
            sb.append("_");
        }
        return cCharAt;
    }

    public static float A03(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C7384Etj.A0Z(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Number) animatedValue).floatValue();
    }

    public static int A06(int i) {
        return ((352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6) + i;
    }

    public static int A0B(int i) {
        int iA0H = AIW.A0H(i);
        if (iA0H < 16) {
            return 16;
        }
        return iA0H;
    }

    public static int A0E(int i, int i2) {
        return i2 + ((352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6);
    }

    public static int A0F(int i, Rect rect) {
        return (View.MeasureSpec.getSize(i) - rect.left) - rect.right;
    }

    public static int A0G(long j, int i) {
        return i + ((640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6);
    }

    public static int A0H(View view, int i) {
        return (i - view.getPaddingTop()) - view.getPaddingBottom();
    }

    public static int A0I(View view, int i) {
        return (i - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public static int A0J(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int A0K(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int A0P(List list) {
        int size = list.size();
        int i = size * 2;
        if (size == 0) {
            return 10;
        }
        return i;
    }

    public static int A0Q(List list, int i) {
        int iIntValue = ((Number) list.get(i)).intValue();
        return (iIntValue >> 31) ^ (iIntValue << 1);
    }

    public static long A0Z(List list, int i) {
        return Double.doubleToRawLongBits(((Number) list.get(i)).doubleValue());
    }

    public static JsonParseException A0g(AbstractC9916Gl7 abstractC9916Gl7, String str) {
        C9516GMj c9516GMjA1K = abstractC9916Gl7.A1K();
        JsonParseException jsonParseException = new JsonParseException(str, null);
        jsonParseException._location = c9516GMjA1K;
        jsonParseException.A00 = null;
        return jsonParseException;
    }

    public static FCA A0m(FBB fbb) {
        F9b f9bA03 = FBA.A03(fbb);
        AbstractC8162FXe.A02("Evaluation Context can only be gotten from the UI Thread");
        return f9bA03.A08;
    }

    public static IllegalArgumentException A0o(Object obj) {
        return new IllegalArgumentException(String.format("No implementation bound to key: %s", obj));
    }

    public static Object A0p(DQZ dqz, Object obj) {
        Object obj2 = dqz.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        ArrayList arrayList = new ArrayList();
        dqz.put(obj, arrayList);
        return arrayList;
    }

    public static Object A0s(Object obj, Map map) {
        return AbstractC2258BHp.A0L(obj, map);
    }

    public static Object A0t(String str) {
        return Class.forName(str).getDeclaredMethod("getInstance", null).invoke(null, null);
    }

    public static String A0w(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public static String A0x(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public static String A0y(StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public static GeneralSecurityException A14(String str, StringBuilder sb) {
        sb.append(str);
        return new GeneralSecurityException(sb.toString());
    }

    public static void A18(Drawable drawable, View view) {
        if (drawable.isStateful()) {
            drawable.setState(view.getDrawableState());
        }
    }

    public static void A19(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static void A1H(Class cls) throws ClassNotFoundException {
        Class.forName(cls.getName(), true, cls.getClassLoader());
    }

    public static void A1O(StringBuilder sb, String str) {
        sb.append(str);
        Log.v("FragmentManager", sb.toString());
    }

    public static void A1P(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (AbstractC9014Fwr.A00((C8993FwW) next)) {
            abstractCollection.add(next);
        }
    }

    public static void A1Q(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((FancyPinBlueprint) it.next()).toJson());
    }

    public static void A1R(AbstractCollection abstractCollection, Iterator it, Set set) {
        Object next = it.next();
        if (set.contains(next)) {
            abstractCollection.add(next);
        }
    }

    public static void A1S(AbstractCollection abstractCollection, Set set) {
        C7384Etj.A0X(set);
        if (set.isEmpty()) {
            return;
        }
        abstractCollection.addAll(set);
    }

    public static void A1T(Deque deque) {
        FNZ fnz = (FNZ) deque.peek();
        if (fnz != null) {
            fnz.A03.ACO();
        }
    }

    public static boolean A1V(FfiConverterBoolean ffiConverterBoolean, ByteBuffer byteBuffer) {
        return ffiConverterBoolean.lift(byteBuffer.get()).booleanValue();
    }

    public static boolean A1X(ByteBuffer byteBuffer) {
        return byteBuffer.get() != 0;
    }

    public static byte[] A1Z(OoxmlArchiveGuard.ReadBudget readBudget, InputStream inputStream, ZipEntry zipEntry, long j) {
        String name = zipEntry.getName();
        C7384Etj.A0U(name);
        return readBudget.readEntry(inputStream, name, j);
    }
}
